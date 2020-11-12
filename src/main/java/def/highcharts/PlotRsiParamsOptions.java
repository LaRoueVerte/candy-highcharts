package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of regression series' points.
 */
@jsweet.lang.Interface
public abstract class PlotRsiParamsOptions extends def.js.Object {
    /**
     * (Highstock) Number of maximum decimals that are used in RSI calculations.
     */
    @jsweet.lang.Optional
    public double decimals;
    /**
     * (Highstock) The base period for indicator calculations. This is the
     * number of data points which are taken into account for the indicator
     * calculations.
     */
    @jsweet.lang.Optional
    public double period;
}

