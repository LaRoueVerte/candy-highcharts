package def.highcharts;
import def.js.Array;
/**
 * (Highcharts, Highstock, Gantt) Series labels are placed as close to the
 * series as possible in a natural way, seeking to avoid other series. The goal
 * of this feature is to make the chart more easily readable, like if a human
 * designer placed the labels in the optimal position.
 *
 * The series labels currently work with series types having a `graph` or an
 * `area`.
 */
@jsweet.lang.Interface
public abstract class SeriesLabelOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) An array of boxes to avoid when laying out
     * the labels. Each item has a `left`, `right`, `top` and `bottom` property.
     */
    @jsweet.lang.Optional
    public Array<LabelIntersectBoxObject> boxesToAvoid;
    /**
     * (Highcharts, Highstock, Gantt) Allow labels to be placed distant to the
     * graph if necessary, and draw a connector line to the graph. Setting this
     * option to true may decrease the performance significantly, since the
     * algorithm with systematically search for open spaces in the whole plot
     * area. Visually, it may also result in a more cluttered chart, though more
     * of the series will be labeled.
     */
    @jsweet.lang.Optional
    public Boolean connectorAllowed;
    /**
     * (Highcharts, Highstock, Gantt) If the label is closer than this to a
     * neighbour graph, draw a connector.
     */
    @jsweet.lang.Optional
    public double connectorNeighbourDistance;
    /**
     * (Highcharts, Highstock, Gantt) Enable the series label per series.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Gantt) A format string for the label, with
     * support for a subset of HTML. Variables are enclosed by curly brackets.
     * Available variables are `name`, `options.xxx`, `color` and other members
     * from the `series` object. Use this option also to set a static text for
     * the label.
     */
    @jsweet.lang.Optional
    public String format;
    /**
     * (Highcharts, Highstock, Gantt) Callback function to format each of the
     * series' labels. The `this` keyword refers to the series object. By
     * default the `formatter` is undefined and the `series.name` is rendered.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Series,String> formatter;
    /**
     * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
     * to vary so that small areas get a smaller font size. The default applies
     * this effect to area-like series but not line-like series.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> maxFontSize;
    /**
     * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
     * to vary so that small areas get a smaller font size. The default applies
     * this effect to area-like series but not line-like series.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> minFontSize;
    /**
     * (Highcharts, Highstock, Gantt) Draw the label on the area of an area
     * series. By default it is drawn on the area. Set it to `false` to draw it
     * next to the graph instead.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Object> onArea;
    /**
     * (Highcharts, Highstock, Gantt) Styles for the series label. The color
     * defaults to the series color, or a contrast color if `onArea`.
     */
    @jsweet.lang.Optional
    public CSSObject style;
}

