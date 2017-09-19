(defproject metrics-clojure-riemann "2.11.0-SNAPSHOT"
  :description "Riemann reporter integration for metrics-clojure"
  :url "https://github.com/sjl/metrics-clojure"
  :license {:name "MIT"}
  :profiles {:dev {:global-vars {*warn-on-reflection* true}}}
  :dependencies [[metrics-clojure "2.11.0-SNAPSHOT"]
                 [com.aphyr/metrics3-riemann-reporter "0.4.1"]])
