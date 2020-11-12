package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Language options for the screen
 * reader information sections added before and after the charts.
 */
@jsweet.lang.Interface
public abstract class LangAccessibilityScreenReaderSectionOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String afterRegionLabel;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Language options for annotation
     * descriptions.
     */
    @jsweet.lang.Optional
    public LangAccessibilityScreenReaderSectionAnnotationsOptions annotations;
    @jsweet.lang.Optional
    public String beforeRegionLabel;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Label for the end of the chart.
     * Announced by screen readers.
     */
    @jsweet.lang.Optional
    public String endOfChartMarker;
}

