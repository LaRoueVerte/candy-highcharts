package def.highcharts;
/**
 * (Highstock) Parameters used in calculation of Detrended Price Oscillator
 * series points.
 */
@jsweet.lang.Interface
public abstract class PlotDpoParamsOptions extends def.js.Object {
    /**
     * (Highstock) The point index which indicator calculations will base. For
     * example using OHLC data, index=2 means the indicator will be calculated
     * using Low values.
     */
    @jsweet.lang.Optional
    public double index;
    /**
     * (Highstock) Period for Detrended Price Oscillator
     */
    @jsweet.lang.Optional
    public double period;
}

