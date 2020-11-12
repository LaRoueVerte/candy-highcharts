package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options global to all
 * data series. Individual series can also have specific accessibility options
 * set.
 */
@jsweet.lang.Interface
public abstract class AccessibilitySeriesOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to add series
     * descriptions to charts with a single series.
     */
    @jsweet.lang.Optional
    public Boolean describeSingleSeries;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
     * instead of the default for series descriptions. Receives one argument,
     * `series`, referring to the series to describe. Should return a string
     * with the description of the series for a screen reader user. If `false`
     * is returned, the default formatter will be used for that series.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Series,String> descriptionFormatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
     * points than this, we no longer expose information about individual points
     * to screen readers.
     *
     * Set to `false` to disable.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Double> pointDescriptionEnabledThreshold;
}

