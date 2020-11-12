package def.highcharts;
import def.js.Array;
import def.js.Function;
import jsweet.util.union.Union3;
/**
 * (Highcharts) A Sunburst displays hierarchical data, where a level in the
 * hierarchy is represented by a circle. The center represents the root node of
 * the tree. The visualization bears a resemblance to both treemap and pie
 * charts.
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * 1. Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * 2. Options for all `sunburst` series are defined in plotOptions.sunburst.
 *
 * 3. Options for one single series are given in the series instance array. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class PlotSunburstOptions extends def.js.Object {
    /**
     * (Highcharts) Accessibility options for a series.
     */
    @jsweet.lang.Optional
    public SeriesAccessibilityOptionsObject accessibility;
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
    public Union3<Boolean,PlotSunburstAnimationOptions,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts) The color of the border surrounding each slice. When `null`,
     * the border takes the same color as the slice fill. This can be used
     * together with a `borderWidth` to fill drawing gaps created by
     * antialiazing artefacts in borderless pies.
     *
     * In styled mode, the border stroke is given in the `.highcharts-point`
     * class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highcharts) The width of the border surrounding each slice.
     *
     * When setting the border width to 0, there may be small gaps between the
     * slices due to SVG antialiasing artefacts. To work around this, keep the
     * border width at 0.5 or 1, but set the `borderColor` to `null` instead.
     *
     * In styled mode, the border stroke width is given in the
     * `.highcharts-point` class.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) The center of the sunburst chart relative to the plot area.
     * Can be percentages or pixel values.
     */
    @jsweet.lang.Optional
    public Array<jsweet.util.union.Union<Double,String>> center;
    /**
     * (Highcharts) An additional class name to apply to the series' graphical
     * elements. This option does not replace default class names of the
     * graphical element.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts) The color of the pie series. A pie series is represented as
     * an empty circle if the total sum of its values is 0. Use this property to
     * define the color of its border.
     *
     * In styled mode, the color can be defined by the colorIndex option. Also,
     * the series color can be set with the `.highcharts-series`,
     * `.highcharts-color-{n}`, `.highcharts-{type}-series` or
     * `.highcharts-series-{n}` class, or individual classes given by the
     * `className` option.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
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
     * (Highcharts) A series specific or series type specific color set to use
     * instead of the global colors.
     */
    @jsweet.lang.Optional
    public Array<Union3<String,GradientColorObject,PatternObject>> colors;
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
    public jsweet.util.union.Union<SeriesSunburstDataLabelsOptionsObject,Array<SeriesSunburstDataLabelsOptionsObject>> dataLabels;
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
     * (Highcharts) If the total sum of the pie's values is 0, the series is
     * represented as an empty circle . The `fillColor` option defines the color
     * of that circle. Use pie.borderWidth to set the border thickness.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fillColor;
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
     * (Highcharts) An array specifying which option maps to which key in the
     * data point array. This makes it convenient to work with unstructured data
     * arrays from different sources.
     */
    @jsweet.lang.Optional
    public Array<String> keys;
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
     * (Highcharts) Used together with the levels and `allowDrillToNode`
     * options. When set to false the first level visible when drilling is
     * considered to be level one. Otherwise the level will be the same as the
     * tree structure.
     */
    @jsweet.lang.Optional
    public Boolean levelIsConstant;
    /**
     * (Highcharts) Set options on specific levels. Takes precedence over series
     * options, but not point options.
     */
    @jsweet.lang.Optional
    public Array<PlotSunburstLevelsOptions> levels;
    /**
     * (Highcharts) Determines the width of the ring per level.
     */
    @jsweet.lang.Optional
    public PlotSunburstLevelSizeOptions levelSize;
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
     * (Highcharts) Which point to use as a root in the visualization.
     */
    @jsweet.lang.Optional
    public String rootId;
    /**
     * (Highcharts) Whether to select the series initially. If `showCheckbox` is
     * true, the checkbox next to the series name in the legend will be checked
     * for a selected series.
     */
    @jsweet.lang.Optional
    public Boolean selected;
    /**
     * (Highcharts) Whether to apply a drop shadow to the graph line. Since 2.3
     * the shadow can be an object configuration containing `color`, `offsetX`,
     * `offsetY`, `opacity` and `width`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,ShadowOptionsObject> shadow;
    /**
     * (Highcharts) If true, a checkbox is displayed next to the legend item to
     * allow selecting the series. The state of the checkbox is determined by
     * the `selected` option.
     */
    @jsweet.lang.Optional
    public Boolean showCheckbox;
    /**
     * (Highcharts) Whether to display this particular series or series type in
     * the legend. Since 2.1, pies are not shown in the legend by default.
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
     * (Highcharts) The diameter of the pie relative to the plot area. Can be a
     * percentage or pixel value. Pixel values are given as integers. The
     * default behaviour (as of 3.0) is to scale to the plot area and give room
     * for data labels within the plot area. slicedOffset is also included in
     * the default size calculation. As a consequence, the size of the pie may
     * vary when points are updated and data labels more around. In that case it
     * is best to set a fixed value, for example `"75%"`.
     */
    @jsweet.lang.Optional
    public Union3<Double,String,Object> size;
    /**
     * (Highcharts) If set to `true`, the accessibility module will skip past
     * the points in this series for keyboard navigation.
     */
    @jsweet.lang.Optional
    public Boolean skipKeyboardNavigation;
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
    @jsweet.lang.Optional
    public SeriesStatesOptionsObject states;
    /**
     * (Highcharts) Sticky tracking of mouse events. When true, the `mouseOut`
     * event on a series isn't triggered until the mouse moves over another
     * series, or out of the plot area. When false, the `mouseOut` event on a
     * series is triggered when the mouse leaves the area around the series'
     * graph or markers. This also implies the tooltip. When `stickyTracking` is
     * false and `tooltip.shared` is false, the tooltip will be hidden when
     * moving the mouse between series.
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
     * (Highcharts) Options for the button appearing when traversing down in a
     * treemap.
     */
    @jsweet.lang.Optional
    public PlotSunburstTraverseUpButtonOptions traverseUpButton;
    /**
     * (Highstock) The parameter allows setting line series type and use OHLC
     * indicators. Data in OHLC format is required.
     */
    @jsweet.lang.Optional
    public Boolean useOhlcData;
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

