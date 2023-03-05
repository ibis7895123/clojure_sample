(ns clojure-sample.core)

(defn f [x] (+ x 0))

(nth
 (iterate
  (fn [x] 
    (+ x 2)
    )
  0)
 5)
