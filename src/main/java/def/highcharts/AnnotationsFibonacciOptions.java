package def.highcharts;
/**
 * (Highstock) A fibonacci annotation.
 */
@jsweet.lang.Interface
public abstract class AnnotationsFibonacciOptions extends def.js.Object {
    @jsweet.lang.Optional
    public AnnotationsFibonacciControlPointOptions controlPointOptions;
    /**
     * (Highstock) Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions can be
     * overwritten by config for a specific label.
     */
    @jsweet.lang.Optional
    public AnnotationsFibonacciLabelOptions labelOptions;
    /**
     * (Highstock) Options for annotation's shapes. Each shape inherits options
     * from the shapeOptions object. An option from the shapeOptions can be
     * overwritten by config for a specific shape.
     */
    @jsweet.lang.Optional
    public AnnotationsFibonacciShapeOptions shapeOptions;
    /**
     * (Highstock) Additional options for an annotation with the type.
     */
    @jsweet.lang.Optional
    public AnnotationsFibonacciTypeOptions typeOptions;
}

