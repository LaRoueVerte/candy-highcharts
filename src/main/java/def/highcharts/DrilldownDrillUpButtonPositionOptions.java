package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highmaps) Positioning options for the button within the
 * `relativeTo` box. Available properties are `x`, `y`, `align` and
 * `verticalAlign`.
 */
@jsweet.lang.Interface
public abstract class DrilldownDrillUpButtonPositionOptions extends def.js.Object {
    /**
     * (Highcharts, Highmaps) Horizontal alignment.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highcharts, Highmaps) Vertical alignment of the button.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highcharts, Highmaps) The X offset of the button.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highmaps) The Y offset of the button.
     */
    @jsweet.lang.Optional
    public double y;
}

