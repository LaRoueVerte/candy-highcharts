package def.highcharts;
import def.js.Function;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Time options that can apply globally
 * or to individual charts. These settings affect how `datetime` axes are laid
 * out, how tooltips are formatted, how series pointIntervalUnit works and how
 * the Highstock range selector handles time.
 *
 * The common use case is that all charts in the same Highcharts object share
 * the same time settings, in which case the global settings are set using
 * `setOptions`. (see online documentation for example)
 *
 * Since v6.0.5, the time options were moved from the `global` obect to the
 * `time` object, and time options can be set on each individual chart.
 */
@jsweet.lang.Interface
public abstract class TimeOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) A custom `Date` class for advanced date
     * handling. For example, JDate can be hooked in to handle Jalali dates.
     */
    @jsweet.lang.Optional
    public Object Date;
    /**
     * (Highcharts, Highstock, Gantt) A callback to return the time zone offset
     * for a given datetime. It takes the timestamp in terms of milliseconds
     * since January 1 1970, and returns the timezone offset in minutes. This
     * provides a hook for drawing time based charts in specific time zones
     * using their local DST crossover dates, with the help of external
     * libraries.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Double,Double> getTimezoneOffset;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Allows to manually load the
     * `moment.js` library from Highcharts options instead of the `window`. In
     * case of loading the library from a `script` tag, this option is not
     * needed, it will be loaded from there by default.
     */
    @jsweet.lang.Optional
    public Function moment;
    /**
     * (Highcharts, Highstock, Gantt) Requires moment.js. If the timezone option
     * is specified, it creates a default getTimezoneOffset function that looks
     * up the specified timezone in moment.js. If moment.js is not included,
     * this throws a Highcharts error in the console, but does not crash the
     * chart.
     */
    @jsweet.lang.Optional
    public String timezone;
    /**
     * (Highcharts, Highstock, Gantt) The timezone offset in minutes. Positive
     * values are west, negative values are east of UTC, as in the ECMAScript
     * getTimezoneOffset method. Use this to display UTC based data in a
     * predefined time zone.
     */
    @jsweet.lang.Optional
    public double timezoneOffset;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to use UTC time for axis
     * scaling, tickmark placement and time display in `Highcharts.dateFormat`.
     * Advantages of using UTC is that the time displays equally regardless of
     * the user agent's time zone settings. Local time can be used when the data
     * is loaded in real time or when correct Daylight Saving Time transitions
     * are required.
     */
    @jsweet.lang.Optional
    public Boolean useUTC;
    native public java.lang.Object moment(java.lang.Object... args);
}

