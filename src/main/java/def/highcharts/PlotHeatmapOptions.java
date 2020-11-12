package def.highcharts;
import def.js.Array;
import def.js.Function;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highmaps) A heatmap is a graphical representation of data where
 * the individual values contained in a matrix are represented as colors.
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * 1. Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * 2. Options for all `heatmap` series are defined in plotOptions.heatmap.
 *
 * 3. Options for one single series are given in the series instance array. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class PlotHeatmapOptions extends def.js.Object {
    /**
     * (Highcharts, Highmaps) Accessibility options for a series.
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
     * (Highcharts, Highmaps) Allow this series' points to be selected by
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
     * (Highcharts, Highmaps) Animation is disabled by default on the heatmap
     * series.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,PlotHeatmapAnimationOptions> animation;
    /**
     * (Highcharts, Highmaps) Sets the color blending in the boost module.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.add,def.highcharts.StringTypes.darken,def.highcharts.StringTypes.multiply> boostBlending;
    /**
     * (Highcharts, Highmaps) Set the point threshold for when a series should
     * enter boost mode.
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
     * (Highmaps) The border width for each heat map item.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts, Highmaps) An additional class name to apply to the series'
     * graphical elements. This option does not replace default class names of
     * the graphical element.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highmaps) Disable this option to allow series rendering in
     * the whole plotting area.
     *
     * **Note:** Clipping should be always enabled when chart.zoomType is set
     */
    @jsweet.lang.Optional
    public Boolean clip;
    /**
     * (Highcharts) The main color of the series. In heat maps this color is
     * rarely used, as we mostly use the color to denote the value of each
     * point. Unless options are set in the colorAxis, the default value is
     * pulled from the options.colors array.
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
     * (Highcharts, Highmaps) Styled mode only. A specific color index to use
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
     * (Highcharts, Highmaps) The column size - how many X axis units each
     * column in the heatmap should span.
     */
    @jsweet.lang.Optional
    public double colsize;
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
     * (Highcharts, Highmaps) You can set the cursor to "pointer" if you have
     * click events attached to the series, to signal to the user that the
     * points and lines can be clicked.
     *
     * In styled mode, the series cursor can be set with the same classes as
     * listed under series.color.
     */
    @jsweet.lang.Optional
    public Object cursor;
    /**
     * (Highcharts, Highmaps) A reserved subspace to store options and values
     * for customized functionality. Here you can add additional data for your
     * own event callbacks and formatter callbacks.
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
    public jsweet.util.union.Union<PlotHeatmapDataLabelsOptions,Array<PlotHeatmapDataLabelsOptions>> dataLabels;
    /**
     * (Highcharts, Highstock) Options for the series data sorting.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<DataSortingOptionsObject,PlotHeatmapDataSortingOptions> dataSorting;
    /**
     * (Highcharts, Highmaps) A description of the series to add to the screen
     * reader information about the series.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highcharts, Highmaps) The draggable-points module allows points to be
     * moved around or modified in the chart. In addition to the options
     * mentioned under the `dragDrop` API structure, the module fires three
     * events, point.dragStart, point.drag and point.drop.
     */
    @jsweet.lang.Optional
    public SeriesDragDropOptionsObject dragDrop;
    /**
     * (Highcharts, Highmaps) Enable or disable the mouse tracking for a
     * specific series. This includes point tooltips and click events on graphs
     * and points. For large datasets it improves performance.
     */
    @jsweet.lang.Optional
    public Boolean enableMouseTracking;
    /**
     * (Highcharts, Highmaps) General event handlers for the series items. These
     * event hooks can also be attached to the series at run time using the
     * `Highcharts.addEvent` function.
     */
    @jsweet.lang.Optional
    public SeriesEventsOptionsObject events;
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
     * (Highcharts, Highmaps) When set to `false` will prevent the series data
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
     * (Highcharts, Highmaps) An array specifying which option maps to which key
     * in the data point array. This makes it convenient to work with
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
     * (Highcharts, Highmaps) Options for the point markers of line-like series.
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
     * (Highcharts, Highmaps) The color for the parts of the graph or points
     * that are below the threshold. Note that `zones` takes precedence over the
     * negative color. Using `negativeColor` is equivalent to applying a zone
     * with value of 0.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> negativeColor;
    /**
     * (Highcharts, Highmaps) The color applied to null points. In styled mode,
     * a general CSS class is applied instead.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> nullColor;
    /**
     * (Highcharts, Highmaps) Opacity of a series parts: line, fill (e.g. area)
     * and dataLabels.
     */
    @jsweet.lang.Optional
    public double opacity;
    /**
     * (Highcharts, Highmaps) Properties for each single point.
     */
    @jsweet.lang.Optional
    public PlotSeriesPointOptions point;
    /**
     * (Highcharts, Highmaps) Same as accessibility.pointDescriptionFormatter,
     * but for an individual series. Overrides the chart wide configuration.
     */
    @jsweet.lang.Optional
    public Function pointDescriptionFormatter;
    /**
     * (Highcharts, Highmaps) Padding between the points in the heatmap.
     */
    @jsweet.lang.Optional
    public double pointPadding;
    /**
     * (Highcharts, Highmaps) The row size - how many Y axis units each heatmap
     * row should span.
     */
    @jsweet.lang.Optional
    public double rowsize;
    /**
     * (Highcharts, Highmaps) Whether to select the series initially. If
     * `showCheckbox` is true, the checkbox next to the series name in the
     * legend will be checked for a selected series.
     */
    @jsweet.lang.Optional
    public Boolean selected;
    /**
     * (Highcharts, Highmaps) If true, a checkbox is displayed next to the
     * legend item to allow selecting the series. The state of the checkbox is
     * determined by the `selected` option.
     */
    @jsweet.lang.Optional
    public Boolean showCheckbox;
    /**
     * (Highcharts, Highmaps) Whether to display this particular series or
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
     * (Highcharts, Highmaps) If set to `true`, the accessibility module will
     * skip past the points in this series for keyboard navigation.
     */
    @jsweet.lang.Optional
    public Boolean skipKeyboardNavigation;
    @jsweet.lang.Optional
    public SeriesStatesOptionsObject states;
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
     * (Highcharts, Highmaps) Set the initial visibility of the series.
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

