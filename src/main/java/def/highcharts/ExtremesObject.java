package def.highcharts;
/**
 * The returned object literal from the Highcharts.Axis#getExtremes function.
 */
@jsweet.lang.Interface
public abstract class ExtremesObject extends def.js.Object {
    /**
     * The maximum value of the axis' associated series.
     */
    public double dataMax;
    /**
     * The minimum value of the axis' associated series.
     */
    public double dataMin;
    /**
     * The maximum axis value, either automatic or set manually. If the `max`
     * option is not set, `maxPadding` is 0 and `endOnTick` is false, this value
     * will be the same as `dataMax`.
     */
    public double max;
    /**
     * The minimum axis value, either automatic or set manually. If the `min`
     * option is not set, `minPadding` is 0 and `startOnTick` is false, this
     * value will be the same as `dataMin`.
     */
    public double min;
    /**
     * The user defined maximum, either from the `max` option or from a zoom or
     * `setExtremes` action.
     */
    public double userMax;
    /**
     * The user defined minimum, either from the `min` option or from a zoom or
     * `setExtremes` action.
     */
    public double userMin;
}

