package def.highcharts;
/**
 * (Highcharts) Accessibility options for an axis. Requires the accessibility
 * module.
 */
@jsweet.lang.Interface
public abstract class AxisAccessibilityOptionsObject extends def.js.Object {
    /**
     * (Highcharts) Description for an axis to expose to screen reader users.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highcharts) Enable axis accessibility features, including axis
     * information in the screen reader information region. If this is disabled
     * on the xAxis, the x values are not exposed to screen readers for the
     * individual data points by default.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts) Range description for an axis. Overrides the default range
     * description. Set to empty to disable range description for this axis.
     */
    @jsweet.lang.Optional
    public String rangeDescription;
}

