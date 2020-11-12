package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highmaps) An array of data points for the series. For the `map` series type,
 * points can be given in the following ways:
 *
 * 1. An array of numerical values. In this case, the numerical values will be
 * interpreted as `value` options. Example: (see online documentation for
 * example)
 *
 * 2. An array of arrays with 2 values. In this case, the values correspond to
 * `[hc-key, value]`. Example: (see online documentation for example)
 *
 * 3. An array of objects with named values. The following snippet shows only a
 * few settings, see the complete options set below. If the total number of data
 * points exceeds the series' turboThreshold, this option is not available. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class SeriesMapDataOptions extends def.js.Object {
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
     * (Highmaps) When data labels are laid out on a map, Highmaps runs a
     * simplified algorithm to detect collision. When two labels collide, the
     * one with the lowest rank is hidden. By default the rank is computed from
     * the area.
     */
    @jsweet.lang.Optional
    public double labelrank;
    /**
     * (Highmaps) The relative mid point of an area, used to place the data
     * label. Ranges from 0 to 1\. When `mapData` is used, middleX can be
     * defined there.
     */
    @jsweet.lang.Optional
    public double middleX;
    /**
     * (Highmaps) The relative mid point of an area, used to place the data
     * label. Ranges from 0 to 1\. When `mapData` is used, middleY can be
     * defined there.
     */
    @jsweet.lang.Optional
    public double middleY;
    /**
     * (Highmaps) The name of the point as shown in the legend, tooltip,
     * dataLabel etc.
     */
    @jsweet.lang.Optional
    public String name;
    /**
     * (Highmaps) For map and mapline series types, the SVG path for the shape.
     * For compatibily with old IE, not all SVG path definitions are supported,
     * but M, L and C operators are safe.
     *
     * To achieve a better separation between the structure and the data, it is
     * recommended to use `mapData` to define that paths instead of defining
     * them on the data points themselves.
     */
    @jsweet.lang.Optional
    public String path;
    /**
     * (Highmaps) The numeric value of the data point.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> value;
}

