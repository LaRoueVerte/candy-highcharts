package def.highcharts;

import def.js.Array;
import jsweet.util.union.Union3;

/**
 * (Highcharts) A `solidgauge` series. If the type option is not specified, it is inherited from chart.type.
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * 1. Options for all series in a chart are defined in the plotOptions.series object.
 *
 * 2. Options for all `solidgauge` series are defined in plotOptions.solidgauge.
 *
 * 3. Options for one single series are given in the series instance array. (see online documentation for example)
 *
 * You have to extend the `SeriesSolidgaugeOptions` via an interface to allow custom properties: ``` declare interface SeriesSolidgaugeOptions { customProperty:
 * string; }
 *
 */
@jsweet.lang.Interface
@jsweet.lang.Extends({ SeriesOptions.class })
public abstract class SeriesSolidgaugeOptions extends PlotSolidgaugeOptions {
	/**
	 * (Highcharts) An array of data points for the series. For the `solidgauge` series type, points can be given in the following ways:
	 *
	 * 1. An array of numerical values. In this case, the numerical values will be interpreted as `y` options. Example: (see online documentation for example)
	 *
	 * 2. An array of objects with named values. The following snippet shows only a few settings, see the complete options set below. If the total number of
	 * data points exceeds the series' turboThreshold, this option is not available. (see online documentation for example)
	 *
	 * The typical gauge only contains a single data value.
	 */
	@jsweet.lang.Optional
	public Array<Union3<Double, Object, PointOptionsObject>> data;
	/**
	 * Not available
	 */
	@jsweet.lang.Optional
	public Object dataParser;
	/**
	 * Not available
	 */
	@jsweet.lang.Optional
	public Object dataURL;
	/**
	 * Not available
	 */
	@jsweet.lang.Optional
	public Object dial;
	/**
	 * Not available
	 */
	@jsweet.lang.Optional
	public Object pivot;
	/**
	 * Not available
	 */
	@jsweet.lang.Optional
	public Object stack;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) This property is only in TypeScript non-optional and might be `undefined` in series objects from unknown
	 * sources.
	 */
	public def.highcharts.StringTypes.solidgauge type;
	/**
	 * Not available
	 */
	@jsweet.lang.Optional
	public Object wrap;
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
	 * (Highcharts, Highstock) When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either
	 * the axis id or the index of the axis in the xAxis array, with 0 being the first.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Double, String> xAxis;
	/**
	 * (Highcharts, Highstock) When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either
	 * the axis id or the index of the axis in the yAxis array, with 0 being the first.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Double, String> yAxis;
	/**
	 * (Highcharts, Highstock) Define the visual z index of the series.
	 */
	@jsweet.lang.Optional
	public double zIndex;
}
