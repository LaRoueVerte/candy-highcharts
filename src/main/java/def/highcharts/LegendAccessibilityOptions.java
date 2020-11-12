package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
 * legend. Requires the Accessibility module.
 */
@jsweet.lang.Interface
public abstract class LegendAccessibilityOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
     * the legend.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation
     * for the legend.
     */
    @jsweet.lang.Optional
    public LegendAccessibilityKeyboardNavigationOptions keyboardNavigation;
}

