(ns test-sugar.core-test
  (:require [clojure.test :refer [deftest is]]
            [test-sugar.core :as ts]))

(deftest test-is-do
  (ts/is-do nil? (get [] 10)))

(deftest test-is=
  (ts/is= 10 (identity 10)))

(deftest test-with-provided
  (ts/with-provided {#'identity inc
                     #'dec (fn [x] (* x 5))}
    (ts/is= 11 (identity 10))
    (ts/is= 15 (dec 3))))
