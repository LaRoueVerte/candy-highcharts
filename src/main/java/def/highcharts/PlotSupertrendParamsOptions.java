package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of Supertrend indicator series
 * points.
 */
@jsweet.lang.Interface
public abstract class PlotSupertrendParamsOptions extends def.js.Object {
    /**
     * (Highstock) Multiplier for Supertrend Indicator.
     */
    @jsweet.lang.Optional
    public double multiplier;
    /**
     * (Highstock) The base period for indicator Supertrend Indicator
     * calculations. This is the number of data points which are taken into
     * account for the indicator calculations.
     */
    @jsweet.lang.Optional
    public double period;
}

