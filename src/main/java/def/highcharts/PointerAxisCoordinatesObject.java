package def.highcharts;
import def.js.Array;
/**
 * Positions in terms of axis values.
 */
@jsweet.lang.Interface
public abstract class PointerAxisCoordinatesObject extends def.js.Object {
    /**
     * Positions on the x-axis.
     */
    public Array<PointerAxisCoordinateObject> xAxis;
    /**
     * Positions on the y-axis.
     */
    public Array<PointerAxisCoordinateObject> yAxis;
}

