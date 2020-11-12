package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for buttons
 * appearing in the exporting module.
 *
 * In styled mode, the buttons are styled with the `.highcharts-contextbutton`
 * and `.highcharts-button-symbol` classes.
 */
@jsweet.lang.Interface
public abstract class NavigationButtonOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Alignment for the buttons.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel spacing between
     * buttons.
     */
    @jsweet.lang.Optional
    public double buttonSpacing;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable buttons.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Pixel height of the buttons.
     */
    @jsweet.lang.Optional
    public double height;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fill color for the symbol within
     * the button.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> symbolFill;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the symbol on
     * the button.
     */
    @jsweet.lang.Optional
    public double symbolSize;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the symbol's stroke
     * or line.
     */
    @jsweet.lang.Optional
    public String symbolStroke;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
     * symbol on the button.
     */
    @jsweet.lang.Optional
    public double symbolStrokeWidth;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position of the center of
     * the symbol inside the button.
     */
    @jsweet.lang.Optional
    public double symbolX;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position of the center of
     * the symbol inside the button.
     */
    @jsweet.lang.Optional
    public double symbolY;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A text string to add to the
     * individual button.
     */
    @jsweet.lang.Optional
    public String text;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A configuration object for the
     * button theme. The object accepts SVG properties like `stroke-width`,
     * `stroke` and `fill`. Tri-state button styles are supported by the
     * `states.hover` and `states.select` objects.
     */
    @jsweet.lang.Optional
    public NavigationButtonThemeOptions theme;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
     * buttons. Can be one of `"top"`, `"middle"` or `"bottom"`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the button.
     */
    @jsweet.lang.Optional
    public double width;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
     * button's position relative to its `verticalAlign`.
     */
    @jsweet.lang.Optional
    public double y;
}

