package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of regression series' points.
 */
@jsweet.lang.Interface
public abstract class PlotPivotpointsParamsOptions extends def.js.Object {
    /**
     * (Highstock) Algorithm used to calculate ressistance and support lines
     * based on pivot points. Implemented algorithms: `'standard'`,
     * `'fibonacci'` and `'camarilla'`
     */
    @jsweet.lang.Optional
    public String algorithm;
    /**
     * (Highstock) The base period for indicator calculations. This is the
     * number of data points which are taken into account for the indicator
     * calculations.
     */
    @jsweet.lang.Optional
    public double period;
}

