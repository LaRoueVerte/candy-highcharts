package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highcharts) Set options on specific levels. Takes precedence over series
 * options, but not point options.
 */
@jsweet.lang.Interface
public abstract class PlotTreemapLevelsOptions extends def.js.Object {
    /**
     * (Highcharts) Can set a `borderColor` on all points which lies on the same
     * level.
     */
    @jsweet.lang.Optional
    public String borderColor;
    /**
     * (Highcharts) Set the dash style of the border of all the point which lies
     * on the level. See plotOptions.scatter.dashStyle for possible options.
     */
    @jsweet.lang.Optional
    public Object borderDashStyle;
    /**
     * (Highcharts) Can set the borderWidth on all points which lies on the same
     * level.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) Can set a color on all points which lies on the same level.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts) A configuration object to define how the color of a child
     * varies from the parent's color. The variation is distributed among the
     * children of node. For example when setting brightness, the brightness
     * change will range from the parent's original brightness on the first
     * child, to the amount set in the `to` setting on the last node. This
     * allows a gradient-like color scheme that sets children out from each
     * other while highlighting the grouping on treemaps and sectors on sunburst
     * charts.
     */
    @jsweet.lang.Optional
    public PlotTreemapLevelsColorVariationOptions colorVariation;
    /**
     * (Highcharts) Can set the options of dataLabels on each point which lies
     * on the level. plotOptions.treemap.dataLabels for possible values.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<PlotTreemapLevelsDataLabelsOptions,Array<PlotTreemapLevelsDataLabelsOptions>> dataLabels;
    /**
     * (Highcharts) Can set the layoutAlgorithm option on a specific level.
     */
    @jsweet.lang.Optional
    public Object layoutAlgorithm;
    /**
     * (Highcharts) Can set the layoutStartingDirection option on a specific
     * level.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.horizontal,def.highcharts.StringTypes.vertical> layoutStartingDirection;
    /**
     * (Highcharts) Decides which level takes effect from the options set in the
     * levels object.
     */
    @jsweet.lang.Optional
    public double level;
}

