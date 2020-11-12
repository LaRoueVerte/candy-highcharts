package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
 * points. Each control point inherits options from controlPointOptions object.
 * Options from the controlPointOptions can be overwritten by options in a
 * specific control point.
 */
@jsweet.lang.Interface
public abstract class AnnotationControlPointOptionsObject extends def.js.Object {
    @jsweet.lang.Optional
    public java.util.function.BiFunction<AnnotationControlPoint,AnnotationControllable,PositionObject> positioner;
}

