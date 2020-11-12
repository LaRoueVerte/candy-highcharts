package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Gantt) Allow panning in a chart. Best used with
 * panKey to combine zooming and panning.
 *
 * On touch devices, when the tooltip.followTouchMove option is `true`
 * (default), panning requires two fingers. To allow panning with one finger,
 * set `followTouchMove` to `false`.
 */
@jsweet.lang.Interface
public abstract class ChartPanningOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) Enable or disable chart panning.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
     * pan the chart. Can be one of `x`, `y`, or `xy`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.x,def.highcharts.StringTypes.xy,def.highcharts.StringTypes.y> type;
}

