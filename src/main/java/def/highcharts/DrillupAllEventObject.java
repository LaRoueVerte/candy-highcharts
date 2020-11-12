package def.highcharts;
import def.js.Function;
/**
 * The event arguments when all the series have been drilled up.
 */
@jsweet.lang.Interface
public abstract class DrillupAllEventObject extends def.js.Object {
    /**
     * Prevents the default behaviour of the event.
     */
    public Function preventDefault;
    /**
     * The event target.
     */
    public Chart target;
    /**
     * The event type.
     */
    public def.highcharts.StringTypes.drillupall type;
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

