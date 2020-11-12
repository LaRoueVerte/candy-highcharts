package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for the series
 * main summary. Each series type has two modes:
 *
 * 1. This series type is the only series type used in the chart
 *
 * 2. This is a combination chart with multiple series types
 *
 * If a definition does not exist for the specific series type and mode, the
 * 'default' lang definitions are used.
 */
@jsweet.lang.Interface
public abstract class LangAccessibilitySeriesSummaryOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String bar;
    @jsweet.lang.Optional
    public String barCombination;
    @jsweet.lang.Optional
    public String boxplot;
    @jsweet.lang.Optional
    public String boxplotCombination;
    @jsweet.lang.Optional
    public String bubble;
    @jsweet.lang.Optional
    public String bubbleCombination;
    @jsweet.lang.Optional
    public String column;
    @jsweet.lang.Optional
    public String columnCombination;
    @jsweet.lang.Name("default")
    @jsweet.lang.Optional
    public String Default;
    @jsweet.lang.Optional
    public String defaultCombination;
    @jsweet.lang.Optional
    public String line;
    @jsweet.lang.Optional
    public String lineCombination;
    @jsweet.lang.Optional
    public String map;
    @jsweet.lang.Optional
    public String mapbubble;
    @jsweet.lang.Optional
    public String mapbubbleCombination;
    @jsweet.lang.Optional
    public String mapCombination;
    @jsweet.lang.Optional
    public String mapline;
    @jsweet.lang.Optional
    public String maplineCombination;
    @jsweet.lang.Optional
    public String pie;
    @jsweet.lang.Optional
    public String pieCombination;
    @jsweet.lang.Optional
    public String scatter;
    @jsweet.lang.Optional
    public String scatterCombination;
    @jsweet.lang.Optional
    public String spline;
    @jsweet.lang.Optional
    public String splineCombination;
}

