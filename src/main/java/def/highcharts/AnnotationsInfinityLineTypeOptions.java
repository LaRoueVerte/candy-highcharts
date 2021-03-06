package def.highcharts;
import def.js.Array;
/**
 * (Highstock) Additional options for an annotation with the type.
 */
@jsweet.lang.Interface
public abstract class AnnotationsInfinityLineTypeOptions extends def.js.Object {
    /**
     * (Highstock) Line options.
     */
    @jsweet.lang.Optional
    public AnnotationsInfinityLineTypeLineOptions line;
    @jsweet.lang.Optional
    public Array<AnnotationsInfinityLineTypePointsOptions> points;
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

