package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
 */
@jsweet.lang.Interface
public abstract class ChartResetZoomButtonPositionOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
     * button.
     */
    @jsweet.lang.Optional
    public String align;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
     * button.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal offset of the
     * button.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
     * button.
     */
    @jsweet.lang.Optional
    public double y;
}

