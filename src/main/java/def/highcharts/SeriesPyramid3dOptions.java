package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highcharts) A `pyramid3d` series. If the type option is not specified, it is
 * inherited from chart.type.
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * 1. Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * 2. Options for all `pyramid3d` series are defined in plotOptions.pyramid3d.
 *
 * 3. Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * You have to extend the `SeriesPyramid3dOptions` via an interface to allow
 * custom properties: ``` declare interface SeriesPyramid3dOptions {
 * customProperty: string; }
 *
 */
@jsweet.lang.Interface
@jsweet.lang.Extends({SeriesOptions.class})
public abstract class SeriesPyramid3dOptions extends PlotPyramid3dOptions {
    /**
     * Not available
     */
    @jsweet.lang.Optional
    public Object allAreas;
    /**
     * Not available
     */
    @jsweet.lang.Optional
    public Object boostThreshold;
    /**
     * (Highcharts) The center of the series. By default, it is centered in the
     * middle of the plot area, so it fills the plot area height.
     */
    @jsweet.lang.Optional
    public Array<jsweet.util.union.Union<Double,String>> center;
    /**
     * Not available
     */
    @jsweet.lang.Optional
    public Object colorAxis;
    /**
     * Not available
     */
    @jsweet.lang.Optional
    public Object compare;
    /**
     * Not available
     */
    @jsweet.lang.Optional
    public Object compareBase;
    /**
     * (Highcharts) Polar charts only. Whether to connect the ends of a line
     * series plot across the extremes.
     */
    @jsweet.lang.Optional
    public Boolean connectEnds;
    /**
     * (Highcharts, Highstock) Whether to connect a graph line across null
     * points, or render a gap between the two points on either side of the
     * null.
     */
    @jsweet.lang.Optional
    public Boolean connectNulls;
    /**
     * Not available
     */
    @jsweet.lang.Optional
    public Object dataSorting;
    /**
     * (Highcharts) The end angle of the pie in degrees where 0 is top and 90 is
     * right. Defaults to `startAngle` plus 360.
     */
    @jsweet.lang.Optional
    public double endAngle;
    /**
     * (Highcharts) If the total sum of the pie's values is 0, the series is
     * represented as an empty circle . The `fillColor` option defines the color
     * of that circle. Use pie.borderWidth to set the border thickness.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fillColor;
    /**
     * (Highstock) Defines when to display a gap in the graph, together with the
     * gapUnit option.
     *
     * In case when `dataGrouping` is enabled, points can be grouped into a
     * larger time span. This can make the grouped points to have a greater
     * distance than the absolute value of `gapSize` property, which will result
     * in disappearing graph completely. To prevent this situation the mentioned
     * distance between grouped points is used instead of previously defined
     * `gapSize`.
     *
     * In practice, this option is most often used to visualize gaps in time
     * series. In a stock chart, intraday data is available for daytime hours,
     * while gaps will appear in nights and weekends.
     */
    @jsweet.lang.Optional
    public double gapSize;
    /**
     * (Highstock) Together with gapSize, this option defines where to draw gaps
     * in the graph.
     *
     * When the `gapUnit` is `"relative"` (default), a gap size of 5 means that
     * if the distance between two points is greater than 5 times that of the
     * two closest points, the graph will be broken.
     *
     * When the `gapUnit` is `"value"`, the gap is based on absolute axis
     * values, which on a datetime axis is milliseconds. This also applies to
     * the navigator series that inherits gap options from the base series.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.relative,def.highcharts.StringTypes.value> gapUnit;
    /**
     * (Highcharts) Equivalent to chart.ignoreHiddenSeries, this option tells
     * whether the series shall be redrawn as if the hidden point were `null`.
     *
     * The default value changed from `false` to `true` with Highcharts 3.0.
     */
    @jsweet.lang.Optional
    public Boolean ignoreHiddenPoint;
    /**
     * (Highcharts, Highstock) The line cap used for line ends and line joins on
     * the graph.
     */
    @jsweet.lang.Optional
    public Object linecap;
    /**
     * (Highcharts, Highstock) Pixel width of the graph line.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highcharts) Options for the point markers of line-like series.
     * Properties like `fillColor`, `lineColor` and `lineWidth` define the
     * visual appearance of the markers. Other series types, like column series,
     * don't have markers, but have visual options on the series level instead.
     *
     * In styled mode, the markers can be styled with the `.highcharts-point`,
     * `.highcharts-point-hover` and `.highcharts-point-select` class names.
     */
    @jsweet.lang.Optional
    public PointMarkerOptionsObject marker;
    /**
     * (Highcharts) The minimum size for a pie in response to auto margins. The
     * pie will try to shrink to make room for data labels in side the plot
     * area, but only to this size.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> minSize;
    /**
     * (Highcharts) If a point is sliced, moved out from the center, how many
     * pixels should it be moved?.
     */
    @jsweet.lang.Optional
    public double slicedOffset;
    /**
     * (Highcharts) The start angle of the pie slices in degrees where 0 is top
     * and 90 right.
     */
    @jsweet.lang.Optional
    public double startAngle;
    /**
     * (Highcharts, Highstock) Whether to apply steps to the line. Possible
     * values are `left`, `center` and `right`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> step;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
     * TypeScript non-optional and might be `undefined` in series objects from
     * unknown sources.
     */
    public def.highcharts.StringTypes.pyramid3d type;
    /**
     * (Highstock) The parameter allows setting line series type and use OHLC
     * indicators. Data in OHLC format is required.
     */
    @jsweet.lang.Optional
    public Boolean useOhlcData;
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

