package def.highcharts;
import def.js.Array;
import def.js.Function;
import jsweet.util.union.Union3;
/**
 * (Highcharts) A pyramid series is a special type of funnel, without neck and
 * reversed by default.
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * 1. Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * 2. Options for all `pyramid` series are defined in plotOptions.pyramid.
 *
 * 3. Options for one single series are given in the series instance array. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class PlotPyramidOptions extends def.js.Object {
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
     * (Highcharts) Initial animation is by default disabled for the funnel
     * chart.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,PlotPyramidAnimationOptions> animation;
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
     * (Highcharts) The center of the series. By default, it is centered in the
     * middle of the plot area, so it fills the plot area height.
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
     * (Highcharts) Disable this option to allow series rendering in the whole
     * plotting area.
     *
     * **Note:** Clipping should be always enabled when chart.zoomType is set
     */
    @jsweet.lang.Optional
    public Boolean clip;
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
     * (Highcharts) A series specific or series type specific color set to use
     * instead of the global colors.
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
    public jsweet.util.union.Union<SeriesPieDataLabelsOptionsObject,Array<SeriesPieDataLabelsOptionsObject>> dataLabels;
    /**
     * (Highcharts) The thickness of a 3D pie.
     */
    @jsweet.lang.Optional
    public double depth;
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
     * (Highcharts) The end angle of the pie in degrees where 0 is top and 90 is
     * right. Defaults to `startAngle` plus 360.
     */
    @jsweet.lang.Optional
    public double endAngle;
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
     * (Highcharts) The height of the funnel or pyramid. If it is a number it
     * defines the pixel height, if it is a percentage string it is the
     * percentage of the plot area height.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> height;
    /**
     * (Highcharts) Equivalent to chart.ignoreHiddenSeries, this option tells
     * whether the series shall be redrawn as if the hidden point were `null`.
     *
     * The default value changed from `false` to `true` with Highcharts 3.0.
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
     * (Highcharts) The minimum size for a pie in response to auto margins. The
     * pie will try to shrink to make room for data labels in side the plot
     * area, but only to this size.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> minSize;
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
     * (Highcharts) The pyramid neck width is zero by default, as opposed to the
     * funnel, which shares the same layout logic.
     */
    @jsweet.lang.Optional
    public String neckHeight;
    /**
     * (Highcharts) The pyramid neck width is zero by default, as opposed to the
     * funnel, which shares the same layout logic.
     */
    @jsweet.lang.Optional
    public String neckWidth;
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
     * (Highcharts) The pyramid is reversed by default, as opposed to the
     * funnel, which shares the layout engine, and is not reversed.
     */
    @jsweet.lang.Optional
    public Boolean reversed;
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
    /**
     * (Highcharts) Options for the series states.
     */
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
     * (Highcharts) The width of the funnel compared to the width of the plot
     * area, or the pixel width if it is a number.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> width;
    /**
     * (Highmaps) Define the z index of the series.
     */
    @jsweet.lang.Optional
    public double zIndex;
    native public java.lang.Object pointDescriptionFormatter(java.lang.Object... args);
}

