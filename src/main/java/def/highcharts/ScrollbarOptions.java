package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highstock, Gantt) The scrollbar is a means of panning over the X axis of a
 * stock chart. Scrollbars can also be applied to other types of axes.
 *
 * Another approach to scrollable charts is the chart.scrollablePlotArea option
 * that is especially suitable for simpler cartesian charts on mobile.
 *
 * In styled mode, all the presentational options for the scrollbar are replaced
 * by the classes `.highcharts-scrollbar-thumb`, `.highcharts-scrollbar-arrow`,
 * `.highcharts-scrollbar-button`, `.highcharts-scrollbar-rifles` and
 * `.highcharts-scrollbar-track`.
 */
@jsweet.lang.Interface
public abstract class ScrollbarOptions extends def.js.Object {
    /**
     * (Highstock, Gantt) The background color of the scrollbar itself.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> barBackgroundColor;
    /**
     * (Highstock, Gantt) The color of the scrollbar's border.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> barBorderColor;
    /**
     * (Highstock, Gantt) The border rounding radius of the bar.
     */
    @jsweet.lang.Optional
    public double barBorderRadius;
    /**
     * (Highstock, Gantt) The width of the bar's border.
     */
    @jsweet.lang.Optional
    public double barBorderWidth;
    /**
     * (Highstock, Gantt) The color of the small arrow inside the scrollbar
     * buttons.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> buttonArrowColor;
    /**
     * (Highstock, Gantt) The color of scrollbar buttons.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> buttonBackgroundColor;
    /**
     * (Highstock, Gantt) The color of the border of the scrollbar buttons.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> buttonBorderColor;
    /**
     * (Highstock, Gantt) The corner radius of the scrollbar buttons.
     */
    @jsweet.lang.Optional
    public double buttonBorderRadius;
    /**
     * (Highstock, Gantt) The border width of the scrollbar buttons.
     */
    @jsweet.lang.Optional
    public double buttonBorderWidth;
    /**
     * (Highstock, Gantt) Enable or disable the scrollbar.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock, Gantt) The height of the scrollbar. The height also applies
     * to the width of the scroll arrows so that they are always squares.
     * Defaults to 20 for touch devices and 14 for mouse devices.
     */
    @jsweet.lang.Optional
    public double height;
    /**
     * (Highstock, Gantt) Whether to redraw the main chart as the scrollbar or
     * the navigator zoomed window is moved. Defaults to `true` for modern
     * browsers and `false` for legacy IE browsers as well as mobile devices.
     */
    @jsweet.lang.Optional
    public Boolean liveRedraw;
    /**
     * (Highstock, Gantt) The margin between the scrollbar and its axis when the
     * scrollbar is applied directly to an axis.
     */
    @jsweet.lang.Optional
    public double margin;
    /**
     * (Highstock, Gantt) The minimum width of the scrollbar.
     */
    @jsweet.lang.Optional
    public double minWidth;
    /**
     * (Highstock, Gantt) The color of the small rifles in the middle of the
     * scrollbar.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> rifleColor;
    /**
     * (Highstock, Gantt) Whether to show or hide the scrollbar when the
     * scrolled content is zoomed out to it full extent.
     */
    @jsweet.lang.Optional
    public Boolean showFull;
    /**
     * (Highstock, Gantt) The color of the track background.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> trackBackgroundColor;
    /**
     * (Highstock, Gantt) The color of the border of the scrollbar track.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> trackBorderColor;
    /**
     * (Highstock, Gantt) The corner radius of the border of the scrollbar
     * track.
     */
    @jsweet.lang.Optional
    public double trackBorderRadius;
    /**
     * (Highstock, Gantt) The width of the border of the scrollbar track.
     */
    @jsweet.lang.Optional
    public double trackBorderWidth;
    /**
     * (Highstock, Gantt) The z index of the scrollbar group.
     */
    @jsweet.lang.Optional
    public double zIndex;
}

