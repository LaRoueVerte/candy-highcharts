package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for descriptions of
 * individual data points.
 */
@jsweet.lang.Interface
public abstract class AccessibilityPointOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Date format to use for points on
     * datetime axes when describing them to screen reader users.
     *
     * Defaults to the same format as in tooltip.
     *
     * For an overview of the replacement codes, see dateFormat.
     */
    @jsweet.lang.Optional
    public String dateFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to determine
     * the date/time format used with points on datetime axes when describing
     * them to screen reader users. Receives one argument, `point`, referring to
     * the point to describe. Should return a date format string compatible with
     * dateFormat.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Point,String> dateFormatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
     * instead of the default for point descriptions.
     *
     * Receives one argument, `point`, referring to the point to describe.
     * Should return a string with the description of the point for a screen
     * reader user. If `false` is returned, the default formatter will be used
     * for that point.
     *
     * Note: Prefer using accessibility.point.valueDescriptionFormat instead if
     * possible, as default functionality such as describing annotations will be
     * preserved.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Point,String> descriptionFormatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Decimals to use for the values
     * in the point descriptions. Uses tooltip.valueDecimals if not defined.
     */
    @jsweet.lang.Optional
    public double valueDecimals;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Format to use for describing the
     * values of data points to assistive technology - including screen readers.
     * The point context is available as `{point}`.
     *
     * Additionally, the series name, annotation info, and description added in
     * `point.accessibility.description` is added by default if relevant. To
     * override this, use the accessibility.point.descriptionFormatter option.
     */
    @jsweet.lang.Optional
    public String valueDescriptionFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Prefix to add to the values in
     * the point descriptions. Uses tooltip.valuePrefix if not defined.
     */
    @jsweet.lang.Optional
    public String valuePrefix;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Suffix to add to the values in
     * the point descriptions. Uses tooltip.valueSuffix if not defined.
     */
    @jsweet.lang.Optional
    public String valueSuffix;
}

