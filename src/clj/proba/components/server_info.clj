(ns proba.components.server-info
  (:require [com.stuartsierra.component :as component]))

(defrecord ServerInfoPrinter [http-port]
  component/Lifecycle
  (start [component]
    (println "Started proba on" (str "http://localhost:" http-port))
    component)
  (stop [component]
    component))
(defn server-info [http-port]
  (->ServerInfoPrinter http-port))
