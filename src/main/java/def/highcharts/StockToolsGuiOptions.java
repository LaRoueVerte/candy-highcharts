package def.highcharts;
import def.js.Array;
/**
 * (Highstock) Definitions of buttons in Stock Tools GUI.
 */
@jsweet.lang.Interface
public abstract class StockToolsGuiOptions extends def.js.Object {
    /**
     * (Highstock) A collection of strings pointing to config options for the
     * toolbar items. Each name refers to a unique key from the definitions
     * object.
     */
    @jsweet.lang.Optional
    public Array<String> buttons;
    /**
     * (Highstock) A CSS class name to apply to the stocktools' div, allowing
     * unique CSS styling for each chart.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highstock) An options object of the buttons definitions. Each name
     * refers to unique key from buttons array.
     */
    @jsweet.lang.Optional
    public StockToolsGuiDefinitionsOptions definitions;
    /**
     * (Highstock) Enable or disable the stockTools gui.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock) A CSS class name to apply to the container of buttons,
     * allowing unique CSS styling for each chart.
     */
    @jsweet.lang.Optional
    public String toolbarClassName;
}

