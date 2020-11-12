package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of regression series' points.
 */
@jsweet.lang.Interface
public abstract class PlotPriceenvelopesParamsOptions extends def.js.Object {
    /**
     * (Highstock) Percentage below the moving average that should be displayed.
     * 0.1 means 90%. Relative to the calculated value.
     */
    @jsweet.lang.Optional
    public double bottomBand;
    /**
     * (Highstock) The point index which indicator calculations will base. For
     * example using OHLC data, index=2 means the indicator will be calculated
     * using Low values.
     */
    @jsweet.lang.Optional
    public double index;
    /**
     * (Highstock) The base period for indicator calculations. This is the
     * number of data points which are taken into account for the indicator
     * calculations.
     */
    @jsweet.lang.Optional
    public double period;
    /**
     * (Highstock) Percentage above the moving average that should be displayed.
     * 0.1 means 110%. Relative to the calculated value.
     */
    @jsweet.lang.Optional
    public double topBand;
}

