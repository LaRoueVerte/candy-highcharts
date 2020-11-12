package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Highchart by default puts a credits
 * label in the lower right corner of the chart. This can be changed using these
 * options.
 */
@jsweet.lang.Interface
public abstract class CreditsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the credits
     * text.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The URL for the credits label.
     */
    @jsweet.lang.Optional
    public String href;
    /**
     * (Highmaps) Credits for map source to be concatenated with conventional
     * credit text. By default this is a format string that collects copyright
     * information from the map if available.
     */
    @jsweet.lang.Optional
    public String mapText;
    /**
     * (Highmaps) Detailed credits for map source to be displayed on hover of
     * credits text. By default this is a format string that collects copyright
     * information from the map if available.
     */
    @jsweet.lang.Optional
    public String mapTextFull;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Position configuration for the
     * credits label.
     */
    @jsweet.lang.Optional
    public AlignObject position;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the credits
     * label.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for the credits label.
     */
    @jsweet.lang.Optional
    public String text;
}

