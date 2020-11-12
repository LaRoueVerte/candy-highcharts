package def.highcharts;
/**
 * (Highstock) An elliott wave annotation.
 */
@jsweet.lang.Interface
public abstract class AnnotationsElliottWaveOptions extends def.js.Object {
    @jsweet.lang.Optional
    public AnnotationsElliottWaveControlPointOptions controlPointOptions;
    /**
     * (Highstock) Options for annotation's labels. Each label inherits options
     * from the labelOptions object. An option from the labelOptions can be
     * overwritten by config for a specific label.
     */
    @jsweet.lang.Optional
    public AnnotationsElliottWaveLabelOptions labelOptions;
    /**
     * (Highstock) Options for annotation's shapes. Each shape inherits options
     * from the shapeOptions object. An option from the shapeOptions can be
     * overwritten by config for a specific shape.
     */
    @jsweet.lang.Optional
    public AnnotationsElliottWaveShapeOptions shapeOptions;
    /**
     * (Highstock) Additional options for an annotation with the type.
     */
    @jsweet.lang.Optional
    public AnnotationsElliottWaveTypeOptions typeOptions;
}

