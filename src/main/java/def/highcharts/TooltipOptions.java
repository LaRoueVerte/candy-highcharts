package def.highcharts;
import jsweet.util.union.Union3;
import jsweet.util.function.Function4;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the tooltip that appears
 * when the user hovers over a series or point.
 */
@jsweet.lang.Interface
public abstract class TooltipOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable animation of
     * the tooltip.
     */
    @jsweet.lang.Optional
    public Boolean animation;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the tooltip.
     *
     * In styled mode, the stroke width is set in the `.highcharts-tooltip-box`
     * class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> backgroundColor;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the tooltip border.
     * When `undefined`, the border takes the color of the corresponding series
     * or point.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The radius of the rounded border
     * corners.
     */
    @jsweet.lang.Optional
    public double borderRadius;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the tooltip
     * border.
     *
     * In styled mode, the stroke width is set in the `.highcharts-tooltip-box`
     * class.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highstock) How many decimals to show for the `point.change` value when
     * the `series.compare` option is set. This is overridable in each series'
     * tooltip options object. The default is to preserve all decimals.
     */
    @jsweet.lang.Optional
    public double changeDecimals;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the
     * tooltip's container div, allowing unique CSS styling for each chart.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the cluster point's
     * in the tooltip. Works only with marker-clusters module and analogously to
     * pointFormat.
     *
     * The cluster tooltip can be also formatted using `tooltip.formatter`
     * callback function and `point.isCluster` flag.
     */
    @jsweet.lang.Optional
    public Object clusterFormat;
    /**
     * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
     * format in the tooltip's header will by default be guessed based on the
     * closest data points. This member gives the default string representations
     * used for each unit. For an overview of the replacement codes, see
     * dateFormat.
     */
    @jsweet.lang.Optional
    public Dictionary<String> dateTimeLabelFormats;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Distance from point to tooltip
     * in pixels.
     */
    @jsweet.lang.Optional
    public double distance;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the tooltip.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
     * follow the mouse as it moves across columns, pie slices and other point
     * types with an extent. By default it behaves this way for pie, polygon,
     * map, sankey and wordcloud series by override in the `plotOptions` for
     * those series types.
     *
     * For touch moves to behave the same way, followTouchMove must be `true`
     * also.
     */
    @jsweet.lang.Optional
    public Boolean followPointer;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
     * update as the finger moves on a touch device. If this is `true` and
     * chart.panning is set,`followTouchMove` will take over one-finger touches,
     * so the user needs to use two fingers for zooming and panning.
     *
     * Note the difference to followPointer that only defines the _position_ of
     * the tooltip. If `followPointer` is false in for example a column series,
     * the tooltip will show above or below the column, but as `followTouchMove`
     * is true, the tooltip will jump from column to column as the user swipes
     * across the plot area.
     */
    @jsweet.lang.Optional
    public Boolean followTouchMove;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A string to append to the
     * tooltip format.
     */
    @jsweet.lang.Optional
    public String footerFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
     * text of the tooltip from scratch. In case of single or shared tooltips, a
     * string should be returned. In case of split tooltips, it should return an
     * array where the first item is the header, and subsequent items are mapped
     * to the points. Return `false` to disable tooltip for a specific point on
     * series.
     *
     * A subset of HTML is supported. Unless `useHTML` is true, the HTML of the
     * tooltip is parsed and converted to SVG, therefore this isn't a complete
     * HTML renderer. The following HTML tags are supported: `b`, `br`, `em`,
     * `i`, `span`, `strong`. Spans can be styled with a `style` attribute, but
     * only text-related CSS, that is shared with SVG, is handled.
     *
     * The available data in the formatter differ a bit depending on whether the
     * tooltip is shared or split, or belongs to a single point. In a
     * shared/split tooltip, all properties except `x`, which is common for all
     * points, are kept in an array, `this.points`.
     *
     * Available data are:
     *
     * - **this.percentage (not shared) /** **this.points[i].percentage
     * (shared)**: Stacked series and pies only. The point's percentage of the
     * total.
     *
     * - **this.point (not shared) / this.points[i].point (shared)**: The point
     * object. The point name, if defined, is available through
     * `this.point.name`.
     *
     * - **this.points**: In a shared tooltip, this is an array containing all
     * other properties for each point.
     *
     * - **this.series (not shared) / this.points[i].series (shared)**: The
     * series object. The series name is available through `this.series.name`.
     *
     * - **this.total (not shared) / this.points[i].total (shared)**: Stacked
     * series only. The total value at this point's x value.
     *
     * - **this.x**: The x value. This property is the same regardless of the
     * tooltip being shared or not.
     *
     * - **this.y (not shared) / this.points[i].y (shared)**: The y value.
     */
    @jsweet.lang.Optional
    public Object formatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the tooltip header
     * line. Variables are enclosed by curly brackets. Available variables are
     * `point.key`, `series.name`, `series.color` and other members from the
     * `point` and `series` objects. The `point.key` variable contains the
     * category name, x value or datetime string depending on the type of axis.
     * For datetime axes, the `point.key` date format can be set using
     * `tooltip.xDateFormat`.
     */
    @jsweet.lang.Optional
    public String headerFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
     * the border around the tooltip header. Applies only when tooltip.split is
     * enabled.
     *
     * Custom callbacks for symbol path generation can also be added to
     * `Highcharts.SVGRenderer.prototype.symbols` the same way as for
     * series.marker.symbol.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.callout,def.highcharts.StringTypes.square> headerShape;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The number of milliseconds to
     * wait until the tooltip is hidden when mouse out from a point or chart.
     */
    @jsweet.lang.Optional
    public double hideDelay;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the null point's
     * line in the tooltip. Works analogously to pointFormat.
     */
    @jsweet.lang.Optional
    public String nullFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
     * text of the tooltip for visible null points. Works analogously to
     * formatter.
     */
    @jsweet.lang.Optional
    public Object nullFormatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow the tooltip to
     * render outside the chart's SVG element box. By default (`false`), the
     * tooltip is rendered within the chart's SVG element, which results in the
     * tooltip being aligned inside the chart area. For small charts, this may
     * result in clipping or overlapping. When `true`, a separate SVG element is
     * created and overlaid on the page, allowing the tooltip to be aligned
     * inside the page itself.
     *
     * Defaults to `true` if `chart.scrollablePlotArea` is activated, otherwise
     * `false`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Object> outside;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Padding inside the tooltip, in
     * pixels.
     */
    @jsweet.lang.Optional
    public double padding;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the point's line in
     * the tooltip. Variables are enclosed by curly brackets. Available
     * variables are `point.x`, `point.y`, `series.name` and `series.color` and
     * other properties on the same form. Furthermore, `point.y` can be extended
     * by the `tooltip.valuePrefix` and `tooltip.valueSuffix` variables. This
     * can also be overridden for each series, which makes it a good hook for
     * displaying units.
     *
     * In styled mode, the dot is colored by a class name rather than the point
     * color.
     */
    @jsweet.lang.Optional
    public String pointFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function for
     * formatting the HTML output for a single point in the tooltip. Like the
     * `pointFormat` string, but with more flexibility.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Point,String> pointFormatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function to place the
     * tooltip in a default position. The callback receives three parameters:
     * `labelWidth`, `labelHeight` and `point`, where point contains values for
     * `plotX` and `plotY` telling where the reference point is in the plot
     * area. Add `chart.plotLeft` and `chart.plotTop` to get the full
     * coordinates.
     *
     * Since v7, when tooltip.split option is enabled, positioner is called for
     * each of the boxes separately, including xAxis header. xAxis header is not
     * a point, instead `point` argument contains info: `{ plotX: Number, plotY:
     * Number, isHeader: Boolean }`
     *
     * The return should be an object containing x and y values, for example `{
     * x: 100, y: 100 }`.
     */
    @jsweet.lang.Optional
    public Function4<Tooltip,Double,Double,TooltipPositionerPointObject,PositionObject> positioner;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
     * to the tooltip.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,ShadowOptionsObject> shadow;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
     * the border around the tooltip. Can be one of: `"callout"`, `"circle"`, or
     * `"square"`. When tooltip.split option is enabled, shape is applied to all
     * boxes except header, which is controlled by tooltip.headerShape.
     *
     * Custom callbacks for symbol path generation can also be added to
     * `Highcharts.SVGRenderer.prototype.symbols` the same way as for
     * series.marker.symbol.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.callout,def.highcharts.StringTypes.circle,def.highcharts.StringTypes.square> shape;
    /**
     * (Highcharts, Highstock) When the tooltip is shared, the entire plot area
     * will capture mouse movement or touch events. Tooltip texts for series
     * types with ordered data (not pie, scatter, flags etc) will be shown in a
     * single bubble. This is recommended for single series charts and for
     * tablet/mobile optimized charts.
     *
     * See also tooltip.split, that is better suited for charts with many
     * series, especially line-type series. The `tooltip.split` option takes
     * precedence over `tooltip.shared`.
     */
    @jsweet.lang.Optional
    public Boolean shared;
    /**
     * (Highcharts, Highstock) Proximity snap for graphs or single points. It
     * defaults to 10 for mouse-powered devices and 25 for touch devices.
     *
     * Note that in most cases the whole plot area captures the mouse movement,
     * and in these cases `tooltip.snap` doesn't make sense. This applies when
     * stickyTracking is `true` (default) and when the tooltip is shared or
     * split.
     */
    @jsweet.lang.Optional
    public double snap;
    /**
     * (Highcharts, Highstock) Split the tooltip into one label per series, with
     * the header close to the axis. This is recommended over shared tooltips
     * for charts with multiple line series, generally making them easier to
     * read. This option takes precedence over `tooltip.shared`.
     */
    @jsweet.lang.Optional
    public Boolean split;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Prevents the tooltip from
     * switching or closing, when touched or pointed.
     */
    @jsweet.lang.Optional
    public Boolean stickOnContact;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the tooltip. The
     * tooltip can also be styled through the CSS class `.highcharts-tooltip`.
     *
     * Note that the default `pointerEvents` style makes the tooltip ignore
     * mouse events, so in order to use clickable tooltips, this value must be
     * set to `auto`.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Use HTML to render the contents
     * of the tooltip instead of SVG. Using HTML allows advanced formatting like
     * tables and images in the tooltip. It is also recommended for rtl
     * languages as it works around rtl bugs in early Firefox.
     */
    @jsweet.lang.Optional
    public Boolean useHTML;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) How many decimals to show in
     * each series' y value. This is overridable in each series' tooltip options
     * object. The default is to preserve all decimals.
     */
    @jsweet.lang.Optional
    public double valueDecimals;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A string to prepend to each
     * series' y value. Overridable in each series' tooltip options object.
     */
    @jsweet.lang.Optional
    public String valuePrefix;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A string to append to each
     * series' y value. Overridable in each series' tooltip options object.
     */
    @jsweet.lang.Optional
    public String valueSuffix;
    /**
     * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
     * header if the X axis is a datetime axis. The default is a best guess
     * based on the smallest distance between points in the chart.
     */
    @jsweet.lang.Optional
    public String xDateFormat;
    native public PositionObject positioner(Tooltip p1, Double p2, Double p3, TooltipPositionerPointObject p4);
}

