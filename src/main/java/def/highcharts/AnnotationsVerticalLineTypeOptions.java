package def.highcharts;
import def.js.Array;
/**
 * (Highstock) Additional options for an annotation with the type.
 */
@jsweet.lang.Interface
public abstract class AnnotationsVerticalLineTypeOptions extends def.js.Object {
    /**
     * (Highstock) Connector options.
     */
    @jsweet.lang.Optional
    public AnnotationsVerticalLineTypeConnectorOptions connector;
    /**
     * (Highstock) Label options.
     */
    @jsweet.lang.Optional
    public AnnotationsVerticalLineTypeLabelOptions label;
    /**
     * (Highstock) Line options.
     */
    @jsweet.lang.Optional
    public AnnotationsVerticalLineTypeLineOptions line;
    @jsweet.lang.Optional
    public Array<AnnotationsVerticalLineTypePointsOptions> points;
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

