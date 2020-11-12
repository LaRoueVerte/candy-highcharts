package def.highcharts;
/**
 * Defines the start position and the end position for a gradient relative to
 * the shape. Start position (x1, y1) and end position (x2, y2) are relative to
 * the shape, where 0 means top/left and 1 is bottom/right.
 */
@jsweet.lang.Interface
public abstract class LinearGradientColorObject extends def.js.Object {
    /**
     * Start horizontal position of the gradient. Float ranges 0-1.
     */
    public double x1;
    /**
     * End horizontal position of the gradient. Float ranges 0-1.
     */
    public double x2;
    /**
     * Start vertical position of the gradient. Float ranges 0-1.
     */
    public double y1;
    /**
     * End vertical position of the gradient. Float ranges 0-1.
     */
    public double y2;
}

