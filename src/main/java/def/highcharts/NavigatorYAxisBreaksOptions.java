package def.highcharts;
/**
 * (Highcharts, Highstock, Gantt) An array defining breaks in the axis, the
 * sections defined will be left out and all the points shifted closer to each
 * other.
 */
@jsweet.lang.Interface
public abstract class NavigatorYAxisBreaksOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) A number indicating how much space should
     * be left between the start and the end of the break. The break size is
     * given in axis units, so for instance on a `datetime` axis, a break size
     * of 3600000 would indicate the equivalent of an hour.
     */
    @jsweet.lang.Optional
    public double breakSize;
    /**
     * (Highcharts, Highstock, Gantt) The point where the break starts.
     */
    @jsweet.lang.Optional
    public double from;
    /**
     * (Highcharts, Highstock, Gantt) Defines an interval after which the break
     * appears again. By default the breaks do not repeat.
     */
    @jsweet.lang.Optional
    public double repeat;
    /**
     * (Highcharts, Highstock, Gantt) The point where the break ends.
     */
    @jsweet.lang.Optional
    public double to;
}

