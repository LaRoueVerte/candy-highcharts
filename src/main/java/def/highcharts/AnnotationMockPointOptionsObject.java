package def.highcharts;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) An array of points for the shape. This option is available for shapes which can use multiple points such as path. A
 * point can be either a point object or a point's id.
 */
@jsweet.lang.Interface
public abstract class AnnotationMockPointOptionsObject extends def.js.Object {
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The x position of the point. Units can be either in axis or chart pixel coordinates.
	 */
	@jsweet.lang.Optional
	public double x;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) This number defines which xAxis the point is connected to. It refers to either the axis id or the index of the
	 * axis in the xAxis array. If the option is not configured or the axis is not found the point's x coordinate refers to the chart pixels.
	 */
	// @jsweet.lang.Optional
	// public Union3<Double,String,Object> xAxis;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The y position of the point. Units can be either in axis or chart pixel coordinates.
	 */
	@jsweet.lang.Optional
	public double y;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) This number defines which yAxis the point is connected to. It refers to either the axis id or the index of the
	 * axis in the yAxis array. If the option is not configured or the axis is not found the point's y coordinate refers to the chart pixels.
	 */
	// @jsweet.lang.Optional
	// public Union3<Double,String,Object> yAxis;
}
