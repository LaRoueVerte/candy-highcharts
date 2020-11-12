package def.highcharts;
import jsweet.util.union.Union3;
/**
 * Handle color operations. Some object methods are chainable.
 */
public class Color extends def.js.Object {
    /**
     * Creates a color instance out of a color string or object.
     *
     * @param input
     *        The input color in either rbga or hex format.
     *
     * @return Color instance.
     */
    native public static Color parse(String input);
    /**
     * Handle color operations. Some object methods are chainable.
     *
     * @param input
     *        The input color in either rbga or hex format
     */
    public Color(String input){}
    /**
     * Brighten the color instance.
     *
     * @param alpha
     *        The alpha value.
     *
     * @return This color with modifications.
     */
    native public Color brighten(double alpha);
    /**
     * Return the color or gradient stops in the specified format
     *
     * @param format
     *        Possible values are 'a', 'rgb', 'rgba' (default).
     *
     * @return This color as a string or gradient stops.
     */
    native public Union3<String,GradientColorObject,PatternObject> get(String format);
    /**
     * Set the color's opacity to a given alpha value.
     *
     * @param alpha
     *        Opacity between 0 and 1.
     *
     * @return Color with modifications.
     */
    native public Color setOpacity(double alpha);
    /**
     * Return an intermediate color between two colors.
     *
     * @param to
     *        The color object to tween to.
     *
     * @param pos
     *        The intermediate position, where 0 is the from color (current
     *        color item), and 1 is the `to` color.
     *
     * @return The intermediate color in rgba notation.
     */
    native public String tweenTo(Color to, double pos);
    /**
     * Return the color or gradient stops in the specified format
     *
     * @param format
     *        Possible values are 'a', 'rgb', 'rgba' (default).
     *
     * @return This color as a string or gradient stops.
     */
    native public Union3<String,GradientColorObject,PatternObject> get();
    /**
     * Creates a color instance out of a color string or object.
     *
     * @param input
     *        The input color in either rbga or hex format.
     *
     * @return Color instance.
     */
    native public static Color parse(PatternObject input);
    /**
     * Creates a color instance out of a color string or object.
     *
     * @param input
     *        The input color in either rbga or hex format.
     *
     * @return Color instance.
     */
    native public static Color parse(GradientColorObject input);
    /**
     * Handle color operations. Some object methods are chainable.
     *
     * @param input
     *        The input color in either rbga or hex format
     */
    public Color(PatternObject input){}
    /**
     * Handle color operations. Some object methods are chainable.
     *
     * @param input
     *        The input color in either rbga or hex format
     */
    public Color(GradientColorObject input){}
    protected Color(){}
}

