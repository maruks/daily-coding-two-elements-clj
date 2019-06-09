(ns two-elements.core)

(defn elements [xs]
  (let [xored     (apply bit-xor xs)
        right-bit (bit-and xored (- xored))
        groups    (group-by #(zero? (bit-and right-bit %)) xs)
        x         (apply bit-xor (groups true))
        y         (apply bit-xor (groups false))]
    [x y]))
