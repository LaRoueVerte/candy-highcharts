package def.highcharts;
import def.dom.Event;
import def.dom.PointerEvent;
/**
 * (Highcharts, Highstock, Gantt) The individual point events.
 */
@jsweet.lang.Interface
public abstract class PointEventsOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) Fires when a point is clicked. One
     * parameter, `event`, is passed to the function, containing common event
     * information.
     *
     * If the `series.allowPointSelect` option is true, the default action for
     * the point's click event is to toggle the point's select state. Returning
     * `false` cancels this action.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,PointClickEventObject> click;
    /**
     * (Highcharts, Highstock, Gantt) Callback that fires while dragging a
     * point. The mouse event is passed in as parameter. The original data can
     * be accessed from `e.origin`, and the new point values can be accessed
     * from `e.newPoints`. If there is only a single point being updated, it can
     * be accessed from `e.newPoint` for simplicity, and its ID can be accessed
     * from `e.newPointId`. The `this` context is the point being dragged. To
     * stop the default drag action, return false. See drag and drop options.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,PointDragEventObject> drag;
    /**
     * (Highcharts, Highstock, Gantt) Callback that fires when starting to drag
     * a point. The mouse event object is passed in as an argument. If a drag
     * handle is used, `e.updateProp` is set to the data property being dragged.
     * The `this` context is the point. See drag and drop options.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,PointDragStartEventObject> dragStart;
    /**
     * (Highcharts, Highstock, Gantt) Callback that fires when the point is
     * dropped. The parameters passed are the same as for drag. To stop the
     * default drop action, return false. See drag and drop options.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,PointDropEventObject> drop;
    /**
     * (Highcharts) Fires when the legend item belonging to the pie point
     * (slice) is clicked. The `this` keyword refers to the point itself. One
     * parameter, `event`, is passed to the function, containing common event
     * information. The default action is to toggle the visibility of the point.
     * This can be prevented by calling `event.preventDefault()`.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,PointLegendItemClickEventObject> legendItemClick;
    /**
     * (Highcharts, Highstock, Gantt) Fires when the mouse leaves the area close
     * to the point. One parameter, `event`, is passed to the function,
     * containing common event information.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,PointerEvent> mouseOut;
    /**
     * (Highcharts, Highstock, Gantt) Fires when the mouse enters the area close
     * to the point. One parameter, `event`, is passed to the function,
     * containing common event information.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,Event> mouseOver;
    /**
     * (Highcharts, Highstock, Gantt) Fires when the point is removed using the
     * `.remove()` method. One parameter, `event`, is passed to the function.
     * Returning `false` cancels the operation.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,Event> remove;
    /**
     * Fires when the point is selected either programmatically or following a
     * click on the point. One parameter, `event`, is passed to the function.
     * Returning `false` cancels the operation.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,PointInteractionEventObject> select;
    /**
     * Fires when the point is unselected either programmatically or following a
     * click on the point. One parameter, `event`, is passed to the function.
     * Returning `false` cancels the operation.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,PointInteractionEventObject> unselect;
    /**
     * (Highcharts, Highstock, Gantt) Fires when the point is updated
     * programmatically through the `.update()` method. One parameter, `event`,
     * is passed to the function. The new point options can be accessed through
     * `event.options`. Returning `false` cancels the operation.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,PointUpdateEventObject> update;
}

