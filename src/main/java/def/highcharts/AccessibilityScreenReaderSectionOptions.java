package def.highcharts;
import def.dom.MouseEvent;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the screen
 * reader information sections added before and after the chart.
 */
@jsweet.lang.Interface
public abstract class AccessibilityScreenReaderSectionOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
     * information region after the chart. Analogous to beforeChartFormat.
     */
    @jsweet.lang.Optional
    public String afterChartFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
     * the HTML contents of the hidden screen reader information region after
     * the chart. Analogous to beforeChartFormatter.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Chart,String> afterChartFormatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Date format to use to describe
     * range of datetime axes.
     *
     * For an overview of the replacement codes, see dateFormat.
     */
    @jsweet.lang.Optional
    public String axisRangeDateFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
     * information region before the chart. Supported HTML tags are `<h1-7>`,
     * `<p>`, `<div>`, `<a>`, `<ul>`, `<ol>`, `<li>`, and `<button>`. Attributes
     * are not supported, except for id on `<div>`, `<a>`, and `<button>`. Id is
     * required on `<a>` and `<button>` in the format `<tag id="abcd">`.
     * Numbers, lower- and uppercase letters, "-" and "#" are valid characters
     * in IDs.
     */
    @jsweet.lang.Optional
    public String beforeChartFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
     * the HTML contents of the hidden screen reader information region before
     * the chart. Receives one argument, `chart`, referring to the chart object.
     * Should return a string with the HTML content of the region. By default
     * this returns an automatic description of the chart based on
     * beforeChartFormat.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Chart,String> beforeChartFormatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
     * the "Play as sound" button in the screen reader region.
     *
     * By default Highcharts will call the `chart.sonify` function.
     */
    @jsweet.lang.Optional
    public java.util.function.Consumer<MouseEvent> onPlayAsSoundClick;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
     * the "View as Data Table" link in the screen reader region.
     *
     * By default Highcharts will insert and set focus to a data table
     * representation of the chart.
     */
    @jsweet.lang.Optional
    public java.util.function.Consumer<MouseEvent> onViewDataTableClick;
}

