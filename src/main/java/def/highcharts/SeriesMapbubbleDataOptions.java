package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highmaps) An array of data points for the series. For the `mapbubble` series
 * type, points can be given in the following ways:
 *
 * 1. An array of numerical values. In this case, the numerical values will be
 * interpreted as `z` options. Example: (see online documentation for example)
 *
 * 2. An array of objects with named values. The following snippet shows only a
 * few settings, see the complete options set below. If the total number of data
 * points exceeds the series' turboThreshold, this option is not available. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class SeriesMapbubbleDataOptions extends def.js.Object {
    /**
     * (Highmaps) Individual color for the point. By default the color is either
     * used to denote the value, or pulled from the global `colors` array.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highmaps) Individual data label for each point. The options are the same
     * as the ones for plotOptions.series.dataLabels.
     */
    @jsweet.lang.Optional
    public DataLabelsOptions dataLabels;
    /**
     * (Highmaps) The `id` of a series in the drilldown.series array to use for
     * a drilldown for this point.
     */
    @jsweet.lang.Optional
    public String drilldown;
    /**
     * (Highmaps) Individual point events
     */
    @jsweet.lang.Optional
    public PointEventsOptionsObject events;
    /**
     * (Highmaps) An id for the point. This can be used after render time to get
     * a pointer to the point object through `chart.get()`.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highmaps) The name of the point as shown in the legend, tooltip,
     * dataLabel etc.
     */
    @jsweet.lang.Optional
    public String name;
    /**
     * (Highmaps) While the `x` and `y` values of the bubble are determined by
     * the underlying map, the `z` indicates the actual value that gives the
     * size of the bubble.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> z;
}

