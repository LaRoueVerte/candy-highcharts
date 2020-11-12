package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of regression series' points.
 */
@jsweet.lang.Interface
public abstract class PlotTrendlineParamsOptions extends def.js.Object {
    /**
     * (Highstock) The point index which indicator calculations will base. For
     * example using OHLC data, index=2 means the indicator will be calculated
     * using Low values.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> index;
}

