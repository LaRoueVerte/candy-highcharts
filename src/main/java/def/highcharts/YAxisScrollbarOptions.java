package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highstock) An optional scrollbar to display on the Y axis in response to
 * limiting the minimum an maximum of the axis values.
 *
 * In styled mode, all the presentational options for the scrollbar are replaced
 * by the classes `.highcharts-scrollbar-thumb`, `.highcharts-scrollbar-arrow`,
 * `.highcharts-scrollbar-button`, `.highcharts-scrollbar-rifles` and
 * `.highcharts-scrollbar-track`.
 */
@jsweet.lang.Interface
public abstract class YAxisScrollbarOptions extends def.js.Object {
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
     * (Highstock) Enable the scrollbar on the Y axis.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock) Whether to redraw the main chart as the scrollbar or the
     * navigator zoomed window is moved. Defaults to `true` for modern browsers
     * and `false` for legacy IE browsers as well as mobile devices.
     */
    @jsweet.lang.Optional
    public Boolean liveRedraw;
    /**
     * (Highstock) Pixel margin between the scrollbar and the axis elements.
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
     * (Highstock) Whether to show the scrollbar when it is fully zoomed out at
     * max range. Setting it to `false` on the Y axis makes the scrollbar stay
     * hidden until the user zooms in, like common in browsers.
     */
    @jsweet.lang.Optional
    public Boolean showFull;
    /**
     * (Highstock) The width of a vertical scrollbar or height of a horizontal
     * scrollbar. Defaults to 20 on touch devices.
     */
    @jsweet.lang.Optional
    public double size;
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
     * (Highstock) Z index of the scrollbar elements.
     */
    @jsweet.lang.Optional
    public double zIndex;
}

