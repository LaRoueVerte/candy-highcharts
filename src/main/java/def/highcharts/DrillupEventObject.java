package def.highcharts;
import def.js.Function;
/**
 * The event arguments when drilling up from a drilldown series.
 */
@jsweet.lang.Interface
public abstract class DrillupEventObject extends def.js.Object {
    /**
     * Prevents the default behaviour of the event.
     */
    public Function preventDefault;
    /**
     * Options for the new series.
     */
    @jsweet.lang.Optional
    public SeriesOptionsRegistry seriesOptions;
    /**
     * The event target.
     */
    public Chart target;
    /**
     * The event type.
     */
    public def.highcharts.StringTypes.drillup type;
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

