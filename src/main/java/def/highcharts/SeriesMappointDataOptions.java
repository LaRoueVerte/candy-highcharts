package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highmaps) An array of data points for the series. For the `mappoint` series
 * type, points can be given in the following ways:
 *
 * 1. An array of numerical values. In this case, the numerical values will be
 * interpreted as `y` options. The `x` values will be automatically calculated,
 * either starting at 0 and incremented by 1, or from `pointStart` and
 * `pointInterval` given in the series options. If the axis has categories,
 * these will be used. Example: (see online documentation for example)
 *
 * 2. An array of arrays with 2 values. In this case, the values correspond to
 * `x,y`. If the first value is a string, it is applied as the name of the
 * point, and the `x` value is inferred. (see online documentation for example)
 *
 * 3. An array of objects with named values. The following snippet shows only a
 * few settings, see the complete options set below. If the total number of data
 * points exceeds the series' turboThreshold, this option is not available. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class SeriesMappointDataOptions extends def.js.Object {
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
     * (Highmaps) The latitude of the point. Must be combined with the `lon`
     * option to work. Overrides `x` and `y` values.
     */
    @jsweet.lang.Optional
    public double lat;
    /**
     * (Highmaps) The longitude of the point. Must be combined with the `lon`
     * option to work. Overrides `x` and `y` values.
     */
    @jsweet.lang.Optional
    public double lon;
    /**
     * (Highmaps) The name of the point as shown in the legend, tooltip,
     * dataLabel etc.
     */
    @jsweet.lang.Optional
    public String name;
    /**
     * (Highmaps) The x coordinate of the point in terms of the map path
     * coordinates.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highmaps) The x coordinate of the point in terms of the map path
     * coordinates.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> y;
}

