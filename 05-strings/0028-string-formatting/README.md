# 0028 — String Formatting

Format the float `3.14159` to two decimals and zero-pad the integer `42` to width five, printing `pi: 3.14` and `id: 00042`. `clojure.core/format` wraps `String.format` but uses the default locale, so the locale-sensitive `%.2f` is done with `String/format` and an explicit `Locale/US`; the locale-independent `%05d` uses plain `format`.

## Run

    clojure -M main.clj
