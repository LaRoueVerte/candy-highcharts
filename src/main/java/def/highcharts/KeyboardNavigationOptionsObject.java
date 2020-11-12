package def.highcharts;
import def.js.Array;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation.
 */
@jsweet.lang.Interface
public abstract class KeyboardNavigationOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
     * the chart.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the focus border
     * drawn around elements while navigating through them.
     */
    @jsweet.lang.Optional
    public KeyboardNavigationFocusBorderOptionsObject focusBorder;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Order of tab navigation in the
     * chart. Determines which elements are tabbed to first. Available elements
     * are: `series`, `zoom`, `rangeSelector`, `chartMenu`, `legend`. In
     * addition, any custom components can be added here.
     */
    @jsweet.lang.Optional
    public Array<String> order;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the keyboard
     * navigation of data points and series.
     */
    @jsweet.lang.Optional
    public KeyboardNavigationSeriesNavigationOptionsObject seriesNavigation;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to wrap around
     * when reaching the end of arrow-key navigation for an element in the
     * chart.
     */
    @jsweet.lang.Optional
    public Boolean wrapAround;
}

