package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highstock) An optional scrollbar to display on the X axis in response to
 * limiting the minimum and maximum of the axis values.
 *
 * In styled mode, all the presentational options for the scrollbar are replaced
 * by the classes `.highcharts-scrollbar-thumb`, `.highcharts-scrollbar-arrow`,
 * `.highcharts-scrollbar-button`, `.highcharts-scrollbar-rifles` and
 * `.highcharts-scrollbar-track`.
 */
@jsweet.lang.Interface
public abstract class ColorAxisScrollbarOptions extends def.js.Object {
    /**
     * (Highstock) The background color of the scrollbar itself.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> barBackgroundColor;
    /**
     * (Highstock) The color of the scrollbar's border.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> barBorderColor;
    /**
     * (Highstock) The border rounding radius of the bar.
     */
    @jsweet.lang.Optional
    public double barBorderRadius;
    /**
     * (Highstock) The width of the bar's border.
     */
    @jsweet.lang.Optional
    public double barBorderWidth;
    /**
     * (Highstock) The color of the small arrow inside the scrollbar buttons.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> buttonArrowColor;
    /**
     * (Highstock) The color of scrollbar buttons.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> buttonBackgroundColor;
    /**
     * (Highstock) The color of the border of the scrollbar buttons.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> buttonBorderColor;
    /**
     * (Highstock) The corner radius of the scrollbar buttons.
     */
    @jsweet.lang.Optional
    public double buttonBorderRadius;
    /**
     * (Highstock) The border width of the scrollbar buttons.
     */
    @jsweet.lang.Optional
    public double buttonBorderWidth;
    /**
     * (Highstock) Enable or disable the scrollbar.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock) The height of the scrollbar. The height also applies to the
     * width of the scroll arrows so that they are always squares. Defaults to
     * 20 for touch devices and 14 for mouse devices.
     */
    @jsweet.lang.Optional
    public double height;
    /**
     * (Highstock) Whether to redraw the main chart as the scrollbar or the
     * navigator zoomed window is moved. Defaults to `true` for modern browsers
     * and `false` for legacy IE browsers as well as mobile devices.
     */
    @jsweet.lang.Optional
    public Boolean liveRedraw;
    /**
     * (Highstock) The margin between the scrollbar and its axis when the
     * scrollbar is applied directly to an axis.
     */
    @jsweet.lang.Optional
    public double margin;
    /**
     * (Highstock) The minimum width of the scrollbar.
     */
    @jsweet.lang.Optional
    public double minWidth;
    /**
     * (Highstock) The color of the small rifles in the middle of the scrollbar.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> rifleColor;
    /**
     * (Highstock) Whether to show or hide the scrollbar when the scrolled
     * content is zoomed out to it full extent.
     */
    @jsweet.lang.Optional
    public Boolean showFull;
    /**
     * (Highstock) The color of the track background.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> trackBackgroundColor;
    /**
     * (Highstock) The color of the border of the scrollbar track.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> trackBorderColor;
    /**
     * (Highstock) The corner radius of the border of the scrollbar track.
     */
    @jsweet.lang.Optional
    public double trackBorderRadius;
    /**
     * (Highstock) The width of the border of the scrollbar track.
     */
    @jsweet.lang.Optional
    public double trackBorderWidth;
    /**
     * (Highstock) The z index of the scrollbar group.
     */
    @jsweet.lang.Optional
    public double zIndex;
}

