package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highstock) A label on the axis next to the crosshair.
 *
 * In styled mode, the label is styled with the `.highcharts-crosshair-label`
 * class.
 */
@jsweet.lang.Interface
public abstract class AxisCrosshairLabelOptions extends def.js.Object {
    /**
     * (Highstock) Alignment of the label compared to the axis. Defaults to
     * `"left"` for right-side axes, `"right"` for left-side axes and `"center"`
     * for horizontal axes.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highstock) The background color for the label. Defaults to the related
     * series color, or `#666666` if that is not available.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> backgroundColor;
    /**
     * (Highstock) The border color for the crosshair label
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highstock) The border corner radius of the crosshair label.
     */
    @jsweet.lang.Optional
    public double borderRadius;
    /**
     * (Highstock) The border width for the crosshair label.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highstock) Flag to enable crosshair's label.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock) A format string for the crosshair label. Defaults to
     * `{value}` for numeric axes and `{value:%b %d, %Y}` for datetime axes.
     */
    @jsweet.lang.Optional
    public String format;
    /**
     * (Highstock) Formatter function for the label text.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<Axis,Double,String> formatter;
    /**
     * (Highstock) Padding inside the crosshair label.
     */
    @jsweet.lang.Optional
    public double padding;
    /**
     * (Highstock) The shape to use for the label box.
     */
    @jsweet.lang.Optional
    public String shape;
    /**
     * (Highstock) Text styles for the crosshair label.
     */
    @jsweet.lang.Optional
    public CSSObject style;
}

