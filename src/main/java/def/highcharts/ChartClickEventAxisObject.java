package def.highcharts;
/**
 * Contains an axes of the clicked spot.
 */
@jsweet.lang.Interface
public abstract class ChartClickEventAxisObject extends def.js.Object {
    /**
     * Axis at the clicked spot.
     */
    public Axis axis;
    /**
     * Axis value at the clicked spot.
     */
    public double value;
}

