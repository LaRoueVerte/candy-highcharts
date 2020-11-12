package def.highcharts;
/**
 * (Highcharts, Highstock, Gantt) Options for displaying a message like "No data
 * to display". This feature requires the file no-data-to-display.js to be
 * loaded in the page. The actual text to display is set in the lang.noData
 * option.
 */
@jsweet.lang.Interface
public abstract class NoDataOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
     * the no-data label.
     */
    @jsweet.lang.Optional
    public SVGAttributes attr;
    /**
     * (Highcharts, Highstock, Gantt) The position of the no-data label,
     * relative to the plot area.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<AlignObject,NoDataPositionOptions> position;
    /**
     * (Highcharts, Highstock, Gantt) CSS styles for the no-data label.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Gantt) Whether to insert the label as HTML, or as
     * pseudo-HTML rendered with SVG.
     */
    @jsweet.lang.Optional
    public Boolean useHTML;
}

