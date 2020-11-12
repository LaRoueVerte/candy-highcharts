package def.highcharts;
/**
 * (Highstock) The normal state of a series, or for point items in column, pie
 * and similar series. Currently only used for setting animation when returning
 * to normal state from hover.
 */
@jsweet.lang.Interface
public abstract class SeriesStatesNormalOptionsObject extends def.js.Object {
    /**
     * (Highstock) Animation when returning to normal state after hovering.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Partial2<AnimationOptionsObject>> animation;
}

