(ns test-sugar.core
  (:require #+clj [clojure.test :refer [is]]
            [cemerick.cljs.test])
  #+cljs (:require-macros [cemerick.cljs.test :refer [is]]))

(defn is-do
  "Equals to (is (apply fnc body)).
  Example usage:
    (is-do nil? (get [] 10))"
  [fnc & body]
  (is (apply fnc body)))

(defn is=
  "Equals to (is (apply = boy)).
  Example usage:
    (is= 10 (identity 10))"
  [& body]
  (apply is-do = body))
