package def.highcharts;
import def.js.Array;
/**
 * (Highstock) Additional options for an annotation with the type.
 */
@jsweet.lang.Interface
public abstract class AnnotationsMeasureTypeOptions extends def.js.Object {
    @jsweet.lang.Optional
    public AnnotationsMeasureTypeBackgroundOptions background;
    /**
     * (Highstock) Configure a crosshair that is horizontally placed in middle
     * of rectangle.
     */
    @jsweet.lang.Optional
    public AnnotationsMeasureTypeCrosshairXOptions crosshairX;
    /**
     * (Highstock) Configure a crosshair that is vertically placed in middle of
     * rectangle.
     */
    @jsweet.lang.Optional
    public AnnotationsMeasureTypeCrosshairYOptions crosshairY;
    @jsweet.lang.Optional
    public AnnotationsMeasureTypeLabelOptions label;
    /**
     * (Highstock) Line options.
     */
    @jsweet.lang.Optional
    public AnnotationsMeasureTypeLineOptions line;
    @jsweet.lang.Optional
    public Array<AnnotationsMeasureTypePointsOptions> points;
    /**
     * (Highstock) Decides in what dimensions the user can resize by dragging
     * the mouse. Can be one of x, y or xy.
     */
    @jsweet.lang.Optional
    public String selectType;
    /**
     * (Highstock) This number defines which xAxis the point is connected to. It
     * refers to either the axis id or the index of the axis in the xAxis array.
     */
    @jsweet.lang.Optional
    public double xAxis;
    /**
     * (Highstock) This number defines which yAxis the point is connected to. It
     * refers to either the axis id or the index of the axis in the yAxis array.
     */
    @jsweet.lang.Optional
    public double yAxis;
}

