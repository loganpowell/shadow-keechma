(ns starter.core
    (:require [reagent.core :as r]))

(defonce greeting "hello")
(def who "world")

(defn app []
  [:div greeting " " who])

; let's play with the js interop functionality and the REPL!

(js/console.log "Hey from proto-repl!")

(r/render [:div "NEW DIV BABY"
           [:div "and another!"]]
          (.getElementById js/document "app"))

(js/alert "foo")

; ok, enough monkey business :)

(defn stop []
  (js/console.log "Stopping..."))

(defn start []
  (js/console.log "Starting...")
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init []
  (start))
