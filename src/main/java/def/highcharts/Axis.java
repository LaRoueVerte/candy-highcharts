package def.highcharts;

import def.js.Array;
import jsweet.util.union.Union3;

/**
 * Create a new axis object. Called internally when instanciating a new chart or adding axes by Highcharts.Chart#addAxis.
 *
 * A chart can have from 0 axes (pie chart) to multiples. In a normal, single series cartesian chart, there is one X axis and one Y axis.
 *
 * The X axis or axes are referenced by Highcharts.Chart.xAxis, which is an array of Axis objects. If there is only one axis, it can be referenced through
 * `chart.xAxis[0]`, and multiple axes have increasing indices. The same pattern goes for Y axes.
 *
 * If you need to get the axes from a series object, use the `series.xAxis` and `series.yAxis` properties. These are not arrays, as one series can only be
 * associated to one X and one Y axis.
 *
 * A third way to reference the axis programmatically is by `id`. Add an `id` in the axis configuration options, and get the axis by Highcharts.Chart#get.
 *
 * Configuration options for the axes are given in options.xAxis and options.yAxis.
 */
public class Axis extends def.js.Object {
	/**
	 * Create a new axis object. Called internally when instanciating a new chart or adding axes by Highcharts.Chart#addAxis.
	 *
	 * A chart can have from 0 axes (pie chart) to multiples. In a normal, single series cartesian chart, there is one X axis and one Y axis.
	 *
	 * The X axis or axes are referenced by Highcharts.Chart.xAxis, which is an array of Axis objects. If there is only one axis, it can be referenced through
	 * `chart.xAxis[0]`, and multiple axes have increasing indices. The same pattern goes for Y axes.
	 *
	 * If you need to get the axes from a series object, use the `series.xAxis` and `series.yAxis` properties. These are not arrays, as one series can only be
	 * associated to one X and one Y axis.
	 *
	 * A third way to reference the axis programmatically is by `id`. Add an `id` in the axis configuration options, and get the axis by Highcharts.Chart#get.
	 *
	 * Configuration options for the axes are given in options.xAxis and options.yAxis.
	 *
	 * @param chart The Chart instance to apply the axis on.
	 *
	 * @param userOptions Axis options.
	 */
	public Axis(Chart chart, XAxisOptions userOptions) {
	}

	/**
	 * If categories are present for the axis, names are used instead of numbers for that axis.
	 *
	 * Since Highcharts 3.0, categories can also be extracted by giving each point a name and setting axis type to `category`. However, if you have multiple
	 * series, best practice remains defining the `categories` array.
	 */
	public final Array<String> categories = null;
	/**
	 * The Chart that the axis belongs to.
	 */
	public Chart chart;
	/**
	 * The collection where the axis belongs, for example `xAxis`, `yAxis` or `colorAxis`. Corresponds to properties on Chart, for example Chart.xAxis.
	 */
	public String coll;
	/**
	 * The processed crosshair options.
	 */
	public jsweet.util.union.Union<Boolean, AxisCrosshairOptions> crosshair;
	/**
	 * Whether the axis is horizontal.
	 */
	@jsweet.lang.Optional
	public Boolean horiz;
	/**
	 * Whether the axis is the x-axis.
	 */
	@jsweet.lang.Optional
	public Boolean isXAxis;
	/**
	 * The maximum value of the axis. In a logarithmic axis, this is the logarithm of the real value, and the real value can be obtained from Axis#getExtremes.
	 */
	public jsweet.util.union.Union<Double,Object>max;
	/**
	 * The minimum value of the axis. In a logarithmic axis, this is the logarithm of the real value, and the real value can be obtained from Axis#getExtremes.
	 */
	public jsweet.util.union.Union<Double,Object>min;
	/**
	 * List of minor ticks mapped by position on the axis.
	 */
	public Dictionary<Tick> minorTicks;
	/**
	 * Current options for the axis after merge of defaults and user's options.
	 */
	public Union3<XAxisOptions, YAxisOptions, ZAxisOptions> options;
	/**
	 * Whether the axis is reversed. Based on the `axis.reversed`, option, but inverted charts have reversed xAxis by default.
	 */
	public Boolean reversed;
	/**
	 * All series associated to the axis.
	 */
	public Array<Series> series;
	/**
	 * The side on which the axis is rendered. 0 is top, 1 is right, 2 is bottom and 3 is left.
	 */
	public double side;
	/**
	 * Contains the current positions that are laid out on the axis. The positions are numbers in terms of axis values. In a category axis they are integers, in
	 * a datetime axis they are also integers, but designating milliseconds.
	 *
	 * This property is read only - for modifying the tick positions, use the `tickPositioner` callback or [axis.tickPositions(
	 * https://api.highcharts.com/highcharts/xAxis.tickPositions) option instead.
	 */
	@jsweet.lang.Optional
	public AxisTickPositionsArray tickPositions;
	/**
	 * List of major ticks mapped by postition on axis.
	 */
	public Dictionary<Tick> ticks;
	/**
	 * User's options for this axis without defaults.
	 */
	public Union3<XAxisOptions, YAxisOptions, ZAxisOptions> userOptions;

	/**
	 * Add a plot band after render time.
	 *
	 * @param options A configuration object for the plot band, as defined in xAxis.plotBands.
	 *
	 * @return The added plot band.
	 */
	native public jsweet.util.union.Union<PlotLineOrBand, Object> addPlotBand(XAxisPlotBandsOptions options);

	/**
	 * Add a plot line after render time.
	 *
	 * @param options A configuration object for the plot line, as defined in xAxis.plotLines.
	 *
	 * @return The added plot line.
	 */
	native public jsweet.util.union.Union<PlotLineOrBand, Object> addPlotLine(XAxisPlotLinesOptions options);

	/**
	 * Adds the title defined in axis.options.title.
	 *
	 * @param display Whether or not to display the title.
	 */
	native public void addTitle(Boolean display);

	/**
	 * The default label formatter. The context is a special config object for the label. In apps, use the labels.formatter instead, except when a modification
	 * is needed.
	 *
	 * @param this Formatter context of axis label.
	 *
	 * @return The formatted label content.
	 */
	native public String defaultLabelFormatter(AxisLabelsFormatterContextObjectDouble This);

	/**
	 * Internal function to draw a crosshair.
	 *
	 * @param e The event arguments from the modified pointer event, extended with `chartX` and `chartY`
	 *
	 * @param point The Point object if the crosshair snaps to points.
	 *
	 * @fires Highcharts.Axis#afterDrawCrosshair
	 * @fires Highcharts.Axis#drawCrosshair
	 */
	native public void drawCrosshair(PointerEventObject e, Point point);

	/**
	 * Get the current extremes for the axis.
	 *
	 * @return An object containing extremes information.
	 */
	native public ExtremesObject getExtremes();

	/**
	 * Internal function to et the tick positions of a linear axis to round values like whole tens or every five.
	 *
	 * @param tickInterval The normalized tick interval.
	 *
	 * @param min Axis minimum.
	 *
	 * @param max Axis maximum.
	 *
	 * @return An array of axis values where ticks should be placed.
	 */
	native public Array<Double> getLinearTickPositions(double tickInterval, double min, double max);

	/**
	 * Internal function to get the path for the axis line. Extended for polar charts.
	 *
	 * @param lineWidth The line width in pixels.
	 *
	 * @return The SVG path definition in array form.
	 */
	native public Array<?> getLinePath(double lineWidth);

	/**
	 * Resolve the new minorTicks/minorTickInterval options into the legacy loosely typed minorTickInterval option.
	 */
	native public Union3<def.highcharts.StringTypes.auto, Double, Object> getMinorTickInterval();

	/**
	 * Internal function to return the minor tick positions. For logarithmic axes, the same logic as for major ticks is reused.
	 *
	 * @return An array of axis values where ticks should be placed.
	 */
	native public Array<Double> getMinorTickPositions();

	/**
	 * Internal function to create the SVG path definition for a plot band.
	 *
	 * @param from The axis value to start from.
	 *
	 * @param to The axis value to end on.
	 *
	 * @param options The plotBand or plotLine configuration object.
	 *
	 * @return The SVG path definition in array form.
	 */
	native public Array<?> getPlotBandPath(double from, double to, Object options);

	/**
	 * Create the path for a plot line that goes from the given value on this axis, across the plot to the opposite side. Also used internally for grid lines
	 * and crosshairs.
	 *
	 * @param options Options for the path.
	 *
	 * @return The SVG path definition for the plot line.
	 */
	native public jsweet.util.union.Union<Array<?>,Object> getPlotLinePath(AxisPlotLinePathOptionsObject options);

	/**
	 * Get the zero plane either based on zero or on the min or max value. Used in bar and area plots.
	 *
	 * @param threshold The threshold in axis values.
	 *
	 * @return The translated threshold position in terms of pixels, and corrected to stay within the axis bounds.
	 */
	native public jsweet.util.union.Union<Double, Object> getThreshold(double threshold);

	/**
	 * Return true if the axis has associated data.
	 *
	 * @return True if the axis has associated visible series and those series have either valid data points or explicit `min` and `max` settings.
	 */
	native public Boolean hasData();

	/**
	 * Hide the crosshair if visible.
	 */
	native public void hideCrosshair();

	/**
	 * Overrideable function to initialize the axis.
	 *
	 * @param chart The Chart instance to apply the axis on.
	 *
	 * @param userOptions Axis options.
	 *
	 * @fires Highcharts.Axis#afterInit
	 * @fires Highcharts.Axis#init
	 */
	native public void init(Chart chart, XAxisOptions userOptions);

	/**
	 * Remove the axis from the chart.
	 *
	 * @param redraw Whether to redraw the chart following the remove.
	 */
	native public void remove(Boolean redraw);

	/**
	 * Remove a plot band by its id.
	 *
	 * @param id The plot band's `id` as given in the original configuration object or in the `addPlotBand` option.
	 */
	native public void removePlotBand(String id);

	/**
	 * Remove a plot line by its id.
	 *
	 * @param id The plot line's `id` as given in the original configuration object or in the `addPlotLine` option.
	 */
	native public void removePlotLine(String id);

	/**
	 * Render the axis line. Called internally when rendering and redrawing the axis.
	 */
	native public void renderLine();

	/**
	 * Render a minor tick into the given position. If a minor tick already exists in this position, move it.
	 *
	 * @param pos The position in axis values.
	 */
	native public void renderMinorTick(double pos);

	/**
	 * Render a major tick into the given position. If a tick already exists in this position, move it.
	 *
	 * @param pos The position in axis values.
	 *
	 * @param i The tick index.
	 */
	native public void renderTick(double pos, double i);

	/**
	 * Set new axis categories and optionally redraw.
	 *
	 * @param categories The new categories.
	 *
	 * @param redraw Whether to redraw the chart.
	 */
	native public void setCategories(Array<String> categories, Boolean redraw);

	/**
	 * Set the minimum and maximum of the axes after render time. If the `startOnTick` and `endOnTick` options are true, the minimum and maximum values are
	 * rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range
	 * lower than the `minRange` option, which by default is the range of five points.
	 *
	 * @param newMin The new minimum value.
	 *
	 * @param newMax The new maximum value.
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call to Highcharts.Chart#redraw
	 *
	 * @param animation Enable or modify animations.
	 *
	 * @param eventArguments Arguments to be accessed in event handler.
	 *
	 * @fires Highcharts.Axis#setExtremes
	 */
	native public void setExtremes(double newMin, double newMax, Boolean redraw, Boolean animation, Object eventArguments);

	/**
	 * Update the axis title by options after render time.
	 *
	 * @param titleOptions The additional title options.
	 *
	 * @param redraw Whether to redraw the chart after setting the title.
	 */
	native public void setTitle(XAxisTitleOptions titleOptions, Boolean redraw);

	/**
	 * Translate a value in terms of axis units into pixels within the chart.
	 *
	 * @param value A value in terms of axis units.
	 *
	 * @param paneCoordinates Whether to return the pixel coordinate relative to the chart or just the axis/pane itself.
	 *
	 * @return Pixel position of the value on the chart or axis.
	 */
	native public double toPixels(double value, Boolean paneCoordinates);

	/**
	 * Translate a pixel position along the axis to a value in terms of axis units.
	 *
	 * @param pixel The pixel value coordinate.
	 *
	 * @param paneCoordinates Whether the input pixel is relative to the chart or just the axis/pane itself.
	 *
	 * @return The axis value.
	 */
	native public double toValue(double pixel, Boolean paneCoordinates);

	/**
	 * Update an axis object with a new set of options. The options are merged with the existing options, so only new or altered options need to be specified.
	 *
	 * @param options The new options that will be merged in with existing options on the axis.
	 *
	 * @param redraw Whether to redraw the chart after the axis is altered. If doing more operations on the chart, it is a good idea to set redraw to false and
	 *            call Chart#redraw after.
	 */
	native public void update(XAxisOptions options, Boolean redraw);

	/**
	 * Adds the title defined in axis.options.title.
	 *
	 * @param display Whether or not to display the title.
	 */
	native public void addTitle();

	/**
	 * Internal function to draw a crosshair.
	 *
	 * @param e The event arguments from the modified pointer event, extended with `chartX` and `chartY`
	 *
	 * @param point The Point object if the crosshair snaps to points.
	 *
	 * @fires Highcharts.Axis#afterDrawCrosshair
	 * @fires Highcharts.Axis#drawCrosshair
	 */
	native public void drawCrosshair(PointerEventObject e);

	/**
	 * Internal function to draw a crosshair.
	 *
	 * @param e The event arguments from the modified pointer event, extended with `chartX` and `chartY`
	 *
	 * @param point The Point object if the crosshair snaps to points.
	 *
	 * @fires Highcharts.Axis#afterDrawCrosshair
	 * @fires Highcharts.Axis#drawCrosshair
	 */
	native public void drawCrosshair();

	/**
	 * Remove the axis from the chart.
	 *
	 * @param redraw Whether to redraw the chart following the remove.
	 */
	native public void remove();

	/**
	 * Set new axis categories and optionally redraw.
	 *
	 * @param categories The new categories.
	 *
	 * @param redraw Whether to redraw the chart.
	 */
	native public void setCategories(Array<String> categories);

	/**
	 * Set the minimum and maximum of the axes after render time. If the `startOnTick` and `endOnTick` options are true, the minimum and maximum values are
	 * rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range
	 * lower than the `minRange` option, which by default is the range of five points.
	 *
	 * @param newMin The new minimum value.
	 *
	 * @param newMax The new maximum value.
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call to Highcharts.Chart#redraw
	 *
	 * @param animation Enable or modify animations.
	 *
	 * @param eventArguments Arguments to be accessed in event handler.
	 *
	 * @fires Highcharts.Axis#setExtremes
	 */
	native public void setExtremes(double newMin, double newMax, Boolean redraw, Boolean animation);

	/**
	 * Set the minimum and maximum of the axes after render time. If the `startOnTick` and `endOnTick` options are true, the minimum and maximum values are
	 * rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range
	 * lower than the `minRange` option, which by default is the range of five points.
	 *
	 * @param newMin The new minimum value.
	 *
	 * @param newMax The new maximum value.
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call to Highcharts.Chart#redraw
	 *
	 * @param animation Enable or modify animations.
	 *
	 * @param eventArguments Arguments to be accessed in event handler.
	 *
	 * @fires Highcharts.Axis#setExtremes
	 */
	native public void setExtremes(double newMin, double newMax, Boolean redraw);

	/**
	 * Set the minimum and maximum of the axes after render time. If the `startOnTick` and `endOnTick` options are true, the minimum and maximum values are
	 * rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range
	 * lower than the `minRange` option, which by default is the range of five points.
	 *
	 * @param newMin The new minimum value.
	 *
	 * @param newMax The new maximum value.
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call to Highcharts.Chart#redraw
	 *
	 * @param animation Enable or modify animations.
	 *
	 * @param eventArguments Arguments to be accessed in event handler.
	 *
	 * @fires Highcharts.Axis#setExtremes
	 */
	native public void setExtremes(double newMin, double newMax);

	/**
	 * Set the minimum and maximum of the axes after render time. If the `startOnTick` and `endOnTick` options are true, the minimum and maximum values are
	 * rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range
	 * lower than the `minRange` option, which by default is the range of five points.
	 *
	 * @param newMin The new minimum value.
	 *
	 * @param newMax The new maximum value.
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call to Highcharts.Chart#redraw
	 *
	 * @param animation Enable or modify animations.
	 *
	 * @param eventArguments Arguments to be accessed in event handler.
	 *
	 * @fires Highcharts.Axis#setExtremes
	 */
	native public void setExtremes(double newMin);

	/**
	 * Set the minimum and maximum of the axes after render time. If the `startOnTick` and `endOnTick` options are true, the minimum and maximum values are
	 * rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range
	 * lower than the `minRange` option, which by default is the range of five points.
	 *
	 * @param newMin The new minimum value.
	 *
	 * @param newMax The new maximum value.
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call to Highcharts.Chart#redraw
	 *
	 * @param animation Enable or modify animations.
	 *
	 * @param eventArguments Arguments to be accessed in event handler.
	 *
	 * @fires Highcharts.Axis#setExtremes
	 */
	native public void setExtremes();

	/**
	 * Update the axis title by options after render time.
	 *
	 * @param titleOptions The additional title options.
	 *
	 * @param redraw Whether to redraw the chart after setting the title.
	 */
	native public void setTitle(XAxisTitleOptions titleOptions);

	/**
	 * Translate a pixel position along the axis to a value in terms of axis units.
	 *
	 * @param pixel The pixel value coordinate.
	 *
	 * @param paneCoordinates Whether the input pixel is relative to the chart or just the axis/pane itself.
	 *
	 * @return The axis value.
	 */
	native public double toValue(double pixel);

	/**
	 * Update an axis object with a new set of options. The options are merged with the existing options, so only new or altered options need to be specified.
	 *
	 * @param options The new options that will be merged in with existing options on the axis.
	 *
	 * @param redraw Whether to redraw the chart after the axis is altered. If doing more operations on the chart, it is a good idea to set redraw to false and
	 *            call Chart#redraw after.
	 */
	native public void update(XAxisOptions options);

	/**
	 * Create a new axis object. Called internally when instanciating a new chart or adding axes by Highcharts.Chart#addAxis.
	 *
	 * A chart can have from 0 axes (pie chart) to multiples. In a normal, single series cartesian chart, there is one X axis and one Y axis.
	 *
	 * The X axis or axes are referenced by Highcharts.Chart.xAxis, which is an array of Axis objects. If there is only one axis, it can be referenced through
	 * `chart.xAxis[0]`, and multiple axes have increasing indices. The same pattern goes for Y axes.
	 *
	 * If you need to get the axes from a series object, use the `series.xAxis` and `series.yAxis` properties. These are not arrays, as one series can only be
	 * associated to one X and one Y axis.
	 *
	 * A third way to reference the axis programmatically is by `id`. Add an `id` in the axis configuration options, and get the axis by Highcharts.Chart#get.
	 *
	 * Configuration options for the axes are given in options.xAxis and options.yAxis.
	 *
	 * @param chart The Chart instance to apply the axis on.
	 *
	 * @param userOptions Axis options.
	 */
	public Axis(Chart chart, ZAxisOptions userOptions) {
	}

	/**
	 * Create a new axis object. Called internally when instanciating a new chart or adding axes by Highcharts.Chart#addAxis.
	 *
	 * A chart can have from 0 axes (pie chart) to multiples. In a normal, single series cartesian chart, there is one X axis and one Y axis.
	 *
	 * The X axis or axes are referenced by Highcharts.Chart.xAxis, which is an array of Axis objects. If there is only one axis, it can be referenced through
	 * `chart.xAxis[0]`, and multiple axes have increasing indices. The same pattern goes for Y axes.
	 *
	 * If you need to get the axes from a series object, use the `series.xAxis` and `series.yAxis` properties. These are not arrays, as one series can only be
	 * associated to one X and one Y axis.
	 *
	 * A third way to reference the axis programmatically is by `id`. Add an `id` in the axis configuration options, and get the axis by Highcharts.Chart#get.
	 *
	 * Configuration options for the axes are given in options.xAxis and options.yAxis.
	 *
	 * @param chart The Chart instance to apply the axis on.
	 *
	 * @param userOptions Axis options.
	 */
	public Axis(Chart chart, YAxisOptions userOptions) {
	}

	/**
	 * Add a plot band after render time.
	 *
	 * @param options A configuration object for the plot band, as defined in xAxis.plotBands.
	 *
	 * @return The added plot band.
	 */
	native public jsweet.util.union.Union<PlotLineOrBand, Object> addPlotBand(YAxisPlotBandsOptions options);

	/**
	 * Add a plot band after render time.
	 *
	 * @param options A configuration object for the plot band, as defined in xAxis.plotBands.
	 *
	 * @return The added plot band.
	 */
	native public jsweet.util.union.Union<PlotLineOrBand, Object> addPlotBand(ZAxisPlotBandsOptions options);

	/**
	 * Add a plot line after render time.
	 *
	 * @param options A configuration object for the plot line, as defined in xAxis.plotLines.
	 *
	 * @return The added plot line.
	 */
	native public jsweet.util.union.Union<PlotLineOrBand, Object> addPlotLine(YAxisPlotLinesOptions options);

	/**
	 * Add a plot line after render time.
	 *
	 * @param options A configuration object for the plot line, as defined in xAxis.plotLines.
	 *
	 * @return The added plot line.
	 */
	native public jsweet.util.union.Union<PlotLineOrBand, Object> addPlotLine(ZAxisPlotLinesOptions options);

	/**
	 * The default label formatter. The context is a special config object for the label. In apps, use the labels.formatter instead, except when a modification
	 * is needed.
	 *
	 * @param this Formatter context of axis label.
	 *
	 * @return The formatted label content.
	 */
	native public String defaultLabelFormatter(AxisLabelsFormatterContextObjectString This);

	/**
	 * Overrideable function to initialize the axis.
	 *
	 * @param chart The Chart instance to apply the axis on.
	 *
	 * @param userOptions Axis options.
	 *
	 * @fires Highcharts.Axis#afterInit
	 * @fires Highcharts.Axis#init
	 */
	native public void init(Chart chart, ZAxisOptions userOptions);

	/**
	 * Overrideable function to initialize the axis.
	 *
	 * @param chart The Chart instance to apply the axis on.
	 *
	 * @param userOptions Axis options.
	 *
	 * @fires Highcharts.Axis#afterInit
	 * @fires Highcharts.Axis#init
	 */
	native public void init(Chart chart, YAxisOptions userOptions);

	/**
	 * Set the minimum and maximum of the axes after render time. If the `startOnTick` and `endOnTick` options are true, the minimum and maximum values are
	 * rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range
	 * lower than the `minRange` option, which by default is the range of five points.
	 *
	 * @param newMin The new minimum value.
	 *
	 * @param newMax The new maximum value.
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call to Highcharts.Chart#redraw
	 *
	 * @param animation Enable or modify animations.
	 *
	 * @param eventArguments Arguments to be accessed in event handler.
	 *
	 * @fires Highcharts.Axis#setExtremes
	 */
	native public void setExtremes(double newMin, double newMax, Boolean redraw, Partial2<AnimationOptionsObject> animation, Object eventArguments);

	/**
	 * Update the axis title by options after render time.
	 *
	 * @param titleOptions The additional title options.
	 *
	 * @param redraw Whether to redraw the chart after setting the title.
	 */
	native public void setTitle(YAxisTitleOptions titleOptions, Boolean redraw);

	/**
	 * Update the axis title by options after render time.
	 *
	 * @param titleOptions The additional title options.
	 *
	 * @param redraw Whether to redraw the chart after setting the title.
	 */
	native public void setTitle(ZAxisTitleOptions titleOptions, Boolean redraw);

	/**
	 * Update an axis object with a new set of options. The options are merged with the existing options, so only new or altered options need to be specified.
	 *
	 * @param options The new options that will be merged in with existing options on the axis.
	 *
	 * @param redraw Whether to redraw the chart after the axis is altered. If doing more operations on the chart, it is a good idea to set redraw to false and
	 *            call Chart#redraw after.
	 */
	native public void update(YAxisOptions options, Boolean redraw);

	/**
	 * Update an axis object with a new set of options. The options are merged with the existing options, so only new or altered options need to be specified.
	 *
	 * @param options The new options that will be merged in with existing options on the axis.
	 *
	 * @param redraw Whether to redraw the chart after the axis is altered. If doing more operations on the chart, it is a good idea to set redraw to false and
	 *            call Chart#redraw after.
	 */
	native public void update(ZAxisOptions options, Boolean redraw);

	/**
	 * Set the minimum and maximum of the axes after render time. If the `startOnTick` and `endOnTick` options are true, the minimum and maximum values are
	 * rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range
	 * lower than the `minRange` option, which by default is the range of five points.
	 *
	 * @param newMin The new minimum value.
	 *
	 * @param newMax The new maximum value.
	 *
	 * @param redraw Whether to redraw the chart or wait for an explicit call to Highcharts.Chart#redraw
	 *
	 * @param animation Enable or modify animations.
	 *
	 * @param eventArguments Arguments to be accessed in event handler.
	 *
	 * @fires Highcharts.Axis#setExtremes
	 */
	native public void setExtremes(double newMin, double newMax, Boolean redraw, Partial2<AnimationOptionsObject> animation);

	/**
	 * Update the axis title by options after render time.
	 *
	 * @param titleOptions The additional title options.
	 *
	 * @param redraw Whether to redraw the chart after setting the title.
	 */
	native public void setTitle(ZAxisTitleOptions titleOptions);

	/**
	 * Update the axis title by options after render time.
	 *
	 * @param titleOptions The additional title options.
	 *
	 * @param redraw Whether to redraw the chart after setting the title.
	 */
	native public void setTitle(YAxisTitleOptions titleOptions);

	/**
	 * Update an axis object with a new set of options. The options are merged with the existing options, so only new or altered options need to be specified.
	 *
	 * @param options The new options that will be merged in with existing options on the axis.
	 *
	 * @param redraw Whether to redraw the chart after the axis is altered. If doing more operations on the chart, it is a good idea to set redraw to false and
	 *            call Chart#redraw after.
	 */
	native public void update(YAxisOptions options);

	/**
	 * Update an axis object with a new set of options. The options are merged with the existing options, so only new or altered options need to be specified.
	 *
	 * @param options The new options that will be merged in with existing options on the axis.
	 *
	 * @param redraw Whether to redraw the chart after the axis is altered. If doing more operations on the chart, it is a good idea to set redraw to false and
	 *            call Chart#redraw after.
	 */
	native public void update(ZAxisOptions options);

	/**
	 * Set new axis categories and optionally redraw.
	 *
	 * @param categories The new categories.
	 *
	 * @param redraw Whether to redraw the chart.
	 */
	native public void setCategories(String[] categories, Boolean redraw);

	/**
	 * Set new axis categories and optionally redraw.
	 *
	 * @param categories The new categories.
	 *
	 * @param redraw Whether to redraw the chart.
	 */
	native public void setCategories(String[] categories);

	protected Axis() {
	}

	/** This class was automatically generated for disambiguating erased method signatures. */
	@jsweet.lang.Erased
	public static class AxisLabelsFormatterContextObjectDouble extends def.js.Object {
		public AxisLabelsFormatterContextObjectDouble(AxisLabelsFormatterContextObjectDouble This) {
		}
	}

	/** This class was automatically generated for disambiguating erased method signatures. */
	@jsweet.lang.Erased
	public static class AxisLabelsFormatterContextObjectString extends def.js.Object {
		public AxisLabelsFormatterContextObjectString(AxisLabelsFormatterContextObjectString This) {
		}
	}
}
