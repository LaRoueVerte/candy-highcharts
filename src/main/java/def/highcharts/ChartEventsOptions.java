package def.highcharts;
import def.dom.Event;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Event listeners for the chart.
 */
@jsweet.lang.Interface
public abstract class ChartEventsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires when a series is added to
     * the chart after load time, using the `addSeries` method. One parameter,
     * `event`, is passed to the function, containing common event information.
     * Through `event.options` you can access the series options that were
     * passed to the `addSeries` method. Returning false prevents the series
     * from being added.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Chart,ChartAddSeriesEventObject> addSeries;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires after a chart is printed
     * through the context menu item or the `Chart.print` method.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Chart,Event> afterPrint;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires before a chart is printed
     * through the context menu item or the `Chart.print` method.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Chart,Event> beforePrint;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires when clicking on the plot
     * background. One parameter, `event`, is passed to the function, containing
     * common event information.
     *
     * Information on the clicked spot can be found through `event.xAxis` and
     * `event.yAxis`, which are arrays containing the axes of each dimension and
     * each axis' value at the clicked spot. The primary axes are
     * `event.xAxis[0]` and `event.yAxis[0]`. Remember the unit of a datetime
     * axis is milliseconds since 1970-01-01 00:00:00. (see online documentation
     * for example)
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Chart,PointerEventObject> click;
    /**
     * (Highcharts, Highmaps) Fires when a drilldown point is clicked, before
     * the new series is added. This event is also utilized for async drilldown,
     * where the seriesOptions are not added by option, but rather loaded async.
     * Note that when clicking a category label to trigger multiple series
     * drilldown, one `drilldown` event is triggered per point in the category.
     *
     * Event arguments:
     *
     * - `category`: If a category label was clicked, which index.
     *
     * - `originalEvent`: The original browser event (usually click) that
     * triggered the drilldown.
     *
     * - `point`: The originating point.
     *
     * - `points`: If a category label was clicked, this array holds all points
     * corresponding to the category.
     *
     * - `seriesOptions`: Options for the new series.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Chart,DrilldownEventObject> drilldown;
    /**
     * (Highcharts, Highmaps) Fires when drilling up from a drilldown series.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Chart,DrillupEventObject> drillup;
    /**
     * (Highcharts, Highmaps) In a chart with multiple drilldown series, this
     * event fires after all the series have been drilled up.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Chart,DrillupAllEventObject> drillupall;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback that fires while
     * exporting data. This allows the modification of data rows before
     * processed into the final format.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Chart,ExportDataEventObject> exportData;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is finished
     * loading. Since v4.2.2, it also waits for images to be loaded, for example
     * from point markers. One parameter, `event`, is passed to the function,
     * containing common event information.
     *
     * There is also a second parameter to the chart constructor where a
     * callback function can be passed to be executed on chart.load.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Chart,Event> load;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is redrawn,
     * either after a call to `chart.redraw()` or after an axis, series or point
     * is modified with the `redraw` option set to `true`. One parameter,
     * `event`, is passed to the function, containing common event information.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Chart,Event> redraw;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires after initial load of the
     * chart (directly after the `load` event), and after each redraw (directly
     * after the `redraw` event).
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Chart,Event> render;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Fires when an area of the chart
     * has been selected. Selection is enabled by setting the chart's zoomType.
     * One parameter, `event`, is passed to the function, containing common
     * event information. The default action for the selection event is to zoom
     * the chart to the selected area. It can be prevented by calling
     * `event.preventDefault()` or return false.
     *
     * Information on the selected area can be found through `event.xAxis` and
     * `event.yAxis`, which are arrays containing the axes of each dimension and
     * each axis' min and max values. The primary axes are `event.xAxis[0]` and
     * `event.yAxis[0]`. Remember the unit of a datetime axis is milliseconds
     * since 1970-01-01 00:00:00. (see online documentation for example)
     */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<Chart,ChartSelectionContextObject,jsweet.util.union.Union<Boolean,Object>> selection;
}

