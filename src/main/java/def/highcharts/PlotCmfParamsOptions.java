package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of regression series' points.
 */
@jsweet.lang.Interface
public abstract class PlotCmfParamsOptions extends def.js.Object {
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
     * (Highstock) The id of another series to use its data as volume data for
     * the indiator calculation.
     */
    @jsweet.lang.Optional
    public String volumeSeriesID;
}

