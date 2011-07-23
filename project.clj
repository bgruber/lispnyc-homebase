(defproject org.lispnyc.webapp.homebase "3.0.0"
  :description "LispNYC's webserver and social integration homebase."
  :main org.lispnyc.webapp.homebase.core ; required for main
  :dependencies [
                 [org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [compojure "0.5.2"]
                 [ring/ring-jetty-adapter "0.3.5"]
                 [rhino/js "1.7R2"]
                 [enlive "1.0.0"]
                 [ring/ring-servlet "0.3.5"]
                 [hiccup "0.3.1"]
                 [pebble "2.5.1"]          ; pebble jar
                 [commons-logging "1.0.4"] ; pebble jar
                 [lucene "1.4.1"]          ; pebble jar
                 [acegi-security "1.0.6"]  ; pebble jar
                 [radeox "1.0-b2" ]        ; pebble jar
                 [javax.mail.glassfish "1.4.1.v201005082020"] ; pebble jar
                 ]
  :dev-dependencies [[lein-ring "0.4.5"]]
  :ring {:handler org.lispnyc.webapp.homebase.core/app-routes}
  :uberjar-name "home.war"
  )