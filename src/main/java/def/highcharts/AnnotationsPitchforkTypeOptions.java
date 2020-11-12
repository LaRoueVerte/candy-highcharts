package def.highcharts;
import def.js.Array;
/**
 * (Highstock) Additional options for an annotation with the type.
 */
@jsweet.lang.Interface
public abstract class AnnotationsPitchforkTypeOptions extends def.js.Object {
    /**
     * (Highstock) Inner background options.
     */
    @jsweet.lang.Optional
    public AnnotationsPitchforkTypeInnerBackgroundOptions innerBackground;
    /**
     * (Highstock) Line options.
     */
    @jsweet.lang.Optional
    public AnnotationsPitchforkTypeLineOptions line;
    /**
     * (Highstock) Outer background options.
     */
    @jsweet.lang.Optional
    public AnnotationsPitchforkTypeOuterBackgroundOptions outerBackground;
    @jsweet.lang.Optional
    public Array<AnnotationsPitchforkTypePointsOptions> points;
    /**
     * (Highstock) This number defines which xAxis the point is connected to. It
     * refers to either the axis id or the index of the axis in the xAxis array.
     */
    @jsweet.lang.Optional
    public double xAxis;
    /**
     * (Highstock) This number defines which yAxis the point is connected to. It
     * refers to either the axis id or the index of the axis in the xAxis array.
     */
    @jsweet.lang.Optional
    public double yAxis;
}

