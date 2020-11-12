package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Gantt) The position of the no-data label, relative to
 * the plot area.
 */
@jsweet.lang.Interface
public abstract class NoDataPositionOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) Horizontal alignment of the label.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highcharts, Highstock, Gantt) Vertical alignment of the label.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highcharts, Highstock, Gantt) Horizontal offset of the label, in pixels.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Gantt) Vertical offset of the label, in pixels.
     */
    @jsweet.lang.Optional
    public double y;
}

