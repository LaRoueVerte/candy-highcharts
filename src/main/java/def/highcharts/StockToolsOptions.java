package def.highcharts;
/**
 * (Highstock) Configure the stockTools gui strings in the chart. Requires the
 * [stockTools module]() to be loaded. For a description of the module and
 * information on its features, see [Highcharts StockTools]().
 */
@jsweet.lang.Interface
public abstract class StockToolsOptions extends def.js.Object {
    /**
     * (Highstock) Definitions of buttons in Stock Tools GUI.
     */
    @jsweet.lang.Optional
    public StockToolsGuiOptions gui;
}

