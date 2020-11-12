package def.highcharts;
import def.dom.MouseEvent;
/**
 * Contains common information for a drag event on series point.
 */
@jsweet.lang.Interface
public abstract class PointDragStartEventObject extends MouseEvent {
    /**
     * Data property being dragged.
     */
    @jsweet.lang.Optional
    public String updateProp;
}

