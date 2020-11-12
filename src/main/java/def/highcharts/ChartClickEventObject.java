package def.highcharts;
import def.js.Array;
/**
 * Contains information about the clicked spot on the chart. Remember the unit
 * of a datetime axis is milliseconds since 1970-01-01 00:00:00.
 */
@jsweet.lang.Interface
public abstract class ChartClickEventObject extends PointerEventObject {
    /**
     * Information about the x-axis on the clicked spot.
     */
    public Array<ChartClickEventAxisObject> xAxis;
    /**
     * Information about the y-axis on the clicked spot.
     */
    public Array<ChartClickEventAxisObject> yAxis;
    /**
     * Information about the z-axis on the clicked spot.
     */
    @jsweet.lang.Optional
    public Array<ChartClickEventAxisObject> zAxis;
}

