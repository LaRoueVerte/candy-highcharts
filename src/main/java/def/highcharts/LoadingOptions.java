package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) The loading options control the
 * appearance of the loading screen that covers the plot area on chart
 * operations. This screen only appears after an explicit call to
 * `chart.showLoading()`. It is a utility for developers to communicate to the
 * end user that something is going on, for example while retrieving new data
 * via an XHR connection. The "Loading..." text itself is not part of this
 * configuration object, but part of the `lang` object.
 */
@jsweet.lang.Interface
public abstract class LoadingOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
     * the fade out effect.
     */
    @jsweet.lang.Optional
    public double hideDuration;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading label
     * `span`.
     */
    @jsweet.lang.Optional
    public CSSObject labelStyle;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The duration in milliseconds of
     * the fade in effect.
     */
    @jsweet.lang.Optional
    public double showDuration;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the loading
     * screen that covers the plot area.
     *
     * In styled mode, the loading label is styled with the
     * `.highcharts-loading` class.
     */
    @jsweet.lang.Optional
    public CSSObject style;
}

