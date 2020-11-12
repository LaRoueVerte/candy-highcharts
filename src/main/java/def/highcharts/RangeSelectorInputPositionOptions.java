package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highstock, Gantt) Positioning for the input boxes. Allowed properties are
 * `align`, `x` and `y`.
 */
@jsweet.lang.Interface
public abstract class RangeSelectorInputPositionOptions extends def.js.Object {
    /**
     * (Highstock, Gantt) The alignment of the input box. Allowed properties are
     * `left`, `center`, `right`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highstock, Gantt) X offset of the input row.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highstock, Gantt) Y offset of the input row.
     */
    @jsweet.lang.Optional
    public double y;
}

