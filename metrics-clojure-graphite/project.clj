(defproject metrics-clojure-graphite "2.11.0-SNAPSHOT"
  :description "Graphite reporter integration for metrics-clojure"
  :url "https://github.com/sjl/metrics-clojure"
  :license {:name "MIT"}
  :profiles {:dev {:global-vars {*warn-on-reflection* true}}}
  :dependencies [[metrics-clojure "2.11.0-SNAPSHOT"]
                 [io.dropwizard.metrics/metrics-graphite "3.2.2"]])
