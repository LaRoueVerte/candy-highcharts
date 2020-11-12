package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
import def.js.Function;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the export button.
 *
 * In styled mode, export button styles can be applied with the
 * `.highcharts-contextbutton` class.
 */
@jsweet.lang.Interface
public abstract class ExportingButtonsOptionsObject extends def.js.Object {
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
     * (Highcharts, Highstock, Highmaps, Gantt) The class name of the context
     * button.
     */
    @jsweet.lang.Optional
    public String className;
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
     * (Highcharts, Highstock, Highmaps, Gantt) The class name of the menu
     * appearing from the button.
     */
    @jsweet.lang.Optional
    public String menuClassName;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A collection of strings pointing
     * to config options for the menu items. The config options are defined in
     * the `menuItemDefinitions` option.
     *
     * By default, there is the "View in full screen" and "Print" menu items,
     * plus one menu item for each of the available export types.
     */
    @jsweet.lang.Optional
    public Array<String> menuItems;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A click handler callback to use
     * on the button directly instead of the popup menu.
     */
    @jsweet.lang.Optional
    public Function onclick;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The symbol for the button.
     * Points to a definition function in the `Highcharts.Renderer.symbols`
     * collection. The default `exportIcon` function is part of the exporting
     * module. Possible values are "circle", "square", "diamond", "triangle",
     * "triangle-down", "menu", "menuball" or custom shape.
     */
    @jsweet.lang.Optional
    public Object symbol;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) See
     * navigation.buttonOptions.symbolFill.
     */
    @jsweet.lang.Optional
    public String symbolFill;
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
    public ExportingButtonsContextButtonThemeOptions theme;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The key to a lang option setting
     * that is used for the button's title tooltip. When the key is
     * `contextButtonTitle`, it refers to lang.contextButtonTitle that defaults
     * to "Chart context menu".
     */
    @jsweet.lang.Optional
    public String titleKey;
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
     * (Highcharts, Highstock, Highmaps, Gantt) The horizontal position of the
     * button relative to the `align` option.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
     * button's position relative to its `verticalAlign`.
     */
    @jsweet.lang.Optional
    public double y;
    native public java.lang.Object onclick(java.lang.Object... args);
}

