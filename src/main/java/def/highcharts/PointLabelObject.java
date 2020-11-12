package def.highcharts;
import jsweet.util.union.Union3;
/**
 * Configuration hash for the data label and tooltip formatters.
 */
@jsweet.lang.Interface
public abstract class PointLabelObject extends def.js.Object {
    /**
     * The point's current color.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * The point's current color index, used in styled mode instead of `color`.
     * The color index is inserted in class names used for styling.
     */
    public double colorIndex;
    /**
     * The name of the related point.
     */
    @jsweet.lang.Optional
    public String key;
    /**
     * The percentage for related points in a stacked series or pies.
     */
    public double percentage;
    /**
     * The related point. The point name, if defined, is available through
     * `this.point.name`.
     */
    public Point point;
    /**
     * The related series. The series name is available through
     * `this.series.name`.
     */
    public Series series;
    /**
     * The total of values in either a stack for stacked series, or a pie in a
     * pie series.
     */
    @jsweet.lang.Optional
    public double total;
    /**
     * For categorized axes this property holds the category name for the point.
     * For other axes it holds the X value.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> x;
    /**
     * The y value of the point.
     */
    @jsweet.lang.Optional
    public double y;
}

