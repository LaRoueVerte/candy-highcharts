package def.highcharts;
/**
 * (Highcharts, Highstock, Gantt) An array of lines stretching across the plot
 * area, marking a specific value on one of the axes.
 *
 * In styled mode, the plot lines are styled by the `.highcharts-plot-line`
 * class in addition to the `className` option.
 */
@jsweet.lang.Interface
public abstract class NavigatorYAxisPlotLinesOptions extends def.js.Object {
    /**
     * (Highstock) Flag to decide if plotLine should be rendered across all
     * panes.
     */
    @jsweet.lang.Optional
    public Boolean acrossPanes;
    /**
     * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
     * default `highcharts-plot-line`, to apply to each individual line.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock, Gantt) The color of the line.
     */
    @jsweet.lang.Optional
    public String color;
    /**
     * (Highcharts, Highstock, Gantt) The dashing or dot style for the plot
     * line. For possible values see this overview.
     */
    @jsweet.lang.Optional
    public Object dashStyle;
    /**
     * (Highcharts, Highstock, Gantt) An object defining mouse events for the
     * plot line. Supported properties are `click`, `mouseover`, `mouseout`,
     * `mousemove`.
     */
    @jsweet.lang.Optional
    public NavigatorYAxisPlotLinesEventsOptions events;
    /**
     * (Highcharts, Highstock, Gantt) An id used for identifying the plot line
     * in Axis.removePlotLine.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highcharts, Highstock, Gantt) Text labels for the plot bands
     */
    @jsweet.lang.Optional
    public NavigatorYAxisPlotLinesLabelOptions label;
    /**
     * (Highcharts, Highstock, Gantt) The position of the line in axis units.
     */
    @jsweet.lang.Optional
    public double value;
    /**
     * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
     */
    @jsweet.lang.Optional
    public double width;
    /**
     * (Highcharts, Highstock, Gantt) The z index of the plot line within the
     * chart.
     */
    @jsweet.lang.Optional
    public double zIndex;
}

