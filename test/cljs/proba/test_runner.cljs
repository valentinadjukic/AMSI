(ns proba.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [proba.core-test]
   [proba.common-test]))

(enable-console-print!)

(doo-tests 'proba.core-test
           'proba.common-test)
