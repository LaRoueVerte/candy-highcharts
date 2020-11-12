package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps) An array of data classes or ranges for the
 * choropleth map. If none given, the color axis is scalar and values are
 * distributed as a gradient between the minimum and maximum colors.
 */
@jsweet.lang.Interface
public abstract class ColorAxisDataClassesOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps) The color of each data class. If not
     * set, the color is pulled from the global or chart-specific colors array.
     * In styled mode, this option is ignored. Instead, use colors defined in
     * CSS.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Highstock, Highmaps) The start of the value range that the
     * data class represents, relating to the point value.
     *
     * The range of each `dataClass` is closed in both ends, but can be
     * overridden by the next `dataClass`.
     */
    @jsweet.lang.Optional
    public double from;
    /**
     * (Highcharts, Highstock, Highmaps) The name of the data class as it
     * appears in the legend. If no name is given, it is automatically created
     * based on the `from` and `to` values. For full programmatic control,
     * legend.labelFormatter can be used. In the formatter, `this.from` and
     * `this.to` can be accessed.
     */
    @jsweet.lang.Optional
    public String name;
    /**
     * (Highcharts, Highstock, Highmaps) The end of the value range that the
     * data class represents, relating to the point value.
     *
     * The range of each `dataClass` is closed in both ends, but can be
     * overridden by the next `dataClass`.
     */
    @jsweet.lang.Optional
    public double to;
}

