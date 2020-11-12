package def.highcharts;
/**
 * Event information regarding completed animation of a series.
 */
@jsweet.lang.Interface
public abstract class SeriesAfterAnimateEventObject extends def.js.Object {
    /**
     * Animated series.
     */
    public Series target;
    /**
     * Event type.
     */
    public def.highcharts.StringTypes.afterAnimate type;
}

