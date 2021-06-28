(ns qbits.xi
  (:require [qbits.xi.protocols :as p]))

(defn async?
  [x]
  (satisfies? p/Future x))
