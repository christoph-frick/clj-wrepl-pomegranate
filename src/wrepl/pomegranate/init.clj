(ns wrepl.pomegranate.init
  (:require [integrant.core :as ig]
            [cemerick.pomegranate :refer [add-dependencies]]))

(defmethod ig/init-key :wrepl.pomegranate/init
  [_ {:keys [coordinates repositories]
      :or {repositories {"clojars" "https://clojars.org/repo"
                         "jcenter" "https://jcenter.bintray.com"}}
      :as opts}]
  (add-dependencies :coordinates coordinates
                    :repositories repositories))
