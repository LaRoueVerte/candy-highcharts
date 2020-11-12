package def.highcharts;
/**
 * (Highcharts) A configuration object to define how the color of a child varies
 * from the parent's color. The variation is distributed among the children of
 * node. For example when setting brightness, the brightness change will range
 * from the parent's original brightness on the first child, to the amount set
 * in the `to` setting on the last node. This allows a gradient-like color
 * scheme that sets children out from each other while highlighting the grouping
 * on treemaps and sectors on sunburst charts.
 */
@jsweet.lang.Interface
public abstract class PlotTreemapLevelsColorVariationOptions extends def.js.Object {
    /**
     * (Highcharts) The key of a color variation. Currently supports
     * `brightness` only.
     */
    @jsweet.lang.Optional
    public def.highcharts.StringTypes.brightness key;
    /**
     * (Highcharts) The ending value of a color variation. The last sibling will
     * receive this value.
     */
    @jsweet.lang.Optional
    public double to;
}

