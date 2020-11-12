package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of regression series' points.
 */
@jsweet.lang.Interface
public abstract class PlotZigzagParamsOptions extends def.js.Object {
    /**
     * (Highstock) The threshold for the value change.
     *
     * For example deviation=1 means the indicator will ignore all price
     * movements less than 1%.
     */
    @jsweet.lang.Optional
    public double deviation;
    /**
     * (Highstock) The point index which indicator calculations will base - high
     * value.
     *
     * For example using OHLC data, index=1 means the indicator will be
     * calculated using High values.
     */
    @jsweet.lang.Optional
    public double highIndex;
    /**
     * (Highstock) The point index which indicator calculations will base - low
     * value.
     *
     * For example using OHLC data, index=2 means the indicator will be
     * calculated using Low values.
     */
    @jsweet.lang.Optional
    public double lowIndex;
}

