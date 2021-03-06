package def.highcharts;
import def.js.Array;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) A basic type of an annotation. It
 * allows to add custom labels or shapes. The items can be tied to points, axis
 * coordinates or chart pixel coordinates.
 */
@jsweet.lang.Interface
public abstract class AnnotationsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the initial
     * animation when a series is displayed for the `annotation`. The animation
     * can also be set as a configuration object. Please note that this option
     * only applies to the initial animation. For other animations, see
     * chart.animation and the animation parameter under the API methods. The
     * following properties are supported:
     *
     * - `defer`: The animation delay time in milliseconds.
     */
    @jsweet.lang.Optional
    public Union3<Boolean,AnnotationsAnimationOptions,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
     * points. Each control point inherits options from controlPointOptions
     * object. Options from the controlPointOptions can be overwritten by
     * options in a specific control point.
     */
    @jsweet.lang.Optional
    public AnnotationControlPointOptionsObject controlPointOptions;
    /**
     * (Highstock) A crooked line annotation.
     */
    @jsweet.lang.Optional
    public AnnotationsCrookedLineOptions crookedLine;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Allow an annotation to be
     * draggable by a user. Possible values are `'x'`, `'xy'`, `'y'` and `''`
     * (disabled).
     */
    @jsweet.lang.Optional
    public Object draggable;
    /**
     * (Highstock) An elliott wave annotation.
     */
    @jsweet.lang.Optional
    public AnnotationsElliottWaveOptions elliottWave;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
     */
    @jsweet.lang.Optional
    public AnnotationsEventsOptions events;
    /**
     * (Highstock) A fibonacci annotation.
     */
    @jsweet.lang.Optional
    public AnnotationsFibonacciOptions fibonacci;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
     * Can be user later when removing an annotation in
     * Chart.removeAnnotation(id) method.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> id;
    /**
     * (Highstock) An infinity line annotation.
     */
    @jsweet.lang.Optional
    public AnnotationsInfinityLineOptions infinityLine;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
     * Each label inherits options from the labelOptions object. An option from
     * the labelOptions can be overwritten by config for a specific label.
     */
    @jsweet.lang.Optional
    public AnnotationsLabelOptions labelOptions;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
     * annotation. For options that apply to multiple labels, they can be added
     * to the labelOptions.
     */
    @jsweet.lang.Optional
    public Array<AnnotationsLabelsOptions> labels;
    /**
     * (Highstock) A measure annotation.
     */
    @jsweet.lang.Optional
    public AnnotationsMeasureOptions measure;
    /**
     * (Highstock) A pitchfork annotation.
     */
    @jsweet.lang.Optional
    public AnnotationsPitchforkOptions pitchfork;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
     * Each shape inherits options from the shapeOptions object. An option from
     * the shapeOptions can be overwritten by config for a specific shape.
     */
    @jsweet.lang.Optional
    public AnnotationsShapeOptions shapeOptions;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
     * annotation. For options that apply to multiple shapes, then can be added
     * to the shapeOptions.
     */
    @jsweet.lang.Optional
    public Array<AnnotationsShapesOptions> shapes;
    /**
     * (Highstock) A tunnel annotation.
     */
    @jsweet.lang.Optional
    public AnnotationsTunnelOptions tunnel;
    /**
     * (Highstock) A vertical line annotation.
     */
    @jsweet.lang.Optional
    public AnnotationsVerticalLineOptions verticalLine;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether the annotation is
     * visible.
     */
    @jsweet.lang.Optional
    public Boolean visible;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the annotation.
     */
    @jsweet.lang.Optional
    public double zIndex;
}

