package def.highcharts;
import def.dom.PointerEvent;
import def.js.Function;
/**
 * Information about the legend click event.
 */
@jsweet.lang.Interface
public abstract class SeriesLegendItemClickEventObject extends def.js.Object {
    /**
     * Related browser event.
     */
    public PointerEvent browserEvent;
    /**
     * Prevent the default action of toggle the visibility of the series.
     */
    public Function preventDefault;
    /**
     * Related series.
     */
    public Series target;
    /**
     * Event type.
     */
    public def.highcharts.StringTypes.legendItemClick type;
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

