package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
 * annotation. For options that apply to multiple labels, they can be added to
 * the labelOptions.
 */
@jsweet.lang.Interface
public abstract class AnnotationsLabelsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for an
     * annotation label.
     */
    @jsweet.lang.Optional
    public AnnotationLabelAccessibilityOptionsObject accessibility;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The alignment of the
     * annotation's label. If right, the right side of the label should be
     * touching the point.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow the
     * annotation's labels to overlap. To make the labels less sensitive for
     * overlapping, the can be set to 0.
     */
    @jsweet.lang.Optional
    public Boolean allowOverlap;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the annotation's label.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> backgroundColor;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border color for the
     * annotation's label.
     */
    @jsweet.lang.Optional
    public String borderColor;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
     * the annotaiton's label.
     */
    @jsweet.lang.Optional
    public double borderRadius;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
     * the annotation's label
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A class name for styling by CSS.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide the annotation's
     * label that is outside the plot area.
     */
    @jsweet.lang.Optional
    public Boolean crop;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The label's pixel distance from
     * the point.
     */
    @jsweet.lang.Optional
    public double distance;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
     * label.
     */
    @jsweet.lang.Optional
    public String format;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
     * format the annotation's label. Note that if a `format` or `text` are
     * defined, the format or text take precedence and the formatter is ignored.
     * `This` refers to a point object.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Point,String> formatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether the annotation is
     * visible in the exported data table.
     */
    @jsweet.lang.Optional
    public Boolean includeInDataExport;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) How to handle the annotation's
     * label that flow outside the plot area. The justify option aligns the
     * label inside the plot area.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.allow,def.highcharts.StringTypes.justify> overflow;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When either the borderWidth or
     * the backgroundColor is set, this is the padding within the box.
     */
    @jsweet.lang.Optional
    public double padding;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
     * which the label will be connected. It can be either the point which
     * exists in the series - it is referenced by the point's id - or a new
     * point with defined x, y properties and optionally axes.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,AnnotationMockPointOptionsObject> point;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. The
     * shadow can be an object configuration containing `color`, `offsetX`,
     * `offsetY`, `opacity` and `width`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,ShadowOptionsObject> shadow;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
     * the border around the label. Symbols are predefined functions on the
     * Renderer object.
     */
    @jsweet.lang.Optional
    public String shape;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Styles for the annotation's
     * label.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Alias for the format option.
     */
    @jsweet.lang.Optional
    public String text;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
     * the annotation's label.
     */
    @jsweet.lang.Optional
    public Boolean useHTML;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
     * annotation's label.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
     * label relative to the point. Note that if a `distance` is defined, the
     * distance takes precedence over `x` and `y` options.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
     * label relative to the point. Note that if a `distance` is defined, the
     * distance takes precedence over `x` and `y` options.
     */
    @jsweet.lang.Optional
    public double y;
}

