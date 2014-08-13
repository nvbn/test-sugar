(ns test-sugar.core-test
  (:require [clojure.test :refer [deftest is]]
            [test-sugar.core :as ts]))

(deftest test-is-do
  (ts/is-do nil? (get [] 10)))

(deftest test-is=
  (ts/is= 10 (identity 10)))

(defn fake-inc
  [x]
  (+ 10 x))

(defn fake-identity
  [x]
  [x])

(deftest test-with-provided
  (ts/with-provided {#'fake-inc inc
                     #'fake-identity (fn [x] (* x 5))}
    (ts/is= 11 (fake-inc 10))
    (ts/is= 15 (fake-identity 3))))
