(defproject net.ofnir/wrepl.pomegranate "0.1.2-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [integrant "0.8.0"]
                 [clj-commons/pomegranate "1.2.1"]
                 [org.slf4j/slf4j-simple "1.7.36"]]
  :deploy-repositories {"releases" {:url "https://clojars.org/repo/" :creds :gpg}})
