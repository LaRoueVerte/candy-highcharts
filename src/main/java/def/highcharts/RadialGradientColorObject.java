package def.highcharts;
/**
 * Defines the center position and the radius for a gradient.
 */
@jsweet.lang.Interface
public abstract class RadialGradientColorObject extends def.js.Object {
    /**
     * Center horizontal position relative to the shape. Float ranges 0-1.
     */
    public double cx;
    /**
     * Center vertical position relative to the shape. Float ranges 0-1.
     */
    public double cy;
    /**
     * Radius relative to the shape. Float ranges 0-1.
     */
    public double r;
}

