package def.highcharts;
/**
 * (Highstock) Accessibility options for a series.
 */
@jsweet.lang.Interface
public abstract class SeriesAccessibilityOptionsObject extends def.js.Object {
    /**
     * (Highstock) Provide a description of the series, announced to screen
     * readers.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highstock) Enable/disable accessibility functionality for a specific
     * series.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock) Expose only the series element to screen readers, not its
     * points.
     */
    @jsweet.lang.Optional
    public Boolean exposeAsGroupOnly;
    /**
     * (Highstock) Keyboard navigation for a series
     */
    @jsweet.lang.Optional
    public SeriesAccessibilityKeyboardNavigationOptionsObject keyboardNavigation;
    /**
     * (Highstock) Formatter function to use instead of the default for point
     * descriptions. Same as `accessibility.point.descriptionFormatter`, but for
     * a single series.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Point,String> pointDescriptionFormatter;
}

