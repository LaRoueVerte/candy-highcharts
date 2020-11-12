package def.highcharts;
import def.dom.Event;
/**
 * Definition for a menu item in the context menu.
 */
@jsweet.lang.Interface
public abstract class ExportingMenuObject extends def.js.Object {
    /**
     * The click handler for the menu item.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<Chart,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> onclick;
    /**
     * Indicates a separator line instead of an item.
     */
    @jsweet.lang.Optional
    public Boolean separator;
    /**
     * The text for the menu item.
     */
    @jsweet.lang.Optional
    public String text;
    /**
     * If internationalization is required, the key to a language string.
     */
    @jsweet.lang.Optional
    public String textKey;
}

