# test-sugar

Usefull sugar for `clojure.test` and `clojurescript.test`.

## Installation

Add the following dependency to your `project.clj` file:

    [test-sugar "2.0"]

## Usage

`test-sugar` provide set of utility functions.

`is-do` &mdash; shortcut for `(is (apply fnc args))`:

```clojure
(require '(test-sugar.core :refer [is-do]))

(is-do = 10 (inc 10)) ; => true
(is-do nil? nil) ; => true
(is-do nil? 10) ; => false
```

`is=` &mdash; shortcut for `(is (apply = args))`:

```clojure
(require '(test-sugar.core :refer [is=]))

(is= 10 10) ; => true
(is= 9 (inc 8)) ; => true
(is= 5 6) ; => false
```

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
