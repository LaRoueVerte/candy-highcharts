package def.highcharts;
import def.js.Array;
import jsweet.util.union.Union3;
/**
 * (Highstock, Gantt) Options for the navigator Y axis. Default series options
 * for the navigator yAxis are: (see online documentation for example)
 */
@jsweet.lang.Interface
public abstract class NavigatorYAxisOptions extends def.js.Object {
    /**
     * (Highstock, Gantt) Accessibility options for an axis. Requires the
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
     * (Highstock, Gantt) Whether to allow decimals in this axis' ticks. When
     * counting integers, like persons or hits on a web page, decimals should be
     * avoided in the labels.
     */
    @jsweet.lang.Optional
    public Boolean allowDecimals;
    /**
     * (Highstock, Gantt) When using an alternate grid color, a band is painted
     * across the plot area between every other grid line.
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
     * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
     * sections defined will be left out and all the points shifted closer to
     * each other.
     */
    @jsweet.lang.Optional
    public Array<NavigatorYAxisBreaksOptions> breaks;
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
     * (Highstock, Gantt) A class name that opens for styling the axis by CSS,
     * especially in Highcharts styled mode. The class name is applied to group
     * elements for the grid, axis elements and labels.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highstock, Gantt) Configure a crosshair that follows either the mouse
     * pointer or the hovered point.
     *
     * In styled mode, the crosshairs are styled in the `.highcharts-crosshair`,
     * `.highcharts-crosshair-thin` or `.highcharts-xaxis-category` classes.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,AxisCrosshairOptions> crosshair;
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
     * (Highstock, Gantt) Whether to force the axis to end on a tick. Use this
     * option with the `maxPadding` option to control the axis end.
     *
     * This option is always disabled, when panning type is either `y` or `xy`.
     */
    @jsweet.lang.Optional
    public Boolean endOnTick;
    /**
     * (Highstock, Gantt) Event handlers for the axis.
     */
    @jsweet.lang.Optional
    public NavigatorYAxisEventsOptions events;
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
    public NavigatorYAxisGridOptions grid;
    /**
     * (Highstock, Gantt) Color of the grid lines extending the ticks across the
     * plot area.
     *
     * In styled mode, the stroke is given in the `.highcharts-grid-line` class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> gridLineColor;
    /**
     * (Highstock, Gantt) The dash or dot style of the grid lines. For possible
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
     * (Highstock, Gantt) The width of the grid lines extending the ticks across
     * the plot area.
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
     * (Highstock, Gantt) An id for the axis. This can be used after render time
     * to get a pointer to the axis object through `chart.get()`.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highstock, Gantt) The axis labels show the number or category for each
     * tick.
     *
     * Since v8.0.0: Labels are animated in categorized x-axis with updating
     * data if `tickInterval` and `step` is set to 1.
     */
    @jsweet.lang.Optional
    public NavigatorYAxisLabelsOptions labels;
    /**
     * (Highcharts, Highstock) The left position as the horizontal axis. If it's
     * a number, it is interpreted as pixel position relative to the chart.
     *
     * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
     * as percentages of the plot width, offset from plot area left.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> left;
    /**
     * (Highstock, Gantt) The color of the line marking the axis itself.
     *
     * In styled mode, the line stroke is given in the `.highcharts-axis-line`
     * or `.highcharts-xaxis-line` class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> lineColor;
    /**
     * (Highstock, Gantt) The width of the line marking the axis itself.
     *
     * In styled mode, the stroke width is given in the `.highcharts-axis-line`
     * or `.highcharts-xaxis-line` class.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highstock, Gantt) If there are multiple axes on the same side of the
     * chart, the pixel margin between the axes. Defaults to 0 on vertical axes,
     * 15 on horizontal axes.
     */
    @jsweet.lang.Optional
    public double margin;
    /**
     * (Highstock, Gantt) The maximum value of the axis. If `null`, the max
     * value is automatically calculated.
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
     * (Highcharts) Solid gauge only. Unless stops are set, the color to
     * represent the maximum value of the Y axis.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> maxColor;
    /**
     * (Highcharts, Highstock, Gantt) Padding of the max value relative to the
     * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
     * This is useful when you don't want the highest data value to appear on
     * the edge of the plot area. When the axis' `max` option is set or a max
     * extreme is set using `axis.setExtremes()`, the maxPadding will be
     * ignored.
     *
     * Also the `softThreshold` option takes precedence over `maxPadding`, so if
     * the data is tangent to the threshold, `maxPadding` may not apply unless
     * `softThreshold` is set to false.
     */
    @jsweet.lang.Optional
    public double maxPadding;
    /**
     * (Highstock, Gantt) The minimum value of the axis. If `null` the min value
     * is automatically calculated.
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
     * (Highcharts) Solid gauge only. Unless stops are set, the color to
     * represent the minimum value of the Y axis.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> minColor;
    /**
     * (Highstock, Gantt) Color of the minor, secondary grid lines.
     *
     * In styled mode, the stroke width is given in the
     * `.highcharts-minor-grid-line` class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> minorGridLineColor;
    /**
     * (Highstock, Gantt) The dash or dot style of the minor grid lines. For
     * possible values, see this demonstration.
     */
    @jsweet.lang.Optional
    public Object minorGridLineDashStyle;
    /**
     * (Highstock, Gantt) Width of the minor, secondary grid lines.
     *
     * In styled mode, the stroke width is given in the `.highcharts-grid-line`
     * class.
     */
    @jsweet.lang.Optional
    public double minorGridLineWidth;
    /**
     * (Highstock, Gantt) Color for the minor tick marks.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> minorTickColor;
    /**
     * (Highstock, Gantt) Specific tick interval in axis units for the minor
     * ticks. On a linear axis, if `"auto"`, the minor tick interval is
     * calculated as a fifth of the tickInterval. If `null` or `undefined`,
     * minor ticks are not shown.
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
     * (Highstock, Gantt) The pixel length of the minor tick marks.
     */
    @jsweet.lang.Optional
    public double minorTickLength;
    /**
     * (Highstock, Gantt) The position of the minor tick marks relative to the
     * axis line. Can be one of `inside` and `outside`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.inside,def.highcharts.StringTypes.outside> minorTickPosition;
    /**
     * (Highstock, Gantt) Enable or disable minor ticks. Unless
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
     * (Highstock, Gantt) The pixel width of the minor tick mark.
     */
    @jsweet.lang.Optional
    public double minorTickWidth;
    /**
     * (Highcharts, Highstock, Gantt) Padding of the min value relative to the
     * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
     * This is useful when you don't want the lowest data value to appear on the
     * edge of the plot area. When the axis' `min` option is set or a max
     * extreme is set using `axis.setExtremes()`, the maxPadding will be
     * ignored.
     *
     * Also the `softThreshold` option takes precedence over `minPadding`, so if
     * the data is tangent to the threshold, `minPadding` may not apply unless
     * `softThreshold` is set to false.
     */
    @jsweet.lang.Optional
    public double minPadding;
    /**
     * (Highstock, Gantt) The minimum tick interval allowed in axis values. For
     * example on zooming in on an axis with daily data, this can be used to
     * prevent the axis from showing hours. Defaults to the closest distance
     * between two points on the axis.
     */
    @jsweet.lang.Optional
    public double minTickInterval;
    /**
     * (Highstock, Gantt) The distance in pixels from the plot area to the axis
     * line. A positive offset moves the axis with it's line, labels and ticks
     * away from the plot area. This is typically used when two or more axes are
     * displayed on the same side of the plot. With multiple axes the offset is
     * dynamically adjusted to avoid collision, this can be overridden by
     * setting offset explicitly.
     */
    @jsweet.lang.Optional
    public double offset;
    /**
     * (Highstock, Highcharts, Gantt) Whether to display the axis on the
     * opposite side of the normal. The normal is on the left side for vertical
     * axes and bottom for horizontal, so the opposite sides will be right and
     * top respectively. This is typically used with dual or multiple axes.
     */
    @jsweet.lang.Optional
    public Boolean opposite;
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
    public Array<NavigatorYAxisPlotBandsOptions> plotBands;
    /**
     * (Highcharts, Highstock, Gantt) An array of lines stretching across the
     * plot area, marking a specific value on one of the axes.
     *
     * In styled mode, the plot lines are styled by the `.highcharts-plot-line`
     * class in addition to the `className` option.
     */
    @jsweet.lang.Optional
    public Array<NavigatorYAxisPlotLinesOptions> plotLines;
    /**
     * (Highstock, Gantt) Whether to reverse the axis so that the highest number
     * is closest to the origin.
     */
    @jsweet.lang.Optional
    public Boolean reversed;
    /**
     * (Highcharts, Highstock) If `true`, the first series in a stack will be
     * drawn on top in a positive, non-reversed Y axis. If `false`, the first
     * series is in the base of the stack.
     */
    @jsweet.lang.Optional
    public Boolean reversedStacks;
    /**
     * (Highstock, Gantt) Whether to show the first tick label.
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
     *
     * **Note**: The series.softThreshold option takes precedence over this
     * option.
     */
    @jsweet.lang.Optional
    public double softMax;
    /**
     * (Highcharts, Highstock, Gantt) A soft minimum for the axis. If the series
     * data minimum is greater than this, the axis will stay at this minimum,
     * but if the series data minimum is lower, the axis will flex to show all
     * data.
     *
     * **Note**: The series.softThreshold option takes precedence over this
     * option.
     */
    @jsweet.lang.Optional
    public double softMin;
    /**
     * (Highcharts) The stack labels show the total value for each bar in a
     * stacked column or bar chart. The label will be placed on top of positive
     * columns and below negative columns. In case of an inverted column chart
     * or a bar chart the label is placed to the right of positive bars and to
     * the left of negative bars.
     */
    @jsweet.lang.Optional
    public NavigatorYAxisStackLabelsOptions stackLabels;
    /**
     * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
     * put the tick between weeks. 0 = Sunday, 1 = Monday.
     */
    @jsweet.lang.Optional
    public double startOfWeek;
    /**
     * (Highcharts, Highstock, Gantt) Whether to force the axis to start on a
     * tick. Use this option with the `maxPadding` option to control the axis
     * start.
     *
     * This option is always disabled, when panning type is either `y` or `xy`.
     */
    @jsweet.lang.Optional
    public Boolean startOnTick;
    /**
     * (Gantt) For vertical axes only. Setting the static scale ensures that
     * each tick unit is translated into a fixed pixel height. For example,
     * setting the static scale to 24 results in each Y axis category taking up
     * 24 pixels, and the height of the chart adjusts. Adding or removing items
     * will make the chart resize.
     */
    @jsweet.lang.Optional
    public double staticScale;
    /**
     * (Highcharts) Solid gauge series only. Color stops for the solid gauge.
     * Use this in cases where a linear gradient between a `minColor` and
     * `maxColor` is not sufficient. The stops is an array of tuples, where the
     * first item is a float between 0 and 1 assigning the relative position in
     * the gradient, and the second item is the color.
     *
     * For solid gauges, the Y axis also inherits the concept of data classes
     * from the Highmaps color axis.
     */
    @jsweet.lang.Optional
    public Array<jsweet.util.tuple.Tuple2<Double,Union3<String,GradientColorObject,PatternObject>>> stops;
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
     * (Highstock, Gantt) Color for the main tick marks.
     *
     * In styled mode, the stroke is given in the `.highcharts-tick` class.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> tickColor;
    /**
     * (Highstock, Gantt) The interval of the tick marks in axis units. When
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
     * (Highstock, Gantt) The pixel length of the main tick marks.
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
     * (Highstock, Gantt) If tickInterval is `null` this option sets the
     * approximate pixel interval of the tick marks. Not applicable to
     * categorized axis.
     *
     * The tick interval is also influenced by the minTickInterval option, that,
     * by default prevents ticks from being denser than the data points.
     */
    @jsweet.lang.Optional
    public double tickPixelInterval;
    /**
     * (Highstock, Gantt) The position of the major tick marks relative to the
     * axis line. Can be one of `inside` and `outside`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.inside,def.highcharts.StringTypes.outside> tickPosition;
    /**
     * (Highstock, Gantt) A callback function returning array defining where the
     * ticks are laid out on the axis. This overrides the default behaviour of
     * tickPixelInterval and tickInterval. The automatic tick positions are
     * accessible through `this.tickPositions` and can be modified by the
     * callback.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Axis,AxisTickPositionsArray> tickPositioner;
    /**
     * (Highstock, Gantt) An array defining where the ticks are laid out on the
     * axis. This overrides the default behaviour of tickPixelInterval and
     * tickInterval.
     */
    @jsweet.lang.Optional
    public Array<Double> tickPositions;
    /**
     * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
     */
    @jsweet.lang.Optional
    public double tickWidth;
    /**
     * (Highstock, Gantt) The axis title, showing next to the axis line.
     */
    @jsweet.lang.Optional
    public NavigatorYAxisTitleOptions title;
    /**
     * (Highcharts) Parallel coordinates only. Format that will be used for
     * point.y and available in tooltip.pointFormat as `{point.formattedValue}`.
     * If not set, `{point.formattedValue}` will use other options, in this
     * order:
     *
     * 1. yAxis.labels.format will be used if set
     *
     * 2. If yAxis is a category, then category name will be displayed
     *
     * 3. If yAxis is a datetime, then value will use the same format as yAxis
     * labels
     *
     * 4. If yAxis is linear/logarithmic type, then simple value will be used
     */
    @jsweet.lang.Optional
    public String tooltipValueFormat;
    /**
     * (Highcharts, Gantt) The type of axis. Can be one of `linear`,
     * `logarithmic`, `datetime`, `category` or `treegrid`. Defaults to
     * `treegrid` for Gantt charts, `linear` for other chart types.
     *
     * In a datetime axis, the numbers are given in milliseconds, and tick marks
     * are placed on appropriate values, like full hours or days. In a category
     * or treegrid axis, the point names of the chart's series are used for
     * categories, if a categories array is not defined.
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
     * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
     * ticks and labels, should be visible.
     */
    @jsweet.lang.Optional
    public Boolean visible;
    /**
     * (Highcharts, Highstock) The width as the horizontal axis. If it's a
     * number, it is interpreted as pixels.
     *
     * Since Highcharts v5.0.13: If it's a percentage string, it is interpreted
     * as percentages of the total plot width.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> width;
    /**
     * (Highstock, Gantt) Whether to zoom axis. If `chart.zoomType` is set, the
     * option allows to disable zooming on an individual axis.
     */
    @jsweet.lang.Optional
    public Boolean zoomEnabled;
}

