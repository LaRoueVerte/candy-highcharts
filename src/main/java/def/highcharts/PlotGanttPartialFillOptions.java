package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Gantt) A partial fill for each point, typically used to visualize how much
 * of a task is performed. See completed.
 */
@jsweet.lang.Interface
public abstract class PlotGanttPartialFillOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) The fill color to be used for partial
     * fills. Defaults to a darker shade of the point color.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fill;
}

