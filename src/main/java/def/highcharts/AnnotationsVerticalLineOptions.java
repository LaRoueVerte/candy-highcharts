package def.highcharts;
/**
 * (Highstock) A vertical line annotation.
 */
@jsweet.lang.Interface
public abstract class AnnotationsVerticalLineOptions extends def.js.Object {
    /**
     * (Highstock) Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions can be
     * overwritten by config for a specific label.
     */
    @jsweet.lang.Optional
    public AnnotationsVerticalLineLabelOptions labelOptions;
    /**
     * (Highstock) Options for annotation's shapes. Each shape inherits options
     * from the shapeOptions object. An option from the shapeOptions can be
     * overwritten by config for a specific shape.
     */
    @jsweet.lang.Optional
    public AnnotationsVerticalLineShapeOptions shapeOptions;
    /**
     * (Highstock) Additional options for an annotation with the type.
     */
    @jsweet.lang.Optional
    public AnnotationsVerticalLineTypeOptions typeOptions;
}

