package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Configure the accessibility strings
 * in the chart. Requires the accessibility module to be loaded. For a
 * description of the module and information on its features, see Highcharts
 * Accessibility.
 *
 * For more dynamic control over the accessibility functionality, see
 * accessibility.pointDescriptionFormatter,
 * accessibility.seriesDescriptionFormatter, and
 * accessibility.screenReaderSectionFormatter.
 */
@jsweet.lang.Interface
public abstract class LangAccessibilityOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Default announcement for new
     * data in charts. If addPoint or addSeries is used, and only one
     * series/point is added, the `newPointAnnounce` and `newSeriesAnnounce`
     * strings are used. The `...Single` versions will be used if there is only
     * one chart on the page, and the `...Multiple` versions will be used if
     * there are multiple charts on the page. For all other new data events, the
     * `newDataAnnounce` string will be used.
     */
    @jsweet.lang.Optional
    public LangAccessibilityAnnounceNewDataOptions announceNewData;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Axis description format strings.
     */
    @jsweet.lang.Optional
    public LangAccessibilityAxisOptions axis;
    @jsweet.lang.Optional
    public String chartContainerLabel;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Chart type description strings.
     * This is added to the chart information region.
     *
     * If there is only a single series type used in the chart, we use the
     * format string for the series type, or default if missing. There is one
     * format string for cases where there is only a single series in the chart,
     * and one for multiple series of the same type.
     */
    @jsweet.lang.Optional
    public LangAccessibilityChartTypesOptions chartTypes;
    @jsweet.lang.Optional
    public String credits;
    @jsweet.lang.Optional
    public String defaultChartTitle;
    @jsweet.lang.Optional
    public String drillUpButton;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting menu format strings
     * for accessibility module.
     */
    @jsweet.lang.Optional
    public LangAccessibilityExportingOptions exporting;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Set a label on the container
     * wrapping the SVG.
     */
    @jsweet.lang.Optional
    public String graphicContainerLabel;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Language options for
     * accessibility of the legend.
     */
    @jsweet.lang.Optional
    public LangAccessibilityLegendOptions legend;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Range selector language options
     * for accessibility.
     */
    @jsweet.lang.Optional
    public LangAccessibilityRangeSelectorOptions rangeSelector;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Language options for the screen
     * reader information sections added before and after the charts.
     */
    @jsweet.lang.Optional
    public LangAccessibilityScreenReaderSectionOptions screenReaderSection;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for different
     * series types. For more dynamic control over the series element
     * descriptions, see accessibility.seriesDescriptionFormatter.
     */
    @jsweet.lang.Optional
    public LangAccessibilitySeriesOptions series;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Descriptions of lesser known
     * series types. The relevant description is added to the screen reader
     * information region when these series types are used.
     */
    @jsweet.lang.Optional
    public LangAccessibilitySeriesTypeDescriptionsOptions seriesTypeDescriptions;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Language options for
     * sonification.
     */
    @jsweet.lang.Optional
    public LangAccessibilitySonificationOptions sonification;
    @jsweet.lang.Optional
    public String svgContainerLabel;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Title element text for the chart
     * SVG element. Leave this empty to disable adding the title element.
     * Browsers will display this content when hovering over elements in the
     * chart. Assistive technology may use this element to label the chart.
     */
    @jsweet.lang.Optional
    public String svgContainerTitle;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Accessibility language options
     * for the data table.
     */
    @jsweet.lang.Optional
    public LangAccessibilityTableOptions table;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Thousands separator to use when
     * formatting numbers for screen readers. Note that many screen readers will
     * not handle space as a thousands separator, and will consider "11 700" as
     * two numbers.
     *
     * Set to `null` to use the separator defined in lang.thousandsSep.
     */
    @jsweet.lang.Optional
    public String thousandsSep;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Chart and map zoom accessibility
     * language options.
     */
    @jsweet.lang.Optional
    public LangAccessibilityZoomOptions zoom;
}

