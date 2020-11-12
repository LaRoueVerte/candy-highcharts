package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) The chart's caption, which will
 * render below the chart and will be part of exported charts. The caption can
 * be updated after chart initialization through the `Chart.update` or
 * `Chart.caption.update` methods.
 */
@jsweet.lang.Interface
public abstract class CaptionOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
     * caption. Can be one of "left", "center" and "right".
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When the caption is floating,
     * the plot area will not move to make space for it.
     */
    @jsweet.lang.Optional
    public Boolean floating;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The margin between the caption
     * and the plot area.
     */
    @jsweet.lang.Optional
    public double margin;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the caption.
     *
     * In styled mode, the caption style is given in the `.highcharts-caption`
     * class.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The caption text of the chart.
     */
    @jsweet.lang.Optional
    public String text;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
     * the text.
     */
    @jsweet.lang.Optional
    public Boolean useHTML;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
     * caption. Can be one of `"top"`, `"middle"` and `"bottom"`. When middle,
     * the caption behaves as floating.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position of the caption
     * relative to the alignment within `chart.spacingLeft` and
     * `chart.spacingRight`.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position of the caption
     * relative to the alignment within `chart.spacingTop` and
     * `chart.spacingBottom`.
     */
    @jsweet.lang.Optional
    public double y;
}

