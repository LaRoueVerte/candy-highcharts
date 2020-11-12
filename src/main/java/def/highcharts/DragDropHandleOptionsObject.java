package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Function;
/**
 * (Highcharts, Highstock, Gantt) Options for the drag handles.
 */
@jsweet.lang.Interface
public abstract class DragDropHandleOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) The class name of the drag handles.
     * Defaults to `highcharts-drag-handle`.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock, Gantt) The fill color of the drag handles.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Highstock, Gantt) The mouse cursor to use for the drag
     * handles. By default this is intelligently switching between `ew-resize`
     * and `ns-resize` depending on the direction the point is being dragged.
     */
    @jsweet.lang.Optional
    public String cursor;
    /**
     * (Highcharts, Highstock, Gantt) The line color of the drag handles.
     */
    @jsweet.lang.Optional
    public String lineColor;
    /**
     * (Highcharts, Highstock, Gantt) The line width for the drag handles.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highcharts, Highstock, Gantt) Function to define the SVG path to use for
     * the drag handles. Takes the point as argument. Should return an SVG path
     * in array format. The SVG path is automatically positioned on the point.
     */
    @jsweet.lang.Optional
    public Function pathFormatter;
    /**
     * (Highcharts, Highstock, Gantt) The z index for the drag handles.
     */
    @jsweet.lang.Optional
    public double zIndex;
    native public java.lang.Object pathFormatter(java.lang.Object... args);
}

