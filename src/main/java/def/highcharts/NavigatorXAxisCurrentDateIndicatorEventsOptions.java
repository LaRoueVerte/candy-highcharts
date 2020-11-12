package def.highcharts;
import def.dom.Event;
/**
 * (Gantt) An object defining mouse events for the plot line. Supported
 * properties are `click`, `mouseover`, `mouseout`, `mousemove`.
 */
@jsweet.lang.Interface
public abstract class NavigatorXAxisCurrentDateIndicatorEventsOptions extends def.js.Object {
    /**
     * (Gantt) Click event on a plot band.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<PlotLineOrBand,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> click;
    /**
     * (Gantt) Mouse move event on a plot band.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<PlotLineOrBand,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> mousemove;
    /**
     * (Gantt) Mouse out event on the corner of a plot band.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<PlotLineOrBand,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> mouseout;
    /**
     * (Gantt) Mouse over event on a plot band.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<PlotLineOrBand,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> mouseover;
}

