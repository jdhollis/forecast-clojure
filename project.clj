(defproject forecast-clojure "1.0.0"
  :description "Clojure library for retrieving data from the Forecast API"
  :url "https://github.com/jdhollis/forecast-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [environ "0.4.0"]
                 [clj-http "0.7.0"]
                 [cheshire "5.0.2"]])
