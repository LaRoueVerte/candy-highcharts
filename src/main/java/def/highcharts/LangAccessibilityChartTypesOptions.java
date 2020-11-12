package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Chart type description strings. This
 * is added to the chart information region.
 *
 * If there is only a single series type used in the chart, we use the format
 * string for the series type, or default if missing. There is one format string
 * for cases where there is only a single series in the chart, and one for
 * multiple series of the same type.
 */
@jsweet.lang.Interface
public abstract class LangAccessibilityChartTypesOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String barMultiple;
    @jsweet.lang.Optional
    public String barSingle;
    @jsweet.lang.Optional
    public String boxplotMultiple;
    @jsweet.lang.Optional
    public String boxplotSingle;
    @jsweet.lang.Optional
    public String bubbleMultiple;
    @jsweet.lang.Optional
    public String bubbleSingle;
    @jsweet.lang.Optional
    public String columnMultiple;
    @jsweet.lang.Optional
    public String columnSingle;
    @jsweet.lang.Optional
    public String combinationChart;
    @jsweet.lang.Optional
    public String defaultMultiple;
    @jsweet.lang.Optional
    public String defaultSingle;
    @jsweet.lang.Optional
    public String emptyChart;
    @jsweet.lang.Optional
    public String lineMultiple;
    @jsweet.lang.Optional
    public String lineSingle;
    @jsweet.lang.Optional
    public String mapTypeDescription;
    @jsweet.lang.Optional
    public String pieMultiple;
    @jsweet.lang.Optional
    public String pieSingle;
    @jsweet.lang.Optional
    public String scatterMultiple;
    @jsweet.lang.Optional
    public String scatterSingle;
    @jsweet.lang.Optional
    public String splineMultiple;
    @jsweet.lang.Optional
    public String splineSingle;
    @jsweet.lang.Optional
    public String unknownMap;
}

