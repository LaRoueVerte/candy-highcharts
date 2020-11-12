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
public abstract class NavigatorXAxisPlotBandsOptions extends def.js.Object {
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
    public NavigatorXAxisPlotBandsEventsOptions events;
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
     * (Highcharts, Highstock, Gantt) Text labels for the plot bands
     */
    @jsweet.lang.Optional
    public NavigatorXAxisPlotBandsLabelOptions label;
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

