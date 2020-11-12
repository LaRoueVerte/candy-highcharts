package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of regression series' points.
 */
@jsweet.lang.Interface
public abstract class PlotVbpParamsOptions extends def.js.Object {
    /**
     * (Highstock) The number of price zones.
     */
    @jsweet.lang.Optional
    public double ranges;
    /**
     * (Highstock) The id of volume series which is mandatory. For example using
     * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
     * using OHLC and volume values.
     */
    @jsweet.lang.Optional
    public String volumeSeriesID;
}

