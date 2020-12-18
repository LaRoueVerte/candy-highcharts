package def.highcharts;
import def.dom.SVGElement;
import def.js.Array;
/**
 * The overview of the chart's series. The legend object is instanciated
 * internally in the chart constructor, and is available from the `chart.legend`
 * property. Each chart has only one legend.
 */
public class Legend extends def.js.Object {
    /**
     * The overview of the chart's series. The legend object is instanciated
     * internally in the chart constructor, and is available from the
     * `chart.legend` property. Each chart has only one legend.
     *
     * @param chart
     *        The chart instance.
     *
     * @param options
     *        Legend options.
     */
    public Legend(Chart chart, LegendOptions options){}
    /**
     * All items for the legend, which is an array of series for most series and
     * an array of points for pie series and its derivatives.
     */
    public final Array<jsweet.util.union.Union<Point,Series>> allItems=null;
    /**
     * SVG element of the legend box.
     */
	public final SVGElement box = null;
    /**
     * Chart of this legend.
     */
    public final Chart chart=null;
    /**
     * SVG group of the legend.
     */
	public final SVGElement group = null;
    /**
     * Legend options.
     */
    public final LegendOptions options=null;
    /**
     * SVG element of the legend title.
     */
	public final SVGElement title = null;
    /**
     * Set the legend item text.
     *
     * @param item
     *        The item for which to update the text in the legend.
     */
    native public void setText(Point item);
    /**
     * Update the legend with new options. Equivalent to running `chart.update`
     * with a legend configuration option.
     *
     * @param options
     *        Legend options.
     *
     * @param redraw
     *        Whether to redraw the chart after the axis is altered. If doing
     *        more operations on the chart, it is a good idea to set redraw to
     *        false and call Chart#redraw after. Whether to redraw the chart.
     *
     * @fires Highcharts.Legends#afterUpdate
     */
    native public void update(LegendOptions options, Boolean redraw);
    /**
     * Update the legend with new options. Equivalent to running `chart.update`
     * with a legend configuration option.
     *
     * @param options
     *        Legend options.
     *
     * @param redraw
     *        Whether to redraw the chart after the axis is altered. If doing
     *        more operations on the chart, it is a good idea to set redraw to
     *        false and call Chart#redraw after. Whether to redraw the chart.
     *
     * @fires Highcharts.Legends#afterUpdate
     */
    native public void update(LegendOptions options);
    /**
     * Set the legend item text.
     *
     * @param item
     *        The item for which to update the text in the legend.
     */
    native public void setText(Series item);
    protected Legend(){}
}

