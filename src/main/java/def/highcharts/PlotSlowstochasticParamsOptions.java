package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of regression series' points.
 */
@jsweet.lang.Interface
public abstract class PlotSlowstochasticParamsOptions extends def.js.Object {
    /**
     * (Highstock) Periods for Slow Stochastic oscillator: [%K, %D, SMA(%D)].
     */
    @jsweet.lang.Optional
    public jsweet.util.tuple.Tuple3<Double,Double,Double> periods;
}

