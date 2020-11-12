package def.highcharts;
/**
 * (Highstock) A pitchfork annotation.
 */
@jsweet.lang.Interface
public abstract class AnnotationsPitchforkOptions extends def.js.Object {
    @jsweet.lang.Optional
    public AnnotationsPitchforkControlPointOptions controlPointOptions;
    /**
     * (Highstock) Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions can be
     * overwritten by config for a specific label.
     */
    @jsweet.lang.Optional
    public AnnotationsPitchforkLabelOptions labelOptions;
    /**
     * (Highstock) Options for annotation's shapes. Each shape inherits options
     * from the shapeOptions object. An option from the shapeOptions can be
     * overwritten by config for a specific shape.
     */
    @jsweet.lang.Optional
    public AnnotationsPitchforkShapeOptions shapeOptions;
    /**
     * (Highstock) Additional options for an annotation with the type.
     */
    @jsweet.lang.Optional
    public AnnotationsPitchforkTypeOptions typeOptions;
}

