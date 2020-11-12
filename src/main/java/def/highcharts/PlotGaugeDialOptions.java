package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) Options for the dial or arrow pointer of the gauge.
 *
 * In styled mode, the dial is styled with the `.highcharts-gauge-series
 * .highcharts-dial` rule.
 */
@jsweet.lang.Interface
public abstract class PlotGaugeDialOptions extends def.js.Object {
    /**
     * (Highcharts) The background or fill color of the gauge's dial.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> backgroundColor;
    /**
     * (Highcharts) The length of the dial's base part, relative to the total
     * radius or length of the dial.
     */
    @jsweet.lang.Optional
    public String baseLength;
    /**
     * (Highcharts) The pixel width of the base of the gauge dial. The base is
     * the part closest to the pivot, defined by baseLength.
     */
    @jsweet.lang.Optional
    public double baseWidth;
    /**
     * (Highcharts) The border color or stroke of the gauge's dial. By default,
     * the borderWidth is 0, so this must be set in addition to a custom border
     * color.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highcharts) The width of the gauge dial border in pixels.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) The radius or length of the dial, in percentages relative to
     * the radius of the gauge itself.
     */
    @jsweet.lang.Optional
    public String radius;
    /**
     * (Highcharts) The length of the dial's rear end, the part that extends out
     * on the other side of the pivot. Relative to the dial's length.
     */
    @jsweet.lang.Optional
    public String rearLength;
    /**
     * (Highcharts) The width of the top of the dial, closest to the perimeter.
     * The pivot narrows in from the base to the top.
     */
    @jsweet.lang.Optional
    public double topWidth;
}

