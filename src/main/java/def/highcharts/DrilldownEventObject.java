package def.highcharts;
import def.js.Array;
import def.dom.Event;
import def.js.Function;
/**
 * The event arguments when a drilldown point is clicked.
 */
@jsweet.lang.Interface
public abstract class DrilldownEventObject extends def.js.Object {
    /**
     * If a category label was clicked, which index.
     */
    @jsweet.lang.Optional
    public double category;
    /**
     * The original browser event (usually click) that triggered the drilldown.
     */
    @jsweet.lang.Optional
    public Event originalEvent;
    /**
     * The originating point.
     */
    public Point point;
    /**
     * If a category label was clicked, this array holds all points
     * corresponding to the category. Otherwise it is set to false.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Array<Point>> points;
    /**
     * Prevents the default behaviour of the event.
     */
    public Function preventDefault;
    /**
     * Options for the new series. If the event is utilized for async drilldown,
     * the seriesOptions are not added, but rather loaded async.
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
    public def.highcharts.StringTypes.drilldown type;
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

