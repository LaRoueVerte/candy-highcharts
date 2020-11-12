package def.highcharts;
import def.js.Array;
import def.dom.Event;
/**
 * Object for select events.
 */
@jsweet.lang.Interface
public abstract class SelectEventObject extends def.js.Object {
    public Event originalEvent;
    public Array<SelectDataObject> xAxis;
    public Array<SelectDataObject> yAxis;
}

