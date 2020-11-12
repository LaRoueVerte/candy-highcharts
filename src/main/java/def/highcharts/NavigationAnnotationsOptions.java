package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Additional options to be merged into
 * all annotations.
 */
@jsweet.lang.Interface
public abstract class NavigationAnnotationsOptions extends def.js.Object {
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
    public Union3<Boolean,NavigationAnnotationsAnimationOptions,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
     * points. Each control point inherits options from controlPointOptions
     * object. Options from the controlPointOptions can be overwritten by
     * options in a specific control point.
     */
    @jsweet.lang.Optional
    public AnnotationControlPointOptionsObject controlPointOptions;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Allow an annotation to be
     * draggable by a user. Possible values are `'x'`, `'xy'`, `'y'` and `''`
     * (disabled).
     */
    @jsweet.lang.Optional
    public Object draggable;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
     */
    @jsweet.lang.Optional
    public NavigationAnnotationsEventsOptions events;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
     * Can be user later when removing an annotation in
     * Chart.removeAnnotation(id) method.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> id;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
     * Each label inherits options from the labelOptions object. An option from
     * the labelOptions can be overwritten by config for a specific label.
     */
    @jsweet.lang.Optional
    public NavigationAnnotationsLabelOptions labelOptions;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
     * annotation. For options that apply to multiple labels, they can be added
     * to the labelOptions.
     */
    @jsweet.lang.Optional
    public Array<NavigationAnnotationsLabelsOptions> labels;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
     * Each shape inherits options from the shapeOptions object. An option from
     * the shapeOptions can be overwritten by config for a specific shape.
     */
    @jsweet.lang.Optional
    public NavigationAnnotationsShapeOptions shapeOptions;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
     * annotation. For options that apply to multiple shapes, then can be added
     * to the shapeOptions.
     */
    @jsweet.lang.Optional
    public Array<NavigationAnnotationsShapesOptions> shapes;
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

