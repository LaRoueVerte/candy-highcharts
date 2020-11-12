package def.highcharts;
/**
 * (Highstock) Paramters used in calculation of regression series' points.
 */
@jsweet.lang.Interface
public abstract class PlotPsarParamsOptions extends def.js.Object {
    /**
     * (Highstock) Number of maximum decimals that are used in PSAR
     * calculations.
     */
    @jsweet.lang.Optional
    public double decimals;
    /**
     * (Highstock) Acceleration factor increases by increment each time the
     * extreme point makes a new high.
     */
    @jsweet.lang.Optional
    public double increment;
    /**
     * (Highstock) Index from which PSAR is starting calculation
     */
    @jsweet.lang.Optional
    public double index;
    /**
     * (Highstock) The initial value for acceleration factor. Acceleration
     * factor is starting with this value and increases by specified increment
     * each time the extreme point makes a new high. AF can reach a maximum of
     * maxAccelerationFactor, no matter how long the uptrend extends.
     */
    @jsweet.lang.Optional
    public double initialAccelerationFactor;
    /**
     * (Highstock) The Maximum value for acceleration factor. AF can reach a
     * maximum of maxAccelerationFactor, no matter how long the uptrend extends.
     */
    @jsweet.lang.Optional
    public double maxAccelerationFactor;
}

