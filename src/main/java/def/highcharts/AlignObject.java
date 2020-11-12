package def.highcharts;
import jsweet.util.union.Union3;
/**
 * Options to align the element relative to the chart or another box.
 */
@jsweet.lang.Interface
public abstract class AlignObject extends def.js.Object {
    /**
     * Horizontal alignment. Can be one of `left`, `center` and `right`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * Use the `transform` attribute with translateX and translateY custom
     * attributes to align this elements rather than `x` and `y` attributes.
     */
    @jsweet.lang.Optional
    public Boolean alignByTranslate;
    /**
     * Vertical alignment. Can be one of `top`, `middle` and `bottom`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * Horizontal pixel offset from alignment.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * Vertical pixel offset from alignment.
     */
    @jsweet.lang.Optional
    public double y;
}

