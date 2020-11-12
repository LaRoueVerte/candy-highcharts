package def.highcharts;
/**
 * (Highcharts, Highstock) The normal state of a single point marker. Currently
 * only used for setting animation when returning to normal state from hover.
 */
@jsweet.lang.Interface
public abstract class PointStatesNormalOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock) Animation when returning to normal state after
     * hovering.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Partial2<AnimationOptionsObject>> animation;
}

