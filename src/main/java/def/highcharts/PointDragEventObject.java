package def.highcharts;
import def.js.Function;
/**
 * Contains common information for a drag event on series points.
 */
@jsweet.lang.Interface
public abstract class PointDragEventObject extends def.js.Object {
    /**
     * New points during drag.
     */
    public Dictionary<PointDragDropObject> newPoints;
    /**
     * Original data.
     */
    public DragDropPositionObject origin;
    /**
     * Prevent default drag action.
     */
    public Function preventDefault;
    /**
     * Target point that caused the event.
     */
    public Point target;
    /**
     * Event type.
     */
    public def.highcharts.StringTypes.drag type;
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

