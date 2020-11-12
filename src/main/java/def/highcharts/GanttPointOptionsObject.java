package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Gantt) Data for a Gantt series.
 */
@jsweet.lang.Interface
public abstract class GanttPointOptionsObject extends def.js.Object {
    /**
     * (Gantt) Accessibility options for a data point.
     */
    @jsweet.lang.Optional
    public PointAccessibilityOptionsObject accessibility;
    /**
     * (Gantt) Whether the grid node belonging to this point should start as
     * collapsed. Used in axes of type treegrid.
     */
    @jsweet.lang.Optional
    public Boolean collapsed;
    /**
     * (Gantt) Progress indicator, how much of the task completed. If it is a
     * number, the `fill` will be applied automatically.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,XrangePointPartialFillOptionsObject> completed;
    /**
     * (Gantt) A reserved subspace to store options and values for customized
     * functionality. Here you can add additional data for your own event
     * callbacks and formatter callbacks.
     */
    @jsweet.lang.Optional
    public Dictionary<?> custom;
    /**
     * (Gantt) The ID of the point (task) that this point depends on in Gantt
     * charts. Aliases connect. Can also be an object, specifying further
     * connecting options between the points. Multiple connections can be
     * specified by providing an array.
     */
    @jsweet.lang.Optional
    public Union3<String,XrangePointConnectorsOptionsObject,Array<jsweet.util.union.Union<String,XrangePointConnectorsOptionsObject>>> dependency;
    /**
     * (Gantt) A description of the point to add to the screen reader
     * information about the point.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Gantt) Point specific options for the draggable-points module. Overrides
     * options on `series.dragDrop`.
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
     * (Gantt) The end time of a task.
     */
    @jsweet.lang.Optional
    public double end;
    /**
     * (Highcharts, Highstock, Gantt) An id for the point. This can be used
     * after render time to get a pointer to the point object through
     * `chart.get()`.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Gantt) The rank for this point's data label in case of collision. If two
     * data labels are about to overlap, only the one with the highest
     * `labelrank` will be drawn.
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
     * (Gantt) Whether this point is a milestone. If so, only the `start` option
     * is handled, while `end` is ignored.
     */
    @jsweet.lang.Optional
    public Boolean milestone;
    /**
     * (Gantt) The name of a task. If a `treegrid` y-axis is used (default in
     * Gantt charts), this will be picked up automatically, and used to
     * calculate the y-value.
     */
    @jsweet.lang.Optional
    public String name;
    /**
     * (Gantt) The ID of the parent point (task) of this point in Gantt charts.
     */
    @jsweet.lang.Optional
    public String parent;
    /**
     * (Gantt) The start time of a task.
     */
    @jsweet.lang.Optional
    public double start;
    /**
     * (Gantt) The Y value of a task.
     */
    @jsweet.lang.Optional
    public double y;
}

