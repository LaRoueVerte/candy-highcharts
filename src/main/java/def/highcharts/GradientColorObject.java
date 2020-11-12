package def.highcharts;
import def.js.Array;
/**
 * Gradient options instead of a solid color.
 */
@jsweet.lang.Interface
public abstract class GradientColorObject extends def.js.Object {
    /**
     * Holds an object that defines the start position and the end position
     * relative to the shape.
     */
    @jsweet.lang.Optional
    public LinearGradientColorObject linearGradient;
    /**
     * Holds an object that defines the center position and the radius.
     */
    @jsweet.lang.Optional
    public RadialGradientColorObject radialGradient;
    /**
     * The first item in each tuple is the position in the gradient, where 0 is
     * the start of the gradient and 1 is the end of the gradient. Multiple
     * stops can be applied. The second item is the color for each stop. This
     * color can also be given in the rgba format.
     */
    public Array<GradientColorStopObject> stops;
}

