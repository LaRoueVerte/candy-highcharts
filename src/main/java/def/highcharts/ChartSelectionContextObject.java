package def.highcharts;
import def.js.Array;
import def.dom.Event;
/**
 * The primary axes are `xAxis[0]` and `yAxis[0]`. Remember the unit of a
 * datetime axis is milliseconds since 1970-01-01 00:00:00.
 */
@jsweet.lang.Interface
public abstract class ChartSelectionContextObject extends Event {
    /**
     * Arrays containing the axes of each dimension and each axis' min and max
     * values.
     */
    public Array<ChartSelectionAxisContextObject> xAxis;
    /**
     * Arrays containing the axes of each dimension and each axis' min and max
     * values.
     */
    public Array<ChartSelectionAxisContextObject> yAxis;
}

