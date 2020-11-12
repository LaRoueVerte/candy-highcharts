package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Gantt) Text labels for the plot bands
 */
@jsweet.lang.Interface
public abstract class YAxisPlotBandsLabelOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) Horizontal alignment of the label. Can be
     * one of "left", "center" or "right".
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highcharts, Highstock, Gantt) Rotation of the text label in degrees .
     */
    @jsweet.lang.Optional
    public double rotation;
    /**
     * (Highcharts, Highstock, Gantt) CSS styles for the text label.
     *
     * In styled mode, the labels are styled by the
     * `.highcharts-plot-band-label` class.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Gantt) The string text itself. A subset of HTML
     * is supported.
     */
    @jsweet.lang.Optional
    public String text;
    /**
     * (Highcharts, Highstock, Gantt) The text alignment for the label. While
     * `align` determines where the texts anchor point is placed within the plot
     * band, `textAlign` determines how the text is aligned against its anchor
     * point. Possible values are "left", "center" and "right". Defaults to the
     * same as the `align` option.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> textAlign;
    /**
     * (Highcharts, Highstock, Gantt) Whether to use HTML to render the labels.
     */
    @jsweet.lang.Optional
    public Boolean useHTML;
    /**
     * (Highcharts, Highstock, Gantt) Vertical alignment of the label relative
     * to the plot band. Can be one of "top", "middle" or "bottom".
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highcharts, Highstock, Gantt) Horizontal position relative the
     * alignment. Default varies by orientation.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Gantt) Vertical position of the text baseline
     * relative to the alignment. Default varies by orientation.
     */
    @jsweet.lang.Optional
    public double y;
}

