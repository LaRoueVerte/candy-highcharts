package def.highcharts;
import def.js.Array;
import jsweet.util.union.Union3;
/**
 * (Highcharts) The Z axis or depth axis for 3D plots.
 *
 * See the Axis class for programmatic access to the axis.
 */
@jsweet.lang.Interface
public abstract class ZAxisOptions extends def.js.Object {
    /**
     * (Highcharts) Accessibility options for an axis. Requires the
     * accessibility module.
     */
    @jsweet.lang.Optional
    public AxisAccessibilityOptionsObject accessibility;
    /**
     * (Highcharts, Highstock, Gantt) When using multiple axis, the ticks of two
     * or more opposite axes will automatically be aligned by adding ticks to
     * the axis or axes with the least ticks, as if `tickAmount` were specified.
     *
     * This can be prevented by setting `alignTicks` to false. If the grid lines
     * look messy, it's a good idea to hide them for the secondary axis by
     * setting `gridLineWidth` to 0.
     *
     * If `startOnTick` or `endOnTick` in an Axis options are set to false, then
     * the `alignTicks ` will be disabled for the Axis.
     *
     * Disabled for logarithmic axes.
     */
    @jsweet.lang.Optional
    public Boolean alignTicks;
    /**
     * (Highcharts) Whether to allow decimals in this axis' ticks. When counting
     * integers, like persons or hits on a web page, decimals should be avoided
     * in the labels.
     */
    @jsweet.lang.Optional
    public Boolean allowDecimals;
    /**
     * (Highcharts) When using an alternate grid color, a band is painted across
     * the plot area between every other grid line.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> alternateGridColor;
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
     * (Highcharts, Gantt) If categories are present for the xAxis, names are
     * used instead of numbers for that axis.
     *
     * Since Highcharts 3.0, categories can also be extracted by giving each
     * point a name and setting axis type to `category`. However, if you have
     * multiple series, best practice remains defining the `categories` array.
     *
     * Example: `categories: ['Apples', 'Bananas', 'Oranges']`
     */
    @jsweet.lang.Optional
    public Array<String> categories;
    /**
     * (Highcharts, Highstock, Gantt) The highest allowed value for
     * automatically computed axis extremes.
     */
    @jsweet.lang.Optional
    public double ceiling;
    /**
     * (Highcharts) A class name that opens for styling the axis by CSS,
     * especially in Highcharts styled mode. The class name is applied to group
     * elements for the grid, axis elements and labels.
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
     * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
     * automatically adjust to the appropriate unit. This member gives the
     * default string representations used for each unit. For intermediate
     * values, different units may be used, for example the `day` unit can be
     * used on midnight and `hour` unit be used for intermediate values on the
     * same axis.
     *
     * For an overview of the replacement codes, see dateFormat.
     *
     * Defaults to: (see online documentation for example)
     */
    @jsweet.lang.Optional
    public AxisDateTimeLabelFormatsOptions dateTimeLabelFormats;
    /**
     * (Highcharts) Whether to force the axis to end on a tick. Use this option
     * with the `maxPadding` option to control the axis end.
     */
    @jsweet.lang.Optional
    public Boolean endOnTick;
    /**
     * (Highcharts) Event handlers for the axis.
     */
    @jsweet.lang.Optional
    public ZAxisEventsOptions events;
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
    public ZAxisGridOptions grid;
    /**
     * (Highcharts) Color of the grid lines extending the ticks across the plot
     * area.
     *
     * In styled mode, the stroke is given in the `.highcharts-grid-line` class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> gridLineColor;
    /**
     * (Highcharts) The dash or dot style of the grid lines. For possible
     * values, see this demonstration.
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
     * (Highcharts) The width of the grid lines extending the ticks across the
     * plot area.
     *
     * In styled mode, the stroke width is given in the `.highcharts-grid-line`
     * class.
     */
    @jsweet.lang.Optional
    public double gridLineWidth;
    /**
     * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
     */
    @jsweet.lang.Optional
    public double gridZIndex;
    /**
     * (Highcharts) An id for the axis. This can be used after render time to
     * get a pointer to the axis object through `chart.get()`.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highcharts) The axis labels show the number or category for each tick.
     *
     * Since v8.0.0: Labels are animated in categorized x-axis with updating
     * data if `tickInterval` and `step` is set to 1.
     */
    @jsweet.lang.Optional
    public ZAxisLabelsOptions labels;
    /**
     * (Highcharts, Highstock, Gantt) Index of another axis that this axis is
     * linked to. When an axis is linked to a master axis, it will take the same
     * extremes as the master, but as assigned by min or max or by setExtremes.
     * It can be used to show additional info, or to ease reading the chart by
     * duplicating the scales.
     */
    @jsweet.lang.Optional
    public double linkedTo;
    /**
     * (Highcharts) If there are multiple axes on the same side of the chart,
     * the pixel margin between the axes. Defaults to 0 on vertical axes, 15 on
     * horizontal axes.
     */
    @jsweet.lang.Optional
    public double margin;
    /**
     * (Highcharts) The maximum value of the axis. If `null`, the max value is
     * automatically calculated.
     *
     * If the endOnTick option is true, the `max` value might be rounded up.
     *
     * If a tickAmount is set, the axis may be extended beyond the set max in
     * order to reach the given number of ticks. The same may happen in a chart
     * with multiple axes, determined by chart. alignTicks, where a `tickAmount`
     * is applied internally.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> max;
    /**
     * (Highcharts) Padding of the max value relative to the length of the axis.
     * A padding of 0.05 will make a 100px axis 5px longer. This is useful when
     * you don't want the highest data value to appear on the edge of the plot
     * area. When the axis' `max` option is set or a max extreme is set using
     * `axis.setExtremes()`, the maxPadding will be ignored.
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
     * (Highcharts) The minimum value of the axis. If `null` the min value is
     * automatically calculated.
     *
     * If the startOnTick option is true (default), the `min` value might be
     * rounded down.
     *
     * The automatically calculated minimum value is also affected by floor,
     * softMin, minPadding, minRange as well as series.threshold and
     * series.softThreshold.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> min;
    /**
     * (Highcharts) Color of the minor, secondary grid lines.
     *
     * In styled mode, the stroke width is given in the
     * `.highcharts-minor-grid-line` class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> minorGridLineColor;
    /**
     * (Highcharts) The dash or dot style of the minor grid lines. For possible
     * values, see this demonstration.
     */
    @jsweet.lang.Optional
    public Object minorGridLineDashStyle;
    /**
     * (Highcharts) Width of the minor, secondary grid lines.
     *
     * In styled mode, the stroke width is given in the `.highcharts-grid-line`
     * class.
     */
    @jsweet.lang.Optional
    public double minorGridLineWidth;
    /**
     * (Highcharts) Color for the minor tick marks.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> minorTickColor;
    /**
     * (Highcharts) Specific tick interval in axis units for the minor ticks. On
     * a linear axis, if `"auto"`, the minor tick interval is calculated as a
     * fifth of the tickInterval. If `null` or `undefined`, minor ticks are not
     * shown.
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
     * (Highcharts) The pixel length of the minor tick marks.
     */
    @jsweet.lang.Optional
    public double minorTickLength;
    /**
     * (Highcharts) The position of the minor tick marks relative to the axis
     * line. Can be one of `inside` and `outside`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.inside,def.highcharts.StringTypes.outside> minorTickPosition;
    /**
     * (Highcharts) Enable or disable minor ticks. Unless minorTickInterval is
     * set, the tick interval is calculated as a fifth of the `tickInterval`.
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
     * (Highcharts) The pixel width of the minor tick mark.
     */
    @jsweet.lang.Optional
    public double minorTickWidth;
    /**
     * (Highcharts, Highstock, Gantt) Padding of the min value relative to the
     * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
     * This is useful when you don't want the lowest data value to appear on the
     * edge of the plot area. When the axis' `min` option is set or a min
     * extreme is set using `axis.setExtremes()`, the minPadding will be
     * ignored.
     */
    @jsweet.lang.Optional
    public double minPadding;
    /**
     * (Highcharts) The minimum range to display on this axis. The entire axis
     * will not be allowed to span over a smaller interval than this. For
     * example, for a datetime axis the main unit is milliseconds. If minRange
     * is set to 3600000, you can't zoom in more than to one hour.
     *
     * The default minRange for the x axis is five times the smallest interval
     * between any of the data points.
     *
     * On a logarithmic axis, the unit for the minimum range is the power. So a
     * minRange of 1 means that the axis can be zoomed to 10-100, 100-1000,
     * 1000-10000 etc.
     *
     * **Note**: The `minPadding`, `maxPadding`, `startOnTick` and `endOnTick`
     * settings also affect how the extremes of the axis are computed.
     */
    @jsweet.lang.Optional
    public double minRange;
    /**
     * (Highcharts) The minimum tick interval allowed in axis values. For
     * example on zooming in on an axis with daily data, this can be used to
     * prevent the axis from showing hours. Defaults to the closest distance
     * between two points on the axis.
     */
    @jsweet.lang.Optional
    public double minTickInterval;
    /**
     * (Highcharts) The distance in pixels from the plot area to the axis line.
     * A positive offset moves the axis with it's line, labels and ticks away
     * from the plot area. This is typically used when two or more axes are
     * displayed on the same side of the plot. With multiple axes the offset is
     * dynamically adjusted to avoid collision, this can be overridden by
     * setting offset explicitly.
     */
    @jsweet.lang.Optional
    public double offset;
    /**
     * (Highcharts) Whether to display the axis on the opposite side of the
     * normal. The normal is on the left side for vertical axes and bottom for
     * horizontal, so the opposite sides will be right and top respectively.
     * This is typically used with dual or multiple axes.
     */
    @jsweet.lang.Optional
    public Boolean opposite;
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
     * (Highcharts) Refers to the index in the panes array. Used for circular
     * gauges and polar charts. When the option is not set then first pane will
     * be used.
     */
    @jsweet.lang.Optional
    public double pane;
    /**
     * (Highcharts, Highstock, Gantt) An array of colored bands stretching
     * across the plot area marking an interval on the axis.
     *
     * In styled mode, the plot bands are styled by the `.highcharts-plot-band`
     * class in addition to the `className` option.
     */
    @jsweet.lang.Optional
    public Array<ZAxisPlotBandsOptions> plotBands;
    /**
     * (Highcharts, Highstock, Gantt) An array of lines stretching across the
     * plot area, marking a specific value on one of the axes.
     *
     * In styled mode, the plot lines are styled by the `.highcharts-plot-line`
     * class in addition to the `className` option.
     */
    @jsweet.lang.Optional
    public Array<ZAxisPlotLinesOptions> plotLines;
    /**
     * (Highstock) The zoomed range to display when only defining one or none of
     * `min` or `max`. For example, to show the latest month, a range of one
     * month can be set.
     */
    @jsweet.lang.Optional
    public double range;
    /**
     * (Highcharts) Whether to reverse the axis so that the highest number is
     * closest to the origin. If the chart is inverted, the x axis is reversed
     * by default.
     */
    @jsweet.lang.Optional
    public Boolean reversed;
    /**
     * (Highcharts, Highstock) This option determines how stacks should be
     * ordered within a group. For example reversed xAxis also reverses stacks,
     * so first series comes last in a group. To keep order like for
     * non-reversed xAxis enable this option.
     */
    @jsweet.lang.Optional
    public Boolean reversedStacks;
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
    public ZAxisScrollbarOptions scrollbar;
    /**
     * (Highcharts) Whether to show the first tick label.
     */
    @jsweet.lang.Optional
    public Boolean showFirstLabel;
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
     * (Highcharts) Whether to force the axis to start on a tick. Use this
     * option with the `minPadding` option to control the axis start.
     */
    @jsweet.lang.Optional
    public Boolean startOnTick;
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
     * (Highcharts) Color for the main tick marks.
     *
     * In styled mode, the stroke is given in the `.highcharts-tick` class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> tickColor;
    /**
     * (Highcharts) The interval of the tick marks in axis units. When
     * `undefined`, the tick interval is computed to approximately follow the
     * tickPixelInterval on linear and datetime axes. On categorized axes, a
     * `undefined` tickInterval will default to 1, one category. Note that
     * datetime axes are based on milliseconds, so for example an interval of
     * one day is expressed as `24 * 3600 * 1000`.
     *
     * On logarithmic axes, the tickInterval is based on powers, so a
     * tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A
     * tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of
     * 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40
     * etc.
     *
     * If the tickInterval is too dense for labels to be drawn, Highcharts may
     * remove ticks.
     *
     * If the chart has multiple axes, the alignTicks option may interfere with
     * the `tickInterval` setting.
     */
    @jsweet.lang.Optional
    public double tickInterval;
    /**
     * (Highcharts) The pixel length of the main tick marks.
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
     * (Highcharts) If tickInterval is `null` this option sets the approximate
     * pixel interval of the tick marks. Not applicable to categorized axis.
     *
     * The tick interval is also influenced by the minTickInterval option, that,
     * by default prevents ticks from being denser than the data points.
     */
    @jsweet.lang.Optional
    public double tickPixelInterval;
    /**
     * (Highcharts) The position of the major tick marks relative to the axis
     * line. Can be one of `inside` and `outside`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.inside,def.highcharts.StringTypes.outside> tickPosition;
    /**
     * (Highcharts) A callback function returning array defining where the ticks
     * are laid out on the axis. This overrides the default behaviour of
     * tickPixelInterval and tickInterval. The automatic tick positions are
     * accessible through `this.tickPositions` and can be modified by the
     * callback.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Axis,AxisTickPositionsArray> tickPositioner;
    /**
     * (Highcharts) An array defining where the ticks are laid out on the axis.
     * This overrides the default behaviour of tickPixelInterval and
     * tickInterval.
     */
    @jsweet.lang.Optional
    public Array<Double> tickPositions;
    /**
     * (Highcharts) The pixel width of the major tick marks. Defaults to 0 on
     * category axes, otherwise 1.
     *
     * In styled mode, the stroke width is given in the `.highcharts-tick`
     * class, but in order for the element to be generated on category axes, the
     * option must be explicitly set to 1.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> tickWidth;
    /**
     * (Highcharts) The axis title, showing next to the axis line.
     */
    @jsweet.lang.Optional
    public ZAxisTitleOptions title;
    /**
     * (Highcharts, Gantt) The type of axis. Can be one of `linear`,
     * `logarithmic`, `datetime` or `category`. In a datetime axis, the numbers
     * are given in milliseconds, and tick marks are placed on appropriate
     * values like full hours or days. In a category axis, the point names of
     * the chart's series are used for categories, if not a categories array is
     * defined.
     */
    @jsweet.lang.Optional
    public Object type;
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
    /**
     * (Highcharts) Whether to zoom axis. If `chart.zoomType` is set, the option
     * allows to disable zooming on an individual axis.
     */
    @jsweet.lang.Optional
    public Boolean zoomEnabled;
}

