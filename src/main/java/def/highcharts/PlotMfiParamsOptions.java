package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of regression series' points.
 */
@jsweet.lang.Interface
public abstract class PlotMfiParamsOptions extends def.js.Object {
    /**
     * (Highstock) Number of maximum decimals that are used in MFI calculations.
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
    /**
     * (Highstock) The id of volume series which is mandatory. For example using
     * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
     * using OHLC and volume values.
     */
    @jsweet.lang.Optional
    public String volumeSeriesID;
}

