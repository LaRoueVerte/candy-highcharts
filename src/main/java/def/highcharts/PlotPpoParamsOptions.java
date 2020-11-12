package def.highcharts;
import def.js.Array;
/**
 * (Highstock) Paramters used in calculation of Percentage Price Oscillator
 * series points.
 */
@jsweet.lang.Interface
public abstract class PlotPpoParamsOptions extends def.js.Object {
    /**
     * (Highstock) The point index which indicator calculations will base. For
     * example using OHLC data, index=2 means the indicator will be calculated
     * using Low values.
     *
     * By default index value used to be set to 0. Since Highstock 7 by default
     * index is set to 3 which means that the ema indicator will be calculated
     * using Close values.
     */
    @jsweet.lang.Optional
    public double index;
    /**
     * (Highstock) Periods for Percentage Price Oscillator calculations.
     */
    @jsweet.lang.Optional
    public Array<Double> periods;
}

