package def.highcharts;
import def.js.Array;
import def.js.Function;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock) Error bars are a graphical representation of the
 * variability of data and are used on graphs to indicate the error, or
 * uncertainty in a reported measurement.
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * 1. Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * 2. Options for all `errorbar` series are defined in plotOptions.errorbar.
 *
 * 3. Options for one single series are given in the series instance array. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class PlotErrorbarOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock) Accessibility options for a series.
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
     * (Highcharts, Highstock) Allow this series' points to be selected by
     * clicking on the graphic (columns, point markers, pie slices, map areas
     * etc).
     *
     * The selected points can be handled by point select and unselect events,
     * or collectively by the getSelectedPoints function.
     *
     * And alternative way of selecting points is through dragging.
     */
    @jsweet.lang.Optional
    public Boolean allowPointSelect;
    /**
     * (Highcharts, Highstock) Enable or disable the initial animation when a
     * series is displayed. The animation can also be set as a configuration
     * object. Please note that this option only applies to the initial
     * animation of the series itself. For other animations, see chart.animation
     * and the animation parameter under the API methods. The following
     * properties are supported:
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
    public Union3<Boolean,PlotErrorbarAnimationOptions,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts, Highstock) For some series, there is a limit that shuts down
     * initial animation by default when the total number of points in the chart
     * is too high. For example, for a column chart and its derivatives,
     * animation does not run if there is more than 250 points totally. To
     * disable this cap, set `animationLimit` to `Infinity`.
     */
    @jsweet.lang.Optional
    public double animationLimit;
    /**
     * (Highcharts) The dash style of the box.
     */
    @jsweet.lang.Optional
    public Object boxDashStyle;
    /**
     * (Highcharts, Highstock, Gantt) When `true`, the columns will center in
     * the category, ignoring null or missing points. When `false`, space will
     * be reserved for null or missing points.
     */
    @jsweet.lang.Optional
    public Boolean centerInCategory;
    /**
     * (Highcharts, Highstock) An additional class name to apply to the series'
     * graphical elements. This option does not replace default class names of
     * the graphical element.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock) Disable this option to allow series rendering in
     * the whole plotting area.
     *
     * **Note:** Clipping should be always enabled when chart.zoomType is set
     */
    @jsweet.lang.Optional
    public Boolean clip;
    /**
     * (Highcharts) The main color of the bars. This can be overridden by
     * stemColor and whiskerColor individually.
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
     * (Highcharts, Highstock) Styled mode only. A specific color index to use
     * for the series, so its graphic representations are given the class name
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
     * (Highcharts, Highstock, Gantt) When the series contains less points than
     * the crop threshold, all points are drawn, event if the points fall
     * outside the visible plot area at the current zoom. The advantage of
     * drawing all points (including markers and columns), is that animation is
     * performed on updates. On the other hand, when the series contains more
     * points than the crop threshold, the series data is cropped to only
     * contain points that fall within the plot area. The advantage of cropping
     * away invisible points is to increase performance on large series.
     */
    @jsweet.lang.Optional
    public double cropThreshold;
    /**
     * (Highcharts, Highstock) You can set the cursor to "pointer" if you have
     * click events attached to the series, to signal to the user that the
     * points and lines can be clicked.
     *
     * In styled mode, the series cursor can be set with the same classes as
     * listed under series.color.
     */
    @jsweet.lang.Optional
    public Object cursor;
    /**
     * (Highcharts, Highstock) A reserved subspace to store options and values
     * for customized functionality. Here you can add additional data for your
     * own event callbacks and formatter callbacks.
     */
    @jsweet.lang.Optional
    public Dictionary<?> custom;
    /**
     * (Highcharts, Highstock) Name of the dash style to use for the graph, or
     * for some series types the outline of each shape.
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
    public jsweet.util.union.Union<PlotErrorbarDataLabelsOptions,Array<PlotErrorbarDataLabelsOptions>> dataLabels;
    /**
     * (Highcharts, Highstock) Options for the series data sorting.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<DataSortingOptionsObject,PlotErrorbarDataSortingOptions> dataSorting;
    /**
     * (Highcharts) Depth of the columns in a 3D column chart.
     */
    @jsweet.lang.Optional
    public double depth;
    /**
     * (Highcharts, Highstock) A description of the series to add to the screen
     * reader information about the series.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highcharts, Highstock) The draggable-points module allows points to be
     * moved around or modified in the chart. In addition to the options
     * mentioned under the `dragDrop` API structure, the module fires three
     * events, point.dragStart, point.drag and point.drop.
     */
    @jsweet.lang.Optional
    public SeriesDragDropOptionsObject dragDrop;
    /**
     * (Highcharts) 3D columns only. The color of the edges. Similar to
     * `borderColor`, except it defaults to the same color as the column.
     */
    @jsweet.lang.Optional
    public String edgeColor;
    /**
     * (Highcharts) 3D columns only. The width of the colored edges.
     */
    @jsweet.lang.Optional
    public double edgeWidth;
    /**
     * (Highcharts, Highstock) Enable or disable the mouse tracking for a
     * specific series. This includes point tooltips and click events on graphs
     * and points. For large datasets it improves performance.
     */
    @jsweet.lang.Optional
    public Boolean enableMouseTracking;
    /**
     * (Highcharts, Highstock) General event handlers for the series items.
     * These event hooks can also be attached to the series at run time using
     * the `Highcharts.addEvent` function.
     */
    @jsweet.lang.Optional
    public SeriesEventsOptionsObject events;
    /**
     * (Highcharts) The fill color of the box.
     *
     * In styled mode, the fill color can be set with the
     * `.highcharts-boxplot-box` class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fillColor;
    /**
     * (Highcharts, Highstock) Determines whether the series should look for the
     * nearest point in both dimensions or just the x-dimension when hovering
     * the series. Defaults to `'xy'` for scatter series and `'x'` for most
     * other series. If the data has duplicate x-values, it is recommended to
     * set this to `'xy'` to allow hovering over all points.
     *
     * Applies only to series types using nearest neighbor search (not direct
     * hover) for tooltip.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.x,def.highcharts.StringTypes.xy> findNearestPointBy;
    /**
     * (Highcharts, Highstock, Gantt) Whether to use the Y extremes of the total
     * chart width or only the zoomed area when zooming in on parts of the X
     * axis. By default, the Y axis adjusts to the min and max of the visible
     * data. Cartesian series only.
     */
    @jsweet.lang.Optional
    public Boolean getExtremesFromAll;
    /**
     * (Highcharts, Highstock, Gantt) Whether to group non-stacked columns or to
     * let them render independent of each other. Non-grouped columns will be
     * laid out individually and overlap each other.
     */
    @jsweet.lang.Optional
    public Boolean grouping;
    /**
     * (Highcharts, Highstock, Gantt) Padding between each value groups, in x
     * axis units.
     */
    @jsweet.lang.Optional
    public double groupPadding;
    /**
     * (Highcharts, Highstock) When set to `false` will prevent the series data
     * from being included in any form of data export.
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
     * (Highcharts, Highstock) An array specifying which option maps to which
     * key in the data point array. This makes it convenient to work with
     * unstructured data arrays from different sources.
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
     * (Highcharts) The width of the line surrounding the box. If any of
     * stemWidth, medianWidth or whiskerWidth are `null`, the lineWidth also
     * applies to these lines.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highcharts) The parent series of the error bar. The default value links
     * it to the previous series. Otherwise, use the id of the parent series.
     */
    @jsweet.lang.Optional
    public String linkedTo;
    /**
     * (Highcharts, Highstock, Gantt) The maximum allowed pixel width for a
     * column, translated to the height of a bar in a bar chart. This prevents
     * the columns from becoming too wide when there is a small number of points
     * in the chart.
     */
    @jsweet.lang.Optional
    public double maxPointWidth;
    /**
     * (Highcharts) The color of the median line. If `undefined`, the general
     * series color applies.
     *
     * In styled mode, the median stroke width can be set with the
     * `.highcharts-boxplot-median` class.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,GradientColorObject> medianColor;
    /**
     * (Highcharts) The dash style of the median.
     */
    @jsweet.lang.Optional
    public Object medianDashStyle;
    /**
     * (Highcharts) The pixel width of the median line. If `null`, the lineWidth
     * is used.
     *
     * In styled mode, the median stroke width can be set with the
     * `.highcharts-boxplot-median` class.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> medianWidth;
    /**
     * (Highcharts, Highstock, Gantt) The minimal height for a column or width
     * for a bar. By default, 0 values are not shown. To visualize a 0 (or close
     * to zero) point, set the minimal point length to a pixel value like 3\. In
     * stacked column charts, minPointLength might not be respected for tightly
     * packed values.
     */
    @jsweet.lang.Optional
    public double minPointLength;
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
     * (Highcharts, Highstock) The color for the parts of the graph or points
     * that are below the threshold. Note that `zones` takes precedence over the
     * negative color. Using `negativeColor` is equivalent to applying a zone
     * with value of 0.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> negativeColor;
    /**
     * (Highcharts, Highstock) Opacity of a series parts: line, fill (e.g. area)
     * and dataLabels.
     */
    @jsweet.lang.Optional
    public double opacity;
    /**
     * (Highcharts, Highstock) Properties for each single point.
     */
    @jsweet.lang.Optional
    public PlotSeriesPointOptions point;
    /**
     * (Highcharts, Highstock) Same as accessibility.pointDescriptionFormatter,
     * but for an individual series. Overrides the chart wide configuration.
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
     * (Highcharts, Highstock, Gantt) Padding between each column or bar, in x
     * axis units.
     */
    @jsweet.lang.Optional
    public double pointPadding;
    /**
     * (Highcharts, Highstock, Gantt) Possible values: `"on"`, `"between"`,
     * `number`.
     *
     * In a column chart, when pointPlacement is `"on"`, the point will not
     * create any padding of the X axis. In a polar column chart this means that
     * the first column points directly north. If the pointPlacement is
     * `"between"`, the columns will be laid out between ticks. This is useful
     * for example for visualising an amount between two points in time or in a
     * certain sector of a polar chart.
     *
     * Since Highcharts 3.0.2, the point placement can also be numeric, where 0
     * is on the axis value, -0.5 is between this value and the previous, and
     * 0.5 is between this value and the next. Unlike the textual options,
     * numeric point placement options won't affect axis padding.
     *
     * Note that pointPlacement needs a pointRange to work. For column series
     * this is computed, but for line-type series it needs to be set.
     *
     * For the `xrange` series type and gantt charts, if the Y axis is a
     * category axis, the `pointPlacement` applies to the Y axis rather than the
     * (typically datetime) X axis.
     *
     * Defaults to `undefined` in cartesian charts, `"between"` in polar charts.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> pointPlacement;
    /**
     * (Highcharts, Highstock, Gantt) The X axis range that each point is valid
     * for. This determines the width of the column. On a categorized axis, the
     * range will be 1 by default (one category unit). On linear and datetime
     * axes, the range will be computed as the distance between the two closest
     * data points.
     *
     * The default `null` means it is computed automatically, but this option
     * can be used to override the automatic value.
     *
     * This option is set by default to 1 if data sorting is enabled.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> pointRange;
    /**
     * (Highcharts, Highstock, Gantt) If no x values are given for the points in
     * a series, pointStart defines on what value to start. For example, if a
     * series contains one yearly value starting from 1945, set pointStart to
     * 1945.
     */
    @jsweet.lang.Optional
    public double pointStart;
    /**
     * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
     * each column or bar point. When `null`, the width is calculated from the
     * `pointPadding` and `groupPadding`. The width effects the dimension that
     * is not based on the point value. For column series it is the hoizontal
     * length and for bar series it is the vertical length.
     */
    @jsweet.lang.Optional
    public double pointWidth;
    /**
     * (Highcharts, Highstock) Whether to select the series initially. If
     * `showCheckbox` is true, the checkbox next to the series name in the
     * legend will be checked for a selected series.
     */
    @jsweet.lang.Optional
    public Boolean selected;
    /**
     * (Highcharts, Highstock) Whether to apply a drop shadow to the graph line.
     * Since 2.3 the shadow can be an object configuration containing `color`,
     * `offsetX`, `offsetY`, `opacity` and `width`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,ShadowOptionsObject> shadow;
    /**
     * (Highcharts, Highstock) If true, a checkbox is displayed next to the
     * legend item to allow selecting the series. The state of the checkbox is
     * determined by the `selected` option.
     */
    @jsweet.lang.Optional
    public Boolean showCheckbox;
    /**
     * (Highcharts, Highstock) Whether to display this particular series or
     * series type in the legend. Standalone series are shown in legend by
     * default, and linked series are not. Since v7.2.0 it is possible to show
     * series that use colorAxis by setting this option to `true`.
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
     * (Highcharts, Highstock) If set to `true`, the accessibility module will
     * skip past the points in this series for keyboard navigation.
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
     * (Highcharts) The dash style of the stem, the vertical line extending from
     * the box to the whiskers.
     */
    @jsweet.lang.Optional
    public Object stemDashStyle;
    /**
     * (Highcharts) The width of the stem, the vertical line extending from the
     * box to the whiskers. If `undefined`, the width is inherited from the
     * lineWidth option.
     *
     * In styled mode, the stem stroke width can be set with the
     * `.highcharts-boxplot-stem` class.
     */
    @jsweet.lang.Optional
    public double stemWidth;
    /**
     * (Highcharts, Highstock) Sticky tracking of mouse events. When true, the
     * `mouseOut` event on a series isn't triggered until the mouse moves over
     * another series, or out of the plot area. When false, the `mouseOut` event
     * on a series is triggered when the mouse leaves the area around the
     * series' graph or markers. This also implies the tooltip when not shared.
     * When `stickyTracking` is false and `tooltip.shared` is false, the tooltip
     * will be hidden when moving the mouse between series. Defaults to true for
     * line and area type series, but to false for columns, pies etc.
     *
     * **Note:** The boost module will force this option because of technical
     * limitations.
     */
    @jsweet.lang.Optional
    public Boolean stickyTracking;
    /**
     * (Highcharts) The Y axis value to serve as the base for the columns, for
     * distinguishing between values above and below a threshold. If `null`, the
     * columns extend from the padding Y axis minimum.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> threshold;
    /**
     * (Highcharts, Highstock) A configuration object for the tooltip rendering
     * of each single series. Properties are inherited from tooltip, but only
     * the following properties can be defined on a series level.
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
     * (Highcharts, Highstock) Set the initial visibility of the series.
     */
    @jsweet.lang.Optional
    public Boolean visible;
    /**
     * (Highcharts) The color of the whiskers, the horizontal lines marking low
     * and high values. When `undefined`, the general series color is used.
     *
     * In styled mode, the whisker stroke can be set with the
     * `.highcharts-boxplot-whisker` class .
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> whiskerColor;
    /**
     * (Highcharts) The dash style of the whiskers.
     */
    @jsweet.lang.Optional
    public Object whiskerDashStyle;
    /**
     * (Highcharts) The length of the whiskers, the horizontal lines marking low
     * and high values. It can be a numerical pixel value, or a percentage value
     * of the box width. Set `0` to disable whiskers.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> whiskerLength;
    /**
     * (Highcharts) The line width of the whiskers, the horizontal lines marking
     * low and high values. When `null`, the general lineWidth applies.
     */
    @jsweet.lang.Optional
    public double whiskerWidth;
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

