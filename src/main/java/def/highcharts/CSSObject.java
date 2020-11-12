package def.highcharts;
/**
 * A style object with camel case property names to define visual appearance of
 * a SVG element or HTML element. The properties can be whatever styles are
 * supported on the given SVG or HTML element.
 */
@jsweet.lang.Interface
public abstract class CSSObject extends def.js.Object {
    native public java.lang.Object $get(String key);
    /**
     * Background style for the element.
     */
    @jsweet.lang.Optional
    public String background;
    /**
     * Background color of the element.
     */
    @jsweet.lang.Optional
    public String backgroundColor;
    /**
     * Border style for the element.
     */
    @jsweet.lang.Optional
    public String border;
    /**
     * Radius of the element border.
     */
    @jsweet.lang.Optional
    public double borderRadius;
    /**
     * Color used in the element. The 'contrast' option is a Highcharts custom
     * property that results in black or white, depending on the background of
     * the element.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.contrast,String> color;
    /**
     * Style of the mouse cursor when resting over the element.
     */
    @jsweet.lang.Optional
    public Object cursor;
    /**
     * Font family of the element text. Multiple values have to be in decreasing
     * preference order and separated by comma.
     */
    @jsweet.lang.Optional
    public String fontFamily;
    /**
     * Font size of the element text.
     */
    @jsweet.lang.Optional
    public String fontSize;
    /**
     * Font weight of the element text.
     */
    @jsweet.lang.Optional
    public String fontWeight;
    /**
     * Height of the element.
     */
    @jsweet.lang.Optional
    public double height;
    /**
     * Width of the element border.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * Opacity of the element.
     */
    @jsweet.lang.Optional
    public double opacity;
    /**
     * Space around the element content.
     */
    @jsweet.lang.Optional
    public String padding;
    /**
     * Behaviour of the element when the mouse cursor rests over it.
     */
    @jsweet.lang.Optional
    public String pointerEvents;
    /**
     * Positioning of the element.
     */
    @jsweet.lang.Optional
    public String position;
    /**
     * Alignment of the element text.
     */
    @jsweet.lang.Optional
    public String textAlign;
    /**
     * Additional decoration of the element text.
     */
    @jsweet.lang.Optional
    public String textDecoration;
    /**
     * Outline style of the element text.
     */
    @jsweet.lang.Optional
    public String textOutline;
    /**
     * Line break style of the element text. Highcharts SVG elements support
     * `ellipsis` when a `width` is set.
     */
    @jsweet.lang.Optional
    public String textOverflow;
    /**
     * Top spacing of the element relative to the parent element.
     */
    @jsweet.lang.Optional
    public String top;
    /**
     * Animated transition of selected element properties.
     */
    @jsweet.lang.Optional
    public String transition;
    /**
     * Line break style of the element text.
     */
    @jsweet.lang.Optional
    public String whiteSpace;
    /**
     * Width of the element.
     */
    @jsweet.lang.Optional
    public double width;
}

