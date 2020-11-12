package def.highcharts;

import def.js.Array;

/**
 * (Highstock) Additional options for an annotation with the type.
 */
@jsweet.lang.Interface
public abstract class AnnotationsTunnelTypeOptions extends def.js.Object {
	/**
	 * (Highstock) Background options.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Object, AnnotationsTunnelTypeBackgroundOptions> background;
	/**
	 * (Highstock) The height of the annotation in terms of yAxis.
	 */
	@jsweet.lang.Optional
	public double height;
	/**
	 * (Highstock) Options for the control point which controls the annotation's height.
	 */
	@jsweet.lang.Optional
	public AnnotationsTunnelTypeHeightControlPointOptions heightControlPoint;
	/**
	 * (Highstock) Line options.
	 */
	@jsweet.lang.Optional
	public AnnotationsTunnelTypeLineOptions line;
	@jsweet.lang.Optional
	public Array<AnnotationsTunnelTypePointsOptions> points;
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
