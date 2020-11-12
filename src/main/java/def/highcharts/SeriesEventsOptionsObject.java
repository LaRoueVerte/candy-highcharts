package def.highcharts;
import def.dom.Event;
import def.dom.PointerEvent;
import def.js.Function;
/**
 * (Highstock) General event handlers for the series items. These event hooks
 * can also be attached to the series at run time using the
 * `Highcharts.addEvent` function.
 */
@jsweet.lang.Interface
public abstract class SeriesEventsOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) Fires after the series has finished its
     * initial animation, or in case animation is disabled, immediately as the
     * series is displayed.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Series,SeriesAfterAnimateEventObject> afterAnimate;
    /**
     * (Highstock) Fires when the checkbox next to the series' name in the
     * legend is clicked. One parameter, `event`, is passed to the function. The
     * state of the checkbox is found by `event.checked`. The checked item is
     * found by `event.item`. Return `false` to prevent the default action which
     * is to toggle the select state of the series.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Function,java.util.function.BiConsumer<Series,SeriesCheckboxClickEventObject>> checkboxClick;
    /**
     * (Highstock) Fires when the series is clicked. One parameter, `event`, is
     * passed to the function, containing common event information.
     * Additionally, `event.point` holds a pointer to the nearest point on the
     * graph.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Series,SeriesClickEventObject> click;
    /**
     * (Highstock) Fires when the series is hidden after chart generation time,
     * either by clicking the legend item or by calling `.hide()`.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Series,Event> hide;
    /**
     * (Highstock) Fires when the legend item belonging to the series is
     * clicked. One parameter, `event`, is passed to the function. The default
     * action is to toggle the visibility of the series. This can be prevented
     * by returning `false` or calling `event.preventDefault()`.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Series,SeriesLegendItemClickEventObject> legendItemClick;
    /**
     * (Highstock) Fires when the mouse leaves the graph. One parameter,
     * `event`, is passed to the function, containing common event information.
     * If the stickyTracking option is true, `mouseOut` doesn't happen before
     * the mouse enters another graph or leaves the plot area.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Series,PointerEvent> mouseOut;
    /**
     * (Highstock) Fires when the mouse enters the graph. One parameter,
     * `event`, is passed to the function, containing common event information.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Series,PointerEvent> mouseOver;
    /**
     * (Highcharts) Fires on a request for change of root node for the tree,
     * before the update is made. An event object is passed to the function,
     * containing additional properties `newRootId`, `previousRootId`, `redraw`
     * and `trigger`.
     */
    @jsweet.lang.Optional
    public Function setRootNode;
    /**
     * (Highstock) Fires when the series is shown after chart generation time,
     * either by clicking the legend item or by calling `.show()`.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Series,Event> show;
    native public java.lang.Object setRootNode(java.lang.Object... args);
}

