package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) The chart's main title.
 */
@jsweet.lang.Interface
public abstract class TitleOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
     * title. Can be one of "left", "center" and "right".
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When the title is floating, the
     * plot area will not move to make space for it.
     */
    @jsweet.lang.Optional
    public Boolean floating;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The margin between the title and
     * the plot area, or if a subtitle is present, the margin between the
     * subtitle and the plot area.
     */
    @jsweet.lang.Optional
    public double margin;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title. Use
     * this for font styling, but use `align`, `x` and `y` for text alignment.
     *
     * In styled mode, the title style is given in the `.highcharts-title`
     * class.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The title of the chart. To
     * disable the title, set the `text` to `undefined`.
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
     * title. Can be one of `"top"`, `"middle"` and `"bottom"`. When a value is
     * given, the title behaves as if floating were `true`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Adjustment made to the title
     * width, normally to reserve space for the exporting burger menu.
     */
    @jsweet.lang.Optional
    public double widthAdjust;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position of the title
     * relative to the alignment within `chart.spacingLeft` and
     * `chart.spacingRight`.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position of the title
     * relative to the alignment within chart.spacingTop and
     * chart.spacingBottom. By default it depends on the font size.
     */
    @jsweet.lang.Optional
    public double y;
}

