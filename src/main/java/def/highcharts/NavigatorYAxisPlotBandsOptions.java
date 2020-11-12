package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Gantt) An array of colored bands stretching across
 * the plot area marking an interval on the axis.
 *
 * In styled mode, the plot bands are styled by the `.highcharts-plot-band`
 * class in addition to the `className` option.
 */
@jsweet.lang.Interface
public abstract class NavigatorYAxisPlotBandsOptions extends def.js.Object {
    /**
     * (Highstock) Flag to decide if plotBand should be rendered across all
     * panes.
     */
    @jsweet.lang.Optional
    public Boolean acrossPanes;
    /**
     * (Highcharts, Highstock, Gantt) Border color for the plot band. Also
     * requires `borderWidth` to be set.
     */
    @jsweet.lang.Optional
    public String borderColor;
    /**
     * (Highcharts, Highstock, Gantt) Border width for the plot band. Also
     * requires `borderColor` to be set.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
     * default `highcharts-plot-band`, to apply to each individual band.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock, Gantt) The color of the plot band.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Highstock, Gantt) An object defining mouse events for the
     * plot band. Supported properties are `click`, `mouseover`, `mouseout`,
     * `mousemove`.
     */
    @jsweet.lang.Optional
    public NavigatorYAxisPlotBandsEventsOptions events;
    /**
     * (Highcharts, Highstock, Gantt) The start position of the plot band in
     * axis units.
     */
    @jsweet.lang.Optional
    public double from;
    /**
     * (Highcharts, Highstock, Gantt) An id used for identifying the plot band
     * in Axis.removePlotBand.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highcharts) In a gauge chart, this option determines the inner radius of
     * the plot band that stretches along the perimeter. It can be given as a
     * percentage string, like `"100%"`, or as a pixel number, like `100`. By
     * default, the inner radius is controlled by the thickness option.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> innerRadius;
    /**
     * (Highcharts, Highstock, Gantt) Text labels for the plot bands
     */
    @jsweet.lang.Optional
    public NavigatorYAxisPlotBandsLabelOptions label;
    /**
     * (Highcharts) In a gauge chart, this option determines the outer radius of
     * the plot band that stretches along the perimeter. It can be given as a
     * percentage string, like `"100%"`, or as a pixel number, like `100`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> outerRadius;
    /**
     * (Highcharts) In a gauge chart, this option sets the width of the plot
     * band stretching along the perimeter. It can be given as a percentage
     * string, like `"10%"`, or as a pixel number, like `10`. The default value
     * 10 is the same as the default tickLength, thus making the plot band act
     * as a background for the tick markers.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> thickness;
    /**
     * (Highcharts, Highstock, Gantt) The end position of the plot band in axis
     * units.
     */
    @jsweet.lang.Optional
    public double to;
    /**
     * (Highcharts, Highstock, Gantt) The z index of the plot band within the
     * chart, relative to other elements. Using the same z index as another
     * element may give unpredictable results, as the last rendered element will
     * be on top. Values from 0 to 20 make sense.
     */
    @jsweet.lang.Optional
    public double zIndex;
}

