package def.highcharts;
/**
 * Common information for a click event on a series point.
 */
@jsweet.lang.Interface
public abstract class PointClickEventObject extends PointerEventObject {
    /**
     * Clicked point.
     */
    public Point point;
}

