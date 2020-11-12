package def.highcharts;

import def.js.Array;

/**
 * (Highstock) Additional options for an annotation with the type.
 */
@jsweet.lang.Interface
public abstract class AnnotationsFibonacciTypeOptions extends def.js.Object {
	/**
	 * (Highstock) An array of background colors: Default to: (see online documentation for example)
	 */
	// @jsweet.lang.Optional
	// public Object backgroundColors;
	/**
	 * (Highstock) The height of the fibonacci in terms of yAxis.
	 */
	@jsweet.lang.Optional
	public double height;
	/**
	 * (Highstock) An array with options for the labels.
	 */
	@jsweet.lang.Optional
	public Array<AnnotationsFibonacciTypeLabelsOptions> labels;
	/**
	 * (Highstock) Line options.
	 */
	@jsweet.lang.Optional
	public AnnotationsFibonacciTypeLineOptions line;
	/**
	 * (Highstock) The color of line.
	 */
	@jsweet.lang.Optional
	public String lineColor;
	/**
	 * (Highstock) An array of colors for the lines.
	 */
	// @jsweet.lang.Optional
	// public Object lineColors;
	@jsweet.lang.Optional
	public Array<AnnotationsFibonacciTypePointsOptions> points;
	/**
	 * (Highstock) This number defines which xAxis the point is connected to. It refers to either the axis id or the index of the axis in the xAxis array.
	 */
	@jsweet.lang.Optional
	public double xAxis;
	/**
	 * (Highstock) This number defines which yAxis the point is connected to. It refers to either the axis id or the index of the axis in the xAxis array.
	 */
	@jsweet.lang.Optional
	public double yAxis;
}
