(defproject cc.qbits/xi "0.1.5-SNAPSHOT"
  :description ""
  :url "http://github.com/mpenet/xi"
  :license {:url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.2"]]
  :cljfmt {:remove-multiple-non-indenting-spaces? true}
  :global-vars {*warn-on-reflection* true}
  :deploy-repositories [["snapshots" :clojars] ["releases" :clojars]])
