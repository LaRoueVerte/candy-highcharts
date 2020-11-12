package def.highcharts;
/**
 * (Highstock) A crooked line annotation.
 */
@jsweet.lang.Interface
public abstract class AnnotationsCrookedLineOptions extends def.js.Object {
    @jsweet.lang.Optional
    public AnnotationsCrookedLineControlPointOptions controlPointOptions;
    /**
     * (Highstock) Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions can be
     * overwritten by config for a specific label.
     */
    @jsweet.lang.Optional
    public AnnotationsCrookedLineLabelOptions labelOptions;
    /**
     * (Highstock) Options for annotation's shapes. Each shape inherits options
     * from the shapeOptions object. An option from the shapeOptions can be
     * overwritten by config for a specific shape.
     */
    @jsweet.lang.Optional
    public AnnotationsCrookedLineShapeOptions shapeOptions;
    /**
     * (Highstock) Additional options for an annotation with the type.
     */
    @jsweet.lang.Optional
    public AnnotationsCrookedLineTypeOptions typeOptions;
}

