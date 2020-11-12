package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) Options for the pivot or the center point of the gauge.
 *
 * In styled mode, the pivot is styled with the `.highcharts-gauge-series
 * .highcharts-pivot` rule.
 */
@jsweet.lang.Interface
public abstract class PlotGaugePivotOptions extends def.js.Object {
    /**
     * (Highcharts) The background color or fill of the pivot.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> backgroundColor;
    /**
     * (Highcharts) The border or stroke color of the pivot. In able to change
     * this, the borderWidth must also be set to something other than the
     * default 0.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highcharts) The border or stroke width of the pivot.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) The pixel radius of the pivot.
     */
    @jsweet.lang.Optional
    public double radius;
}

