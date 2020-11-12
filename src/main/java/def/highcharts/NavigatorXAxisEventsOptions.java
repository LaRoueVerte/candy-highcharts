package def.highcharts;
/**
 * (Highstock, Gantt) Event handlers for the axis.
 */
@jsweet.lang.Interface
public abstract class NavigatorXAxisEventsOptions extends def.js.Object {
    /**
     * (Highcharts, Gantt) An event fired after the breaks have rendered.
     */
    @jsweet.lang.Optional
    public java.util.function.Consumer<Axis> afterBreaks;
    /**
     * (Highstock, Gantt) As opposed to the `setExtremes` event, this event
     * fires after the final min and max values are computed and corrected for
     * `minRange`.
     *
     * Fires when the minimum and maximum is set for the axis, either by calling
     * the `.setExtremes()` method or by selecting an area in the chart. One
     * parameter, `event`, is passed to the function, containing common event
     * information.
     *
     * The new user set minimum and maximum values can be found by `event.min`
     * and `event.max`. These reflect the axis minimum and maximum in axis
     * values. The actual data extremes are found in `event.dataMin` and
     * `event.dataMax`.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Axis,AxisSetExtremesEventObject> afterSetExtremes;
    /**
     * (Highcharts, Gantt) An event fired when a break from this axis occurs on
     * a point.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Axis,AxisPointBreakEventObject> pointBreak;
    /**
     * (Highcharts, Highstock, Gantt) An event fired when a point falls inside a
     * break from this axis.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Axis,AxisPointBreakEventObject> pointInBreak;
    /**
     * (Highstock, Gantt) Fires when the minimum and maximum is set for the
     * axis, either by calling the `.setExtremes()` method or by selecting an
     * area in the chart. One parameter, `event`, is passed to the function,
     * containing common event information.
     *
     * The new user set minimum and maximum values can be found by `event.min`
     * and `event.max`. These reflect the axis minimum and maximum in data
     * values. When an axis is zoomed all the way out from the "Reset zoom"
     * button, `event.min` and `event.max` are null, and the new extremes are
     * set based on `this.dataMin` and `this.dataMax`.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Axis,AxisSetExtremesEventObject> setExtremes;
}

