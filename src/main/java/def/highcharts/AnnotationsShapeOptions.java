package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
 * Each shape inherits options from the shapeOptions object. An option from the
 * shapeOptions can be overwritten by config for a specific shape.
 */
@jsweet.lang.Interface
public abstract class AnnotationsShapeOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Name of the dash style to use
     * for the shape's stroke.
     */
    @jsweet.lang.Optional
    public Object dashStyle;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's fill.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fill;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The height of the shape.
     */
    @jsweet.lang.Optional
    public double height;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The radius of the shape.
     */
    @jsweet.lang.Optional
    public double r;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Defines additional snapping area
     * around an annotation making this annotation to focus. Defined in pixels.
     */
    @jsweet.lang.Optional
    public double snap;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as
     * the annotation shape. Note, type has to be set to `'image'`.
     */
    @jsweet.lang.Optional
    public String src;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's stroke.
     */
    @jsweet.lang.Optional
    public String stroke;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
     * shape.
     */
    @jsweet.lang.Optional
    public double strokeWidth;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The type of the shape, e.g.
     * circle or rectangle.
     */
    @jsweet.lang.Optional
    public String type;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The width of the shape.
     */
    @jsweet.lang.Optional
    public double width;
}

