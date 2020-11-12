package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for different
 * series types. For more dynamic control over the series element descriptions,
 * see accessibility.seriesDescriptionFormatter.
 */
@jsweet.lang.Interface
public abstract class LangAccessibilitySeriesOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) User supplied description text.
     * This is added in the point comment description by default if present.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Description for the value of
     * null points.
     */
    @jsweet.lang.Optional
    public String nullPointValue;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Description for annotations on a
     * point, as it is made available to assistive technology.
     */
    @jsweet.lang.Optional
    public String pointAnnotationsDescription;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for the
     * series main summary. Each series type has two modes:
     *
     * 1. This series type is the only series type used in the chart
     *
     * 2. This is a combination chart with multiple series types
     *
     * If a definition does not exist for the specific series type and mode, the
     * 'default' lang definitions are used.
     */
    @jsweet.lang.Optional
    public LangAccessibilitySeriesSummaryOptions summary;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) xAxis description for series if
     * there are multiple xAxes in the chart.
     */
    @jsweet.lang.Optional
    public String xAxisDescription;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) yAxis description for series if
     * there are multiple yAxes in the chart.
     */
    @jsweet.lang.Optional
    public String yAxisDescription;
}

