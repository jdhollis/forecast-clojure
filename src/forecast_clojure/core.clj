(ns forecast-clojure.core
  (:use [clojure.string :only [join]]
        [environ.core])
  (:require [cheshire.core :as json]
            [clj-http.client :as client]))
