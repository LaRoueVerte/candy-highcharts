package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) Determines the width of the ring per level.
 */
@jsweet.lang.Interface
public abstract class PlotSunburstLevelSizeOptions extends def.js.Object {
    /**
     * (Highcharts) How to interpret `levelSize.value`.
     *
     * - `percentage` gives a width relative to result of outer radius minus
     * inner radius.
     *
     * - `pixels` gives the ring a fixed width in pixels.
     *
     * - `weight` takes the remaining width after percentage and pixels, and
     * distributes it accross all "weighted" levels. The value relative to the
     * sum of all weights determines the width.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.percentage,def.highcharts.StringTypes.pixels,def.highcharts.StringTypes.weight> unit;
    /**
     * (Highcharts) The value used for calculating the width of the ring. Its'
     * affect is determined by `levelSize.unit`.
     */
    @jsweet.lang.Optional
    public double value;
}

