package def.highcharts;
import def.dom.Event;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
 */
@jsweet.lang.Interface
public abstract class NavigationAnnotationsEventsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
     * is added to the chart.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<Annotation,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> add;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
     * is updated (e.g. drag and droppped or resized by control points).
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<Annotation,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> afterUpdate;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
     * is removed from the chart.
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<Annotation,jsweet.util.union.Union<Event,Dictionary<?>>,Boolean> remove;
}

