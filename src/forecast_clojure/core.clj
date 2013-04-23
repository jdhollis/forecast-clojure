(ns forecast-clojure.core
  (:use environ.core
        [clojure.string :only (join)])
  (:require [cheshire.core :as json]
            [clj-http.client :as client]))

(defn forecast
  "Retrieve the forecast for a given latitude and longitude"
  [lat lon & {:keys [params time] :or [params nil time nil]}]
  (let [base-url "https://api.forecast.io/forecast"
        api-key (env :forecast-key)
        query (apply str (interpose "," [lat lon time]))
        url (join "/" [base-url api-key query])
        response (client/get url {:query-params params :throw-exceptions false})]
    (cond (= 200 (:status response))
          (json/parse-string (:body response) true))))
