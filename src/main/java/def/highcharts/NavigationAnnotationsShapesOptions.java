package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
 * annotation. For options that apply to multiple shapes, then can be added to
 * the shapeOptions.
 */
@jsweet.lang.Interface
public abstract class NavigationAnnotationsShapesOptions extends def.js.Object {
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
     * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
     * drawn at the final vertex of the path. Custom markers can be defined in
     * defs property.
     */
    @jsweet.lang.Optional
    public String markerEnd;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
     * drawn at the first vertex of the path. Custom markers can be defined in
     * defs property.
     */
    @jsweet.lang.Optional
    public String markerStart;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
     * which the shape will be connected. It can be either the point which
     * exists in the series - it is referenced by the point's id - or a new
     * point with defined x, y properties and optionally axes.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,AnnotationMockPointOptionsObject> point;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array of points for the
     * shape. This option is available for shapes which can use multiple points
     * such as path. A point can be either a point object or a point's id.
     */
    @jsweet.lang.Optional
    public Array<jsweet.util.union.Union<String,AnnotationMockPointOptionsObject>> points;
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

