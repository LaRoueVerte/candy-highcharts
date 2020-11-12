package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highstock) Options for annotation's labels. Each label inherits options from
 * the labelOptions object. An option from the labelOptions can be overwritten
 * by config for a specific label.
 */
@jsweet.lang.Interface
public abstract class AnnotationsInfinityLineLabelOptions extends def.js.Object {
    /**
     * (Highstock) Accessibility options for an annotation label.
     */
    @jsweet.lang.Optional
    public AnnotationLabelAccessibilityOptionsObject accessibility;
    /**
     * (Highstock) The alignment of the annotation's label. If right, the right
     * side of the label should be touching the point.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highstock) Whether to allow the annotation's labels to overlap. To make
     * the labels less sensitive for overlapping, the can be set to 0.
     */
    @jsweet.lang.Optional
    public Boolean allowOverlap;
    /**
     * (Highstock) The background color or gradient for the annotation's label.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> backgroundColor;
    /**
     * (Highstock) The border color for the annotation's label.
     */
    @jsweet.lang.Optional
    public String borderColor;
    /**
     * (Highstock) The border radius in pixels for the annotaiton's label.
     */
    @jsweet.lang.Optional
    public double borderRadius;
    /**
     * (Highstock) The border width in pixels for the annotation's label
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highstock) A class name for styling by CSS.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highstock) Whether to hide the annotation's label that is outside the
     * plot area.
     */
    @jsweet.lang.Optional
    public Boolean crop;
    /**
     * (Highstock) The label's pixel distance from the point.
     */
    @jsweet.lang.Optional
    public double distance;
    /**
     * (Highstock) A format string for the data label.
     */
    @jsweet.lang.Optional
    public String format;
    /**
     * (Highstock) Callback JavaScript function to format the annotation's
     * label. Note that if a `format` or `text` are defined, the format or text
     * take precedence and the formatter is ignored. `This` refers to a point
     * object.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Point,String> formatter;
    /**
     * (Highstock) Whether the annotation is visible in the exported data table.
     */
    @jsweet.lang.Optional
    public Boolean includeInDataExport;
    /**
     * (Highstock) How to handle the annotation's label that flow outside the
     * plot area. The justify option aligns the label inside the plot area.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.allow,def.highcharts.StringTypes.justify> overflow;
    /**
     * (Highstock) When either the borderWidth or the backgroundColor is set,
     * this is the padding within the box.
     */
    @jsweet.lang.Optional
    public double padding;
    /**
     * (Highstock) The shadow of the box. The shadow can be an object
     * configuration containing `color`, `offsetX`, `offsetY`, `opacity` and
     * `width`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,ShadowOptionsObject> shadow;
    /**
     * (Highstock) The name of a symbol to use for the border around the label.
     * Symbols are predefined functions on the Renderer object.
     */
    @jsweet.lang.Optional
    public String shape;
    /**
     * (Highstock) Styles for the annotation's label.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highstock) Alias for the format option.
     */
    @jsweet.lang.Optional
    public String text;
    /**
     * (Highstock) Whether to use HTML to render the annotation's label.
     */
    @jsweet.lang.Optional
    public Boolean useHTML;
    /**
     * (Highstock) The vertical alignment of the annotation's label.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highstock) The x position offset of the label relative to the point.
     * Note that if a `distance` is defined, the distance takes precedence over
     * `x` and `y` options.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highstock) The y position offset of the label relative to the point.
     * Note that if a `distance` is defined, the distance takes precedence over
     * `x` and `y` options.
     */
    @jsweet.lang.Optional
    public double y;
}

