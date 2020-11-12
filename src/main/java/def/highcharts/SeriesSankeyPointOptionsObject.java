package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) An array of data points for the series. For the `sankey` series
 * type, points can be given in the following way:
 *
 * An array of objects with named values. The following snippet shows only a few
 * settings, see the complete options set below. If the total number of data
 * points exceeds the series' turboThreshold, this option is not available. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class SeriesSankeyPointOptionsObject extends def.js.Object {
    /**
     * (Highcharts) Accessibility options for a data point.
     */
    @jsweet.lang.Optional
    public PointAccessibilityOptionsObject accessibility;
    /**
     * (Highcharts, Gantt) An additional, individual class name for the data
     * point's graphic representation.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts) The color for the individual _link_. By default, the link
     * color is the same as the node it extends from. The `series.fillOpacity`
     * option also applies to the points, so when setting a specific link color,
     * consider setting the `fillOpacity` to 1.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Gantt) A specific color index to use for the point, so its
     * graphic representations are given the class name `highcharts-color-{n}`.
     * In styled mode this will change the color of the graphic. In non-styled
     * mode, the color by is set by the `fill` attribute, so the change in class
     * name won't have a visual effect by default.
     */
    @jsweet.lang.Optional
    public double colorIndex;
    /**
     * (Highcharts) A reserved subspace to store options and values for
     * customized functionality. Here you can add additional data for your own
     * event callbacks and formatter callbacks.
     */
    @jsweet.lang.Optional
    public Dictionary<?> custom;
    /**
     * (Highcharts) Individual data label for each point. The options are the
     * same as the ones for plotOptions.series.dataLabels.
     */
    @jsweet.lang.Optional
    public Object dataLabels;
    /**
     * (Highcharts) A description of the point to add to the screen reader
     * information about the point.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highcharts, Highstock, Gantt) The individual point events.
     */
    @jsweet.lang.Optional
    public PointEventsOptionsObject events;
    /**
     * (Highcharts) The node that the link runs from.
     */
    @jsweet.lang.Optional
    public String from;
    /**
     * (Highcharts, Highstock, Gantt) An id for the point. This can be used
     * after render time to get a pointer to the point object through
     * `chart.get()`.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highcharts) The rank for this point's data label in case of collision.
     * If two data labels are about to overlap, only the one with the highest
     * `labelrank` will be drawn.
     */
    @jsweet.lang.Optional
    public double labelrank;
    /**
     * (Highcharts) The name of the point as shown in the legend, tooltip,
     * dataLabels, etc.
     */
    @jsweet.lang.Optional
    public String name;
    /**
     * (Highcharts) Whether the link goes out of the system.
     */
    @jsweet.lang.Optional
    public Boolean outgoing;
    /**
     * (Highcharts, Highstock, Gantt) Whether the data point is selected
     * initially.
     */
    @jsweet.lang.Optional
    public Boolean selected;
    /**
     * (Highcharts) The node that the link runs to.
     */
    @jsweet.lang.Optional
    public String to;
    /**
     * (Highcharts) The weight of the link.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> weight;
}

