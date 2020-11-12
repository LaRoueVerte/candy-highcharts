package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highcharts) Set options on specific levels. Takes precedence over series
 * options, but not point options.
 */
@jsweet.lang.Interface
public abstract class PlotSunburstLevelsOptions extends def.js.Object {
    /**
     * (Highcharts) Can set a `borderColor` on all points which lies on the same
     * level.
     */
    @jsweet.lang.Optional
    public String borderColor;
    /**
     * (Highcharts) Can set a `borderDashStyle` on all points which lies on the
     * same level.
     */
    @jsweet.lang.Optional
    public Object borderDashStyle;
    /**
     * (Highcharts) Can set a `borderWidth` on all points which lies on the same
     * level.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) Can set a `color` on all points which lies on the same
     * level.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts) Can set a `colorVariation` on all points which lies on the
     * same level.
     */
    @jsweet.lang.Optional
    public PlotSunburstLevelsColorVariationOptions colorVariation;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Can set `dataLabels` on all
     * points which lies on the same level.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<SeriesSunburstDataLabelsOptionsObject,Array<SeriesSunburstDataLabelsOptionsObject>> dataLabels;
    /**
     * (Highcharts) Can set a `levelSize` on all points which lies on the same
     * level.
     */
    @jsweet.lang.Optional
    public Object levelSize;
    /**
     * (Highcharts) Can set a `rotation` on all points which lies on the same
     * level.
     */
    @jsweet.lang.Optional
    public double rotation;
    /**
     * (Highcharts) Can set a `rotationMode` on all points which lies on the
     * same level.
     */
    @jsweet.lang.Optional
    public String rotationMode;
}

