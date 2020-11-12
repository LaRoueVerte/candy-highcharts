package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highcharts) Set options on specific levels. Takes precedence over series
 * options, but not node and link options.
 */
@jsweet.lang.Interface
public abstract class PlotSankeyLevelsOptions extends def.js.Object {
    /**
     * (Highcharts) Can set `borderColor` on all nodes which lay on the same
     * level.
     */
    @jsweet.lang.Optional
    public String borderColor;
    /**
     * (Highcharts) Can set `borderWidth` on all nodes which lay on the same
     * level.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) Can set `color` on all nodes which lay on the same level.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts) Can set `colorByPoint` on all nodes which lay on the same
     * level.
     */
    @jsweet.lang.Optional
    public Boolean colorByPoint;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Can set `dataLabels` on all
     * points which lay on the same level.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<SeriesSankeyDataLabelsOptionsObject,Array<SeriesSankeyDataLabelsOptionsObject>> dataLabels;
    /**
     * (Highcharts) Decides which level takes effect from the options set in the
     * levels object.
     */
    @jsweet.lang.Optional
    public double level;
    /**
     * (Highcharts) Can set `linkOpacity` on all points which lay on the same
     * level.
     */
    @jsweet.lang.Optional
    public double linkOpacity;
    /**
     * (Highcharts) Can set `states` on all nodes and points which lay on the
     * same level.
     */
    @jsweet.lang.Optional
    public SeriesStatesOptionsObject states;
}

