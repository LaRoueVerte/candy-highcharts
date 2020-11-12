package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of regression series' points.
 */
@jsweet.lang.Interface
public abstract class PlotStochasticParamsOptions extends def.js.Object {
    /**
     * (Highstock) Periods for Stochastic oscillator: [%K, %D].
     */
    @jsweet.lang.Optional
    public jsweet.util.tuple.Tuple2<Double,Double> periods;
}

