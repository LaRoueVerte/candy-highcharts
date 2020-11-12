package def.highcharts;
import def.js.Array;
/**
 * (Highcharts) The pane serves as a container for axes and backgrounds for
 * circular gauges and polar charts.
 */
@jsweet.lang.Interface
public abstract class PaneOptions extends def.js.Object {
    /**
     * (Highcharts) An array of background items for the pane.
     */
    @jsweet.lang.Optional
    public Array<PaneBackgroundOptions> background;
    /**
     * (Highcharts) The center of a polar chart or angular gauge, given as an
     * array of [x, y] positions. Positions can be given as integers that
     * transform to pixels, or as percentages of the plot area size.
     */
    @jsweet.lang.Optional
    public Array<jsweet.util.union.Union<String,Double>> center;
    /**
     * (Highcharts) The end angle of the polar X axis or gauge value axis, given
     * in degrees where 0 is north. Defaults to startAngle
     *
     * + 360.
     */
    @jsweet.lang.Optional
    public double endAngle;
    /**
     * (Highcharts) The inner size of the pane, either as a number defining
     * pixels, or a percentage defining a percentage of the pane's size.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> innerSize;
    /**
     * (Highcharts) The size of the pane, either as a number defining pixels, or
     * a percentage defining a percentage of the available plot area (the
     * smallest of the plot height or plot width).
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> size;
    /**
     * (Highcharts) The start angle of the polar X axis or gauge axis, given in
     * degrees where 0 is north. Defaults to 0.
     */
    @jsweet.lang.Optional
    public double startAngle;
}

