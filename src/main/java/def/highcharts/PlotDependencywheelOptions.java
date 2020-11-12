package def.highcharts;
import def.js.Array;
import def.js.Function;
import jsweet.util.union.Union3;
/**
 * (Highcharts) A dependency wheel chart is a type of flow diagram, where all
 * nodes are laid out in a circle, and the flow between the are drawn as link
 * bands.
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * 1. Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * 2. Options for all `dependencywheel` series are defined in
 * plotOptions.dependencywheel.
 *
 * 3. Options for one single series are given in the series instance array. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class PlotDependencywheelOptions extends def.js.Object {
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
    public Union3<Boolean,PlotDependencywheelAnimationOptions,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts, Highstock, Gantt) The color of the border surrounding each
     * column or bar.
     *
     * In styled mode, the border stroke can be set with the `.highcharts-point`
     * rule.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highcharts, Highstock, Gantt) The width of the border surrounding each
     * column or bar. Defaults to `1` when there is room for a border, but to
     * `0` when the columns are so dense that a border would cover the next
     * column.
     *
     * In styled mode, the stroke width can be set with the `.highcharts-point`
     * rule.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) The center of the wheel relative to the plot area. Can be
     * percentages or pixel values. The default behaviour is to center the wheel
     * inside the plot area.
     */
    @jsweet.lang.Optional
    public Array<Union3<Double,String,Object>> center;
    /**
     * (Highcharts, Highstock, Gantt) When `true`, the columns will center in
     * the category, ignoring null or missing points. When `false`, space will
     * be reserved for null or missing points.
     */
    @jsweet.lang.Optional
    public Boolean centerInCategory;
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
     * (Highcharts, Highstock, Gantt) When using automatic point colors pulled
     * from the global colors or series-specific plotOptions.column.colors
     * collections, this option determines whether the chart should receive one
     * color per series or one color per point.
     *
     * In styled mode, the `colors` or `series.colors` arrays are not supported,
     * and instead this option gives the points individual color class names on
     * the form `highcharts-color-{n}`.
     */
    @jsweet.lang.Optional
    public Boolean colorByPoint;
    /**
     * (Highcharts) Styled mode only. A specific color index to use for the
     * series, so its graphic representations are given the class name
     * `highcharts-color-{n}`.
     */
    @jsweet.lang.Optional
    public double colorIndex;
    /**
     * (Highcharts, Highstock, Gantt) A series specific or series type specific
     * color set to apply instead of the global colors when colorByPoint is
     * true.
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
     * (Gantt) Override Pathfinder connector options for a series. Requires
     * Highcharts Gantt to be loaded.
     */
    @jsweet.lang.Optional
    public SeriesConnectorsOptionsObject connectors;
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
     * (Highcharts) Higher numbers makes the links in a sankey diagram or
     * dependency wheelrender more curved. A `curveFactor` of 0 makes the lines
     * straight.
     */
    @jsweet.lang.Optional
    public double curveFactor;
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
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the data labels
     * appearing on top of the nodes and links. For sankey charts, data labels
     * are visible for the nodes by default, but hidden for links. This is
     * controlled by modifying the `nodeFormat`, and the `format` that applies
     * to links and is an empty string by default.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<SeriesSankeyDataLabelsOptionsObject,Array<SeriesSankeyDataLabelsOptionsObject>> dataLabels;
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
     * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
     * chart width or only the zoomed area when zooming in on parts of the X
     * axis. By default, the Y axis adjusts to the min and max of the visible
     * data. Cartesian series only.
     */
    @jsweet.lang.Optional
    public Boolean getExtremesFromAll;
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
     * (Highcharts) Set options on specific levels. Takes precedence over series
     * options, but not node and link options.
     */
    @jsweet.lang.Optional
    public Array<PlotDependencywheelLevelsOptions> levels;
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
     * (Highcharts) Opacity for the links between nodes in the sankey diagram.
     */
    @jsweet.lang.Optional
    public double linkOpacity;
    /**
     * (Highcharts) The minimal width for a line of a sankey. By default, 0
     * values are not shown.
     */
    @jsweet.lang.Optional
    public double minLinkWidth;
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
     * (Highcharts) The padding between nodes in a sankey diagram or dependency
     * wheel, in pixels.
     *
     * If the number of nodes is so great that it is possible to lay them out
     * within the plot area with the given `nodePadding`, they will be rendered
     * with a smaller padding as a strategy to avoid overflow.
     */
    @jsweet.lang.Optional
    public double nodePadding;
    /**
     * (Highcharts) The pixel width of each node in a sankey diagram or
     * dependency wheel, or the height in case the chart is inverted.
     */
    @jsweet.lang.Optional
    public double nodeWidth;
    /**
     * (Highcharts) Opacity of a series parts: line, fill (e.g. area) and
     * dataLabels.
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
     * (Highcharts) Whether to display this particular series or series type in
     * the legend. Standalone series are shown in legend by default, and linked
     * series are not. Since v7.2.0 it is possible to show series that use
     * colorAxis by setting this option to `true`.
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
     * (Highcharts) The start angle of the dependency wheel, in degrees where 0
     * is up.
     */
    @jsweet.lang.Optional
    public double startAngle;
    @jsweet.lang.Optional
    public SeriesStatesOptionsObject states;
    /**
     * (Highcharts) Sticky tracking of mouse events. When true, the `mouseOut`
     * event on a series isn't triggered until the mouse moves over another
     * series, or out of the plot area. When false, the `mouseOut` event on a
     * series is triggered when the mouse leaves the area around the series'
     * graph or markers. This also implies the tooltip when not shared. When
     * `stickyTracking` is false and `tooltip.shared` is false, the tooltip will
     * be hidden when moving the mouse between series. Defaults to true for line
     * and area type series, but to false for columns, pies etc.
     *
     * **Note:** The boost module will force this option because of technical
     * limitations.
     */
    @jsweet.lang.Optional
    public Boolean stickyTracking;
    /**
     * (Highcharts) A configuration object for the tooltip rendering of each
     * single series. Properties are inherited from tooltip, but only the
     * following properties can be defined on a series level.
     */
    @jsweet.lang.Optional
    public SeriesTooltipOptionsObject tooltip;
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
    native public java.lang.Object pointDescriptionFormatter(java.lang.Object... args);
}

