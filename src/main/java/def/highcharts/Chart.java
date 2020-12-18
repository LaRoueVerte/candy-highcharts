package def.highcharts;

import def.dom.Event;
import def.dom.HTMLElement;
import def.dom.SVGElement;
import def.js.Array;
import def.js.Function;
import jsweet.util.function.Function4;

/**
 * The Chart class. The recommended constructor is Highcharts#chart.
 */
public class Chart extends def.js.Object {
	/**
	 * The Chart class. The recommended constructor is Highcharts#chart.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 */
	public Chart(Options options, java.util.function.Consumer<Chart> callback) {
	}

	/**
	 * The Chart class. The recommended constructor is Highcharts#chart.
	 *
	 * @param renderTo The DOM element to render to, or its id.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 */
	public Chart(String renderTo, Options options, java.util.function.Consumer<Chart> callback) {
	}

	/**
	 * All the axes in the chart.
	 */
	public Array<Axis> axes;
	/**
	 * The current pixel height of the chart.
	 */
	public double chartHeight;
	/**
	 * The current pixel width of the chart.
	 */
	public double chartWidth;
	/**
	 * These collections (arrays) implement update() methods with support for one-to-one option.
	 */
	public Object collectionsWithUpdate;
	/**
	 * The containing HTML element of the chart. The container is dynamically inserted into the element given as the `renderTo` parameter in the
	 * Highcharts#chart constructor.
	 */
	public HTMLElement container;
	/**
	 * The chart's credits label. The label has an `update` method that allows setting new options as per the credits options set.
	 */
	public SVGElement credits;
	/**
	 * Contains the original hovered point.
	 */
	public jsweet.util.union.Union<Point, Object> hoverPoint;
	/**
	 * Contains all hovered points.
	 */
	public jsweet.util.union.Union<Array<Point>, Object> hoverPoints;
	/**
	 * Contains the original hovered series.
	 */
	public jsweet.util.union.Union<Series, Object> hoverSeries;
	/**
	 * Index position of the chart in the Highcharts#charts property.
	 */
	public final double index = 0;
	/**
	 * The flag is set to `true` if a series of the chart is inverted.
	 */
	@jsweet.lang.Optional
	public Boolean inverted;
	/**
	 * The overview of the chart's series.
	 */
	public Legend legend;
	/**
	 * Callback function to override the default function that formats all the numbers in the chart. Returns a string with the formatted number.
	 */
	public Function4<Double, Double, String, String, String> numberFormatter;
	/**
	 * The options structure for the chart after merging #defaultOptions and #userOptions. It contains members for the sub elements like series, legend, tooltip
	 * etc.
	 */
	public Options options;
	/**
	 * The current height of the plot area in pixels.
	 */
	public double plotHeight;
	/**
	 * The current left position of the plot area in pixels.
	 */
	public double plotLeft;
	/**
	 * The current top position of the plot area in pixels.
	 */
	public double plotTop;
	/**
	 * The current width of the plot area in pixels.
	 */
	public double plotWidth;
	/**
	 * The Pointer that keeps track of mouse and touch interaction.
	 */
	public Pointer pointer;
	/**
	 * These properties cause isDirtyBox to be set to true when updating. Can be extended from plugins.
	 */
	public Object propsRequireDirtyBox;
	/**
	 * These properties require a full reflow of chart elements, best implemented through running `Chart.setSize` internally (#8190).
	 */
	public Object[] propsRequireReflow;
	/**
	 * These properties cause all series to be updated when updating. Can be extended from plugins.
	 */
	public Object propsRequireUpdateSeries;
	/**
	 * The renderer instance of the chart. Each chart instance has only one associated renderer.
	 */
	public SVGRenderer renderer;
	/**
	 * All the current series in the chart.
	 */
	public Array<Series> series;
	/**
	 * Whether the chart is in styled mode, meaning all presentatinoal attributes are avoided.
	 */
	public Boolean styledMode;
	/**
	 * The chart subtitle. The subtitle has an `update` method that allows modifying the options directly or indirectly via `chart.update`.
	 */
	public SubtitleObject subtitle;
	/**
	 * The `Time` object associated with the chart. Since v6.0.5, time settings can be applied individually for each chart. If no individual settings apply, the
	 * `Time` object is shared by all instances.
	 */
	public Time time;
	/**
	 * The chart title. The title has an `update` method that allows modifying the options directly or indirectly via `chart.update`.
	 */
	public TitleObject title;
	/**
	 * Tooltip object for points of series.
	 */
	public Tooltip tooltip;
	/**
	 * The original options given to the constructor or a chart factory like Highcharts.chart and Highcharts.stockChart.
	 */
	public Options userOptions;
	/**
	 * A collection of the X axes in the chart.
	 */
	public Array<Axis> xAxis;
	/**
	 * A collection of the Y axes in the chart.
	 */
	public Array<Axis> yAxis;

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(XAxisOptions options, Boolean isX, Boolean redraw, Boolean animation);

	/**
	 * Add a color axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it
	 * adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option
	 * instead.
	 *
	 * @param options The axis options.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public ColorAxis addColorAxis(ColorAxisOptions options, Boolean redraw, Boolean animation);

	/**
	 * Set a new credits label for the chart.
	 *
	 * @param credits A configuration object for the new credits.
	 */
	native public void addCredits(CreditsOptions credits);

	/**
	 * Add a series to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the series as a configuration option
	 * instead. With multiple axes, the `offset` is dynamically adjusted.
	 *
	 * @param options The config options for the series.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @return The newly created series object.
	 *
	 * @fires Highcharts.Chart#addSeries
	 * @fires Highcharts.Chart#afterAddSeries
	 */
	native public Series addSeries(SeriesOptionsRegistry options, Boolean redraw, Boolean animation);

	/**
	 * Remove the chart and purge memory. This method is called internally before adding a second chart into the same container, as well as on window unload to
	 * prevent leaks.
	 *
	 * @fires Highcharts.Chart#destroy
	 */
	native public void destroy();

	/**
	 * Get an axis, series or point object by `id` as given in the configuration options. Returns `undefined` if no item is found.
	 *
	 * @param id The id as given in the configuration options.
	 *
	 * @return The retrieved item.
	 */
	native public Object get(String id);

	/**
	 * Returns an array of all currently selected points in the chart. Points can be selected by clicking or programmatically by the Highcharts.Point#select
	 * function.
	 *
	 * @return The currently selected points.
	 */
	native public Array<Point> getSelectedPoints();

	/**
	 * Returns an array of all currently selected series in the chart. Series can be selected either programmatically by the Highcharts.Series#select function
	 * or by checking the checkbox next to the legend item if series.showCheckBox is true.
	 *
	 * @return The currently selected series.
	 */
	native public Array<Series> getSelectedSeries();

	/**
	 * Hide the loading layer.
	 */
	native public void hideLoading();

	/**
	 * Overridable function that initializes the chart. The constructor's arguments are passed on directly.
	 *
	 * @param userOptions Custom options.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded.
	 *
	 * @fires Highcharts.Chart#init
	 * @fires Highcharts.Chart#afterInit
	 */
	native public void init(Options userOptions, Function callback);

	/**
	 * Check whether a given point is within the plot area.
	 *
	 * @param plotX Pixel x relative to the plot area.
	 *
	 * @param plotY Pixel y relative to the plot area.
	 *
	 * @param inverted Whether the chart is inverted.
	 *
	 * @return Returns true if the given point is inside the plot area.
	 */
	native public Boolean isInsidePlot(double plotX, double plotY, Boolean inverted);

	/**
	 * Redraw the chart after changes have been done to the data, axis extremes chart size or chart elements. All methods for updating axes, series or points
	 * have a parameter for redrawing the chart. This is `true` by default. But in many cases you want to do more than one operation on the chart before
	 * redrawing, for example add a number of points. In those cases it is a waste of resources to redraw the chart for each new point added. So you add the
	 * points and call `chart.redraw()` after.
	 *
	 * @param animation If or how to apply animation to the redraw.
	 *
	 * @fires Highcharts.Chart#afterSetExtremes
	 * @fires Highcharts.Chart#beforeRedraw
	 * @fires Highcharts.Chart#predraw
	 * @fires Highcharts.Chart#redraw
	 * @fires Highcharts.Chart#render
	 * @fires Highcharts.Chart#updatedData
	 */
	native public void redraw(Boolean animation);

	/**
	 * Reflows the chart to its container. By default, the chart reflows automatically to its container following a `window.resize` event, as per the
	 * chart.reflow option. However, there are no reliable events for div resize, so if the container is resized without a window resize event, this must be
	 * called explicitly.
	 *
	 * @param e Event arguments. Used primarily when the function is called internally as a response to window resize.
	 */
	native public void reflow(Event e);

	/**
	 * Set the caption options. This can also be done from Chart#update.
	 *
	 * @param options New caption options. The caption text itself is set by the `options.text` property.
	 */
	native public void setCaption(CaptionOptions options);

	/**
	 * Set the chart container's class name, in addition to `highcharts-container`.
	 *
	 * @param className The additional class name.
	 */
	native public void setClassName(String className);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	native public void setSize(double width, double height, Boolean animation);

	/**
	 * Shortcut to set the subtitle options. This can also be done from Chart#update or Chart#setTitle.
	 *
	 * @param options New subtitle options. The subtitle text itself is set by the `options.text` property.
	 */
	native public void setSubtitle(SubtitleOptions options);

	/**
	 * Set a new title or subtitle for the chart.
	 *
	 * @param titleOptions New title options. The title text itself is set by the `titleOptions.text` property.
	 *
	 * @param subtitleOptions New subtitle options. The subtitle text itself is set by the `subtitleOptions.text` property.
	 *
	 * @param redraw Whether to redraw the chart or wait for a later call to `chart.redraw()`.
	 */
	native public void setTitle(TitleOptions titleOptions, SubtitleOptions subtitleOptions, Boolean redraw);

	/**
	 * Dim the chart and show a loading text or symbol. Options for the loading screen are defined in the loading options.
	 *
	 * @param str An optional text to show in the loading label instead of the default one. The default text is set in lang.loading.
	 */
	native public void showLoading(String str);

	/**
	 * Display the zoom button, so users can reset zoom to the default view settings.
	 *
	 * @fires Highcharts.Chart#afterShowResetZoom
	 * @fires Highcharts.Chart#beforeShowResetZoom
	 */
	native public void showResetZoom();

	/**
	 * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled, re-formatted etc.
	 *
	 * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections, an `id` option is used to map the
	 * new option set to an existing object. If an existing object of the same id is not found, the corresponding item is updated. So for example, running
	 * `chart.update` with a series item without an id, will cause the existing chart's series with the same index in the series array to be updated. When the
	 * `oneToOne` parameter is true, `chart.update` will also take care of adding and removing items from the collection. Read more under the parameter
	 * description below.
	 *
	 * Note that when changing series data, `chart.update` may mutate the passed data options.
	 *
	 * See also the responsive option set. Switching between `responsive.rules` basically runs `chart.update` under the hood.
	 *
	 * @param options A configuration object for the new chart options.
	 *
	 * @param redraw Whether to redraw the chart.
	 *
	 * @param oneToOne When `true`, the `series`, `xAxis`, `yAxis` and `annotations` collections will be updated one to one, and items will be either added or
	 *            removed to match the new updated options. For example, if the chart has two series and we call `chart.update` with a configuration containing
	 *            three series, one will be added. If we call `chart.update` with one series, one will be removed. Setting an empty `series` array will remove
	 *            all series, but leaving out the`series` property will leave all series untouched. If the series have id's, the new series options will be
	 *            matched by id, and the remaining ones removed.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @fires Highcharts.Chart#update
	 * @fires Highcharts.Chart#afterUpdate
	 */
	native public void update(Options options, Boolean redraw, Boolean oneToOne, Boolean animation);

	/**
	 * Zoom the chart out after a user has zoomed in. See also Axis.setExtremes.
	 *
	 * @fires Highcharts.Chart#selection
	 */
	native public void zoomOut();

	/**
	 * The Chart class. The recommended constructor is Highcharts#chart.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 */
	public Chart(Options options) {
	}

	/**
	 * The Chart class. The recommended constructor is Highcharts#chart.
	 *
	 * @param renderTo The DOM element to render to, or its id.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 */
	public Chart(String renderTo, Options options) {
	}

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(XAxisOptions options, Boolean isX, Boolean redraw);

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(XAxisOptions options, Boolean isX);

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(XAxisOptions options);

	/**
	 * Add a color axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it
	 * adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option
	 * instead.
	 *
	 * @param options The axis options.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public ColorAxis addColorAxis(ColorAxisOptions options, Boolean redraw);

	/**
	 * Add a color axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it
	 * adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option
	 * instead.
	 *
	 * @param options The axis options.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public ColorAxis addColorAxis(ColorAxisOptions options);

	/**
	 * Set a new credits label for the chart.
	 *
	 * @param credits A configuration object for the new credits.
	 */
	native public void addCredits();

	/**
	 * Add a series to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the series as a configuration option
	 * instead. With multiple axes, the `offset` is dynamically adjusted.
	 *
	 * @param options The config options for the series.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @return The newly created series object.
	 *
	 * @fires Highcharts.Chart#addSeries
	 * @fires Highcharts.Chart#afterAddSeries
	 */
	native public Series addSeries(SeriesOptionsRegistry options, Boolean redraw);

	/**
	 * Add a series to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the series as a configuration option
	 * instead. With multiple axes, the `offset` is dynamically adjusted.
	 *
	 * @param options The config options for the series.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @return The newly created series object.
	 *
	 * @fires Highcharts.Chart#addSeries
	 * @fires Highcharts.Chart#afterAddSeries
	 */
	native public Series addSeries(SeriesOptionsRegistry options);

	/**
	 * Overridable function that initializes the chart. The constructor's arguments are passed on directly.
	 *
	 * @param userOptions Custom options.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded.
	 *
	 * @fires Highcharts.Chart#init
	 * @fires Highcharts.Chart#afterInit
	 */
	native public void init(Options userOptions);

	/**
	 * Check whether a given point is within the plot area.
	 *
	 * @param plotX Pixel x relative to the plot area.
	 *
	 * @param plotY Pixel y relative to the plot area.
	 *
	 * @param inverted Whether the chart is inverted.
	 *
	 * @return Returns true if the given point is inside the plot area.
	 */
	native public Boolean isInsidePlot(double plotX, double plotY);

	/**
	 * Redraw the chart after changes have been done to the data, axis extremes chart size or chart elements. All methods for updating axes, series or points
	 * have a parameter for redrawing the chart. This is `true` by default. But in many cases you want to do more than one operation on the chart before
	 * redrawing, for example add a number of points. In those cases it is a waste of resources to redraw the chart for each new point added. So you add the
	 * points and call `chart.redraw()` after.
	 *
	 * @param animation If or how to apply animation to the redraw.
	 *
	 * @fires Highcharts.Chart#afterSetExtremes
	 * @fires Highcharts.Chart#beforeRedraw
	 * @fires Highcharts.Chart#predraw
	 * @fires Highcharts.Chart#redraw
	 * @fires Highcharts.Chart#render
	 * @fires Highcharts.Chart#updatedData
	 */
	native public void redraw();

	/**
	 * Reflows the chart to its container. By default, the chart reflows automatically to its container following a `window.resize` event, as per the
	 * chart.reflow option. However, there are no reliable events for div resize, so if the container is resized without a window resize event, this must be
	 * called explicitly.
	 *
	 * @param e Event arguments. Used primarily when the function is called internally as a response to window resize.
	 */
	native public void reflow();

	/**
	 * Set the chart container's class name, in addition to `highcharts-container`.
	 *
	 * @param className The additional class name.
	 */
	native public void setClassName();

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	native public void setSize(double width, double height);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	native public void setSize(double width);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	// native public void setSize();
	/**
	 * Set a new title or subtitle for the chart.
	 *
	 * @param titleOptions New title options. The title text itself is set by the `titleOptions.text` property.
	 *
	 * @param subtitleOptions New subtitle options. The subtitle text itself is set by the `subtitleOptions.text` property.
	 *
	 * @param redraw Whether to redraw the chart or wait for a later call to `chart.redraw()`.
	 */
	native public void setTitle(TitleOptions titleOptions, SubtitleOptions subtitleOptions);

	/**
	 * Set a new title or subtitle for the chart.
	 *
	 * @param titleOptions New title options. The title text itself is set by the `titleOptions.text` property.
	 *
	 * @param subtitleOptions New subtitle options. The subtitle text itself is set by the `subtitleOptions.text` property.
	 *
	 * @param redraw Whether to redraw the chart or wait for a later call to `chart.redraw()`.
	 */
	native public void setTitle(TitleOptions titleOptions);

	/**
	 * Set a new title or subtitle for the chart.
	 *
	 * @param titleOptions New title options. The title text itself is set by the `titleOptions.text` property.
	 *
	 * @param subtitleOptions New subtitle options. The subtitle text itself is set by the `subtitleOptions.text` property.
	 *
	 * @param redraw Whether to redraw the chart or wait for a later call to `chart.redraw()`.
	 */
	native public void setTitle();

	/**
	 * Dim the chart and show a loading text or symbol. Options for the loading screen are defined in the loading options.
	 *
	 * @param str An optional text to show in the loading label instead of the default one. The default text is set in lang.loading.
	 */
	native public void showLoading();

	/**
	 * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled, re-formatted etc.
	 *
	 * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections, an `id` option is used to map the
	 * new option set to an existing object. If an existing object of the same id is not found, the corresponding item is updated. So for example, running
	 * `chart.update` with a series item without an id, will cause the existing chart's series with the same index in the series array to be updated. When the
	 * `oneToOne` parameter is true, `chart.update` will also take care of adding and removing items from the collection. Read more under the parameter
	 * description below.
	 *
	 * Note that when changing series data, `chart.update` may mutate the passed data options.
	 *
	 * See also the responsive option set. Switching between `responsive.rules` basically runs `chart.update` under the hood.
	 *
	 * @param options A configuration object for the new chart options.
	 *
	 * @param redraw Whether to redraw the chart.
	 *
	 * @param oneToOne When `true`, the `series`, `xAxis`, `yAxis` and `annotations` collections will be updated one to one, and items will be either added or
	 *            removed to match the new updated options. For example, if the chart has two series and we call `chart.update` with a configuration containing
	 *            three series, one will be added. If we call `chart.update` with one series, one will be removed. Setting an empty `series` array will remove
	 *            all series, but leaving out the`series` property will leave all series untouched. If the series have id's, the new series options will be
	 *            matched by id, and the remaining ones removed.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @fires Highcharts.Chart#update
	 * @fires Highcharts.Chart#afterUpdate
	 */
	native public void update(Options options, Boolean redraw, Boolean oneToOne);

	/**
	 * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled, re-formatted etc.
	 *
	 * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections, an `id` option is used to map the
	 * new option set to an existing object. If an existing object of the same id is not found, the corresponding item is updated. So for example, running
	 * `chart.update` with a series item without an id, will cause the existing chart's series with the same index in the series array to be updated. When the
	 * `oneToOne` parameter is true, `chart.update` will also take care of adding and removing items from the collection. Read more under the parameter
	 * description below.
	 *
	 * Note that when changing series data, `chart.update` may mutate the passed data options.
	 *
	 * See also the responsive option set. Switching between `responsive.rules` basically runs `chart.update` under the hood.
	 *
	 * @param options A configuration object for the new chart options.
	 *
	 * @param redraw Whether to redraw the chart.
	 *
	 * @param oneToOne When `true`, the `series`, `xAxis`, `yAxis` and `annotations` collections will be updated one to one, and items will be either added or
	 *            removed to match the new updated options. For example, if the chart has two series and we call `chart.update` with a configuration containing
	 *            three series, one will be added. If we call `chart.update` with one series, one will be removed. Setting an empty `series` array will remove
	 *            all series, but leaving out the`series` property will leave all series untouched. If the series have id's, the new series options will be
	 *            matched by id, and the remaining ones removed.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @fires Highcharts.Chart#update
	 * @fires Highcharts.Chart#afterUpdate
	 */
	native public void update(Options options, Boolean redraw);

	/**
	 * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled, re-formatted etc.
	 *
	 * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections, an `id` option is used to map the
	 * new option set to an existing object. If an existing object of the same id is not found, the corresponding item is updated. So for example, running
	 * `chart.update` with a series item without an id, will cause the existing chart's series with the same index in the series array to be updated. When the
	 * `oneToOne` parameter is true, `chart.update` will also take care of adding and removing items from the collection. Read more under the parameter
	 * description below.
	 *
	 * Note that when changing series data, `chart.update` may mutate the passed data options.
	 *
	 * See also the responsive option set. Switching between `responsive.rules` basically runs `chart.update` under the hood.
	 *
	 * @param options A configuration object for the new chart options.
	 *
	 * @param redraw Whether to redraw the chart.
	 *
	 * @param oneToOne When `true`, the `series`, `xAxis`, `yAxis` and `annotations` collections will be updated one to one, and items will be either added or
	 *            removed to match the new updated options. For example, if the chart has two series and we call `chart.update` with a configuration containing
	 *            three series, one will be added. If we call `chart.update` with one series, one will be removed. Setting an empty `series` array will remove
	 *            all series, but leaving out the`series` property will leave all series untouched. If the series have id's, the new series options will be
	 *            matched by id, and the remaining ones removed.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @fires Highcharts.Chart#update
	 * @fires Highcharts.Chart#afterUpdate
	 */
	native public void update(Options options);

	/**
	 * The Chart class. The recommended constructor is Highcharts#chart.
	 *
	 * @param renderTo The DOM element to render to, or its id.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 */
	public Chart(HTMLElement renderTo, Options options, java.util.function.Consumer<Chart> callback) {
	}

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(ZAxisOptions options, Boolean isX, Boolean redraw, Boolean animation);

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(YAxisOptions options, Boolean isX, Boolean redraw, Partial2<AnimationOptionsObject> animation);

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(ZAxisOptions options, Boolean isX, Boolean redraw, Partial2<AnimationOptionsObject> animation);

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(YAxisOptions options, Boolean isX, Boolean redraw, Boolean animation);

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(XAxisOptions options, Boolean isX, Boolean redraw, Partial2<AnimationOptionsObject> animation);

	/**
	 * Add a color axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it
	 * adds expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option
	 * instead.
	 *
	 * @param options The axis options.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public ColorAxis addColorAxis(ColorAxisOptions options, Boolean redraw, Partial2<AnimationOptionsObject> animation);

	/**
	 * Add a series to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the series as a configuration option
	 * instead. With multiple axes, the `offset` is dynamically adjusted.
	 *
	 * @param options The config options for the series.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @return The newly created series object.
	 *
	 * @fires Highcharts.Chart#addSeries
	 * @fires Highcharts.Chart#afterAddSeries
	 */
	native public Series addSeries(SeriesOptionsRegistry options, Boolean redraw, Partial2<AnimationOptionsObject> animation);

	/**
	 * Redraw the chart after changes have been done to the data, axis extremes chart size or chart elements. All methods for updating axes, series or points
	 * have a parameter for redrawing the chart. This is `true` by default. But in many cases you want to do more than one operation on the chart before
	 * redrawing, for example add a number of points. In those cases it is a waste of resources to redraw the chart for each new point added. So you add the
	 * points and call `chart.redraw()` after.
	 *
	 * @param animation If or how to apply animation to the redraw.
	 *
	 * @fires Highcharts.Chart#afterSetExtremes
	 * @fires Highcharts.Chart#beforeRedraw
	 * @fires Highcharts.Chart#predraw
	 * @fires Highcharts.Chart#redraw
	 * @fires Highcharts.Chart#render
	 * @fires Highcharts.Chart#updatedData
	 */
	native public void redraw(Partial2<AnimationOptionsObject> animation);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	native public void setSize(Object width, Object height, Partial2<AnimationOptionsObject> animation);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	native public void setSize(double width, Object height, Partial2<AnimationOptionsObject> animation);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	// native public void setSize(double width, double height, Boolean animation);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	// native public void setSize(double width, double height, Boolean animation);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	native public void setSize(double width, double height, Partial2<AnimationOptionsObject> animation);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	// native public void setSize(double width, double height, Partial<AnimationOptionsObject> animation);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	native public void setSize(double width, Object height, Boolean animation);

	/**
	 * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled, re-formatted etc.
	 *
	 * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections, an `id` option is used to map the
	 * new option set to an existing object. If an existing object of the same id is not found, the corresponding item is updated. So for example, running
	 * `chart.update` with a series item without an id, will cause the existing chart's series with the same index in the series array to be updated. When the
	 * `oneToOne` parameter is true, `chart.update` will also take care of adding and removing items from the collection. Read more under the parameter
	 * description below.
	 *
	 * Note that when changing series data, `chart.update` may mutate the passed data options.
	 *
	 * See also the responsive option set. Switching between `responsive.rules` basically runs `chart.update` under the hood.
	 *
	 * @param options A configuration object for the new chart options.
	 *
	 * @param redraw Whether to redraw the chart.
	 *
	 * @param oneToOne When `true`, the `series`, `xAxis`, `yAxis` and `annotations` collections will be updated one to one, and items will be either added or
	 *            removed to match the new updated options. For example, if the chart has two series and we call `chart.update` with a configuration containing
	 *            three series, one will be added. If we call `chart.update` with one series, one will be removed. Setting an empty `series` array will remove
	 *            all series, but leaving out the`series` property will leave all series untouched. If the series have id's, the new series options will be
	 *            matched by id, and the remaining ones removed.
	 *
	 * @param animation Whether to apply animation, and optionally animation configuration.
	 *
	 * @fires Highcharts.Chart#update
	 * @fires Highcharts.Chart#afterUpdate
	 */
	native public void update(Options options, Boolean redraw, Boolean oneToOne, Partial2<AnimationOptionsObject> animation);

	/**
	 * The Chart class. The recommended constructor is Highcharts#chart.
	 *
	 * @param renderTo The DOM element to render to, or its id.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 */
	public Chart(HTMLElement renderTo, Options options) {
	}

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(ZAxisOptions options, Boolean isX, Boolean redraw);

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(YAxisOptions options, Boolean isX, Boolean redraw);

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(YAxisOptions options, Boolean isX);

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(ZAxisOptions options, Boolean isX);

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(ZAxisOptions options);

	/**
	 * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds
	 * expense to the calculations and rendering. When adding data at the same time as the chart is initialized, add the axis as a configuration option instead.
	 *
	 * @param options The axis options.
	 *
	 * @param isX Whether it is an X axis or a value axis.
	 *
	 * @param redraw Whether to redraw the chart after adding.
	 *
	 * @param animation Whether and how to apply animation in the redraw.
	 *
	 * @return The newly generated Axis object.
	 */
	native public Axis addAxis(YAxisOptions options);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	// native public void setSize(double width, double height);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	// native public void setSize(double width, double height);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	// native public void setSize(double width, double height);

	/**
	 * Resize the chart to a given width and height. In order to set the width only, the height argument may be skipped. To set the height only, pass
	 * `undefined` for the width.
	 *
	 * @param width The new pixel width of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value (when setting height
	 *            only), or `null` to adapt to the width of the containing element.
	 *
	 * @param height The new pixel height of the chart. Since v4.2.6, the argument can be `undefined` in order to preserve the current value, or `null` in order
	 *            to adapt to the height of the containing element.
	 *
	 * @param animation Whether and how to apply animation.
	 *
	 * @fires Highcharts.Chart#endResize
	 * @fires Highcharts.Chart#resize
	 */
	// native public void setSize(double width);

	native public String numberFormatter(Double p1, Double p2, String p3, String p4);

	protected Chart() {
	}
}
