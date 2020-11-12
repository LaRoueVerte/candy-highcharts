package def.highcharts;
/**
 * The event options for adding function callback.
 */
@jsweet.lang.Interface
public abstract class EventOptionsObject extends def.js.Object {
    /**
     * The order the event handler should be called. This opens for having one
     * handler be called before another, independent of in which order they were
     * added.
     */
    public double order;
}

