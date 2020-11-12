package def.highcharts;
/**
 * (Highstock, Gantt) An array of configuration objects for the buttons.
 *
 * Defaults to: (see online documentation for example)
 */
@jsweet.lang.Interface
public abstract class RangeSelectorButtonsOptions extends def.js.Object {
    /**
     * (Highstock, Gantt) How many units of the defined type the button should
     * span. If `type` is "month" and `count` is 3, the button spans three
     * months.
     */
    @jsweet.lang.Optional
    public double count;
    /**
     * (Highstock) A custom data grouping object for each button.
     */
    @jsweet.lang.Optional
    public DataGroupingOptionsObject dataGrouping;
    @jsweet.lang.Optional
    public RangeSelectorButtonsEventsOptions events;
    /**
     * (Highstock, Gantt) Additional range (in milliseconds) added to the end of
     * the calculated time span.
     */
    @jsweet.lang.Optional
    public double offsetMax;
    /**
     * (Highstock, Gantt) Additional range (in milliseconds) added to the start
     * of the calculated time span.
     */
    @jsweet.lang.Optional
    public double offsetMin;
    /**
     * (Highstock, Gantt) When buttons apply dataGrouping on a series, by
     * default zooming in/out will deselect buttons and unset dataGrouping.
     * Enable this option to keep buttons selected when extremes change.
     */
    @jsweet.lang.Optional
    public Boolean preserveDataGrouping;
    /**
     * (Highstock, Gantt) The text for the button itself.
     */
    @jsweet.lang.Optional
    public String text;
    /**
     * (Highstock, Gantt) Defined the time span for the button. Can be one of
     * `millisecond`, `second`, `minute`, `hour`, `day`, `week`, `month`,
     * `year`, `ytd`, and `all`.
     */
    @jsweet.lang.Optional
    public Object type;
}

