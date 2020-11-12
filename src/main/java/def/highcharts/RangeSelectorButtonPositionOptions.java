package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highstock, Gantt) Positioning for the button row.
 */
@jsweet.lang.Interface
public abstract class RangeSelectorButtonPositionOptions extends def.js.Object {
    /**
     * (Highstock, Gantt) The alignment of the input box. Allowed properties are
     * `left`, `center`, `right`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highstock, Gantt) X offset of the button row.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highstock, Gantt) Y offset of the button row.
     */
    @jsweet.lang.Optional
    public double y;
}

