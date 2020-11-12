package def.highcharts;

import def.highcharts.Axis.AxisLabelsFormatterContextObjectDouble;
import def.highcharts.Axis.AxisLabelsFormatterContextObjectString;
import def.js.Array;
import jsweet.util.union.Union3;

/**
 * (Highstock, Gantt) The axis labels show the number or category for each tick.
 *
 * Since v8.0.0: Labels are animated in categorized x-axis with updating data if `tickInterval` and `step` is set to 1.
 */
@jsweet.lang.Interface
public abstract class NavigatorYAxisLabelsOptions extends def.js.Object {
	/**
	 * (Highstock, Gantt) What part of the string the given position is anchored to. Can be one of `"left"`, `"center"` or `"right"`. The exact position also
	 * depends on the `labels.x` setting.
	 *
	 * Angular gauges and solid gauges defaults to `"center"`. Solid gauges with two labels have additional option `"auto"` for automatic horizontal and
	 * vertical alignment.
	 */
	@jsweet.lang.Optional
	public Union3<def.highcharts.StringTypes.center, def.highcharts.StringTypes.left, def.highcharts.StringTypes.right> align;
	/**
	 * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels. If there is enough space, labels
	 * are not rotated. As the chart gets narrower, it will start rotating the labels -45 degrees, then remove every second label and try again with rotations 0
	 * and -45 etc. Set it to `false` to disable rotation, which will cause the labels to word-wrap if possible.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Boolean, Array<Double>> autoRotation;
	/**
	 * (Highcharts, Gantt) When each category width is more than this many pixels, we don't apply auto rotation. Instead, we lay out the axis label with word
	 * wrap. A lower limit makes sense when the label contains multiple short words that don't extend the available horizontal space for each label.
	 */
	@jsweet.lang.Optional
	public double autoRotationLimit;
	/**
	 * (Highcharts) Angular gauges and solid gauges only. The label's pixel distance from the perimeter of the plot area.
	 *
	 * Since v7.1.2: If it's a percentage string, it is interpreted the same as series.radius, so label can be aligned under the gauge's shape.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Double, String> distance;
	/**
	 * (Highstock, Gantt) Enable or disable the axis labels.
	 */
	@jsweet.lang.Optional
	public Boolean enabled;
	/**
	 * (Highstock, Gantt) A format string for the axis label.
	 */
	@jsweet.lang.Optional
	public String format;
	/**
	 * (Highstock, Gantt) Callback JavaScript function to format the label. The value is given by `this.value`. Additional properties for `this` are `axis`,
	 * `chart`, `isFirst` and `isLast`. The value of the default label formatter can be retrieved by calling `this.axis.defaultLabelFormatter.call(this)` within
	 * the function.
	 *
	 * Defaults to: (see online documentation for example)
	 */
	@jsweet.lang.Optional
	public java.util.function.BiFunction<AxisLabelsFormatterContextObjectDouble, AxisLabelsFormatterContextObjectString, String> formatter;
	/**
	 * (Gantt) The number of pixels to indent the labels per level in a treegrid axis.
	 */
	@jsweet.lang.Optional
	public double indentation;
	/**
	 * (Gantt) Set options on specific levels in a tree grid axis. Takes precedence over labels options.
	 */
	@jsweet.lang.Optional
	public Array<NavigatorYAxisLabelsLevelsOptions> levels;
	/**
	 * (Highstock, Gantt) How to handle overflowing labels on horizontal axis. If set to `"allow"`, it will not be aligned at all. By default it `"justify"`
	 * labels inside the chart area. If there is room to move it, it will be aligned to the edge, else it will be removed.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<def.highcharts.StringTypes.allow, def.highcharts.StringTypes.justify> overflow;
	/**
	 * (Highcharts, Gantt) The pixel padding for axis labels, to ensure white space between them.
	 */
	@jsweet.lang.Optional
	public double padding;
	/**
	 * (Highcharts) Defines how the labels are be repositioned according to the 3D chart orientation.
	 *
	 * - `'offset'`: Maintain a fixed horizontal/vertical distance from the tick marks, despite the chart orientation. This is the backwards compatible
	 * behavior, and causes skewing of X and Z axes.
	 *
	 * - `'chart'`: Preserve 3D position relative to the chart. This looks nice, but hard to read if the text isn't forward-facing.
	 *
	 * - `'flap'`: Rotated text along the axis to compensate for the chart orientation. This tries to maintain text as legible as possible on all orientations.
	 *
	 * - `'ortho'`: Rotated text along the axis direction so that the labels are orthogonal to the axis. This is very similar to `'flap'`, but prevents skewing
	 * the labels (X and Y scaling are still present).
	 */
	@jsweet.lang.Optional
	public Object position3d;
	/**
	 * (Highcharts, Gantt) Whether to reserve space for the labels. By default, space is reserved for the labels in these cases:
	 *
	 * * On all horizontal axes.
	 *
	 * * On vertical axes if `label.align` is `right` on a left-side axis or `left` on a right-side axis.
	 *
	 * * On vertical axes if `label.align` is `center`.
	 *
	 * This can be turned off when for example the labels are rendered inside the plot area instead of outside.
	 */
	@jsweet.lang.Optional
	public Boolean reserveSpace;
	/**
	 * (Highstock, Gantt) Rotation of the labels in degrees.
	 */
	@jsweet.lang.Optional
	public double rotation;
	/**
	 * (Highcharts) If enabled, the axis labels will skewed to follow the perspective.
	 *
	 * This will fix overlapping labels and titles, but texts become less legible due to the distortion.
	 *
	 * The final appearance depends heavily on `labels.position3d`.
	 */
	@jsweet.lang.Optional
	public Boolean skew3d;
	/**
	 * (Highstock, Gantt) Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.
	 */
	@jsweet.lang.Optional
	public double staggerLines;
	/**
	 * (Highstock, Gantt) To show only every _n_'th label on the axis, set the step to _n_. Setting the step to 2 shows every other label.
	 *
	 * By default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1\. This usually only happens on a category axis, and is
	 * often a sign that you have chosen the wrong axis type.
	 *
	 * Read more at Axis docs => What axis should I use?
	 */
	@jsweet.lang.Optional
	public double step;
	/**
	 * (Highstock, Gantt) CSS styles for the label. Use `whiteSpace: 'nowrap'` to prevent wrapping of category labels. Use `textOverflow: 'none'` to prevent
	 * ellipsis (dots).
	 *
	 * In styled mode, the labels are styled with the `.highcharts-axis-labels` class.
	 */
	@jsweet.lang.Optional
	public CSSObject style;
	/**
	 * (Gantt) The symbol for the collapse and expand icon in a treegrid.
	 */
	@jsweet.lang.Optional
	public NavigatorYAxisLabelsSymbolOptions symbol;
	/**
	 * (Highstock, Gantt) Whether to use HTML to render the labels.
	 */
	@jsweet.lang.Optional
	public Boolean useHTML;
	/**
	 * (Highstock, Gantt) The x position offset of all labels relative to the tick positions on the axis. Defaults to -15 for left axis, 15 for right axis.
	 */
	@jsweet.lang.Optional
	public double x;
	/**
	 * (Highstock, Gantt) The y position offset of all labels relative to the tick positions on the axis. For polar and radial axis consider the use of the
	 * distance option.
	 */
	@jsweet.lang.Optional
	public double y;
	/**
	 * (Highstock, Gantt) The Z index for the axis labels.
	 */
	@jsweet.lang.Optional
	public double zIndex;
}
