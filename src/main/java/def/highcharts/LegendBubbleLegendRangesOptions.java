package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps) Options for specific range. One range
 * consists of bubble, label and connector.
 */
@jsweet.lang.Interface
public abstract class LegendBubbleLegendRangesOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps) The color of the border for individual
     * range.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highcharts, Highstock, Highmaps) The color of the bubble for individual
     * range.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Highstock, Highmaps) The color of the connector for
     * individual range.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> connectorColor;
    /**
     * (Highcharts, Highstock, Highmaps) Range size value, similar to bubble Z
     * data.
     */
    @jsweet.lang.Optional
    public double value;
}

