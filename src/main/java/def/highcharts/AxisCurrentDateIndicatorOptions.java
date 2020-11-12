package def.highcharts;
/**
 * (Gantt) Show an indicator on the axis for the current date and time. Can be a
 * boolean or a configuration object similar to xAxis.plotLines.
 */
@jsweet.lang.Interface
public abstract class AxisCurrentDateIndicatorOptions extends def.js.Object {
    /**
     * (Highstock) Flag to decide if plotLine should be rendered across all
     * panes.
     */
    @jsweet.lang.Optional
    public Boolean acrossPanes;
    /**
     * (Gantt) A custom class name, in addition to the default
     * `highcharts-plot-line`, to apply to each individual line.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Gantt) The color of the line.
     */
    @jsweet.lang.Optional
    public String color;
    /**
     * (Gantt) The dashing or dot style for the plot line. For possible values
     * see this overview.
     */
    @jsweet.lang.Optional
    public Object dashStyle;
    /**
     * (Gantt) An object defining mouse events for the plot line. Supported
     * properties are `click`, `mouseover`, `mouseout`, `mousemove`.
     */
    @jsweet.lang.Optional
    public Object events;
    /**
     * (Gantt) An id used for identifying the plot line in Axis.removePlotLine.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Gantt) Text labels for the plot bands
     */
    @jsweet.lang.Optional
    public Object label;
    /**
     * (Gantt) The width or thickness of the plot line.
     */
    @jsweet.lang.Optional
    public double width;
    /**
     * (Gantt) The z index of the plot line within the chart.
     */
    @jsweet.lang.Optional
    public double zIndex;
}

