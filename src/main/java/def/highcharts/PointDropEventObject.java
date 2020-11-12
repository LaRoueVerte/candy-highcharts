package def.highcharts;
import def.js.Function;
/**
 * Contains common information for a drop event on series points.
 */
@jsweet.lang.Interface
public abstract class PointDropEventObject extends def.js.Object {
    /**
     * New point after drag if only a single one.
     */
    @jsweet.lang.Optional
    public PointDragDropObject newPoint;
    /**
     * New point id after drag if only a single one.
     */
    @jsweet.lang.Optional
    public String newPointId;
    /**
     * New points after drop.
     */
    public Dictionary<PointDragDropObject> newPoints;
    /**
     * Number of new points.
     */
    public double numNewPoints;
    /**
     * Original data.
     */
    public DragDropPositionObject origin;
    /**
     * Prevent default drop action.
     */
    public Function preventDefault;
    /**
     * Target point that caused the event.
     */
    public Point target;
    /**
     * Event type.
     */
    public def.highcharts.StringTypes.drop type;
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

