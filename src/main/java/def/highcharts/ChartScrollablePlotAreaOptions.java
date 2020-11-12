package def.highcharts;
/**
 * (Highcharts, Gantt) Options for a scrollable plot area. This feature provides
 * a minimum size for the plot area of the chart. If the size gets smaller than
 * this, typically on mobile devices, a native browser scrollbar is presented.
 * This scrollbar provides smooth scrolling for the contents of the plot area,
 * whereas the title, legend and unaffected axes are fixed.
 *
 * Since v7.1.2, a scrollable plot area can be defined for either horizontal or
 * vertical scrolling, depending on whether the `minWidth` or `minHeight` option
 * is set.
 */
@jsweet.lang.Interface
public abstract class ChartScrollablePlotAreaOptions extends def.js.Object {
    /**
     * (Highcharts, Gantt) The minimum height for the plot area. If it gets
     * smaller than this, the plot area will become scrollable.
     */
    @jsweet.lang.Optional
    public double minHeight;
    /**
     * (Highcharts, Gantt) The minimum width for the plot area. If it gets
     * smaller than this, the plot area will become scrollable.
     */
    @jsweet.lang.Optional
    public double minWidth;
    /**
     * (Highcharts, Gantt) The opacity of mask applied on one of the sides of
     * the plot area.
     */
    @jsweet.lang.Optional
    public double opacity;
    /**
     * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
     * area. Ranges from 0 to 1, where 0 aligns the plot area to the left and 1
     * aligns it to the right. Typically we would use 1 if the chart has right
     * aligned Y axes.
     */
    @jsweet.lang.Optional
    public double scrollPositionX;
    /**
     * (Highcharts, Gantt) The initial scrolling position of the scrollable plot
     * area. Ranges from 0 to 1, where 0 aligns the plot area to the top and 1
     * aligns it to the bottom.
     */
    @jsweet.lang.Optional
    public double scrollPositionY;
}

