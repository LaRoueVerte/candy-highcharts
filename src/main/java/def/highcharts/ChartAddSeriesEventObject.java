package def.highcharts;
import def.js.Function;
/**
 * Contains common event information. Through the `options` property you can
 * access the series options that were passed to the `addSeries` method.
 */
@jsweet.lang.Interface
public abstract class ChartAddSeriesEventObject extends def.js.Object {
    /**
     * The series options that were passed to the `addSeries` method.
     */
    public SeriesOptionsRegistry options;
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
    public def.highcharts.StringTypes.addSeries type;
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

