package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps) Options for the bubble legend labels.
 */
@jsweet.lang.Interface
public abstract class LegendBubbleLegendLabelsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps) The alignment of the labels compared to
     * the bubble legend. Can be one of `left`, `center` or `right`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Highcharts, Highstock, Highmaps) Whether to allow data labels to
     * overlap.
     */
    @jsweet.lang.Optional
    public Boolean allowOverlap;
    /**
     * (Highcharts, Highstock, Highmaps) An additional class name to apply to
     * the bubble legend label graphical elements. This option does not replace
     * default class names of the graphical element.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock, Highmaps) A format string for the bubble legend
     * labels. Available variables are the same as for `formatter`.
     */
    @jsweet.lang.Optional
    public String format;
    /**
     * (Highcharts, Highstock, Highmaps) Available `this` properties are:
     *
     * - `this.value`: The bubble value.
     *
     * - `this.radius`: The radius of the bubble range.
     *
     * - `this.center`: The center y position of the range.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<BubbleLegendFormatterContextObject,String> formatter;
    /**
     * (Highcharts, Highstock, Highmaps) CSS styles for the labels.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Highmaps) The x position offset of the label
     * relative to the connector.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Highmaps) The y position offset of the label
     * relative to the connector.
     */
    @jsweet.lang.Optional
    public double y;
}

