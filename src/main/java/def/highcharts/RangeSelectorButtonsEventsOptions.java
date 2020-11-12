package def.highcharts;
import def.dom.Event;
@jsweet.lang.Interface
public abstract class RangeSelectorButtonsEventsOptions extends def.js.Object {
    /**
     * (Highstock, Gantt) Fires when clicking on the rangeSelector button. One
     * parameter, event, is passed to the function, containing common event
     * information. (see online documentation for example)
     *
     * Return false to stop default button's click action.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Event,jsweet.util.union.Union<Boolean,Object>> click;
}

