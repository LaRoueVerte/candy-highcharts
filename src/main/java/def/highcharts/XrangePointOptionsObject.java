package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highcharts, Highstock, Gantt) An array of data points for the series. For
 * the `xrange` series type, points can be given in the following ways:
 *
 * 1. An array of objects with named values. The objects are point configuration
 * objects as seen below. (see online documentation for example)
 */
@jsweet.lang.Interface
public abstract class XrangePointOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) Accessibility options for a data point.
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
     * (Highcharts, Highstock, Gantt) Individual color for the point. By default
     * the color is pulled from the global `colors` array.
     *
     * In styled mode, the `color` option doesn't take effect. Instead, use
     * `colorIndex`.
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
     * (Gantt) Connect to a point. This option can be either a string, referring
     * to the ID of another point, or an object, or an array of either. If the
     * option is an array, each element defines a connection.
     */
    @jsweet.lang.Optional
    public Union3<String,XrangePointConnectorsOptionsObject,Array<jsweet.util.union.Union<String,XrangePointConnectorsOptionsObject>>> connect;
    /**
     * (Highcharts, Highstock, Gantt) A reserved subspace to store options and
     * values for customized functionality. Here you can add additional data for
     * your own event callbacks and formatter callbacks.
     */
    @jsweet.lang.Optional
    public Dictionary<?> custom;
    /**
     * (Highcharts, Highstock, Gantt) Individual data label for each point. The
     * options are the same as the ones for plotOptions.series.dataLabels.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<DataLabelsOptions,Array<DataLabelsOptions>> dataLabels;
    /**
     * (Highcharts, Highstock, Gantt) A description of the point to add to the
     * screen reader information about the point.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highcharts, Highstock, Gantt) Point specific options for the
     * draggable-points module. Overrides options on `series.dragDrop`.
     */
    @jsweet.lang.Optional
    public SeriesLineDataDragDropOptions dragDrop;
    /**
     * (Highcharts) The `id` of a series in the drilldown.series array to use
     * for a drilldown for this point.
     */
    @jsweet.lang.Optional
    public String drilldown;
    /**
     * (Highcharts, Highstock, Gantt) The individual point events.
     */
    @jsweet.lang.Optional
    public PointEventsOptionsObject events;
    /**
     * (Highcharts, Highstock, Gantt) An id for the point. This can be used
     * after render time to get a pointer to the point object through
     * `chart.get()`.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highcharts, Highstock, Gantt) The rank for this point's data label in
     * case of collision. If two data labels are about to overlap, only the one
     * with the highest `labelrank` will be drawn.
     */
    @jsweet.lang.Optional
    public double labelrank;
    /**
     * (Highcharts, Highstock) Options for the point markers of line-like
     * series.
     */
    @jsweet.lang.Optional
    public PointMarkerOptionsObject marker;
    /**
     * (Highcharts, Highstock, Gantt) The name of the point as shown in the
     * legend, tooltip, dataLabels, etc.
     */
    @jsweet.lang.Optional
    public String name;
    /**
     * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
     * used to visualize how much of a task is performed. The partial fill
     * object can be set either on series or point level.
     */
    @jsweet.lang.Optional
    public XrangePointPartialFillOptionsObject partialFill;
    /**
     * (Highcharts, Highstock, Gantt) Whether the data point is selected
     * initially.
     */
    @jsweet.lang.Optional
    public Boolean selected;
    /**
     * (Highcharts, Highstock, Gantt) The starting X value of the range point.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Gantt) The ending X value of the range point.
     */
    @jsweet.lang.Optional
    public double x2;
    /**
     * (Highcharts, Highstock, Gantt) The Y value of the range point.
     */
    @jsweet.lang.Optional
    public double y;
}

