package def.highcharts;
/**
 * The shadow options.
 */
@jsweet.lang.Interface
public abstract class ShadowOptionsObject extends def.js.Object {
    /**
     * The shadow color.
     */
    @jsweet.lang.Optional
    public String color;
    /**
     * The horizontal offset from the element.
     */
    @jsweet.lang.Optional
    public double offsetX;
    /**
     * The vertical offset from the element.
     */
    @jsweet.lang.Optional
    public double offsetY;
    /**
     * The shadow opacity.
     */
    @jsweet.lang.Optional
    public double opacity;
    /**
     * The shadow width or distance from the element.
     */
    @jsweet.lang.Optional
    public double width;
}

