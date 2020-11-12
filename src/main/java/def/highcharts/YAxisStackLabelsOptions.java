package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) The stack labels show the total value for each bar in a stacked
 * column or bar chart. The label will be placed on top of positive columns and
 * below negative columns. In case of an inverted column chart or a bar chart
 * the label is placed to the right of positive bars and to the left of negative
 * bars.
 */
@jsweet.lang.Interface
public abstract class YAxisStackLabelsOptions extends def.js.Object {
    /**
     * (Highcharts) Defines the horizontal alignment of the stack total label.
     * Can be one of `"left"`, `"center"` or `"right"`. The default value is
     * calculated at runtime and depends on orientation and whether the stack is
     * positive or negative.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highcharts) Allow the stack labels to overlap.
     */
    @jsweet.lang.Optional
    public Boolean allowOverlap;
    /**
     * (Highcharts) Enable or disable the initial animation when a series is
     * displayed for the `stackLabels`. The animation can also be set as a
     * configuration object. Please note that this option only applies to the
     * initial animation. For other animations, see chart.animation and the
     * animation parameter under the API methods. The following properties are
     * supported:
     *
     * - `defer`: The animation delay time in milliseconds.
     */
    @jsweet.lang.Optional
    public Union3<Boolean,YAxisStackLabelsAnimationOptions,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts) The background color or gradient for the stack label.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> backgroundColor;
    /**
     * (Highcharts) The border color for the stack label. Defaults to
     * `undefined`.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highcharts) The border radius in pixels for the stack label.
     */
    @jsweet.lang.Optional
    public double borderRadius;
    /**
     * (Highcharts) The border width in pixels for the stack label.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) Whether to hide stack labels that are outside the plot area.
     * By default, the stack label is moved inside the plot area according to
     * the overflow option.
     */
    @jsweet.lang.Optional
    public Boolean crop;
    /**
     * (Highcharts) Enable or disable the stack total labels.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock) A format string for the data label. Available
     * variables are the same as for `formatter`.
     */
    @jsweet.lang.Optional
    public String format;
    /**
     * (Highcharts) Callback JavaScript function to format the label. The value
     * is given by `this.total`.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<StackItemObject,String> formatter;
    /**
     * (Highcharts) How to handle stack total labels that flow outside the plot
     * area. The default is set to `"justify"`, which aligns them inside the
     * plot area. For columns and bars, this means it will be moved inside the
     * bar. To display stack labels outside the plot area, set `crop` to `false`
     * and `overflow` to `"allow"`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.allow,def.highcharts.StringTypes.justify> overflow;
    /**
     * (Highcharts) Rotation of the labels in degrees.
     */
    @jsweet.lang.Optional
    public double rotation;
    /**
     * (Highcharts) CSS styles for the label.
     *
     * In styled mode, the styles are set in the `.highcharts-stack-label`
     * class.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts) The text alignment for the label. While `align` determines
     * where the texts anchor point is placed with regards to the stack,
     * `textAlign` determines how the text is aligned against its anchor point.
     * Possible values are `"left"`, `"center"` and `"right"`. The default value
     * is calculated at runtime and depends on orientation and whether the stack
     * is positive or negative.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> textAlign;
    /**
     * (Highcharts, Highstock) Whether to use HTML to render the labels.
     */
    @jsweet.lang.Optional
    public Boolean useHTML;
    /**
     * (Highcharts) Defines the vertical alignment of the stack total label. Can
     * be one of `"top"`, `"middle"` or `"bottom"`. The default value is
     * calculated at runtime and depends on orientation and whether the stack is
     * positive or negative.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highcharts) The x position offset of the label relative to the left of
     * the stacked bar. The default value is calculated at runtime and depends
     * on orientation and whether the stack is positive or negative.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts) The y position offset of the label relative to the tick
     * position on the axis. The default value is calculated at runtime and
     * depends on orientation and whether the stack is positive or negative.
     */
    @jsweet.lang.Optional
    public double y;
}

