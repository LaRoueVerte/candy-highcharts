package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highstock) Connector options.
 */
@jsweet.lang.Interface
public abstract class AnnotationsVerticalLineTypeConnectorOptions extends def.js.Object {
    /**
     * (Highstock) Name of the dash style to use for the shape's stroke.
     */
    @jsweet.lang.Optional
    public Object dashStyle;
    /**
     * (Highstock) The color of the shape's fill.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fill;
    @jsweet.lang.Optional
    public String markerEnd;
    /**
     * (Highstock) Defines additional snapping area around an annotation making
     * this annotation to focus. Defined in pixels.
     */
    @jsweet.lang.Optional
    public double snap;
    /**
     * (Highstock) The URL for an image to use as the annotation shape. Note,
     * type has to be set to `'image'`.
     */
    @jsweet.lang.Optional
    public String src;
    /**
     * (Highstock) The color of the shape's stroke.
     */
    @jsweet.lang.Optional
    public String stroke;
    /**
     * (Highstock) The pixel stroke width of the shape.
     */
    @jsweet.lang.Optional
    public double strokeWidth;
}

