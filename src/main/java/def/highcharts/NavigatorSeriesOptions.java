package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highstock, Gantt) Options for the navigator series. Available options are
 * the same as any series, documented at plotOptions and series.
 *
 * Unless data is explicitly defined on navigator.series, the data is borrowed
 * from the first series in the chart.
 *
 * Default series options for the navigator series are: (see online
 * documentation for example)
 */
@jsweet.lang.Interface
public abstract class NavigatorSeriesOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highstock, Gantt) Sets the fill color of the navigator series.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highstock) Unless data is explicitly defined, the data is borrowed from
     * the first series in the chart.
     */
    @jsweet.lang.Optional
    public Array<?> data;
    /**
     * (Highstock) Data grouping options for the navigator series.
     */
    @jsweet.lang.Optional
    public DataGroupingOptionsObject dataGrouping;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Data label options for the
     * navigator series. Data labels are disabled by default on the navigator
     * series.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<NavigatorSeriesDataLabelsOptions,Array<NavigatorSeriesDataLabelsOptions>> dataLabels;
    /**
     * (Highstock, Gantt) The fill opacity of the navigator series.
     */
    @jsweet.lang.Optional
    public double fillOpacity;
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highstock, Gantt) Line color for the navigator series. Allows setting
     * the color while disallowing the default candlestick setting.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Object> lineColor;
    /**
     * (Highstock, Gantt) The pixel line width of the navigator series.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    @jsweet.lang.Optional
    public NavigatorSeriesMarkerOptions marker;
    /**
     * (Highstock) Since Highstock v8, default value is the same as default
     * `pointRange` defined for a specific type (e.g. `null` for column type).
     *
     * In Highstock version < 8, defaults to 0.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> pointRange;
    /**
     * (Highstock, Gantt) The threshold option. Setting it to 0 will make the
     * default navigator area series draw its area from the 0 value and up.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> threshold;
    /**
     * (Highstock, Gantt) The type of the navigator series.
     *
     * Heads up: In column-type navigator, zooming is limited to at least one
     * point with its `pointRange`.
     */
    @jsweet.lang.Optional
    public String type;
}

