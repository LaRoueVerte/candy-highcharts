package def.highcharts;
/**
 * Contains information about a points new values.
 */
@jsweet.lang.Interface
public abstract class PointDragDropObject extends def.js.Object {
    /**
     * New values.
     */
    public Dictionary<Double> newValues;
    /**
     * Updated point.
     */
    public Point point;
}

