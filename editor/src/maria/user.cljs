(ns maria.user
  (:require re-view.hiccup.core
            [maria.friendly.kinds :refer [what-is]]
            goog.net.jsloader
            maria.user.loaders
            maria.repl-specials
            [cells.cell :refer [cell]]
            [cells.lib :as cell
             :refer [interval timeout fetch geo-location with-view]
             :refer-macros [wait]]
            [shapes.core :as shapes :refer [listen
                                            circle ellipse square rectangle triangle polygon polyline text image
                                            position opacity rotate scale
                                            colorize stroke stroke-width no-stroke fill no-fill
                                            color-names colors-named rgb hsl rescale
                                            layer beside above value-to-cell!
                                            #_ gfish
                                            ;; are these internal only? -jar
                                            ;;assure-shape-seq shape-bounds bounds shape->vector
                                            ]]
            [re-view.core :include-macros true]
            [cljs.spec.alpha :include-macros true]
            [cljs.spec.test.alpha :include-macros true])
  (:require-macros [cells.cell :refer [defcell cell]]))
