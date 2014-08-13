(ns test-sugar.core
  (:require [clojure.test :refer [is]]))

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

(defmacro with-provided
  "Sugar for redifining values.
  Example usage:
    (with-provided {#'core.async/chan (fn [] nil)
                    #'karma.core/select identity})
  "
  [redefs & body]
  `(with-redefs-fn ~redefs
     (fn [] ~@body)))
