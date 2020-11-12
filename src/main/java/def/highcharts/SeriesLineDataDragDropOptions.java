package def.highcharts;
/**
 * (Highcharts, Highstock, Gantt) Point specific options for the
 * draggable-points module. Overrides options on `series.dragDrop`.
 */
@jsweet.lang.Interface
public abstract class SeriesLineDataDragDropOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
     */
    @jsweet.lang.Optional
    public Boolean draggableX;
    /**
     * (Highcharts, Highstock, Gantt) Enable dragging in the Y dimension. Note
     * that this is not supported for TreeGrid axes (the default axis type in
     * Gantt charts).
     */
    @jsweet.lang.Optional
    public Boolean draggableY;
    /**
     * (Highcharts, Highstock, Gantt) Options for the drag handles.
     */
    @jsweet.lang.Optional
    public DragDropHandleOptionsObject dragHandle;
    /**
     * (Highcharts, Highstock, Gantt) Set the maximum X value the points can be
     * moved to.
     */
    @jsweet.lang.Optional
    public double dragMaxX;
    /**
     * (Highcharts, Highstock, Gantt) Set the maximum Y value the points can be
     * moved to.
     */
    @jsweet.lang.Optional
    public double dragMaxY;
    /**
     * (Highcharts, Highstock, Gantt) Set the minimum X value the points can be
     * moved to.
     */
    @jsweet.lang.Optional
    public double dragMinX;
    /**
     * (Highcharts, Highstock, Gantt) Set the minimum Y value the points can be
     * moved to.
     */
    @jsweet.lang.Optional
    public double dragMinY;
    /**
     * (Highcharts, Highstock, Gantt) The X precision value to drag to for this
     * series. Set to 0 to disable. By default this is disabled, except for
     * category axes, where the default is 1.
     */
    @jsweet.lang.Optional
    public double dragPrecisionX;
    /**
     * (Highcharts, Highstock, Gantt) The Y precision value to drag to for this
     * series. Set to 0 to disable. By default this is disabled, except for
     * category axes, where the default is 1.
     */
    @jsweet.lang.Optional
    public double dragPrecisionY;
    /**
     * (Highcharts, Highstock, Gantt) The amount of pixels to drag the pointer
     * before it counts as a drag operation. This prevents drag/drop to fire
     * when just clicking or selecting points.
     */
    @jsweet.lang.Optional
    public double dragSensitivity;
    /**
     * (Highcharts, Highstock, Gantt) Group the points by a property. Points
     * with the same property value will be grouped together when moving.
     */
    @jsweet.lang.Optional
    public String groupBy;
    /**
     * (Highcharts, Highstock, Gantt) Style options for the guide box. The guide
     * box has one state by default, the `default` state.
     */
    @jsweet.lang.Optional
    public Object guideBox;
    /**
     * (Highcharts, Highstock, Gantt) Update points as they are dragged. If
     * false, a guide box is drawn to illustrate the new point size.
     */
    @jsweet.lang.Optional
    public Boolean liveRedraw;
}

