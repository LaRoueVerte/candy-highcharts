package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) The position of the button.
 */
@jsweet.lang.Interface
public abstract class PlotSunburstTraverseUpButtonPositionOptions extends def.js.Object {
    /**
     * (Highcharts) Horizontal alignment of the button.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highcharts) Vertical alignment of the button.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highcharts) Horizontal offset of the button.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts) Vertical offset of the button.
     */
    @jsweet.lang.Optional
    public double y;
}

