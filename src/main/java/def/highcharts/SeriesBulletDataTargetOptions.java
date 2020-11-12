package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) Individual target options for each point.
 */
@jsweet.lang.Interface
public abstract class SeriesBulletDataTargetOptions extends def.js.Object {
    /**
     * (Highcharts) The border color of the rectangle representing the target.
     * When not set, the point's border color is used.
     *
     * In styled mode, use class `highcharts-bullet-target` instead.
     */
    @jsweet.lang.Optional
    public String borderColor;
    /**
     * (Highcharts) The border width of the rectangle representing the target.
     *
     * In styled mode, use class `highcharts-bullet-target` instead.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) The color of the rectangle representing the target. When not
     * set, point's color (if set in point's options - `color`) or zone of the
     * target value (if `zones` or `negativeColor` are set) or the same color as
     * the point has is used.
     *
     * In styled mode, use class `highcharts-bullet-target` instead.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts) The height of the rectangle representing the target.
     */
    @jsweet.lang.Optional
    public double height;
    /**
     * (Highcharts) The width of the rectangle representing the target. Could be
     * set as a pixel value or as a percentage of a column width.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> width;
}

