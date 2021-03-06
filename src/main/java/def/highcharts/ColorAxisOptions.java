package def.highcharts;
import def.js.Array;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps) A color axis for series. Visually, the
 * color axis will appear as a gradient or as separate items inside the legend,
 * depending on whether the axis is scalar or based on data classes.
 *
 * For supported color formats, see the docs article about colors.
 *
 * A scalar color axis is represented by a gradient. The colors either range
 * between the minColor and the maxColor, or for more fine grained control the
 * colors can be defined in stops. Often times, the color axis needs to be
 * adjusted to get the right color spread for the data. In addition to stops,
 * consider using a logarithmic axis type, or setting min and max to avoid the
 * colors being determined by outliers.
 *
 * When dataClasses are used, the ranges are subdivided into separate classes
 * like categories based on their values. This can be used for ranges between
 * two values, but also for a true category. However, when your data is
 * categorized, it may be as convenient to add each category to a separate
 * series.
 *
 * Color axis does not work with: `sankey`, `sunburst`, `dependencywheel`,
 * `networkgraph`, `wordcloud`, `venn`, `gauge` and `solidgauge` series types.
 *
 * Since v7.2.0 `colorAxis` can also be an array of options objects.
 *
 * See the Axis object for programmatic access to the axis.
 */
@jsweet.lang.Interface
public abstract class ColorAxisOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps) Accessibility options for an axis.
     * Requires the accessibility module.
     */
    @jsweet.lang.Optional
    public AxisAccessibilityOptionsObject accessibility;
    /**
     * (Highcharts, Highstock, Highmaps) Whether to allow decimals on the color
     * axis.
     */
    @jsweet.lang.Optional
    public Boolean allowDecimals;
    /**
     * (Highcharts) In a polar chart, this is the angle of the Y axis in
     * degrees, where 0 is up and 90 is right. The angle determines the position
     * of the axis line and the labels, though the coordinate system is
     * unaffected. Since v8.0.0 this option is also applicable for X axis
     * (inverted polar).
     */
    @jsweet.lang.Optional
    public double angle;
    /**
     * (Highcharts, Highstock, Gantt) The highest allowed value for
     * automatically computed axis extremes.
     */
    @jsweet.lang.Optional
    public double ceiling;
    /**
     * (Highcharts, Highstock, Highmaps) A class name that opens for styling the
     * axis by CSS, especially in Highcharts styled mode. The class name is
     * applied to group elements for the grid, axis elements and labels.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Gantt) Show an indicator on the axis for the current date and time. Can
     * be a boolean or a configuration object similar to xAxis.plotLines.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,AxisCurrentDateIndicatorOptions> currentDateIndicator;
    /**
     * (Highcharts, Highstock, Highmaps) Determines how to set each data class'
     * color if no individual color is set. The default value, `tween`, computes
     * intermediate colors between `minColor` and `maxColor`. The other possible
     * value, `category`, pulls colors from the global or chart specific colors
     * array.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.category,def.highcharts.StringTypes.tween> dataClassColor;
    /**
     * (Highcharts, Highstock, Highmaps) An array of data classes or ranges for
     * the choropleth map. If none given, the color axis is scalar and values
     * are distributed as a gradient between the minimum and maximum colors.
     */
    @jsweet.lang.Optional
    public Array<ColorAxisDataClassesOptions> dataClasses;
    /**
     * (Highcharts, Highstock, Highmaps) Whether to force the axis to end on a
     * tick. Use this option with the maxPadding option to control the axis end.
     */
    @jsweet.lang.Optional
    public Boolean endOnTick;
    /**
     * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
     */
    @jsweet.lang.Optional
    public ColorAxisEventsOptions events;
    /**
     * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
     * computed axis extremes.
     */
    @jsweet.lang.Optional
    public double floor;
    /**
     * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
     */
    @jsweet.lang.Optional
    public ColorAxisGridOptions grid;
    /**
     * (Highcharts, Highstock, Highmaps) Color of the grid lines extending from
     * the axis across the gradient.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> gridLineColor;
    /**
     * (Highcharts, Highstock, Highmaps) The dash or dot style of the grid
     * lines. For possible values, see this demonstration.
     */
    @jsweet.lang.Optional
    public Object gridLineDashStyle;
    /**
     * (Highcharts) Polar charts only. Whether the grid lines should draw as a
     * polygon with straight lines between categories, or as circles. Can be
     * either `circle` or `polygon`. Since v8.0.0 this option is also applicable
     * for X axis (inverted polar).
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.circle,def.highcharts.StringTypes.polygon> gridLineInterpolation;
    /**
     * (Highcharts, Highstock, Highmaps) The width of the grid lines extending
     * from the axis across the gradient of a scalar color axis.
     */
    @jsweet.lang.Optional
    public double gridLineWidth;
    /**
     * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
     */
    @jsweet.lang.Optional
    public double gridZIndex;
    /**
     * (Highcharts, Highstock, Highmaps) An id for the axis. This can be used
     * after render time to get a pointer to the axis object through
     * `chart.get()`.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highcharts, Highstock, Highmaps) The axis labels show the number for
     * each tick.
     *
     * For more live examples on label options, see xAxis.labels in the
     * Highcharts API.
     */
    @jsweet.lang.Optional
    public ColorAxisLabelsOptions labels;
    /**
     * (Highcharts, Highstock, Highmaps) The layout of the color axis. Can be
     * `'horizontal'` or `'vertical'`. If none given, the color axis has the
     * same layout as the legend.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Object> layout;
    /**
     * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
     * itself.
     *
     * In styled mode, the line stroke is given in the `.highcharts-axis-line`
     * or `.highcharts-xaxis-line` class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> lineColor;
    /**
     * (Highcharts, Highstock, Highmaps) If there are multiple axes on the same
     * side of the chart, the pixel margin between the axes. Defaults to 0 on
     * vertical axes, 15 on horizontal axes.
     */
    @jsweet.lang.Optional
    public double margin;
    /**
     * (Highcharts, Highstock, Highmaps) The triangular marker on a scalar color
     * axis that points to the value of the hovered area. To disable the marker,
     * set `marker: null`.
     */
    @jsweet.lang.Optional
    public PointMarkerOptionsObject marker;
    /**
     * (Highcharts, Highstock, Highmaps) The maximum value of the axis in terms
     * of map point values. If `null`, the max value is automatically
     * calculated. If the `endOnTick` option is true, the max value might be
     * rounded up.
     */
    @jsweet.lang.Optional
    public double max;
    /**
     * (Highcharts, Highstock, Highmaps) The color to represent the maximum of
     * the color axis. Unless dataClasses or stops are set, the gradient ends at
     * this value.
     *
     * If dataClasses are set, the color is based on minColor and maxColor
     * unless a color is set for each data class, or the dataClassColor is set.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> maxColor;
    /**
     * (Highcharts, Highstock, Highmaps) Padding of the max value relative to
     * the length of the axis. A padding of 0.05 will make a 100px axis 5px
     * longer.
     */
    @jsweet.lang.Optional
    public double maxPadding;
    /**
     * (Highstock, Gantt) Maximum range which can be set using the navigator's
     * handles. Opposite of xAxis.minRange.
     */
    @jsweet.lang.Optional
    public double maxRange;
    /**
     * (Highcharts, Highstock, Highmaps) The minimum value of the axis in terms
     * of map point values. If `null`, the min value is automatically
     * calculated. If the `startOnTick` option is true, the min value might be
     * rounded down.
     */
    @jsweet.lang.Optional
    public double min;
    /**
     * (Highcharts, Highstock, Highmaps) The color to represent the minimum of
     * the color axis. Unless dataClasses or stops are set, the gradient starts
     * at this value.
     *
     * If dataClasses are set, the color is based on minColor and maxColor
     * unless a color is set for each data class, or the dataClassColor is set.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> minColor;
    /**
     * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
     * lines.
     *
     * In styled mode, the stroke width is given in the
     * `.highcharts-minor-grid-line` class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> minorGridLineColor;
    /**
     * (Highcharts, Highstock, Highmaps) The dash or dot style of the minor grid
     * lines. For possible values, see this demonstration.
     */
    @jsweet.lang.Optional
    public Object minorGridLineDashStyle;
    /**
     * (Highcharts, Highstock, Highmaps) Width of the minor, secondary grid
     * lines.
     *
     * In styled mode, the stroke width is given in the `.highcharts-grid-line`
     * class.
     */
    @jsweet.lang.Optional
    public double minorGridLineWidth;
    /**
     * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> minorTickColor;
    /**
     * (Highcharts, Highstock, Highmaps) Specific tick interval in axis units
     * for the minor ticks. On a linear axis, if `"auto"`, the minor tick
     * interval is calculated as a fifth of the tickInterval. If `null` or
     * `undefined`, minor ticks are not shown.
     *
     * On logarithmic axes, the unit is the power of the value. For example,
     * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
     * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
     * and 10, 10 and 100 etc.
     *
     * If user settings dictate minor ticks to become too dense, they don't make
     * sense, and will be ignored to prevent performance problems.
     */
    @jsweet.lang.Optional
    public Union3<Double,String,Object> minorTickInterval;
    /**
     * (Highcharts, Highstock, Highmaps) The pixel length of the minor tick
     * marks.
     */
    @jsweet.lang.Optional
    public double minorTickLength;
    /**
     * (Highcharts, Highstock, Highmaps) The position of the minor tick marks
     * relative to the axis line. Can be one of `inside` and `outside`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.inside,def.highcharts.StringTypes.outside> minorTickPosition;
    /**
     * (Highcharts, Highstock, Highmaps) Enable or disable minor ticks. Unless
     * minorTickInterval is set, the tick interval is calculated as a fifth of
     * the `tickInterval`.
     *
     * On a logarithmic axis, minor ticks are laid out based on a best guess,
     * attempting to enter approximately 5 minor ticks between each major tick.
     *
     * Prior to v6.0.0, ticks were unabled in auto layout by setting
     * `minorTickInterval` to `"auto"`.
     */
    @jsweet.lang.Optional
    public Boolean minorTicks;
    /**
     * (Highcharts, Highstock, Highmaps) The pixel width of the minor tick mark.
     */
    @jsweet.lang.Optional
    public double minorTickWidth;
    /**
     * (Highcharts, Highstock, Highmaps) Padding of the min value relative to
     * the length of the axis. A padding of 0.05 will make a 100px axis 5px
     * longer.
     */
    @jsweet.lang.Optional
    public double minPadding;
    /**
     * (Highstock) In an ordinal axis, the points are equally spaced in the
     * chart regardless of the actual time or x distance between them. This
     * means that missing data periods (e.g. nights or weekends for a stock
     * chart) will not take up space in the chart. Having `ordinal: false` will
     * show any gaps created by the `gapSize` setting proportionate to their
     * duration.
     *
     * In stock charts the X axis is ordinal by default, unless the boost module
     * is used and at least one of the series' data length exceeds the
     * boostThreshold.
     */
    @jsweet.lang.Optional
    public Boolean ordinal;
    /**
     * (Highstock) Additional range on the right side of the xAxis. Works
     * similar to `xAxis.maxPadding`, but value is set in milliseconds. Can be
     * set for both main `xAxis` and the navigator's `xAxis`.
     */
    @jsweet.lang.Optional
    public double overscroll;
    /**
     * (Highstock) The zoomed range to display when only defining one or none of
     * `min` or `max`. For example, to show the latest month, a range of one
     * month can be set.
     */
    @jsweet.lang.Optional
    public double range;
    /**
     * (Highcharts, Highstock, Highmaps) Whether to reverse the axis so that the
     * highest number is closest to the origin. Defaults to `false` in a
     * horizontal legend and `true` in a vertical legend, where the smallest
     * value starts on top.
     */
    @jsweet.lang.Optional
    public Boolean reversed;
    /**
     * (Highstock) An optional scrollbar to display on the X axis in response to
     * limiting the minimum and maximum of the axis values.
     *
     * In styled mode, all the presentational options for the scrollbar are
     * replaced by the classes `.highcharts-scrollbar-thumb`,
     * `.highcharts-scrollbar-arrow`, `.highcharts-scrollbar-button`,
     * `.highcharts-scrollbar-rifles` and `.highcharts-scrollbar-track`.
     */
    @jsweet.lang.Optional
    public ColorAxisScrollbarOptions scrollbar;
    /**
     * (Highcharts, Highstock, Highmaps) Whether to show the first tick label.
     */
    @jsweet.lang.Optional
    public Boolean showFirstLabel;
    /**
     * (Highcharts, Highstock, Highmaps) Whether to display the colorAxis in the
     * legend.
     */
    @jsweet.lang.Optional
    public Boolean showInLegend;
    /**
     * (Highcharts, Highstock, Gantt) Whether to show the last tick label.
     * Defaults to `true` on cartesian charts, and `false` on polar charts.
     */
    @jsweet.lang.Optional
    public Boolean showLastLabel;
    /**
     * (Highcharts, Highstock, Gantt) A soft maximum for the axis. If the series
     * data maximum is less than this, the axis will stay at this maximum, but
     * if the series data maximum is higher, the axis will flex to show all
     * data.
     */
    @jsweet.lang.Optional
    public double softMax;
    /**
     * (Highcharts, Highstock, Gantt) A soft minimum for the axis. If the series
     * data minimum is greater than this, the axis will stay at this minimum,
     * but if the series data minimum is lower, the axis will flex to show all
     * data.
     */
    @jsweet.lang.Optional
    public double softMin;
    /**
     * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
     * put the tick between weeks. 0 = Sunday, 1 = Monday.
     */
    @jsweet.lang.Optional
    public double startOfWeek;
    /**
     * (Highcharts, Highstock, Highmaps) Whether to force the axis to start on a
     * tick. Use this option with the `maxPadding` option to control the axis
     * start.
     */
    @jsweet.lang.Optional
    public Boolean startOnTick;
    /**
     * (Highcharts, Highstock, Highmaps) Color stops for the gradient of a
     * scalar color axis. Use this in cases where a linear gradient between a
     * `minColor` and `maxColor` is not sufficient. The stops is an array of
     * tuples, where the first item is a float between 0 and 1 assigning the
     * relative position in the gradient, and the second item is the color.
     */
    @jsweet.lang.Optional
    public Array<jsweet.util.tuple.Tuple2<Double,String>> stops;
    /**
     * (Highcharts, Highstock, Gantt) The amount of ticks to draw on the axis.
     * This opens up for aligning the ticks of multiple charts or panes within a
     * chart. This option overrides the `tickPixelInterval` option.
     *
     * This option only has an effect on linear axes. Datetime, logarithmic or
     * category axes are not affected.
     */
    @jsweet.lang.Optional
    public double tickAmount;
    /**
     * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
     *
     * In styled mode, the stroke is given in the `.highcharts-tick` class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> tickColor;
    /**
     * (Highcharts, Highstock, Highmaps) The interval of the tick marks in axis
     * units. When `null`, the tick interval is computed to approximately follow
     * the `tickPixelInterval`.
     */
    @jsweet.lang.Optional
    public double tickInterval;
    /**
     * (Highcharts, Highstock, Highmaps) The pixel length of the main tick marks
     * on the color axis.
     */
    @jsweet.lang.Optional
    public double tickLength;
    /**
     * (Highcharts, Gantt) For categorized axes only. If `on` the tick mark is
     * placed in the center of the category, if `between` the tick mark is
     * placed between categories. The default is `between` if the `tickInterval`
     * is 1, else `on`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.between,def.highcharts.StringTypes.on> tickmarkPlacement;
    /**
     * (Highcharts, Highstock, Highmaps) If tickInterval is `null` this option
     * sets the approximate pixel interval of the tick marks.
     */
    @jsweet.lang.Optional
    public double tickPixelInterval;
    /**
     * (Highcharts, Highstock, Highmaps) The position of the major tick marks
     * relative to the axis line. Can be one of `inside` and `outside`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.inside,def.highcharts.StringTypes.outside> tickPosition;
    /**
     * (Highcharts, Highstock, Highmaps) A callback function returning array
     * defining where the ticks are laid out on the axis. This overrides the
     * default behaviour of tickPixelInterval and tickInterval. The automatic
     * tick positions are accessible through `this.tickPositions` and can be
     * modified by the callback.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Axis,AxisTickPositionsArray> tickPositioner;
    /**
     * (Highcharts, Highstock, Highmaps) An array defining where the ticks are
     * laid out on the axis. This overrides the default behaviour of
     * tickPixelInterval and tickInterval.
     */
    @jsweet.lang.Optional
    public Array<Double> tickPositions;
    /**
     * (Highcharts, Highstock, Highmaps) The pixel width of the major tick
     * marks. Defaults to 0 on category axes, otherwise 1.
     *
     * In styled mode, the stroke width is given in the `.highcharts-tick`
     * class, but in order for the element to be generated on category axes, the
     * option must be explicitly set to 1.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> tickWidth;
    /**
     * (Highcharts, Highstock, Highmaps) The type of interpolation to use for
     * the color axis. Can be `linear` or `logarithmic`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.linear,def.highcharts.StringTypes.logarithmic> type;
    /**
     * (Highcharts, Gantt) Applies only when the axis `type` is `category`. When
     * `uniqueNames` is true, points are placed on the X axis according to their
     * names. If the same point name is repeated in the same or another series,
     * the point is placed on the same X position as other points of the same
     * name. When `uniqueNames` is false, the points are laid out in increasing
     * X positions regardless of their names, and the X axis category will take
     * the name of the last point in each position.
     */
    @jsweet.lang.Optional
    public Boolean uniqueNames;
    /**
     * (Highcharts, Highstock, Gantt) Datetime axis only. An array determining
     * what time intervals the ticks are allowed to fall on. Each array item is
     * an array where the first value is the time unit and the second value
     * another array of allowed multiples.
     *
     * Defaults to: (see online documentation for example)
     */
    @jsweet.lang.Optional
    public Array<jsweet.util.tuple.Tuple2<String,jsweet.util.union.Union<Array<Double>,Object>>> units;
    /**
     * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
     * ticks and labels, should be visible.
     */
    @jsweet.lang.Optional
    public Boolean visible;
}

