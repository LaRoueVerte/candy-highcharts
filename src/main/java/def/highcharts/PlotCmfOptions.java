package def.highcharts;
import def.js.Array;
import jsweet.util.union.Union3;
import def.js.Function;
/**
 * (Highstock) Chaikin Money Flow indicator (cmf).
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * 1. Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * 2. Options for all `cmf` series are defined in plotOptions.cmf.
 *
 * 3. Options for one single series are given in the series instance array. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class PlotCmfOptions extends def.js.Object {
    /**
     * (Highstock) Accessibility options for a series.
     */
    @jsweet.lang.Optional
    public SeriesAccessibilityOptionsObject accessibility;
    /**
     * (Highstock) Allow this series' points to be selected by clicking on the
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
     * (Highstock) Enable or disable the initial animation when a series is
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
    public Union3<Boolean,PlotCmfAnimationOptions,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highstock) Sets the color blending in the boost module.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.add,def.highcharts.StringTypes.darken,def.highcharts.StringTypes.multiply> boostBlending;
    /**
     * (Highstock) Set the point threshold for when a series should enter boost
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
     * (Highmaps) The border color of the map areas.
     *
     * In styled mode, the border stroke is given in the `.highcharts-point`
     * class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highmaps) The border width of each map area.
     *
     * In styled mode, the border stroke width is given in the
     * `.highcharts-point` class.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highstock) An additional class name to apply to the series' graphical
     * elements. This option does not replace default class names of the
     * graphical element.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highstock) Disable this option to allow series rendering in the whole
     * plotting area.
     *
     * **Note:** Clipping should be always enabled when chart.zoomType is set
     */
    @jsweet.lang.Optional
    public Boolean clip;
    /**
     * (Highstock) The main color of the series. In line type series it applies
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
     * (Highstock) Styled mode only. A specific color index to use for the
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
     * (Highstock) Whether to compare indicator to the main series values or
     * indicator values.
     */
    @jsweet.lang.Optional
    public Boolean compareToMain;
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
     * (Highcharts, Highstock) When the series contains less points than the
     * crop threshold, all points are drawn, even if the points fall outside the
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
     * (Highstock) You can set the cursor to "pointer" if you have click events
     * attached to the series, to signal to the user that the points and lines
     * can be clicked.
     *
     * In styled mode, the series cursor can be set with the same classes as
     * listed under series.color.
     */
    @jsweet.lang.Optional
    public Object cursor;
    /**
     * (Highstock) A reserved subspace to store options and values for
     * customized functionality. Here you can add additional data for your own
     * event callbacks and formatter callbacks.
     */
    @jsweet.lang.Optional
    public Dictionary<?> custom;
    /**
     * (Highstock) Name of the dash style to use for the graph, or for some
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
    public jsweet.util.union.Union<PlotCmfDataLabelsOptions,Array<PlotCmfDataLabelsOptions>> dataLabels;
    /**
     * (Highcharts, Highstock) Options for the series data sorting.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<DataSortingOptionsObject,PlotCmfDataSortingOptions> dataSorting;
    /**
     * (Highstock) A description of the series to add to the screen reader
     * information about the series.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highstock) Enable or disable the mouse tracking for a specific series.
     * This includes point tooltips and click events on graphs and points. For
     * large datasets it improves performance.
     */
    @jsweet.lang.Optional
    public Boolean enableMouseTracking;
    /**
     * (Highstock) General event handlers for the series items. These event
     * hooks can also be attached to the series at run time using the
     * `Highcharts.addEvent` function.
     */
    @jsweet.lang.Optional
    public SeriesEventsOptionsObject events;
    /**
     * (Highstock) Determines whether the series should look for the nearest
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
     * (Highstock) When set to `false` will prevent the series data from being
     * included in any form of data export.
     *
     * Since version 6.0.0 until 7.1.0 the option was existing undocumented as
     * `includeInCSVExport`.
     */
    @jsweet.lang.Optional
    public Boolean includeInDataExport;
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
     * (Highcharts, Highstock) The SVG value used for the `stroke-linecap` and
     * `stroke-linejoin` of a line graph. Round means that lines are rounded in
     * the ends and bends.
     */
    @jsweet.lang.Optional
    public Object linecap;
    /**
     * (Highcharts, Highstock) Pixel width of the graph line.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highcharts, Highstock, Gantt) The main series ID that indicator will be
     * based on. Required for this indicator.
     */
    @jsweet.lang.Optional
    public String linkedTo;
    /**
     * (Highstock) Options for the point markers of line-like series. Properties
     * like `fillColor`, `lineColor` and `lineWidth` define the visual
     * appearance of the markers. Other series types, like column series, don't
     * have markers, but have visual options on the series level instead.
     *
     * In styled mode, the markers can be styled with the `.highcharts-point`,
     * `.highcharts-point-hover` and `.highcharts-point-select` class names.
     */
    @jsweet.lang.Optional
    public PointMarkerOptionsObject marker;
    /**
     * (Highstock) The name of the series as shown in the legend, tooltip etc.
     * If not set, it will be based on a technical indicator type and default
     * params.
     */
    @jsweet.lang.Optional
    public String name;
    /**
     * (Highstock) The color for the parts of the graph or points that are below
     * the threshold. Note that `zones` takes precedence over the negative
     * color. Using `negativeColor` is equivalent to applying a zone with value
     * of 0.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> negativeColor;
    /**
     * (Highstock) Opacity of a series parts: line, fill (e.g. area) and
     * dataLabels.
     */
    @jsweet.lang.Optional
    public double opacity;
    /**
     * (Highstock) Paramters used in calculation of regression series' points.
     */
    @jsweet.lang.Optional
    public PlotCmfParamsOptions params;
    /**
     * (Highstock) Properties for each single point.
     */
    @jsweet.lang.Optional
    public PlotSeriesPointOptions point;
    /**
     * (Highstock) Same as accessibility.pointDescriptionFormatter, but for an
     * individual series. Overrides the chart wide configuration.
     */
    @jsweet.lang.Optional
    public Function pointDescriptionFormatter;
    /**
     * (Highstock) Whether to select the series initially. If `showCheckbox` is
     * true, the checkbox next to the series name in the legend will be checked
     * for a selected series.
     */
    @jsweet.lang.Optional
    public Boolean selected;
    /**
     * (Highstock) Whether to apply a drop shadow to the graph line. Since 2.3
     * the shadow can be an object configuration containing `color`, `offsetX`,
     * `offsetY`, `opacity` and `width`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,ShadowOptionsObject> shadow;
    /**
     * (Highstock) If true, a checkbox is displayed next to the legend item to
     * allow selecting the series. The state of the checkbox is determined by
     * the `selected` option.
     */
    @jsweet.lang.Optional
    public Boolean showCheckbox;
    /**
     * (Highstock) Whether to display this particular series or series type in
     * the legend. Standalone series are shown in legend by default, and linked
     * series are not. Since v7.2.0 it is possible to show series that use
     * colorAxis by setting this option to `true`.
     */
    @jsweet.lang.Optional
    public Boolean showInLegend;
    /**
     * (Highstock) If set to `true`, the accessibility module will skip past the
     * points in this series for keyboard navigation.
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
    @jsweet.lang.Optional
    public SeriesStatesOptionsObject states;
    /**
     * (Highcharts, Highstock) Whether to apply steps to the line. Possible
     * values are `left`, `center` and `right`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> step;
    /**
     * (Highstock) Sticky tracking of mouse events. When true, the `mouseOut`
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
     * (Highcharts, Highstock) The threshold, also called zero level or base
     * level. For line type series this is only used in conjunction with
     * negativeColor.
     */
    @jsweet.lang.Optional
    public double threshold;
    /**
     * (Highstock) A configuration object for the tooltip rendering of each
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
     * (Highstock) Set the initial visibility of the series.
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

