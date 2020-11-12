package def.highcharts;
/**
 * (Highcharts, Highstock, Gantt) The draggable-points module allows points to
 * be moved around or modified in the chart. In addition to the options
 * mentioned under the `dragDrop` API structure, the module fires three events,
 * point.dragStart, point.drag and point.drop.
 */
@jsweet.lang.Interface
public abstract class SeriesDragDropOptionsObject extends def.js.Object {
    /**
     * (Highstock) Allow close value to be dragged individually.
     */
    @jsweet.lang.Optional
    public Boolean draggableClose;
    /**
     * (Gantt) Allow end value to be dragged individually.
     */
    @jsweet.lang.Optional
    public Boolean draggableEnd;
    /**
     * (Highstock) Allow high value to be dragged individually.
     */
    @jsweet.lang.Optional
    public Boolean draggableHigh;
    /**
     * (Highstock) Allow low value to be dragged individually.
     */
    @jsweet.lang.Optional
    public Boolean draggableLow;
    /**
     * (Highstock) Allow open value to be dragged individually.
     */
    @jsweet.lang.Optional
    public Boolean draggableOpen;
    /**
     * (Highcharts, Highstock) Allow Q1 value to be dragged individually.
     */
    @jsweet.lang.Optional
    public Boolean draggableQ1;
    /**
     * (Highcharts, Highstock) Allow Q3 value to be dragged individually.
     */
    @jsweet.lang.Optional
    public Boolean draggableQ3;
    /**
     * (Gantt) Allow start value to be dragged individually.
     */
    @jsweet.lang.Optional
    public Boolean draggableStart;
    /**
     * (Highcharts) Allow target value to be dragged individually.
     */
    @jsweet.lang.Optional
    public Boolean draggableTarget;
    /**
     * (Highcharts, Highstock, Gantt) Enable dragging in the X dimension.
     */
    @jsweet.lang.Optional
    public Boolean draggableX;
    /**
     * (Highcharts, Highstock, Gantt) Allow x value to be dragged individually.
     */
    @jsweet.lang.Optional
    public Boolean draggableX1;
    /**
     * (Highcharts, Highstock, Gantt) Allow x2 value to be dragged individually.
     */
    @jsweet.lang.Optional
    public Boolean draggableX2;
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

