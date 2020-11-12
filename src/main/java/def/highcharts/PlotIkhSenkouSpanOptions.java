package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highstock) The styles for area between Senkou Span A and B.
 */
@jsweet.lang.Interface
public abstract class PlotIkhSenkouSpanOptions extends def.js.Object {
    /**
     * (Highstock) Color of the area between Senkou Span A and B, when Senkou
     * Span A is above Senkou Span B. Note that if a `style.fill` is defined,
     * the `color` takes precedence and the `style.fill` is ignored.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highstock) Color of the area between Senkou Span A and B, when Senkou
     * Span A is under Senkou Span B.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> negativeColor;
}

