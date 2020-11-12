package def.highcharts;

import def.js.Array;
import jsweet.lang.Interface;
import jsweet.util.union.Union3;

/**
 * The Point object. The point objects are generated from the `series.data` configuration objects or raw numbers. They can be accessed from the `Series.points`
 * array. Other ways to instantiate points are through Highcharts.Series#addPoint or Highcharts.Series#setData.
 */
@Interface
public class Point extends def.js.Object {
	/**
	 * For categorized axes this property holds the category name for the point. For other axes it holds the X value.
	 */
	@jsweet.lang.Optional
	public String category;
	/**
	 * The point's current color.
	 */
	@jsweet.lang.Optional
	public Union3<String, GradientColorObject, PatternObject> color;
	/**
	 * The point's current color index, used in styled mode instead of `color`. The color index is inserted in class names used for styling.
	 */
	@jsweet.lang.Optional
	public double colorIndex;
	/**
	 * (Highstock) Highstock only. If a point object is created by data grouping, it doesn't reflect actual points in the raw data. In this case, the
	 * `dataGroup` property holds information that points back to the raw data.
	 *
	 * - `dataGroup.start` is the index of the first raw data point in the group.
	 *
	 * - `dataGroup.length` is the amount of points in the group.
	 */
	@jsweet.lang.Optional
	public DataGroupingInfoObject dataGroup;
	/**
	 * Contains the point's index in the `Series.points` array.
	 */
	@jsweet.lang.Optional
	public final double index = 0;
	/**
	 * The name of the point. The name can be given as the first position of the point configuration array, or as a `name` property in the configuration:
	 */
	@jsweet.lang.Optional
	public String name;
	/**
	 * The point's options as applied in the initial configuration, or extended through `Point.update`.
	 *
	 * In TypeScript you have to extend `PointOptionsObject` via an additional interface to allow custom data options: (see online documentation for example)
	 */
	@jsweet.lang.Optional
	public PointOptionsObject options;
	/**
	 * The percentage for points in a stacked series or pies.
	 */
	@jsweet.lang.Optional
	public double percentage;
	/**
	 * Whether the point is selected or not.
	 */
	@jsweet.lang.Optional
	public Boolean selected;
	/**
	 * The series object associated with the point.
	 */
	@jsweet.lang.Optional
	public Series series;
	/**
	 * Pie series only. Whether to display a slice offset from the center.
	 */
	@jsweet.lang.Optional
	public Boolean sliced;
	/**
	 * The total of values in either a stack for stacked series, or a pie in a pie series.
	 */
	@jsweet.lang.Optional
	public double total;
	/**
	 * For certain series types, like pie charts, where individual points can be shown or hidden.
	 */
	@jsweet.lang.Optional
	public Boolean visible;
	/**
	 * The x value of the point.
	 */
	@jsweet.lang.Optional
	public double x;
	/**
	 * The y value of the point.
	 */
	@jsweet.lang.Optional
	public double y;

	/**
	 * Get the CSS class names for individual points. Used internally where the returned value is set on every point.
	 *
	 * @return The class names.
	 */
	native public String getClassName();

	/**
	 * Return the configuration hash needed for the data label and tooltip formatters.
	 *
	 * @return Abstract object used in formatters and formats.
	 */
	native public PointLabelObject getLabelConfig();

	/**
	 * In a series with `zones`, return the zone that the point belongs to.
	 *
	 * @return The zone item.
	 */
	native public SeriesZonesOptionsObject getZone();

	/**
	 * Get the path definition for the halo, which is usually a shadow-like circle around the currently hovered point.
	 *
	 * @param size The radius of the circular halo.
	 *
	 * @return The path definition.
	 */
	native public Array<?> haloPath(double size);

	/**
	 * Initialize the point. Called internally based on the `series.data` option.
	 *
	 * @param series The series object containing this point.
	 *
	 * @param options The data in either number, array or object format.
	 *
	 * @param x Optionally, the X value of the point.
	 *
	 * @return The Point instance.
	 *
	 * @fires Highcharts.Point#afterInit
	 */
	native public Point init(Series series, Object options, double x);

	/**
	 * Runs on mouse out from the point. Called internally from mouse and touch events.
	 *
	 * @fires Highcharts.Point#mouseOut
	 */
	native public void onMouseOut();

	/**
	 * Runs on mouse over the point. Called internally from mouse and touch events.
	 *
	 * @param e The event arguments.
	 */
	native public void onMouseOver(PointerEventObject e);

	/**
	 * Transform number or array configs into objects. Also called for object configs. Used internally to unify the different configuration formats for points.
	 * For example, a simple number `10` in a line series will be transformed to `{ y: 10 }`, and an array config like `[1, 10]` in a scatter series will be
	 * transformed to `{ x: 1, y: 10 }`.
	 *
	 * @param options The input option.
	 *
	 * @return Transformed options.
	 */
	native public Dictionary<?> optionsToObject(Object options);

	/**
	 * Remove a point and optionally redraw the series and if necessary the axes
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call. When doing more operations on the chart, for example running `point.remove()` in
	 *            a loop, it is best practice to set `redraw` to false and call `chart.redraw()` after.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 */
	native public void remove(Boolean redraw, Boolean animation);

	/**
	 * Toggle the selection status of a point.
	 *
	 * @param selected When `true`, the point is selected. When `false`, the point is unselected. When `null` or `undefined`, the selection state is toggled.
	 *
	 * @param accumulate When `true`, the selection is added to other selected points. When `false`, other selected points are deselected. Internally in
	 *            Highcharts, when allowPointSelect is `true`, selected points are accumulated on Control, Shift or Cmd clicking the point.
	 *
	 * @fires Highcharts.Point#select
	 * @fires Highcharts.Point#unselect
	 */
	native public void select(Boolean selected, Boolean accumulate);

	/**
	 * Set a value in an object, on the property defined by key. The key supports nested properties using dot notation. The function modifies the input object
	 * and does not make a copy.
	 *
	 * @param object The object to set the value on.
	 *
	 * @param value The value to set.
	 *
	 * @param key Key to the property to set.
	 *
	 * @return The modified object.
	 */
	native public <T> T setNestedProperty(T object, Object value, String key);

	/**
	 * Set the point's state.
	 *
	 * @param state The new state, can be one of `'hover'`, `'select'`, `'inactive'`, or `''` (an empty string), `'normal'` or `undefined` to set to normal
	 *            state.
	 *
	 * @param move State for animation.
	 *
	 * @fires Highcharts.Point#afterSetState
	 */
	native public void setState(Object state, Boolean move);

	/**
	 * Extendable method for formatting each point's tooltip line.
	 *
	 * @param pointFormat The point format.
	 *
	 * @return A string to be concatenated in to the common tooltip text.
	 */
	native public String tooltipFormatter(String pointFormat);

	/**
	 * Update point with new options (typically x/y data) and optionally redraw the series.
	 *
	 * @param options The point options. Point options are handled as described under the `series.type.data` item for each series type. For example for a line
	 *            series, if options is a single number, the point will be given that number as the marin y value. If it is an array, it will be interpreted as
	 *            x and y values respectively. If it is an object, advanced options are applied.
	 *
	 * @param redraw Whether to redraw the chart after the point is updated. If doing more operations on the chart, it is best practice to set `redraw` to false
	 *            and call `chart.redraw()` after.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @fires Highcharts.Point#update
	 */
	native public void update(Object options, Boolean redraw, Boolean animation);

	/**
	 * Initialize the point. Called internally based on the `series.data` option.
	 *
	 * @param series The series object containing this point.
	 *
	 * @param options The data in either number, array or object format.
	 *
	 * @param x Optionally, the X value of the point.
	 *
	 * @return The Point instance.
	 *
	 * @fires Highcharts.Point#afterInit
	 */
	native public Point init(Series series, Object options);

	/**
	 * Runs on mouse over the point. Called internally from mouse and touch events.
	 *
	 * @param e The event arguments.
	 */
	native public void onMouseOver();

	/**
	 * Remove a point and optionally redraw the series and if necessary the axes
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call. When doing more operations on the chart, for example running `point.remove()` in
	 *            a loop, it is best practice to set `redraw` to false and call `chart.redraw()` after.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 */
	native public void remove(Boolean redraw);

	/**
	 * Remove a point and optionally redraw the series and if necessary the axes
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call. When doing more operations on the chart, for example running `point.remove()` in
	 *            a loop, it is best practice to set `redraw` to false and call `chart.redraw()` after.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 */
	native public void remove();

	/**
	 * Toggle the selection status of a point.
	 *
	 * @param selected When `true`, the point is selected. When `false`, the point is unselected. When `null` or `undefined`, the selection state is toggled.
	 *
	 * @param accumulate When `true`, the selection is added to other selected points. When `false`, other selected points are deselected. Internally in
	 *            Highcharts, when allowPointSelect is `true`, selected points are accumulated on Control, Shift or Cmd clicking the point.
	 *
	 * @fires Highcharts.Point#select
	 * @fires Highcharts.Point#unselect
	 */
	native public void select(Boolean selected);

	/**
	 * Toggle the selection status of a point.
	 *
	 * @param selected When `true`, the point is selected. When `false`, the point is unselected. When `null` or `undefined`, the selection state is toggled.
	 *
	 * @param accumulate When `true`, the selection is added to other selected points. When `false`, other selected points are deselected. Internally in
	 *            Highcharts, when allowPointSelect is `true`, selected points are accumulated on Control, Shift or Cmd clicking the point.
	 *
	 * @fires Highcharts.Point#select
	 * @fires Highcharts.Point#unselect
	 */
	native public void select();

	/**
	 * Set the point's state.
	 *
	 * @param state The new state, can be one of `'hover'`, `'select'`, `'inactive'`, or `''` (an empty string), `'normal'` or `undefined` to set to normal
	 *            state.
	 *
	 * @param move State for animation.
	 *
	 * @fires Highcharts.Point#afterSetState
	 */
	native public void setState(Object state);

	/**
	 * Set the point's state.
	 *
	 * @param state The new state, can be one of `'hover'`, `'select'`, `'inactive'`, or `''` (an empty string), `'normal'` or `undefined` to set to normal
	 *            state.
	 *
	 * @param move State for animation.
	 *
	 * @fires Highcharts.Point#afterSetState
	 */
	native public void setState();

	/**
	 * Update point with new options (typically x/y data) and optionally redraw the series.
	 *
	 * @param options The point options. Point options are handled as described under the `series.type.data` item for each series type. For example for a line
	 *            series, if options is a single number, the point will be given that number as the marin y value. If it is an array, it will be interpreted as
	 *            x and y values respectively. If it is an object, advanced options are applied.
	 *
	 * @param redraw Whether to redraw the chart after the point is updated. If doing more operations on the chart, it is best practice to set `redraw` to false
	 *            and call `chart.redraw()` after.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @fires Highcharts.Point#update
	 */
	native public void update(Object options, Boolean redraw);

	/**
	 * Update point with new options (typically x/y data) and optionally redraw the series.
	 *
	 * @param options The point options. Point options are handled as described under the `series.type.data` item for each series type. For example for a line
	 *            series, if options is a single number, the point will be given that number as the marin y value. If it is an array, it will be interpreted as
	 *            x and y values respectively. If it is an object, advanced options are applied.
	 *
	 * @param redraw Whether to redraw the chart after the point is updated. If doing more operations on the chart, it is best practice to set `redraw` to false
	 *            and call `chart.redraw()` after.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @fires Highcharts.Point#update
	 */
	native public void update(Object options);

	/**
	 * Remove a point and optionally redraw the series and if necessary the axes
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call. When doing more operations on the chart, for example running `point.remove()` in
	 *            a loop, it is best practice to set `redraw` to false and call `chart.redraw()` after.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 */
	native public void remove(Boolean redraw, Partial2<AnimationOptionsObject> animation);

	/**
	 * Update point with new options (typically x/y data) and optionally redraw the series.
	 *
	 * @param options The point options. Point options are handled as described under the `series.type.data` item for each series type. For example for a line
	 *            series, if options is a single number, the point will be given that number as the marin y value. If it is an array, it will be interpreted as
	 *            x and y values respectively. If it is an object, advanced options are applied.
	 *
	 * @param redraw Whether to redraw the chart after the point is updated. If doing more operations on the chart, it is best practice to set `redraw` to false
	 *            and call `chart.redraw()` after.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @fires Highcharts.Point#update
	 */
	native public void update(Object options, Boolean redraw, Partial2<AnimationOptionsObject> animation);
}
