package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highstock, Gantt) The navigator is a small series below the main series,
 * displaying a view of the entire data set. It provides tools to zoom in and
 * out on parts of the data as well as panning across the dataset.
 */
@jsweet.lang.Interface
public abstract class NavigatorOptions extends def.js.Object {
    /**
     * (Highstock, Gantt) Whether the navigator and scrollbar should adapt to
     * updated data in the base X axis. When loading data async, as in the demo
     * below, this should be `false`. Otherwise new data will trigger navigator
     * redraw, which will cause unwanted looping. In the demo below, the data in
     * the navigator is set only once. On navigating, only the main chart
     * content is updated.
     */
    @jsweet.lang.Optional
    public Boolean adaptToUpdatedData;
    /**
     * (Highstock, Gantt) Enable or disable the navigator.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock, Gantt) Options for the handles for dragging the zoomed area.
     */
    @jsweet.lang.Optional
    public NavigatorHandlesOptions handles;
    /**
     * (Highstock, Gantt) The height of the navigator.
     */
    @jsweet.lang.Optional
    public double height;
    /**
     * (Highstock, Gantt) The distance from the nearest element, the X axis or X
     * axis labels.
     */
    @jsweet.lang.Optional
    public double margin;
    /**
     * (Highstock, Gantt) The color of the mask covering the areas of the
     * navigator series that are currently not visible in the main series. The
     * default color is bluish with an opacity of 0.3 to see the series below.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> maskFill;
    /**
     * (Highstock, Gantt) Whether the mask should be inside the range marking
     * the zoomed range, or outside. In Highstock 1.x it was always `false`.
     */
    @jsweet.lang.Optional
    public Boolean maskInside;
    /**
     * (Highstock, Gantt) When the chart is inverted, whether to draw the
     * navigator on the opposite side.
     */
    @jsweet.lang.Optional
    public Boolean opposite;
    /**
     * (Highstock, Gantt) The color of the line marking the currently zoomed
     * area in the navigator.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> outlineColor;
    /**
     * (Highstock, Gantt) The width of the line marking the currently zoomed
     * area in the navigator.
     */
    @jsweet.lang.Optional
    public double outlineWidth;
    /**
     * (Highstock, Gantt) Options for the navigator series. Available options
     * are the same as any series, documented at plotOptions and series.
     *
     * Unless data is explicitly defined on navigator.series, the data is
     * borrowed from the first series in the chart.
     *
     * Default series options for the navigator series are: (see online
     * documentation for example)
     */
    @jsweet.lang.Optional
    public Object series;
    /**
     * (Highstock, Gantt) Options for the navigator X axis. Default series
     * options for the navigator xAxis are: (see online documentation for
     * example)
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<NavigatorXAxisOptions,Array<NavigatorXAxisOptions>> xAxis;
    /**
     * (Highstock, Gantt) Options for the navigator Y axis. Default series
     * options for the navigator yAxis are: (see online documentation for
     * example)
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<NavigatorYAxisOptions,Array<NavigatorYAxisOptions>> yAxis;
}

