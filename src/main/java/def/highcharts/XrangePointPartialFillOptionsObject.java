package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Gantt) A partial fill for each point, typically used
 * to visualize how much of a task is performed. The partial fill object can be
 * set either on series or point level.
 */
@jsweet.lang.Interface
public abstract class XrangePointPartialFillOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) The amount of the X-range point to be
     * filled. Values can be 0-1 and are converted to percentages in the default
     * data label formatter.
     */
    @jsweet.lang.Optional
    public double amount;
    /**
     * (Highcharts, Highstock, Gantt) The fill color to be used for partial
     * fills. Defaults to a darker shade of the point color.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fill;
}

