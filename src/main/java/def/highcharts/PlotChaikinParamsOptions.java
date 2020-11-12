package def.highcharts;
import def.js.Array;
/**
 * (Highstock) Paramters used in calculation of Chaikin Oscillator series
 * points.
 */
@jsweet.lang.Interface
public abstract class PlotChaikinParamsOptions extends def.js.Object {
    /**
     * (Highstock) Periods for Chaikin Oscillator calculations.
     */
    @jsweet.lang.Optional
    public Array<Double> periods;
    /**
     * (Highstock) The id of volume series which is mandatory. For example using
     * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
     * using OHLC and volume values.
     */
    @jsweet.lang.Optional
    public String volumeSeriesID;
}

