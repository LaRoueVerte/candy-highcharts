package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Function;
/**
 * (Highmaps) Options for the zoom in button. Properties for the zoom in and
 * zoom out buttons are inherited from mapNavigation.buttonOptions, while
 * individual options can be overridden. By default, the `onclick`, `text` and
 * `y` options are individual.
 */
@jsweet.lang.Interface
public abstract class MapNavigationButtonsZoomInOptions extends def.js.Object {
    /**
     * (Highmaps) The alignment of the navigation buttons.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highmaps) What box to align the buttons to. Possible values are
     * `plotBox` and `spacingBox`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.plotBox,def.highcharts.StringTypes.spacingBox> alignTo;
    /**
     * (Highmaps) The pixel height of the map navigation buttons.
     */
    @jsweet.lang.Optional
    public double height;
    /**
     * (Highmaps) Click handler for the button.
     */
    @jsweet.lang.Optional
    public Function onclick;
    /**
     * (Highmaps) Padding for the navigation buttons.
     */
    @jsweet.lang.Optional
    public double padding;
    /**
     * (Highmaps) Text styles for the map navigation buttons.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highmaps) The text for the button. The tooltip (title) is a language
     * option given by lang.zoomIn.
     */
    @jsweet.lang.Optional
    public String text;
    /**
     * (Highmaps) A configuration object for the button theme. The object
     * accepts SVG properties like `stroke-width`, `stroke` and `fill`.
     * Tri-state button styles are supported by the `states.hover` and
     * `states.select` objects.
     */
    @jsweet.lang.Optional
    public SVGAttributes theme;
    /**
     * (Highmaps) The vertical alignment of the buttons. Individual alignment
     * can be adjusted by each button's `y` offset.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highmaps) The width of the map navigation buttons.
     */
    @jsweet.lang.Optional
    public double width;
    /**
     * (Highmaps) The X offset of the buttons relative to its `align` setting.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highmaps) The position of the zoomIn button relative to the vertical
     * alignment.
     */
    @jsweet.lang.Optional
    public double y;
    native public java.lang.Object onclick(java.lang.Object... args);
}

