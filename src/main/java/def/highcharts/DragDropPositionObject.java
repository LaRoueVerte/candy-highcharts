package def.highcharts;
/**
 * Current drag and drop position.
 */
@jsweet.lang.Interface
public abstract class DragDropPositionObject extends def.js.Object {
    /**
     * Chart x position
     */
    public double chartX;
    /**
     * Chart y position
     */
    public double chartY;
    /**
     * Drag and drop guide box.
     */
    @jsweet.lang.Optional
    public BBoxObject guideBox;
    /**
     * Updated point data.
     */
    public Dictionary<Dictionary<Double>> points;
    /**
     * Delta of previous x position.
     */
    @jsweet.lang.Optional
    public double prevdX;
    /**
     * Delta of previous y position.
     */
    @jsweet.lang.Optional
    public double prevdY;
}

