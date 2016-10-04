# forecast-clojure

A Clojure library for retrieving data from the [forecast.io](https://developer.darkskyapp.com/docs/v2) API.

## Installation

`forecast-clojure` is available as a Maven artifact from [Clojars](http://clojars.org/forecast-clojure):

```clojure
[forecast-clojure "1.0.4"]
```

## Configuration

The library fetches your forecast.io API key from the environment using [Environ](https://github.com/weavejester/environ). You can set your key in one of two ways.

In `~/.lein/profiles.clj`:

```clojure
{:user {:env {:forecast-key "insert-your-api-key-here"}}}
```

Or, set it as an environment variable:

```bash
FORECAST_KEY=insert-your-api-key-here
```

## Usage

```clojure
(require '[forecast-clojure.core :refer :all])

(forecast "37.8267" "-122.423")
(forecast "37.8267" "-122.423" :time 1362974400)
(forecast "37.8267" "-122.423" :params {:units "si" :exclude "daily,alerts" :callback "..."})
```

Please refer to the [forecast.io API documentation](https://developer.darkskyapp.com/docs/v2) for information on the full response properties.

## License

Copyright © 2013 J.D. Hollis

Distributed under the Eclipse Public License, the same as Clojure.
