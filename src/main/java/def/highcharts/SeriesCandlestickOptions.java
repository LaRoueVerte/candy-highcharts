package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highstock) A `candlestick` series. If the type option is not specified, it
 * is inherited from chart.type.
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * 1. Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * 2. Options for all `candlestick` series are defined in
 * plotOptions.candlestick.
 *
 * 3. Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * You have to extend the `SeriesCandlestickOptions` via an interface to allow
 * custom properties: ``` declare interface SeriesCandlestickOptions {
 * customProperty: string; }
 *
 */
@jsweet.lang.Interface
@jsweet.lang.Extends({SeriesOptions.class})
public abstract class SeriesCandlestickOptions extends PlotCandlestickOptions {
    /**
     * (Highstock) An array of data points for the series. For the `candlestick`
     * series type, points can be given in the following ways:
     *
     * 1. An array of arrays with 5 or 4 values. In this case, the values
     * correspond to `x,open,high,low,close`. If the first value is a string, it
     * is applied as the name of the point, and the `x` value is inferred. The
     * `x` value can also be omitted, in which case the inner arrays should be
     * of length 4. Then the `x` value is automatically calculated, either
     * starting at 0 and incremented by 1, or from `pointStart` and
     * `pointInterval` given in the series options. (see online documentation
     * for example)
     *
     * 2. An array of objects with named values. The following snippet shows
     * only a few settings, see the complete options set below. If the total
     * number of data points exceeds the series' turboThreshold, this option is
     * not available. (see online documentation for example)
     */
    @jsweet.lang.Optional
    public Array<Union3<jsweet.util.tuple.Tuple4<jsweet.util.union.Union<Double,String>,Double,Double,Double>,jsweet.util.tuple.Tuple5<jsweet.util.union.Union<Double,String>,Double,Double,Double,Double>,PointOptionsObject>> data;
    /**
     * Not available
     */
    @jsweet.lang.Optional
    public Object dataParser;
    /**
     * Not available
     */
    @jsweet.lang.Optional
    public Object dataURL;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
     * TypeScript non-optional and might be `undefined` in series objects from
     * unknown sources.
     */
    public def.highcharts.StringTypes.candlestick type;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
     * be used after render time to get a pointer to the series object through
     * `chart.get()`.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
     * chart, affecting the internal index in the `chart.series` array, the
     * visible Z index as well as the order in the legend.
     */
    @jsweet.lang.Optional
    public double index;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the
     * series in the legend.
     */
    @jsweet.lang.Optional
    public double legendIndex;
    /**
     * (Highmaps) A map data object containing a `path` definition and
     * optionally additional properties to join in the data as per the `joinBy`
     * option.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Array<SeriesMapDataOptions>,?> mapData;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
     * in the legend, tooltip etc.
     */
    @jsweet.lang.Optional
    public String name;
    /**
     * (Highcharts, Highstock) This option allows grouping series in a stacked
     * chart. The stack option can be a string or anything else, as long as the
     * grouped series' stack options match each other after conversion into a
     * string.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> stack;
    /**
     * (Highcharts, Highstock) When using dual or multiple x axes, this number
     * defines which xAxis the particular series is connected to. It refers to
     * either the axis id or the index of the axis in the xAxis array, with 0
     * being the first.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> xAxis;
    /**
     * (Highcharts, Highstock) When using dual or multiple y axes, this number
     * defines which yAxis the particular series is connected to. It refers to
     * either the axis id or the index of the axis in the yAxis array, with 0
     * being the first.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> yAxis;
    /**
     * (Highcharts, Highstock) Define the visual z index of the series.
     */
    @jsweet.lang.Optional
    public double zIndex;
}

