(ns qbits.xi
  (:refer-clojure :exclude [future? realized? empty])
  (:require [qbits.xi.protocols :as p]))

(defn future?
  [x]
  (satisfies? p/Future x))

(def then #'p/-then)
(def fmap #'p/-fmap)
(def catch #'p/-catch)
(def finally #'p/-finally)
(def success! #'p/-success!)
(def complete!  #'p/-complete!)
(def success? #'p/-success?)
(def error! #'p/-error!)
(def error? #'p/-error?)
(def cancel! #'p/-cancel!)
(def canceled? #'p/-canceled?)
(def timeout! #'p/-timeout!)
(def handle #'p/-handle)
(def realized? #'p/-realized?)
(def when-complete #'p/-when-complete)
(def empty #'p/-empty)
