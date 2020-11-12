package def.highcharts;
import def.dom.Event;
/**
 * Common information for a click event on a series.
 */
@jsweet.lang.Interface
public abstract class SeriesClickEventObject extends Event {
    /**
     * Nearest point on the graph.
     */
    public Point point;
}

