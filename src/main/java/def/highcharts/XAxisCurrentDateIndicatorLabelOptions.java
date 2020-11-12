package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Gantt) Text labels for the plot bands
 */
@jsweet.lang.Interface
public abstract class XAxisCurrentDateIndicatorLabelOptions extends def.js.Object {
    /**
     * (Gantt) Horizontal alignment of the label. Can be one of "left", "center"
     * or "right".
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Gantt) Format of the label. This options is passed as the fist argument
     * to dateFormat function.
     */
    @jsweet.lang.Optional
    public String format;
    /**
     * (Gantt) Callback JavaScript function to format the label. Useful
     * properties like the value of plot line or the range of plot band (`from`
     * & `to` properties) can be found in `this.options` object.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<PlotLineOrBand,String> formatter;
    /**
     * (Gantt) Rotation of the text label in degrees. Defaults to 0 for
     * horizontal plot lines and 90 for vertical lines.
     */
    @jsweet.lang.Optional
    public double rotation;
    /**
     * (Gantt) CSS styles for the text label.
     *
     * In styled mode, the labels are styled by the
     * `.highcharts-plot-line-label` class.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Gantt) The text itself. A subset of HTML is supported.
     */
    @jsweet.lang.Optional
    public String text;
    /**
     * (Gantt) The text alignment for the label. While `align` determines where
     * the texts anchor point is placed within the plot band, `textAlign`
     * determines how the text is aligned against its anchor point. Possible
     * values are "left", "center" and "right". Defaults to the same as the
     * `align` option.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> textAlign;
    /**
     * (Gantt) Whether to use HTML to render the labels.
     */
    @jsweet.lang.Optional
    public Boolean useHTML;
    /**
     * (Gantt) Vertical alignment of the label relative to the plot line. Can be
     * one of "top", "middle" or "bottom".
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Gantt) Horizontal position relative the alignment. Default varies by
     * orientation.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Gantt) Vertical position of the text baseline relative to the alignment.
     * Default varies by orientation.
     */
    @jsweet.lang.Optional
    public double y;
}

