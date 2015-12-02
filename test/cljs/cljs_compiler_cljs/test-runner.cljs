(ns cljs_compiler_cljs.test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [cljs_compiler_cljs.core-test]))

(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'cljs_compiler_cljs.core-test))
    0
    1))
