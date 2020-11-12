package def.highcharts;
import def.dom.Event;
/**
 * (Highcharts, Highstock, Gantt) An object defining mouse events for the plot
 * band. Supported properties are `click`, `mouseover`, `mouseout`, `mousemove`.
 */
@jsweet.lang.Interface
public abstract class YAxisPlotBandsEventsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) Click event on a plot band.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<PlotLineOrBand,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> click;
    /**
     * (Highcharts, Highstock, Gantt) Mouse move event on a plot band.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<PlotLineOrBand,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> mousemove;
    /**
     * (Highcharts, Highstock, Gantt) Mouse out event on the corner of a plot
     * band.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<PlotLineOrBand,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> mouseout;
    /**
     * (Highcharts, Highstock, Gantt) Mouse over event on a plot band.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<PlotLineOrBand,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> mouseover;
}

