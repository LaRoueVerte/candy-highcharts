package def.highcharts;
/**
 * (Highstock) A configuration object for the tooltip rendering of each single
 * series. Properties are inherited from tooltip, but only the following
 * properties can be defined on a series level.
 */
@jsweet.lang.Interface
public abstract class SeriesTooltipOptionsObject extends def.js.Object {
    /**
     * (Highstock) How many decimals to show for the `point.change` value when
     * the `series.compare` option is set. This is overridable in each series'
     * tooltip options object. The default is to preserve all decimals.
     */
    @jsweet.lang.Optional
    public double changeDecimals;
    /**
     * (Highstock) The HTML of the cluster point's in the tooltip. Works only
     * with marker-clusters module and analogously to pointFormat.
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
     * (Highstock) Distance from point to tooltip in pixels.
     */
    @jsweet.lang.Optional
    public double distance;
    /**
     * (Highstock) Whether the tooltip should follow the mouse as it moves
     * across columns, pie slices and other point types with an extent. By
     * default it behaves this way for pie, polygon, map, sankey and wordcloud
     * series by override in the `plotOptions` for those series types.
     *
     * For touch moves to behave the same way, followTouchMove must be `true`
     * also.
     */
    @jsweet.lang.Optional
    public Boolean followPointer;
    /**
     * (Highstock) Whether the tooltip should update as the finger moves on a
     * touch device. If this is `true` and chart.panning is
     * set,`followTouchMove` will take over one-finger touches, so the user
     * needs to use two fingers for zooming and panning.
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
     * (Highstock) A string to append to the tooltip format.
     */
    @jsweet.lang.Optional
    public String footerFormat;
    /**
     * (Highstock) The HTML of the tooltip header line. Variables are enclosed
     * by curly brackets. Available variables are `point.key`, `series.name`,
     * `series.color` and other members from the `point` and `series` objects.
     * The `point.key` variable contains the category name, x value or datetime
     * string depending on the type of axis. For datetime axes, the `point.key`
     * date format can be set using `tooltip.xDateFormat`.
     */
    @jsweet.lang.Optional
    public String headerFormat;
    /**
     * (Highcharts) The format string specifying what to show for _nodes_ in
     * tooltip of a diagram series, as opposed to links.
     */
    @jsweet.lang.Optional
    public String nodeFormat;
    /**
     * (Highcharts) A callback for defining the format for _nodes_ in the
     * chart's tooltip, as opposed to links.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<SankeyNodeObject,String> nodeFormatter;
    /**
     * (Highstock) The HTML of the null point's line in the tooltip. Works
     * analogously to pointFormat.
     */
    @jsweet.lang.Optional
    public String nullFormat;
    /**
     * (Highstock) Callback function to format the text of the tooltip for
     * visible null points. Works analogously to formatter.
     */
    @jsweet.lang.Optional
    public Object nullFormatter;
    /**
     * (Highstock) The HTML of the point's line in the tooltip. Variables are
     * enclosed by curly brackets. Available variables are `point.x`, `point.y`,
     * `series.name` and `series.color` and other properties on the same form.
     * Furthermore, `point.y` can be extended by the `tooltip.valuePrefix` and
     * `tooltip.valueSuffix` variables. This can also be overridden for each
     * series, which makes it a good hook for displaying units.
     *
     * In styled mode, the dot is colored by a class name rather than the point
     * color.
     */
    @jsweet.lang.Optional
    public String pointFormat;
    /**
     * (Highstock) A callback function for formatting the HTML output for a
     * single point in the tooltip. Like the `pointFormat` string, but with more
     * flexibility.
     */
    @jsweet.lang.Optional
	public java.util.function.Supplier<String> pointFormatter;
    /**
     * (Highstock) Number of decimals in indicator series.
     */
    @jsweet.lang.Optional
    public double valueDecimals;
    /**
     * (Highstock) A string to prepend to each series' y value. Overridable in
     * each series' tooltip options object.
     */
    @jsweet.lang.Optional
    public String valuePrefix;
    /**
     * (Highstock) A string to append to each series' y value. Overridable in
     * each series' tooltip options object.
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
}

