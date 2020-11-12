package def.highcharts;

import def.js.Array;
import jsweet.util.union.Union3;

/**
 * (Highcharts) A `networkgraph` series. If the type option is not specified, it is inherited from chart.type.
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * 1. Options for all series in a chart are defined in the plotOptions.series object.
 *
 * 2. Options for all `networkgraph` series are defined in plotOptions.networkgraph.
 *
 * 3. Options for one single series are given in the series instance array. (see online documentation for example)
 *
 * You have to extend the `SeriesNetworkgraphOptions` via an interface to allow custom properties: ``` declare interface SeriesNetworkgraphOptions {
 * customProperty: string; }
 *
 */
@jsweet.lang.Interface
@jsweet.lang.Extends({ SeriesOptions.class })
public abstract class SeriesNetworkgraphOptions extends PlotNetworkgraphOptions {
	/**
	 * (Highcharts) An array of data points for the series. For the `networkgraph` series type, points can be given in the following way:
	 *
	 * An array of objects with named values. The following snippet shows only a few settings, see the complete options set below. If the total number of data
	 * points exceeds the series' turboThreshold, this option is not available. (see online documentation for example)
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<PointOptionsObject, Array<Union3<Object, Object[], Double>>> data;
	/**
	 * (Highcharts) A collection of options for the individual nodes. The nodes in a networkgraph diagram are auto-generated instances of `Highcharts.Point`,
	 * but options can be applied here and linked by the `id`.
	 */
	@jsweet.lang.Optional
	public Array<SeriesNetworkgraphNodesOptions> nodes;
	/**
	 * Not available
	 */
	@jsweet.lang.Optional
	public Object stack;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) This property is only in TypeScript non-optional and might be `undefined` in series objects from unknown
	 * sources.
	 */
	public def.highcharts.StringTypes.networkgraph type;
	/**
	 * Not available
	 */
	@jsweet.lang.Optional
	public Object xAxis;
	/**
	 * Not available
	 */
	@jsweet.lang.Optional
	public Object yAxis;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can be used after render time to get a pointer to the series object through
	 * `chart.get()`.
	 */
	@jsweet.lang.Optional
	public String id;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the chart, affecting the internal index in the `chart.series` array, the visible Z
	 * index as well as the order in the legend.
	 */
	@jsweet.lang.Optional
	public double index;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the series in the legend.
	 */
	@jsweet.lang.Optional
	public double legendIndex;
	/**
	 * (Highmaps) A map data object containing a `path` definition and optionally additional properties to join in the data as per the `joinBy` option.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Array<SeriesMapDataOptions>, ?> mapData;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown in the legend, tooltip etc.
	 */
	@jsweet.lang.Optional
	public String name;
	/**
	 * (Highcharts, Highstock) Define the visual z index of the series.
	 */
	@jsweet.lang.Optional
	public double zIndex;
}
