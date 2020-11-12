package def.highcharts;
/**
 * (Highstock) Configure a crosshair that is horizontally placed in middle of
 * rectangle.
 */
@jsweet.lang.Interface
public abstract class AnnotationsMeasureTypeCrosshairXOptions extends def.js.Object {
    /**
     * (Highstock) The dash or dot style of the crosshair's line. For possible
     * values, see this demonstration.
     */
    @jsweet.lang.Optional
    public Object dashStyle;
    /**
     * (Highstock) Enable or disable the horizontal crosshair.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock) The marker-end defines the arrowhead that will be drawn at
     * the final vertex of the given crosshair's path.
     */
    @jsweet.lang.Optional
    public String markerEnd;
    /**
     * (Highstock) The Z index of the crosshair in annotation.
     */
    @jsweet.lang.Optional
    public double zIndex;
}

