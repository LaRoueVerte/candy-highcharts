package def.highcharts;
/**
 * (Highcharts, Highstock) Options for the series data sorting.
 */
@jsweet.lang.Interface
public abstract class PlotSeriesDataSortingOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock) Enable or disable data sorting for the series.
     * Use xAxis.reversed to change the sorting order.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock) Whether to allow matching points by name in an
     * update. If this option is disabled, points will be matched by order.
     */
    @jsweet.lang.Optional
    public Boolean matchByName;
    /**
     * (Highcharts, Highstock) Determines what data value should be used to sort
     * by.
     */
    @jsweet.lang.Optional
    public String sortKey;
}

