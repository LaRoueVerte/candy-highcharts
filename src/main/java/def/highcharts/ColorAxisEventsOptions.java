package def.highcharts;
import def.js.Function;
/**
 * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
 */
@jsweet.lang.Interface
public abstract class ColorAxisEventsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps) As opposed to the `setExtremes` event,
     * this event fires after the final min and max values are computed and
     * corrected for `minRange`.
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
     * (Highcharts, Highstock, Highmaps) Fires when the legend item belonging to
     * the colorAxis is clicked. One parameter, `event`, is passed to the
     * function.
     */
    @jsweet.lang.Optional
    public Function legendItemClick;
    /**
     * (Highcharts, Highstock, Highmaps) Fires when the minimum and maximum is
     * set for the axis, either by calling the `.setExtremes()` method or by
     * selecting an area in the chart. One parameter, `event`, is passed to the
     * function, containing common event information.
     *
     * The new user set minimum and maximum values can be found by `event.min`
     * and `event.max`. These reflect the axis minimum and maximum in data
     * values. When an axis is zoomed all the way out from the "Reset zoom"
     * button, `event.min` and `event.max` are null, and the new extremes are
     * set based on `this.dataMin` and `this.dataMax`.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Axis,AxisSetExtremesEventObject> setExtremes;
    native public java.lang.Object legendItemClick(java.lang.Object... args);
}

