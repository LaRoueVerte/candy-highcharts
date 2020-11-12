package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) The chart's subtitle. This can be
 * used both to display a subtitle below the main title, and to display random
 * text anywhere in the chart. The subtitle can be updated after chart
 * initialization through the `Chart.setTitle` method.
 */
@jsweet.lang.Interface
public abstract class SubtitleOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
     * subtitle. Can be one of "left", "center" and "right".
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When the subtitle is floating,
     * the plot area will not move to make space for it.
     */
    @jsweet.lang.Optional
    public Boolean floating;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title.
     *
     * In styled mode, the subtitle style is given in the `.highcharts-subtitle`
     * class.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The subtitle of the chart.
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
     * title. Can be one of `"top"`, `"middle"` and `"bottom"`. When middle, the
     * subtitle behaves as floating.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Adjustment made to the subtitle
     * width, normally to reserve space for the exporting burger menu.
     */
    @jsweet.lang.Optional
    public double widthAdjust;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position of the subtitle
     * relative to the alignment within `chart.spacingLeft` and
     * `chart.spacingRight`.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position of the subtitle
     * relative to the alignment within `chart.spacingTop` and
     * `chart.spacingBottom`. By default the subtitle is laid out below the
     * title unless the title is floating.
     */
    @jsweet.lang.Optional
    public double y;
}

