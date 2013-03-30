(ns forecast-clojure.core
  (:use [clojure.string :only [join]]
        [environ.core])
  (:require [cheshire.core :as json]
            [clj-http.client :as client]))

(defn forecast
  "Retrieve the forecast for a given latitude and longitude"
  [lat lon & {:keys [params time]}]
  (let [base-url "https://api.forecast.io/forecast"
        api-key (env :forecast-key)
        url (join "/" [base-url api-key (join "," (filter #(not-empty %) (map str [lat lon time])))])
        response (client/get url {:query-params params :throw-exceptions false})]
    (cond (= 200 (:status response))
          (json/parse-string (:body response) true))))
