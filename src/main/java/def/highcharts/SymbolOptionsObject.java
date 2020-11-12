package def.highcharts;
/**
 * Additional options, depending on the actual symbol drawn.
 */
@jsweet.lang.Interface
public abstract class SymbolOptionsObject extends def.js.Object {
    /**
     * The anchor X position for the `callout` symbol. This is where the chevron
     * points to.
     */
    @jsweet.lang.Optional
    public double anchorX;
    /**
     * The anchor Y position for the `callout` symbol. This is where the chevron
     * points to.
     */
    @jsweet.lang.Optional
    public double anchorY;
    /**
     * The end angle of an `arc` symbol.
     */
    @jsweet.lang.Optional
    public double end;
    /**
     * Whether to draw `arc` symbol open or closed.
     */
    @jsweet.lang.Optional
    public Boolean open;
    /**
     * The radius of an `arc` symbol, or the border radius for the `callout`
     * symbol.
     */
    @jsweet.lang.Optional
    public double r;
    /**
     * The start angle of an `arc` symbol.
     */
    @jsweet.lang.Optional
    public double start;
}

