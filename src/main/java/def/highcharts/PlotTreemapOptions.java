package def.highcharts;
import def.js.Array;
import def.js.Function;
import jsweet.util.union.Union3;
/**
 * (Highcharts) A treemap displays hierarchical data using nested rectangles.
 * The data can be laid out in varying ways depending on options.
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * 1. Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * 2. Options for all `treemap` series are defined in plotOptions.treemap.
 *
 * 3. Options for one single series are given in the series instance array. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class PlotTreemapOptions extends def.js.Object {
    /**
     * (Highcharts) Accessibility options for a series.
     */
    @jsweet.lang.Optional
    public SeriesAccessibilityOptionsObject accessibility;
    /**
     * (Highmaps) Whether all areas of the map defined in `mapData` should be
     * rendered. If `true`, areas which don't correspond to a data point, are
     * rendered as `null` points. If `false`, those areas are skipped.
     */
    @jsweet.lang.Optional
    public Boolean allAreas;
    /**
     * (Highcharts) Allow this series' points to be selected by clicking on the
     * graphic (columns, point markers, pie slices, map areas etc).
     *
     * The selected points can be handled by point select and unselect events,
     * or collectively by the getSelectedPoints function.
     *
     * And alternative way of selecting points is through dragging.
     */
    @jsweet.lang.Optional
    public Boolean allowPointSelect;
    /**
     * (Highcharts) When enabled the user can click on a point which is a parent
     * and zoom in on its children.
     */
    @jsweet.lang.Optional
    public Boolean allowTraversingTree;
    /**
     * (Highcharts) Enabling this option will make the treemap alternate the
     * drawing direction between vertical and horizontal. The next levels
     * starting direction will always be the opposite of the previous.
     */
    @jsweet.lang.Optional
    public Boolean alternateStartingDirection;
    /**
     * (Highcharts) Enable or disable the initial animation when a series is
     * displayed. The animation can also be set as a configuration object.
     * Please note that this option only applies to the initial animation of the
     * series itself. For other animations, see chart.animation and the
     * animation parameter under the API methods. The following properties are
     * supported:
     *
     * - `defer`: The animation delay time in milliseconds.
     *
     * - `duration`: The duration of the animation in milliseconds.
     *
     * - `easing`: Can be a string reference to an easing function set on the
     * `Math` object or a function. See the _Custom easing function_ demo below.
     *
     * Due to poor performance, animation is disabled in old IE browsers for
     * several chart types.
     */
    @jsweet.lang.Optional
    public Union3<Boolean,PlotTreemapAnimationOptions,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts) For some series, there is a limit that shuts down initial
     * animation by default when the total number of points in the chart is too
     * high. For example, for a column chart and its derivatives, animation does
     * not run if there is more than 250 points totally. To disable this cap,
     * set `animationLimit` to `Infinity`.
     */
    @jsweet.lang.Optional
    public double animationLimit;
    /**
     * (Highcharts) Sets the color blending in the boost module.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.add,def.highcharts.StringTypes.darken,def.highcharts.StringTypes.multiply> boostBlending;
    /**
     * (Highcharts) Set the point threshold for when a series should enter boost
     * mode.
     *
     * Setting it to e.g. 2000 will cause the series to enter boost mode when
     * there are 2000 or more points in the series.
     *
     * To disable boosting on the series, set the `boostThreshold` to 0. Setting
     * it to 1 will force boosting.
     *
     * Note that the cropThreshold also affects this setting. When zooming in on
     * a series that has fewer points than the `cropThreshold`, all points are
     * rendered although outside the visible plot area, and the `boostThreshold`
     * won't take effect.
     */
    @jsweet.lang.Optional
    public double boostThreshold;
    /**
     * (Highmaps) The color of the border surrounding each tree map item.
     */
    @jsweet.lang.Optional
    public String borderColor;
    /**
     * (Highmaps) The width of the border surrounding each tree map item.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) An additional class name to apply to the series' graphical
     * elements. This option does not replace default class names of the
     * graphical element.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts) Disable this option to allow series rendering in the whole
     * plotting area.
     *
     * **Note:** Clipping should be always enabled when chart.zoomType is set
     */
    @jsweet.lang.Optional
    public Boolean clip;
    /**
     * (Highcharts, Highmaps) Options for marker clusters, the concept of
     * sampling the data values into larger blocks in order to ease readability
     * and increase performance of the JavaScript charts.
     *
     * Note: marker clusters module is not working with `boost` and
     * `draggable-points` modules.
     *
     * The marker clusters feature requires the marker-clusters.js file to be
     * loaded, found in the modules directory of the download package, or online
     * at code.highcharts.com/modules/marker-clusters.js.
     */
    @jsweet.lang.Optional
    public PlotTreemapClusterOptions cluster;
    /**
     * (Highcharts) The main color of the series. In line type series it applies
     * to the line and the point markers unless otherwise specified. In bar type
     * series it applies to the bars unless a color is specified per point. The
     * default value is pulled from the `options.colors` array.
     *
     * In styled mode, the color can be defined by the colorIndex option. Also,
     * the series color can be set with the `.highcharts-series`,
     * `.highcharts-color-{n}`, `.highcharts-{type}-series` or
     * `.highcharts-series-{n}` class, or individual classes given by the
     * `className` option.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Highstock, Highmaps) When using dual or multiple color axes,
     * this number defines which colorAxis the particular series is connected
     * to. It refers to either the axis id or the index of the axis in the
     * colorAxis array, with 0 being the first. Set this option to false to
     * prevent a series from connecting to the default color axis.
     *
     * Since v7.2.0 the option can also be an axis id or an axis index instead
     * of a boolean flag.
     */
    @jsweet.lang.Optional
    public Union3<Boolean,Double,String> colorAxis;
    /**
     * (Highcharts) When using automatic point colors pulled from the
     * `options.colors` collection, this option determines whether the chart
     * should receive one color per series or one color per point.
     */
    @jsweet.lang.Optional
    public Object colorByPoint;
    /**
     * (Highcharts) Styled mode only. A specific color index to use for the
     * series, so its graphic representations are given the class name
     * `highcharts-color-{n}`.
     */
    @jsweet.lang.Optional
    public double colorIndex;
    /**
     * (Highcharts, Highstock, Highmaps) Determines what data value should be
     * used to calculate point color if `colorAxis` is used. Requires to set
     * `min` and `max` if some custom point property is used or if approximation
     * for data grouping is set to `'sum'`.
     */
    @jsweet.lang.Optional
    public String colorKey;
    /**
     * (Highcharts) A series specific or series type specific color set to apply
     * instead of the global colors when colorByPoint is true.
     */
    @jsweet.lang.Optional
    public Array<Union3<String,GradientColorObject,PatternObject>> colors;
    /**
     * (Highstock) Compare the values of the series against the first non-null,
     * non- zero value in the visible range. The y axis will show percentage or
     * absolute change depending on whether `compare` is set to `"percent"` or
     * `"value"`. When this is applied to multiple series, it allows comparing
     * the development of the series against each other. Adds a `change` field
     * to every point object.
     */
    @jsweet.lang.Optional
    public String compare;
    /**
     * (Highstock) When compare is `percent`, this option dictates whether to
     * use 0 or 100 as the base of comparison.
     */
    @jsweet.lang.Optional
    public double compareBase;
    /**
     * (Highstock) Defines if comparison should start from the first point
     * within the visible range or should start from the first point **before**
     * the range.
     *
     * In other words, this flag determines if first point within the visible
     * range will have 0% (`compareStart=true`) or should have been already
     * calculated according to the previous point (`compareStart=false`).
     */
    @jsweet.lang.Optional
    public Boolean compareStart;
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
     * (Gantt) Override Pathfinder connector options for a series. Requires
     * Highcharts Gantt to be loaded.
     */
    @jsweet.lang.Optional
    public SeriesConnectorsOptionsObject connectors;
    /**
     * (Highcharts, Highstock, Gantt) When true, each point or column edge is
     * rounded to its nearest pixel in order to render sharp on screen. In some
     * cases, when there are a lot of densely packed columns, this leads to
     * visible difference in column widths or distance between columns. In these
     * cases, setting `crisp` to `false` may look better, even though each
     * column is rendered blurry.
     */
    @jsweet.lang.Optional
    public Boolean crisp;
    /**
     * (Highcharts) When the series contains less points than the crop
     * threshold, all points are drawn, event if the points fall outside the
     * visible plot area at the current zoom. The advantage of drawing all
     * points (including markers and columns), is that animation is performed on
     * updates. On the other hand, when the series contains more points than the
     * crop threshold, the series data is cropped to only contain points that
     * fall within the plot area. The advantage of cropping away invisible
     * points is to increase performance on large series.
     */
    @jsweet.lang.Optional
    public double cropThreshold;
    /**
     * (Highcharts) You can set the cursor to "pointer" if you have click events
     * attached to the series, to signal to the user that the points and lines
     * can be clicked.
     *
     * In styled mode, the series cursor can be set with the same classes as
     * listed under series.color.
     */
    @jsweet.lang.Optional
    public Object cursor;
    /**
     * (Highcharts) A reserved subspace to store options and values for
     * customized functionality. Here you can add additional data for your own
     * event callbacks and formatter callbacks.
     */
    @jsweet.lang.Optional
    public Dictionary<?> custom;
    /**
     * (Highcharts) Name of the dash style to use for the graph, or for some
     * series types the outline of each shape.
     *
     * In styled mode, the stroke dash-array can be set with the same classes as
     * listed under series.color.
     */
    @jsweet.lang.Optional
    public Object dashStyle;
    /**
     * (Highstock) Data grouping is the concept of sampling the data values into
     * larger blocks in order to ease readability and increase performance of
     * the JavaScript charts. Highstock by default applies data grouping when
     * the points become closer than a certain pixel value, determined by the
     * `groupPixelWidth` option.
     *
     * If data grouping is applied, the grouping information of grouped points
     * can be read from the Point.dataGroup. If point options other than the
     * data itself are set, for example `name` or `color` or custom properties,
     * the grouping logic doesn't know how to group it. In this case the options
     * of the first point instance are copied over to the group point. This can
     * be altered through a custom `approximation` callback function.
     */
    @jsweet.lang.Optional
    public DataGroupingOptionsObject dataGrouping;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the series data
     * labels, appearing next to each data point.
     *
     * Since v6.2.0, multiple data labels can be applied to each single point by
     * defining them as an array of configs.
     *
     * In styled mode, the data labels can be styled with the
     * `.highcharts-data-label-box` and `.highcharts-data-label` class names
     * (see example).
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<PlotTreemapDataLabelsOptions,Array<PlotTreemapDataLabelsOptions>> dataLabels;
    /**
     * (Highcharts) A description of the series to add to the screen reader
     * information about the series.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highcharts) Enable or disable the mouse tracking for a specific series.
     * This includes point tooltips and click events on graphs and points. For
     * large datasets it improves performance.
     */
    @jsweet.lang.Optional
    public Boolean enableMouseTracking;
    /**
     * (Highcharts) General event handlers for the series items. These event
     * hooks can also be attached to the series at run time using the
     * `Highcharts.addEvent` function.
     */
    @jsweet.lang.Optional
    public SeriesEventsOptionsObject events;
    /**
     * (Highcharts) Determines whether the series should look for the nearest
     * point in both dimensions or just the x-dimension when hovering the
     * series. Defaults to `'xy'` for scatter series and `'x'` for most other
     * series. If the data has duplicate x-values, it is recommended to set this
     * to `'xy'` to allow hovering over all points.
     *
     * Applies only to series types using nearest neighbor search (not direct
     * hover) for tooltip.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.x,def.highcharts.StringTypes.xy> findNearestPointBy;
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
     * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
     * chart width or only the zoomed area when zooming in on parts of the X
     * axis. By default, the Y axis adjusts to the min and max of the visible
     * data. Cartesian series only.
     */
    @jsweet.lang.Optional
    public Boolean getExtremesFromAll;
    /**
     * (Highcharts) Whether to ignore hidden points when the layout algorithm
     * runs. If `false`, hidden points will leave open spaces.
     */
    @jsweet.lang.Optional
    public Boolean ignoreHiddenPoint;
    /**
     * (Highcharts) When set to `false` will prevent the series data from being
     * included in any form of data export.
     *
     * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
     * `includeInCSVExport`.
     */
    @jsweet.lang.Optional
    public Boolean includeInDataExport;
    /**
     * (Highcharts) This option decides if the user can interact with the parent
     * nodes or just the leaf nodes. When this option is undefined, it will be
     * true by default. However when allowTraversingTree is true, then it will
     * be false by default.
     */
    @jsweet.lang.Optional
    public Boolean interactByLeaf;
    /**
     * (Highmaps) What property to join the `mapData` to the value data. For
     * example, if joinBy is "code", the mapData items with a specific code is
     * merged into the data with the same code. For maps loaded from GeoJSON,
     * the keys may be held in each point's `properties` object.
     *
     * The joinBy option can also be an array of two values, where the first
     * points to a key in the `mapData`, and the second points to another key in
     * the `data`.
     *
     * When joinBy is `null`, the map items are joined by their position in the
     * array, which performs much better in maps with many data points. This is
     * the recommended option if you are printing more than a thousand data
     * points and have a backend that can preprocess the data into a parallel
     * array of the mapData.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Array<String>> joinBy;
    /**
     * (Highcharts) An array specifying which option maps to which key in the
     * data point array. This makes it convenient to work with unstructured data
     * arrays from different sources.
     */
    @jsweet.lang.Optional
    public Array<String> keys;
    /**
     * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
     * series as possible in a natural way, seeking to avoid other series. The
     * goal of this feature is to make the chart more easily readable, like if a
     * human designer placed the labels in the optimal position.
     *
     * The series labels currently work with series types having a `graph` or an
     * `area`.
     */
    @jsweet.lang.Optional
    public SeriesLabelOptionsObject label;
    /**
     * (Highstock) The line marks the last price from all points.
     */
    @jsweet.lang.Optional
    public SeriesLastPriceOptionsObject lastPrice;
    /**
     * (Highstock) The line marks the last price from visible range of points.
     */
    @jsweet.lang.Optional
    public SeriesLastVisiblePriceOptionsObject lastVisiblePrice;
    /**
     * (Highcharts) This option decides which algorithm is used for setting
     * position and dimensions of the points.
     */
    @jsweet.lang.Optional
    public Object layoutAlgorithm;
    /**
     * (Highcharts) Defines which direction the layout algorithm will start
     * drawing.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.horizontal,def.highcharts.StringTypes.vertical> layoutStartingDirection;
    /**
     * (Highcharts) Used together with the levels and allowTraversingTree
     * options. When set to false the first level visible to be level one, which
     * is dynamic when traversing the tree. Otherwise the level will be the same
     * as the tree structure.
     */
    @jsweet.lang.Optional
    public Boolean levelIsConstant;
    /**
     * (Highcharts) Set options on specific levels. Takes precedence over series
     * options, but not point options.
     */
    @jsweet.lang.Optional
    public Array<PlotTreemapLevelsOptions> levels;
    /**
     * (Highcharts, Highstock) The SVG value used for the `stroke-linecap` and
     * `stroke-linejoin` of a line graph. Round means that lines are rounded in
     * the ends and bends.
     */
    @jsweet.lang.Optional
    public Object linecap;
    /**
     * (Highcharts, Highstock) The width of the line connecting the data points.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highcharts, Highstock, Gantt) The id of another series to link to.
     * Additionally, the value can be ":previous" to link to the previous
     * series. When two series are linked, only the first one appears in the
     * legend. Toggling the visibility of this also toggles the linked series.
     *
     * If master series uses data sorting and linked series does not have its
     * own sorting definition, the linked series will be sorted in the same
     * order as the master one.
     */
    @jsweet.lang.Optional
    public String linkedTo;
    /**
     * (Highstock) Options for the corresponding navigator series if
     * `showInNavigator` is `true` for this series. Available options are the
     * same as any series, documented at plotOptions and series.
     *
     * These options are merged with options in navigator.series, and will take
     * precedence if the same option is defined both places.
     */
    @jsweet.lang.Optional
    public PlotSeriesOptions navigatorOptions;
    /**
     * (Highcharts) The color for the parts of the graph or points that are
     * below the threshold. Note that `zones` takes precedence over the negative
     * color. Using `negativeColor` is equivalent to applying a zone with value
     * of 0.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> negativeColor;
    /**
     * (Highcharts) The opacity of a point in treemap. When a point has
     * children, the visibility of the children is determined by the opacity.
     */
    @jsweet.lang.Optional
    public double opacity;
    /**
     * (Highcharts) Properties for each single point.
     */
    @jsweet.lang.Optional
    public PlotSeriesPointOptions point;
    /**
     * (Highcharts) Same as accessibility.pointDescriptionFormatter, but for an
     * individual series. Overrides the chart wide configuration.
     */
    @jsweet.lang.Optional
    public Function pointDescriptionFormatter;
    /**
     * (Highcharts, Highstock, Gantt) If no x values are given for the points in
     * a series, `pointInterval` defines the interval of the x values. For
     * example, if a series contains one value every decade starting from year
     * 0, set `pointInterval` to `10`. In true `datetime` axes, the
     * `pointInterval` is set in milliseconds.
     *
     * It can be also be combined with `pointIntervalUnit` to draw irregular
     * time intervals.
     *
     * Please note that this options applies to the _series data_, not the
     * interval of the axis ticks, which is independent.
     */
    @jsweet.lang.Optional
    public double pointInterval;
    /**
     * (Highcharts, Highstock, Gantt) On datetime series, this allows for
     * setting the pointInterval to irregular time units, `day`, `month` and
     * `year`. A day is usually the same as 24 hours, but `pointIntervalUnit`
     * also takes the DST crossover into consideration when dealing with local
     * time. Combine this option with `pointInterval` to draw weeks, quarters, 6
     * months, 10 years etc.
     *
     * Please note that this options applies to the _series data_, not the
     * interval of the axis ticks, which is independent.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.day,def.highcharts.StringTypes.month,def.highcharts.StringTypes.year> pointIntervalUnit;
    /**
     * (Highstock) The width of each point on the x axis. For example in a
     * column chart with one value each day, the pointRange would be 1 day (= 24
     * * 3600
     *
     * * 1000 milliseconds). This is normally computed automatically, but this
     * option can be used to override the automatic value.
     */
    @jsweet.lang.Optional
    public double pointRange;
    /**
     * (Highcharts, Highstock, Gantt) If no x values are given for the points in
     * a series, pointStart defines on what value to start. For example, if a
     * series contains one yearly value starting from 1945, set pointStart to
     * 1945.
     */
    @jsweet.lang.Optional
    public double pointStart;
    /**
     * (Highcharts) Whether to select the series initially. If `showCheckbox` is
     * true, the checkbox next to the series name in the legend will be checked
     * for a selected series.
     */
    @jsweet.lang.Optional
    public Boolean selected;
    /**
     * (Highcharts) If true, a checkbox is displayed next to the legend item to
     * allow selecting the series. The state of the checkbox is determined by
     * the `selected` option.
     */
    @jsweet.lang.Optional
    public Boolean showCheckbox;
    /**
     * (Highcharts) Whether to display this series type or specific series item
     * in the legend.
     */
    @jsweet.lang.Optional
    public Boolean showInLegend;
    /**
     * (Highstock) Whether or not to show the series in the navigator. Takes
     * precedence over navigator.baseSeries if defined.
     */
    @jsweet.lang.Optional
    public Boolean showInNavigator;
    /**
     * (Highcharts) If set to `true`, the accessibility module will skip past
     * the points in this series for keyboard navigation.
     */
    @jsweet.lang.Optional
    public Boolean skipKeyboardNavigation;
    /**
     * (Highcharts, Highstock) When this is true, the series will not cause the
     * Y axis to cross the zero plane (or threshold option) unless the data
     * actually crosses the plane.
     *
     * For example, if `softThreshold` is `false`, a series of 0, 1, 2, 3 will
     * make the Y axis show negative values according to the `minPadding`
     * option. If `softThreshold` is `true`, the Y axis starts at 0.
     */
    @jsweet.lang.Optional
    public Boolean softThreshold;
    /**
     * (Highcharts) The sort index of the point inside the treemap level.
     */
    @jsweet.lang.Optional
    public double sortIndex;
    /**
     * (Highcharts, Highstock) Whether to stack the values of each series on top
     * of each other. Possible values are `undefined` to disable, `"normal"` to
     * stack by value or `"percent"`.
     *
     * When stacking is enabled, data must be sorted in ascending X order.
     *
     * Some stacking options are related to specific series types. In the
     * streamgraph series type, the stacking option is set to `"stream"`. The
     * second one is `"overlap"`, which only applies to waterfall series.
     */
    @jsweet.lang.Optional
    public Object stacking;
    /**
     * (Highcharts) A wrapper object for all the series options in specific
     * states.
     */
    @jsweet.lang.Optional
    public SeriesStatesOptionsObject states;
    /**
     * (Highcharts, Highstock) Whether to apply steps to the line. Possible
     * values are `left`, `center` and `right`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> step;
    /**
     * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
     * `mouseOut` event on a series isn't triggered until the mouse moves over
     * another series, or out of the plot area. When false, the `mouseOut` event
     * on a series is triggered when the mouse leaves the area around the
     * series' graph or markers. This also implies the tooltip. When
     * `stickyTracking` is false and `tooltip.shared` is false, the tooltip will
     * be hidden when moving the mouse between series.
     */
    @jsweet.lang.Optional
    public Boolean stickyTracking;
    /**
     * (Highcharts, Highstock) The threshold, also called zero level or base
     * level. For line type series this is only used in conjunction with
     * negativeColor.
     */
    @jsweet.lang.Optional
    public double threshold;
    /**
     * (Highcharts, Highstock) A configuration object for the tooltip rendering
     * of each single series. Properties are inherited from tooltip. Overridable
     * properties are `headerFormat`, `pointFormat`, `yDecimals`, `xDateFormat`,
     * `yPrefix` and `ySuffix`. Unlike other series, in a scatter plot the
     * series.name by default shows in the headerFormat and point.x and point.y
     * in the pointFormat.
     */
    @jsweet.lang.Optional
    public SeriesTooltipOptionsObject tooltip;
    /**
     * (Highcharts) Options for the button appearing when traversing down in a
     * treemap.
     */
    @jsweet.lang.Optional
    public PlotTreemapTraverseUpButtonOptions traverseUpButton;
    /**
     * (Highcharts, Highstock, Gantt) When a series contains a data array that
     * is longer than this, only one dimensional arrays of numbers, or two
     * dimensional arrays with x and y values are allowed. Also, only the first
     * point is tested, and the rest are assumed to be the same format. This
     * saves expensive data checking and indexing in long series. Set it to `0`
     * disable.
     *
     * Note: In boost mode turbo threshold is forced. Only array of numbers or
     * two dimensional arrays are allowed.
     */
    @jsweet.lang.Optional
    public double turboThreshold;
    /**
     * (Highcharts) Set the initial visibility of the series.
     */
    @jsweet.lang.Optional
    public Boolean visible;
    /**
     * (Highmaps) Define the z index of the series.
     */
    @jsweet.lang.Optional
    public double zIndex;
    /**
     * (Highcharts, Highstock) Defines the Axis on which the zones are applied.
     */
    @jsweet.lang.Optional
    public String zoneAxis;
    /**
     * (Highcharts, Highstock) An array defining zones within a series. Zones
     * can be applied to the X axis, Y axis or Z axis for bubbles, according to
     * the `zoneAxis` option. The zone definitions have to be in ascending order
     * regarding to the value.
     *
     * In styled mode, the color zones are styled with the
     * `.highcharts-zone-{n}` class, or custom classed from the `className`
     * option (view live demo).
     */
    @jsweet.lang.Optional
    public Array<SeriesZonesOptionsObject> zones;
    native public java.lang.Object pointDescriptionFormatter(java.lang.Object... args);
}

