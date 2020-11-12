package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Under which conditions the rule
 * applies.
 */
@jsweet.lang.Interface
public abstract class ResponsiveRulesConditionOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function to gain
     * complete control on when the responsive rule applies. Return `true` if it
     * applies. This opens for checking against other metrics than the chart
     * size, for example the document size or other elements.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Chart,Boolean> callback;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
     * the chart height is less than this.
     */
    @jsweet.lang.Optional
    public double maxHeight;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
     * the chart width is less than this.
     */
    @jsweet.lang.Optional
    public double maxWidth;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
     * the chart height is greater than this.
     */
    @jsweet.lang.Optional
    public double minHeight;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
     * the chart width is greater than this.
     */
    @jsweet.lang.Optional
    public double minWidth;
}

