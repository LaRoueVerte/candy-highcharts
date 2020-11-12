package def.highcharts;
import def.js.Date;
/**
 * The Time class. Time settings are applied in general for each page using
 * `Highcharts.setOptions`, or individually for each Chart item through the time
 * options set.
 *
 * The Time object is available from Highcharts.Chart#time, which refers to
 * `Highcharts.time` if no individual time settings are applied.
 */
public class Time extends def.js.Object {
    /**
     * The Time class. Time settings are applied in general for each page using
     * `Highcharts.setOptions`, or individually for each Chart item through the
     * time options set.
     *
     * The Time object is available from Highcharts.Chart#time, which refers to
     * `Highcharts.time` if no individual time settings are applied.
     *
     * @param options
     *        Time options as defined in chart.options.time.
     */
    public Time(TimeOptions options){}
    /**
     * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970)
     * into a human readable date string. The available format keys are listed
     * below. Additional formats can be given in the Highcharts.dateFormats
     * hook.
     *
     * Supported format keys:
     *
     * - `%a`: Short weekday, like 'Mon'
     *
     * - `%A`: Long weekday, like 'Monday'
     *
     * - `%d`: Two digit day of the month, 01 to 31
     *
     * - `%e`: Day of the month, 1 through 31
     *
     * - `%w`: Day of the week, 0 through 6
     *
     * - `%b`: Short month, like 'Jan'
     *
     * - `%B`: Long month, like 'January'
     *
     * - `%m`: Two digit month number, 01 through 12
     *
     * - `%y`: Two digits year, like 09 for 2009
     *
     * - `%Y`: Four digits year, like 2009
     *
     * - `%H`: Two digits hours in 24h format, 00 through 23
     *
     * - `%k`: Hours in 24h format, 0 through 23
     *
     * - `%I`: Two digits hours in 12h format, 00 through 11
     *
     * - `%l`: Hours in 12h format, 1 through 12
     *
     * - `%M`: Two digits minutes, 00 through 59
     *
     * - `%p`: Upper case AM or PM
     *
     * - `%P`: Lower case AM or PM
     *
     * - `%S`: Two digits seconds, 00 through 59
     *
     * - `%L`: Milliseconds (naming from Ruby)
     *
     * @param format
     *        The desired format where various time representations are prefixed
     *        with %.
     *
     * @param timestamp
     *        The JavaScript timestamp.
     *
     * @param capitalize
     *        Upper case first letter in the return.
     *
     * @return The formatted date.
     */
    native public String dateFormat(String format, double timestamp, Boolean capitalize);
    /**
     * Get the value of a date object in given units, and subject to the Time
     * object's current timezone settings. This function corresponds directly to
     * JavaScripts `Date.getXXX / Date.getUTCXXX`, so instead of calling
     * `date.getHours()` or `date.getUTCHours()` we will call
     * `time.get('Hours')`.
     *
     * @return The given time unit
     */
    native public double get(Object unit, Date date);
    /**
     * Return an array with time positions distributed on round time values
     * right and right after min and max. Used in datetime axes as well as for
     * grouping data on a datetime axis.
     *
     * @param normalizedInterval
     *        The interval in axis values (ms) and the count
     *
     * @param min
     *        The minimum in axis values
     *
     * @param max
     *        The maximum in axis values
     */
    native public AxisTickPositionsArray getTimeTicks(TimeNormalizedObject normalizedInterval, double min, double max, double startOfWeek);
    /**
     * Get the time zone offset based on the current timezone information as set
     * in the global options.
     *
     * @param timestamp
     *        The JavaScript timestamp to inspect.
     *
     * @return The timezone offset in minutes compared to UTC.
     */
    native public double getTimezoneOffset(double timestamp);
    /**
     * Make a time and returns milliseconds. Interprets the inputs as UTC time,
     * local time or a specific timezone time depending on the current time
     * settings.
     *
     * @param year
     *        The year
     *
     * @param month
     *        The month. Zero-based, so January is 0.
     *
     * @param date
     *        The day of the month
     *
     * @param hours
     *        The hour of the day, 0-23.
     *
     * @param minutes
     *        The minutes
     *
     * @param seconds
     *        The seconds
     *
     * @return The time in milliseconds since January 1st 1970.
     */
    native public double makeTime(double year, double month, double date, double hours, double minutes, double seconds);
    /**
     * Set the value of a date object in given units, and subject to the Time
     * object's current timezone settings. This function corresponds directly to
     * JavaScripts `Date.setXXX / Date.setUTCXXX`, so instead of calling
     * `date.setHours(0)` or `date.setUTCHours(0)` we will call
     * `time.set('Hours', 0)`.
     *
     * @return The epoch milliseconds of the updated date
     */
    native public double set(Object unit, Date date, double value);
    /**
     * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970)
     * into a human readable date string. The available format keys are listed
     * below. Additional formats can be given in the Highcharts.dateFormats
     * hook.
     *
     * Supported format keys:
     *
     * - `%a`: Short weekday, like 'Mon'
     *
     * - `%A`: Long weekday, like 'Monday'
     *
     * - `%d`: Two digit day of the month, 01 to 31
     *
     * - `%e`: Day of the month, 1 through 31
     *
     * - `%w`: Day of the week, 0 through 6
     *
     * - `%b`: Short month, like 'Jan'
     *
     * - `%B`: Long month, like 'January'
     *
     * - `%m`: Two digit month number, 01 through 12
     *
     * - `%y`: Two digits year, like 09 for 2009
     *
     * - `%Y`: Four digits year, like 2009
     *
     * - `%H`: Two digits hours in 24h format, 00 through 23
     *
     * - `%k`: Hours in 24h format, 0 through 23
     *
     * - `%I`: Two digits hours in 12h format, 00 through 11
     *
     * - `%l`: Hours in 12h format, 1 through 12
     *
     * - `%M`: Two digits minutes, 00 through 59
     *
     * - `%p`: Upper case AM or PM
     *
     * - `%P`: Lower case AM or PM
     *
     * - `%S`: Two digits seconds, 00 through 59
     *
     * - `%L`: Milliseconds (naming from Ruby)
     *
     * @param format
     *        The desired format where various time representations are prefixed
     *        with %.
     *
     * @param timestamp
     *        The JavaScript timestamp.
     *
     * @param capitalize
     *        Upper case first letter in the return.
     *
     * @return The formatted date.
     */
    native public String dateFormat(String format, double timestamp);
    /**
     * Return an array with time positions distributed on round time values
     * right and right after min and max. Used in datetime axes as well as for
     * grouping data on a datetime axis.
     *
     * @param normalizedInterval
     *        The interval in axis values (ms) and the count
     *
     * @param min
     *        The minimum in axis values
     *
     * @param max
     *        The maximum in axis values
     */
    native public AxisTickPositionsArray getTimeTicks(TimeNormalizedObject normalizedInterval, double min, double max);
    /**
     * Return an array with time positions distributed on round time values
     * right and right after min and max. Used in datetime axes as well as for
     * grouping data on a datetime axis.
     *
     * @param normalizedInterval
     *        The interval in axis values (ms) and the count
     *
     * @param min
     *        The minimum in axis values
     *
     * @param max
     *        The maximum in axis values
     */
    native public AxisTickPositionsArray getTimeTicks(TimeNormalizedObject normalizedInterval, double min);
    /**
     * Return an array with time positions distributed on round time values
     * right and right after min and max. Used in datetime axes as well as for
     * grouping data on a datetime axis.
     *
     * @param normalizedInterval
     *        The interval in axis values (ms) and the count
     *
     * @param min
     *        The minimum in axis values
     *
     * @param max
     *        The maximum in axis values
     */
    native public AxisTickPositionsArray getTimeTicks(TimeNormalizedObject normalizedInterval);
    /**
     * Make a time and returns milliseconds. Interprets the inputs as UTC time,
     * local time or a specific timezone time depending on the current time
     * settings.
     *
     * @param year
     *        The year
     *
     * @param month
     *        The month. Zero-based, so January is 0.
     *
     * @param date
     *        The day of the month
     *
     * @param hours
     *        The hour of the day, 0-23.
     *
     * @param minutes
     *        The minutes
     *
     * @param seconds
     *        The seconds
     *
     * @return The time in milliseconds since January 1st 1970.
     */
    native public double makeTime(double year, double month, double date, double hours, double minutes);
    /**
     * Make a time and returns milliseconds. Interprets the inputs as UTC time,
     * local time or a specific timezone time depending on the current time
     * settings.
     *
     * @param year
     *        The year
     *
     * @param month
     *        The month. Zero-based, so January is 0.
     *
     * @param date
     *        The day of the month
     *
     * @param hours
     *        The hour of the day, 0-23.
     *
     * @param minutes
     *        The minutes
     *
     * @param seconds
     *        The seconds
     *
     * @return The time in milliseconds since January 1st 1970.
     */
    native public double makeTime(double year, double month, double date, double hours);
    /**
     * Make a time and returns milliseconds. Interprets the inputs as UTC time,
     * local time or a specific timezone time depending on the current time
     * settings.
     *
     * @param year
     *        The year
     *
     * @param month
     *        The month. Zero-based, so January is 0.
     *
     * @param date
     *        The day of the month
     *
     * @param hours
     *        The hour of the day, 0-23.
     *
     * @param minutes
     *        The minutes
     *
     * @param seconds
     *        The seconds
     *
     * @return The time in milliseconds since January 1st 1970.
     */
    native public double makeTime(double year, double month, double date);
    /**
     * Make a time and returns milliseconds. Interprets the inputs as UTC time,
     * local time or a specific timezone time depending on the current time
     * settings.
     *
     * @param year
     *        The year
     *
     * @param month
     *        The month. Zero-based, so January is 0.
     *
     * @param date
     *        The day of the month
     *
     * @param hours
     *        The hour of the day, 0-23.
     *
     * @param minutes
     *        The minutes
     *
     * @param seconds
     *        The seconds
     *
     * @return The time in milliseconds since January 1st 1970.
     */
    native public double makeTime(double year, double month);
    protected Time(){}
}

