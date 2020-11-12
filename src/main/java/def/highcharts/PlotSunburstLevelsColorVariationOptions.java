package def.highcharts;
/**
 * (Highcharts) Can set a `colorVariation` on all points which lies on the same
 * level.
 */
@jsweet.lang.Interface
public abstract class PlotSunburstLevelsColorVariationOptions extends def.js.Object {
    /**
     * (Highcharts) The key of a color variation. Currently supports
     * `brightness` only.
     */
    @jsweet.lang.Optional
    public String key;
    /**
     * (Highcharts) The ending value of a color variation. The last sibling will
     * receive this value.
     */
    @jsweet.lang.Optional
    public double to;
}

