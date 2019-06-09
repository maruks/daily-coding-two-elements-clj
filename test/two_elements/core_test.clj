(ns two-elements.core-test
  (:require [clojure.test :refer :all]
            [two-elements.core :refer :all]))

(deftest elements-test
  (is (= [9 7] (elements [2 4 7 9 2 4])))
  (is (= [8 4] (elements [2 4 6 8 10 2 6 10]))))
