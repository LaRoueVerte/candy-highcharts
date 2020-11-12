package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) A title to be added on top of the
 * legend.
 */
@jsweet.lang.Interface
public abstract class LegendTitleOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Generic CSS styles for the
     * legend title.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A text or HTML string for the
     * title.
     */
    @jsweet.lang.Optional
    public String text;
}

