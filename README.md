# clj-wrepl-pomegranate

`init` option for [clj-wrepl](https://github.com/christoph-frick/clj-wrepl) to load dependencies using [Pomegranate](https://github.com/cemerick/pomegranate)

## Setup

Add in your *wrepl* config:

```clojure
{:wrepl/init [#ig/ref :wrepl.pomegranate/init]
 :wrepl.pomegranate/init {:coordinates [[com.rpl/specter "1.0.3"]]}}
```

The config follows the [`add-classpath` usage](https://github.com/cemerick/pomegranate#add-classpath-usage) example:

- `:coordinates`: deps as list (like in a Leiningen `project.clj`)
- `:repositories` (optional): Map with repos; Default:
  ```clojure
  {"clojars" "https://clojars.org/repo"
   "jcenter" "https://jcenter.bintray.com"}
  ```
