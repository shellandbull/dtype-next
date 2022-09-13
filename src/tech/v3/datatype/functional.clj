(ns tech.v3.datatype.functional
  ;;Autogenerated from tech.v3.datatype.functional-api-- DO NOT EDIT
  "Arithmetic and statistical operations based on the Buffer interface.  These
  operators and functions all implement vectorized interfaces so passing in something
  convertible to a reader will return a reader.  Arithmetic operations are done lazily.
  These functions generally incur a large dispatch cost so for example each call to '+'
  checks all the arguments to decide if it should dispatch to an iterable implementation
  or to a reader implementation.  For tight loops or operations like map and filter,
  using the specific operators will result in far faster code than using the '+'
  function itself."
  (:require [tech.v3.datatype.functional-api]
            [tech.v3.datatype.rolling]
            [tech.v3.datatype.statistics]
            [tech.v3.datatype.unary-pred])
  (:refer-clojure :exclude [+ - / * <= < >= > identity min max bit-xor bit-and bit-and-not bit-not bit-set bit-test bit-or bit-flip bit-clear bit-shift-left bit-shift-right unsigned-bit-shift-right quot rem cast not and or neg? even? zero? odd? pos?]))

(defn *
  ([x y]
  (tech.v3.datatype.functional-api/* x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/* x y args)))


(defn +
  ([x]
  (tech.v3.datatype.functional-api/+ x))
  ([x y]
  (tech.v3.datatype.functional-api/+ x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/+ x y args)))


(defn -
  ([x]
  (tech.v3.datatype.functional-api/- x))
  ([x y]
  (tech.v3.datatype.functional-api/- x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/- x y args)))


(defn /
  ([x]
  (tech.v3.datatype.functional-api// x))
  ([x y]
  (tech.v3.datatype.functional-api// x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api// x y args)))


(defn <
  ([lhs mid rhs]
  (tech.v3.datatype.functional-api/< lhs mid rhs))
  ([lhs rhs]
  (tech.v3.datatype.functional-api/< lhs rhs)))


(defn <=
  ([lhs mid rhs]
  (tech.v3.datatype.functional-api/<= lhs mid rhs))
  ([lhs rhs]
  (tech.v3.datatype.functional-api/<= lhs rhs)))


(defn >
  ([lhs mid rhs]
  (tech.v3.datatype.functional-api/> lhs mid rhs))
  ([lhs rhs]
  (tech.v3.datatype.functional-api/> lhs rhs)))


(defn >=
  ([lhs mid rhs]
  (tech.v3.datatype.functional-api/>= lhs mid rhs))
  ([lhs rhs]
  (tech.v3.datatype.functional-api/>= lhs rhs)))


(defn abs
  ([x options]
  (tech.v3.datatype.functional-api/abs x options))
  ([x]
  (tech.v3.datatype.functional-api/abs x)))


(defn acos
  ([x options]
  (tech.v3.datatype.functional-api/acos x options))
  ([x]
  (tech.v3.datatype.functional-api/acos x)))


(defn and
  ([lhs rhs]
  (tech.v3.datatype.functional-api/and lhs rhs)))


(defn asin
  ([x options]
  (tech.v3.datatype.functional-api/asin x options))
  ([x]
  (tech.v3.datatype.functional-api/asin x)))


(defn atan
  ([x options]
  (tech.v3.datatype.functional-api/atan x options))
  ([x]
  (tech.v3.datatype.functional-api/atan x)))


(defn atan2
  ([x y]
  (tech.v3.datatype.functional-api/atan2 x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/atan2 x y args)))


(defn bit-and
  ([x y]
  (tech.v3.datatype.functional-api/bit-and x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-and x y args)))


(defn bit-and-not
  ([x y]
  (tech.v3.datatype.functional-api/bit-and-not x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-and-not x y args)))


(defn bit-clear
  ([x y]
  (tech.v3.datatype.functional-api/bit-clear x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-clear x y args)))


(defn bit-flip
  ([x y]
  (tech.v3.datatype.functional-api/bit-flip x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-flip x y args)))


(defn bit-not
  ([x options]
  (tech.v3.datatype.functional-api/bit-not x options))
  ([x]
  (tech.v3.datatype.functional-api/bit-not x)))


(defn bit-or
  ([x y]
  (tech.v3.datatype.functional-api/bit-or x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-or x y args)))


(defn bit-set
  ([x y]
  (tech.v3.datatype.functional-api/bit-set x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-set x y args)))


(defn bit-shift-left
  ([x y]
  (tech.v3.datatype.functional-api/bit-shift-left x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-shift-left x y args)))


(defn bit-shift-right
  ([x y]
  (tech.v3.datatype.functional-api/bit-shift-right x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-shift-right x y args)))


(defn bit-test
  ([x y]
  (tech.v3.datatype.functional-api/bit-test x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-test x y args)))


(defn bit-xor
  ([x y]
  (tech.v3.datatype.functional-api/bit-xor x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-xor x y args)))


(defn bool-reader->indexes
  "Given a reader, produce a filtered list of indexes filtering out 'false' values."
  (^{:tag tech.v3.datatype.PrimitiveList} [options bool-item]
  (tech.v3.datatype.unary-pred/bool-reader->indexes options bool-item))
  (^{:tag tech.v3.datatype.PrimitiveList} [bool-item]
  (tech.v3.datatype.unary-pred/bool-reader->indexes bool-item)))


(defn cbrt
  ([x options]
  (tech.v3.datatype.functional-api/cbrt x options))
  ([x]
  (tech.v3.datatype.functional-api/cbrt x)))


(defn ceil
  ([x options]
  (tech.v3.datatype.functional-api/ceil x options))
  ([x]
  (tech.v3.datatype.functional-api/ceil x)))


(defn cos
  ([x options]
  (tech.v3.datatype.functional-api/cos x options))
  ([x]
  (tech.v3.datatype.functional-api/cos x)))


(defn cosh
  ([x options]
  (tech.v3.datatype.functional-api/cosh x options))
  ([x]
  (tech.v3.datatype.functional-api/cosh x)))


(defn cummax
  "Cumulative running max; returns result in double space.

  Options:

  * `:nan-strategy` - one of `:keep`, `:remove`, `:exception`.  Defaults to `:remove`."
  ([options data]
  (tech.v3.datatype.functional-api/cummax options data))
  ([data]
  (tech.v3.datatype.functional-api/cummax data)))


(defn cummin
  "Cumulative running min; returns result in double space.

  Options:

  * `:nan-strategy` - one of `:keep`, `:remove`, `:exception`.  Defaults to `:remove`."
  ([options data]
  (tech.v3.datatype.functional-api/cummin options data))
  ([data]
  (tech.v3.datatype.functional-api/cummin data)))


(defn cumop
  ([options op data]
  (tech.v3.datatype.functional-api/cumop options op data)))


(defn cumprod
  "Cumulative running product; returns result in double space.

  Options:

  * `:nan-strategy` - one of `:keep`, `:remove`, `:exception`.  Defaults to `:remove`."
  ([options data]
  (tech.v3.datatype.functional-api/cumprod options data))
  ([data]
  (tech.v3.datatype.functional-api/cumprod data)))


(defn cumsum
  "Cumulative running summation; returns result in double space.

  Options:

  * `:nan-strategy` - one of `:keep`, `:remove`, `:exception`.  Defaults to `:remove`."
  ([options data]
  (tech.v3.datatype.functional-api/cumsum options data))
  ([data]
  (tech.v3.datatype.functional-api/cumsum data)))


(defn descriptive-statistics
  "Calculate a set of descriptive statistics on a single reader.

  Available stats:
  #{:min :quartile-1 :sum :mean :mode :median :quartile-3 :max
    :variance :standard-deviation :skew :n-values :kurtosis}

  options
    - `:nan-strategy` - defaults to :remove, one of
    [:keep :remove :exception]. The fastest option is :keep but this
    may result in your results having NaN's in them.  You can also pass
  in a double predicate to filter custom double values."
  ([stats-names stats-data options rdr]
  (tech.v3.datatype.statistics/descriptive-statistics stats-names stats-data options rdr))
  ([stats-names options rdr]
  (tech.v3.datatype.statistics/descriptive-statistics stats-names options rdr))
  ([stats-names rdr]
  (tech.v3.datatype.statistics/descriptive-statistics stats-names rdr))
  ([rdr]
  (tech.v3.datatype.statistics/descriptive-statistics rdr)))


(defn distance
  (^{:tag double} [lhs rhs]
  (tech.v3.datatype.functional-api/distance lhs rhs)))


(defn distance-squared
  (^{:tag double} [lhs rhs]
  (tech.v3.datatype.functional-api/distance-squared lhs rhs)))


(defn dot-product
  (^{:tag double} [lhs rhs]
  (tech.v3.datatype.functional-api/dot-product lhs rhs)))


(defn eq
  ([lhs rhs]
  (tech.v3.datatype.functional-api/eq lhs rhs)))


(defn equals
  ([lhs rhs & args]
  (apply tech.v3.datatype.functional-api/equals lhs rhs args)))


(defn even?
  ([arg options]
  (tech.v3.datatype.functional-api/even? arg options))
  ([arg]
  (tech.v3.datatype.functional-api/even? arg)))


(defn exp
  ([x options]
  (tech.v3.datatype.functional-api/exp x options))
  ([x]
  (tech.v3.datatype.functional-api/exp x)))


(defn expm1
  ([x options]
  (tech.v3.datatype.functional-api/expm1 x options))
  ([x]
  (tech.v3.datatype.functional-api/expm1 x)))


(defn fill-range
  "Given a reader of numeric data and a max span amount, produce
  a new reader where the difference between any two consecutive elements
  is less than or equal to the max span amount.  Also return a bitmap of the added
  indexes.  Uses linear interpolation to fill in areas, operates in double space.
  Returns
  {:result :missing}"
  ([numeric-data max-span]
  (tech.v3.datatype.functional-api/fill-range numeric-data max-span)))


(defn finite?
  ([arg options]
  (tech.v3.datatype.functional-api/finite? arg options))
  ([arg]
  (tech.v3.datatype.functional-api/finite? arg)))


(defn fixed-rolling-window
  "Return a lazily evaluated rolling window of window-fn applied to each window.  The
  iterable or sequence is padded such that there are the same number of values in the
  result as in the input with repeated elements padding the beginning and end of the original
  sequence.
  If input is an iterator, output is an lazy sequence.  If input is a reader,
  output is a reader.

  :Options

  * `:relative-window-position` - Defaults to `:center` - controls the window's
  relative positioning in the sequence.
  * `:edge-mode` - Defaults to `:clamp` - either `:zero` in which case window values
  off the edge are zero for numeric types or nil for object types or `:clamp` - in
  which case window values off the edge of the data are bound to the first or last
  values respectively.


  Example (all results are same length):

```clojure
user> (require '[tech.v3.datatype :as dtype])
nil
user> (require '[tech.v3.datatype.rolling :as rolling])
nil
user> (require '[tech.v3.datatype.functional :as dfn])
nil
  user> (rolling/fixed-rolling-window (range 20) 5 dfn/sum {:relative-window-position :left})
[0 1 3 6 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85]
user> (rolling/fixed-rolling-window (range 20) 5 dfn/sum {:relative-window-position :center})
[3 6 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 89 92]
user> (rolling/fixed-rolling-window (range 20) 5 dfn/sum {:relative-window-position :right})
[10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 89 92 94 95]
user>
```"
  ([item window-size window-fn options]
  (tech.v3.datatype.rolling/fixed-rolling-window item window-size window-fn options))
  ([item window-size window-fn]
  (tech.v3.datatype.rolling/fixed-rolling-window item window-size window-fn)))


(defn floor
  ([x options]
  (tech.v3.datatype.functional-api/floor x options))
  ([x]
  (tech.v3.datatype.functional-api/floor x)))


(defn get-significand
  ([x options]
  (tech.v3.datatype.functional-api/get-significand x options))
  ([x]
  (tech.v3.datatype.functional-api/get-significand x)))


(defn hypot
  ([x y]
  (tech.v3.datatype.functional-api/hypot x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/hypot x y args)))


(defn identity
  ([x options]
  (tech.v3.datatype.functional-api/identity x options))
  ([x]
  (tech.v3.datatype.functional-api/identity x)))


(defn ieee-remainder
  ([x y]
  (tech.v3.datatype.functional-api/ieee-remainder x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/ieee-remainder x y args)))


(defn infinite?
  ([arg options]
  (tech.v3.datatype.functional-api/infinite? arg options))
  ([arg]
  (tech.v3.datatype.functional-api/infinite? arg)))


(defn kendalls-correlation
  (^{:tag double} [options lhs rhs]
  (tech.v3.datatype.statistics/kendalls-correlation options lhs rhs))
  (^{:tag double} [lhs rhs]
  (tech.v3.datatype.statistics/kendalls-correlation lhs rhs)))


(defn kurtosis
  (^{:tag double} [data options]
  (tech.v3.datatype.statistics/kurtosis data options))
  (^{:tag double} [data]
  (tech.v3.datatype.statistics/kurtosis data)))


(defn linear-regressor
  "Create a simple linear regressor.  Returns a function that given a (double) 'x'
  predicts a (double) 'y'.  The function has metadata that contains the regressor and
  some regressor info, notably slope and intercept.

  Example:

```clojure
tech.v3.datatype.functional> (def regressor (linear-regressor [1 2 3] [4 5 6]))
#'tech.v3.datatype.functional/regressor
tech.v3.datatype.functional> (regressor 1)
4.0
tech.v3.datatype.functional> (regressor 2)
5.0
tech.v3.datatype.functional> (meta regressor)
{:regressor
  #object[org.apache.commons.math3.stat.regression.SimpleRegression 0x52091e82 \"org.apache.commons.math3.stat.regression.SimpleRegression@52091e82\"],
 :intercept 3.0,
 :slope 1.0,
 :mean-squared-error 0.0}
```"
  ([x y]
  (tech.v3.datatype.functional-api/linear-regressor x y)))


(defn log
  ([x options]
  (tech.v3.datatype.functional-api/log x options))
  ([x]
  (tech.v3.datatype.functional-api/log x)))


(defn log10
  ([x options]
  (tech.v3.datatype.functional-api/log10 x options))
  ([x]
  (tech.v3.datatype.functional-api/log10 x)))


(defn log1p
  ([x options]
  (tech.v3.datatype.functional-api/log1p x options))
  ([x]
  (tech.v3.datatype.functional-api/log1p x)))


(defn logistic
  ([x options]
  (tech.v3.datatype.functional-api/logistic x options))
  ([x]
  (tech.v3.datatype.functional-api/logistic x)))


(defn magnitude
  (^{:tag double} [item _options]
  (tech.v3.datatype.functional-api/magnitude item _options))
  (^{:tag double} [item]
  (tech.v3.datatype.functional-api/magnitude item)))


(defn magnitude-squared
  (^{:tag double} [data]
  (tech.v3.datatype.functional-api/magnitude-squared data)))


(defn mathematical-integer?
  ([arg options]
  (tech.v3.datatype.functional-api/mathematical-integer? arg options))
  ([arg]
  (tech.v3.datatype.functional-api/mathematical-integer? arg)))


(defn max
  ([x]
  (tech.v3.datatype.functional-api/max x))
  ([x y]
  (tech.v3.datatype.functional-api/max x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/max x y args)))


(defn mean
  "double mean of data"
  (^{:tag double} [data options]
  (tech.v3.datatype.statistics/mean data options))
  (^{:tag double} [data]
  (tech.v3.datatype.statistics/mean data)))


(defn mean-fast
  "Take the mean of the data.  This operation doesn't know anything about nan hence it is
  a bit faster than the base [[mean]] fn."
  (^{:tag double} [data]
  (tech.v3.datatype.functional-api/mean-fast data)))


(defn median
  (^{:tag double} [data options]
  (tech.v3.datatype.statistics/median data options))
  (^{:tag double} [data]
  (tech.v3.datatype.statistics/median data)))


(defn min
  ([x]
  (tech.v3.datatype.functional-api/min x))
  ([x y]
  (tech.v3.datatype.functional-api/min x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/min x y args)))


(defn nan?
  ([arg options]
  (tech.v3.datatype.functional-api/nan? arg options))
  ([arg]
  (tech.v3.datatype.functional-api/nan? arg)))


(defn neg?
  ([arg options]
  (tech.v3.datatype.functional-api/neg? arg options))
  ([arg]
  (tech.v3.datatype.functional-api/neg? arg)))


(defn next-down
  ([x options]
  (tech.v3.datatype.functional-api/next-down x options))
  ([x]
  (tech.v3.datatype.functional-api/next-down x)))


(defn next-up
  ([x options]
  (tech.v3.datatype.functional-api/next-up x options))
  ([x]
  (tech.v3.datatype.functional-api/next-up x)))


(defn normalize
  ([item]
  (tech.v3.datatype.functional-api/normalize item)))


(defn not
  ([arg options]
  (tech.v3.datatype.functional-api/not arg options))
  ([arg]
  (tech.v3.datatype.functional-api/not arg)))


(defn not-eq
  ([lhs rhs]
  (tech.v3.datatype.functional-api/not-eq lhs rhs)))


(defn odd?
  ([arg options]
  (tech.v3.datatype.functional-api/odd? arg options))
  ([arg]
  (tech.v3.datatype.functional-api/odd? arg)))


(defn or
  ([lhs rhs]
  (tech.v3.datatype.functional-api/or lhs rhs)))


(defn pearsons-correlation
  (^{:tag double} [options lhs rhs]
  (tech.v3.datatype.statistics/pearsons-correlation options lhs rhs))
  (^{:tag double} [lhs rhs]
  (tech.v3.datatype.statistics/pearsons-correlation lhs rhs)))


(defn percentiles
  "Create a reader of percentile values, one for each percentage passed in.
  Estimation types are in the set of #{:r1,r2...legacy} and are described
  here: https://commons.apache.org/proper/commons-math/javadocs/api-3.3/index.html.

  nan-strategy can be one of [:keep :remove :exception] and defaults to :exception."
  (^{:tag tech.v3.datatype.Buffer} [percentages options data]
  (tech.v3.datatype.statistics/percentiles percentages options data))
  (^{:tag tech.v3.datatype.Buffer} [percentages data]
  (tech.v3.datatype.statistics/percentiles percentages data)))


(defn pos?
  ([arg options]
  (tech.v3.datatype.functional-api/pos? arg options))
  ([arg]
  (tech.v3.datatype.functional-api/pos? arg)))


(defn pow
  ([x y]
  (tech.v3.datatype.functional-api/pow x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/pow x y args)))


(defn quartile-1
  (^{:tag double} [data options]
  (tech.v3.datatype.statistics/quartile-1 data options))
  (^{:tag double} [data]
  (tech.v3.datatype.statistics/quartile-1 data)))


(defn quartile-3
  (^{:tag double} [data options]
  (tech.v3.datatype.statistics/quartile-3 data options))
  (^{:tag double} [data]
  (tech.v3.datatype.statistics/quartile-3 data)))


(defn quartile-outlier-fn
  "Create a function that, given floating point data, will return true or false
  if that data is an outlier.  Default range mult is 1.5:
  (or (< val (- q1 (* range-mult iqr)))
      (> val (+ q3 (* range-mult iqr)))"
  ([item & args]
  (apply tech.v3.datatype.statistics/quartile-outlier-fn item args)))


(defn quartiles
  "return [min, 25 50 75 max] of item"
  (^{:tag tech.v3.datatype.Buffer} [item]
  (tech.v3.datatype.statistics/quartiles item))
  (^{:tag tech.v3.datatype.Buffer} [options item]
  (tech.v3.datatype.statistics/quartiles options item)))


(defn quot
  ([x y]
  (tech.v3.datatype.functional-api/quot x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/quot x y args)))


(defn reduce-*
  ([rdr]
  (tech.v3.datatype.functional-api/reduce-* rdr)))


(defn reduce-+
  ([rdr]
  (tech.v3.datatype.functional-api/reduce-+ rdr)))


(defn reduce-max
  ([rdr]
  (tech.v3.datatype.functional-api/reduce-max rdr)))


(defn reduce-min
  ([rdr]
  (tech.v3.datatype.functional-api/reduce-min rdr)))


(defn rem
  ([x y]
  (tech.v3.datatype.functional-api/rem x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/rem x y args)))


(defn rint
  ([x options]
  (tech.v3.datatype.functional-api/rint x options))
  ([x]
  (tech.v3.datatype.functional-api/rint x)))


(defn round
  "Vectorized implementation of Math/round.  Operates in double space
  but returns a long or long reader."
  ([arg options]
  (tech.v3.datatype.functional-api/round arg options))
  ([arg]
  (tech.v3.datatype.functional-api/round arg)))


(defn shift
  "Shift by n and fill in with the first element for n>0 or last element for n<0.

  Examples:

```clojure
user> (dfn/shift (range 10) 2)
[0 0 0 1 2 3 4 5 6 7]
user> (dfn/shift (range 10) -2)
[2 3 4 5 6 7 8 9 9 9]
```"
  (^{:tag tech.v3.datatype.Buffer} [rdr n]
  (tech.v3.datatype.functional-api/shift rdr n)))


(defn signum
  ([x options]
  (tech.v3.datatype.functional-api/signum x options))
  ([x]
  (tech.v3.datatype.functional-api/signum x)))


(defn sin
  ([x options]
  (tech.v3.datatype.functional-api/sin x options))
  ([x]
  (tech.v3.datatype.functional-api/sin x)))


(defn sinh
  ([x options]
  (tech.v3.datatype.functional-api/sinh x options))
  ([x]
  (tech.v3.datatype.functional-api/sinh x)))


(defn skew
  (^{:tag double} [data options]
  (tech.v3.datatype.statistics/skew data options))
  (^{:tag double} [data]
  (tech.v3.datatype.statistics/skew data)))


(defn spearmans-correlation
  (^{:tag double} [options lhs rhs]
  (tech.v3.datatype.statistics/spearmans-correlation options lhs rhs))
  (^{:tag double} [lhs rhs]
  (tech.v3.datatype.statistics/spearmans-correlation lhs rhs)))


(defn sq
  ([x options]
  (tech.v3.datatype.functional-api/sq x options))
  ([x]
  (tech.v3.datatype.functional-api/sq x)))


(defn sqrt
  ([x options]
  (tech.v3.datatype.functional-api/sqrt x options))
  ([x]
  (tech.v3.datatype.functional-api/sqrt x)))


(defn standard-deviation
  (^{:tag double} [data options]
  (tech.v3.datatype.statistics/standard-deviation data options))
  (^{:tag double} [data]
  (tech.v3.datatype.statistics/standard-deviation data)))


(defn sum
  "Double sum of data using
  [Kahan compensated summation](https://en.wikipedia.org/wiki/Kahan_summation_algorithm)."
  (^{:tag double} [data options]
  (tech.v3.datatype.statistics/sum data options))
  (^{:tag double} [data]
  (tech.v3.datatype.statistics/sum data)))


(defn sum-fast
  "Find the sum of the data.  This operation is neither nan-aware nor does it implement
  kahans compensation although via parallelization it implements pairwise summation
  compensation.  For a more but slightly slower but far more correct sum operator,
  use [[sum]]."
  (^{:tag double} [data]
  (tech.v3.datatype.functional-api/sum-fast data)))


(defn tan
  ([x options]
  (tech.v3.datatype.functional-api/tan x options))
  ([x]
  (tech.v3.datatype.functional-api/tan x)))


(defn tanh
  ([x options]
  (tech.v3.datatype.functional-api/tanh x options))
  ([x]
  (tech.v3.datatype.functional-api/tanh x)))


(defn to-degrees
  ([x options]
  (tech.v3.datatype.functional-api/to-degrees x options))
  ([x]
  (tech.v3.datatype.functional-api/to-degrees x)))


(defn to-radians
  ([x options]
  (tech.v3.datatype.functional-api/to-radians x options))
  ([x]
  (tech.v3.datatype.functional-api/to-radians x)))


(defn ulp
  ([x options]
  (tech.v3.datatype.functional-api/ulp x options))
  ([x]
  (tech.v3.datatype.functional-api/ulp x)))


(defn unsigned-bit-shift-right
  ([x y]
  (tech.v3.datatype.functional-api/unsigned-bit-shift-right x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/unsigned-bit-shift-right x y args)))


(defn variance
  (^{:tag double} [data options]
  (tech.v3.datatype.statistics/variance data options))
  (^{:tag double} [data]
  (tech.v3.datatype.statistics/variance data)))


(defn zero?
  ([arg options]
  (tech.v3.datatype.functional-api/zero? arg options))
  ([arg]
  (tech.v3.datatype.functional-api/zero? arg)))


