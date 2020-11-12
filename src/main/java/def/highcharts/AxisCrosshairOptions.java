package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Configure a crosshair that follows
 * either the mouse pointer or the hovered point.
 *
 * In styled mode, the crosshairs are styled in the `.highcharts-crosshair`,
 * `.highcharts-crosshair-thin` or `.highcharts-xaxis-category` classes.
 */
@jsweet.lang.Interface
public abstract class AxisCrosshairOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A class name for the crosshair,
     * especially as a hook for styling.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the crosshair.
     * Defaults to `#cccccc` for numeric and datetime axes, and
     * `rgba(204,214,235,0.25)` for category axes, where the crosshair by
     * default highlights the whole category.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The dash style for the
     * crosshair. See plotOptions.series.dashStyle for possible values.
     */
    @jsweet.lang.Optional
    public Object dashStyle;
    /**
     * (Highstock) A label on the axis next to the crosshair.
     *
     * In styled mode, the label is styled with the
     * `.highcharts-crosshair-label` class.
     */
    @jsweet.lang.Optional
    public AxisCrosshairLabelOptions label;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether the crosshair should
     * snap to the point or follow the pointer independent of points.
     */
    @jsweet.lang.Optional
    public Boolean snap;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the
     * crosshair. Defaults to 1 for numeric or datetime axes, and for one
     * category width for category axes.
     */
    @jsweet.lang.Optional
    public double width;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the crosshair.
     * Higher Z indices allow drawing the crosshair on top of the series or
     * behind the grid lines.
     */
    @jsweet.lang.Optional
    public double zIndex;
}

