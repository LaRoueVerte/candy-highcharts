package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Gantt) Style options for the guide box default state.
 */
@jsweet.lang.Interface
public abstract class DragDropGuideBoxOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) CSS class name of the guide box in this
     * state. Defaults to `highcharts-drag-box-default`.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock, Gantt) Guide box fill color.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Highstock, Gantt) Guide box cursor.
     */
    @jsweet.lang.Optional
    public String cursor;
    /**
     * (Highcharts, Highstock, Gantt) Color of the border around the guide box.
     */
    @jsweet.lang.Optional
    public String lineColor;
    /**
     * (Highcharts, Highstock, Gantt) Width of the line around the guide box.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highcharts, Highstock, Gantt) Guide box zIndex.
     */
    @jsweet.lang.Optional
    public double zIndex;
}

