(ns test-sugar.core-test
  (:require #+clj [clojure.test :refer [deftest is]]
            #+cljs [cemerick.cljs.test :refer-macros [is deftest]]
            [test-sugar.core :as ts]))

(deftest test-is-do
  (ts/is-do nil? (get [] 10)))

(deftest test-is=
  (ts/is= 10 (identity 10)))
