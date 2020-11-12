package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the focus border drawn
 * around elements while navigating through them.
 */
@jsweet.lang.Interface
public abstract class KeyboardNavigationFocusBorderOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable/disable focus border for
     * chart.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Hide the browser's default focus
     * indicator.
     */
    @jsweet.lang.Optional
    public Boolean hideBrowserFocusOutline;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Focus border margin around the
     * elements.
     */
    @jsweet.lang.Optional
    public double margin;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Style options for the focus
     * border drawn around elements while navigating through them. Note that
     * some browsers in addition draw their own borders for focused elements.
     * These automatic borders can not be styled by Highcharts.
     *
     * In styled mode, the border is given the `.highcharts-focus-border` class.
     */
    @jsweet.lang.Optional
    public CSSObject style;
}

