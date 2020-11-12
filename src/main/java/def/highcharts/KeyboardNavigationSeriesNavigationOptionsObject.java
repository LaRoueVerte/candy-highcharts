package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the keyboard navigation
 * of data points and series.
 */
@jsweet.lang.Interface
public abstract class KeyboardNavigationSeriesNavigationOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Set the keyboard navigation mode
     * for the chart. Can be "normal" or "serialize". In normal mode, left/right
     * arrow keys move between points in a series, while up/down arrow keys move
     * between series. Up/down navigation acts intelligently to figure out which
     * series makes sense to move to from any given point.
     *
     * In "serialize" mode, points are instead navigated as a single list.
     * Left/right behaves as in "normal" mode. Up/down arrow keys will behave
     * like left/right. This can be useful for unifying navigation behavior
     * with/without screen readers enabled.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.normal,def.highcharts.StringTypes.serialize> mode;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
     * points than this, we no longer allow keyboard navigation for it.
     *
     * Set to `false` to disable.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Double> pointNavigationEnabledThreshold;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Skip null points when navigating
     * through points with the keyboard.
     */
    @jsweet.lang.Optional
    public Boolean skipNullPoints;
}

