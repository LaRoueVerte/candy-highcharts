package def.highcharts;

import def.dom.HTMLElement;
import def.js.Array;
import def.js.Function;
import jsweet.util.function.Function4;
import jsweet.util.union.Union3;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) General options for the chart.
 */
@jsweet.lang.Interface
public abstract class ChartOptions extends def.js.Object {
	/**
	 * (Highcharts, Highstock, Gantt) When using multiple axis, the ticks of two or more opposite axes will automatically be aligned by adding ticks to the axis
	 * or axes with the least ticks, as if `tickAmount` were specified.
	 *
	 * This can be prevented by setting `alignTicks` to false. If the grid lines look messy, it's a good idea to hide them for the secondary axis by setting
	 * `gridLineWidth` to 0.
	 *
	 * If `startOnTick` or `endOnTick` in an Axis options are set to false, then the `alignTicks ` will be disabled for the Axis.
	 *
	 * Disabled for logarithmic axes.
	 */
	@jsweet.lang.Optional
	public Boolean alignTicks;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Set the overall animation for all chart updating. Animation can be disabled throughout the chart by setting it
	 * to false here. It can be overridden for each individual API method as a function parameter. The only animation not affected by this option is the initial
	 * series animation, see plotOptions.series.animation.
	 *
	 * The animation can either be set as a boolean or a configuration object. If `true`, it will use the 'swing' jQuery easing and a duration of 500 ms. If
	 * used as a configuration object, the following properties are supported:
	 *
	 * - `defer`: The animation delay time in milliseconds.
	 *
	 * - `duration`: The duration of the animation in milliseconds.
	 *
	 * - `easing`: A string reference to an easing function set on the `Math` object. See the easing demo.
	 *
	 * When zooming on a series with less than 100 points, the chart redraw will be done with animation, but in case of more data points, it is necessary to set
	 * this option to ensure animation on zoom.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Boolean, Partial2<AnimationOptionsObject>> animation;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient for the outer chart area.
	 */
	@jsweet.lang.Optional
	public Union3<String, GradientColorObject, PatternObject> backgroundColor;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The color of the outer chart border.
	 */
	@jsweet.lang.Optional
	public Union3<String, GradientColorObject, PatternObject> borderColor;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The corner radius of the outer chart border.
	 */
	@jsweet.lang.Optional
	public double borderRadius;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the outer chart border.
	 */
	@jsweet.lang.Optional
	public double borderWidth;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the charts container `div`, allowing unique CSS styling for each chart.
	 */
	@jsweet.lang.Optional
	public String className;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) In styled mode, this sets how many colors the class names should rotate between. With ten colors, series (or
	 * points) are given class names like `highcharts-color-0`, `highcharts-color-0` [...] `highcharts-color-9`. The equivalent in non-styled mode is to set
	 * colors using the colors setting.
	 */
	@jsweet.lang.Optional
	public double colorCount;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Whether to display errors on the chart. When `false`, the errors will be shown only in the console.
	 */
	@jsweet.lang.Optional
	public Boolean displayErrors;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Event listeners for the chart.
	 */
	@jsweet.lang.Optional
	public ChartEventsOptions events;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) An explicit height for the chart. If a _number_, the height is given in pixels. If given a _percentage string_
	 * (for example `'56%'`), the height is given as the percentage of the actual chart width. This allows for preserving the aspect ratio across responsive
	 * sizes.
	 *
	 * By default (when `null`) the height is calculated from the offset height of the containing element, or 400 pixels if the containing element's height is
	 * 0.
	 */
	@jsweet.lang.Optional
	public Union3<Double, String, Object> height;
	/**
	 * (Highcharts, Highstock, Gantt) If true, the axes will scale to the remaining visible series once one series is hidden. If false, hiding and showing a
	 * series will not affect the axes or the other series. For stacks, once one series within the stack is hidden, the rest of the stack will close in around
	 * it even if the axis is not affected.
	 */
	@jsweet.lang.Optional
	public Boolean ignoreHiddenSeries;
	/**
	 * (Highcharts, Highstock, Gantt) Whether to invert the axes so that the x axis is vertical and y axis is horizontal. When `true`, the x axis is reversed by
	 * default.
	 */
	@jsweet.lang.Optional
	public Boolean inverted;
	/**
	 * (Highmaps) Default `mapData` for all series. If set to a string, it functions as an index into the `Highcharts.maps` array. Otherwise it is interpreted
	 * as map data.
	 */
	@jsweet.lang.Optional
	public Union3<String, GeoJSON, Array<?>> map;
	/**
	 * (Highmaps) Set lat/lon transformation definitions for the chart. If not defined, these are extracted from the map data.
	 */
	@jsweet.lang.Optional
	public Object mapTransforms;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The margin between the outer edge of the chart and the plot area. The numbers in the array designate top, right,
	 * bottom and left respectively. Use the options `marginTop`, `marginRight`, `marginBottom` and `marginLeft` for shorthand setting of one option.
	 *
	 * By default there is no margin. The actual space is dynamically calculated from the offset of axis labels, axis title, title, subtitle and legend in
	 * addition to the `spacingTop`, `spacingRight`, `spacingBottom` and `spacingLeft` options.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Double, Array<Double>> margin;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The margin between the bottom outer edge of the chart and the plot area. Use this to set a fixed pixel value for
	 * the margin as opposed to the default dynamic margin. See also `spacingBottom`.
	 */
	@jsweet.lang.Optional
	public double marginBottom;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The margin between the left outer edge of the chart and the plot area. Use this to set a fixed pixel value for
	 * the margin as opposed to the default dynamic margin. See also `spacingLeft`.
	 */
	@jsweet.lang.Optional
	public double marginLeft;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The margin between the right outer edge of the chart and the plot area. Use this to set a fixed pixel value for
	 * the margin as opposed to the default dynamic margin. See also `spacingRight`.
	 */
	@jsweet.lang.Optional
	public double marginRight;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The margin between the top outer edge of the chart and the plot area. Use this to set a fixed pixel value for
	 * the margin as opposed to the default dynamic margin. See also `spacingTop`.
	 */
	@jsweet.lang.Optional
	public double marginTop;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Callback function to override the default function that formats all the numbers in the chart. Returns a string
	 * with the formatted number.
	 */
	@jsweet.lang.Optional
	public Function4<Double, Double, String, String, String> numberFormatter;
	/**
	 * (Highcharts) Options to render charts in 3 dimensions. This feature requires `highcharts-3d.js`, found in the download package or online at
	 * code.highcharts.com/highcharts-3d.js.
	 */
	@jsweet.lang.Optional
	public Chart3dOptions options3d;
	/**
	 * (Highcharts, Gantt) Allows setting a key to switch between zooming and panning. Can be one of `alt`, `ctrl`, `meta` (the command key on Mac and Windows
	 * key on Windows) or `shift`. The keys are mapped directly to the key properties of the click event argument (`event.altKey`, `event.ctrlKey`,
	 * `event.metaKey` and `event.shiftKey`).
	 */
	@jsweet.lang.Optional
	public Object panKey;
	/**
	 * (Highcharts, Highstock, Gantt) Allow panning in a chart. Best used with panKey to combine zooming and panning.
	 *
	 * On touch devices, when the tooltip.followTouchMove option is `true` (default), panning requires two fingers. To allow panning with one finger, set
	 * `followTouchMove` to `false`.
	 */
	@jsweet.lang.Optional
	public ChartPanningOptions panning;
	/**
	 * (Highcharts) Common options for all yAxes rendered in a parallel coordinates plot. This feature requires `modules/parallel-coordinates.js`.
	 *
	 * The default options are: (see online documentation for example)
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<ChartParallelAxesOptions, Array<ChartParallelAxesOptions>> parallelAxes;
	/**
	 * (Highcharts) Flag to render charts as a parallel coordinates plot. In a parallel coordinates plot (||-coords) by default all required yAxes are generated
	 * and the legend is disabled. This feature requires `modules/parallel-coordinates.js`.
	 */
	@jsweet.lang.Optional
	public Boolean parallelCoordinates;
	/**
	 * (Highcharts, Highstock, Gantt) Equivalent to zoomType, but for multitouch gestures only. By default, the `pinchType` is the same as the `zoomType`
	 * setting. However, pinching can be enabled separately in some cases, for example in stock charts where a mouse drag pans the chart, while pinching is
	 * enabled. When tooltip.followTouchMove is true, pinchType only applies to two-finger touches.
	 */
	@jsweet.lang.Optional
	public Union3<def.highcharts.StringTypes.x, def.highcharts.StringTypes.xy, def.highcharts.StringTypes.y> pinchType;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient for the plot area.
	 */
	@jsweet.lang.Optional
	public Union3<String, GradientColorObject, PatternObject> plotBackgroundColor;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as the plot background. To set an image as the background for the entire chart, set
	 * a CSS background image to the container element. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export
	 * server.
	 */
	@jsweet.lang.Optional
	public String plotBackgroundImage;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The color of the inner chart or plot area border.
	 */
	@jsweet.lang.Optional
	public Union3<String, GradientColorObject, PatternObject> plotBorderColor;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the plot area border.
	 */
	@jsweet.lang.Optional
	public double plotBorderWidth;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. The shadow can be an
	 * object configuration containing `color`, `offsetX`, `offsetY`, `opacity` and `width`.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Boolean, CSSObject> plotShadow;
	/**
	 * (Highcharts) When true, cartesian charts like line, spline, area and column are transformed into the polar coordinate system. This produces _polar
	 * charts_, also known as _radar charts_.
	 */
	@jsweet.lang.Optional
	public Boolean polar;
	/**
	 * (Highmaps) Allows to manually load the proj4 library from Highcharts options instead of the `window`. In case of loading the library from a `script` tag,
	 * this option is not needed, it will be loaded from there by default.
	 */
	@jsweet.lang.Optional
	public Function proj4;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Whether to reflow the chart to fit the width of the container div on resizing the window.
	 */
	@jsweet.lang.Optional
	public Boolean reflow;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML
	 * element can also be passed by direct reference, or as the first argument of the chart constructor, in which case the option is not needed.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<String, HTMLElement> renderTo;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The button that appears after a selection zoom, allowing the user to reset zoom.
	 */
	@jsweet.lang.Optional
	public ChartResetZoomButtonOptions resetZoomButton;
	/**
	 * (Highcharts, Gantt) Options for a scrollable plot area. This feature provides a minimum size for the plot area of the chart. If the size gets smaller
	 * than this, typically on mobile devices, a native browser scrollbar is presented. This scrollbar provides smooth scrolling for the contents of the plot
	 * area, whereas the title, legend and unaffected axes are fixed.
	 *
	 * Since v7.1.2, a scrollable plot area can be defined for either horizontal or vertical scrolling, depending on whether the `minWidth` or `minHeight`
	 * option is set.
	 */
	@jsweet.lang.Optional
	public ChartScrollablePlotAreaOptions scrollablePlotArea;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The background color of the marker square when selecting (zooming in on) an area of the chart.
	 */
	@jsweet.lang.Optional
	public Union3<String, GradientColorObject, PatternObject> selectionMarkerFill;

	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow to the outer chart area. Requires that backgroundColor be set. The shadow can be
	 * an object configuration containing `color`, `offsetX`, `offsetY`, `opacity` and `width`.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Boolean, CSSObject> shadow;
	/**
	 * (Highcharts, Gantt) Whether to show the axes initially. This only applies to empty charts where series are added dynamically, as axes are automatically
	 * added to cartesian series.
	 */
	@jsweet.lang.Optional
	public Boolean showAxes;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The distance between the outer edge of the chart and the content, like title or legend, or axis title and labels
	 * if present. The numbers in the array designate top, right, bottom and left respectively. Use the options spacingTop, spacingRight, spacingBottom and
	 * spacingLeft options for shorthand setting of one option.
	 */
	@jsweet.lang.Optional
	public Array<Double> spacing;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The space between the bottom edge of the chart and the content (plot area, axis title and labels, title,
	 * subtitle or legend in top position).
	 */
	@jsweet.lang.Optional
	public double spacingBottom;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The space between the left edge of the chart and the content (plot area, axis title and labels, title, subtitle
	 * or legend in top position).
	 */
	@jsweet.lang.Optional
	public double spacingLeft;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The space between the right edge of the chart and the content (plot area, axis title and labels, title, subtitle
	 * or legend in top position).
	 */
	@jsweet.lang.Optional
	public double spacingRight;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The space between the top edge of the chart and the content (plot area, axis title and labels, title, subtitle
	 * or legend in top position).
	 */
	@jsweet.lang.Optional
	public double spacingTop;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Additional CSS styles to apply inline to the container `div`. Note that since the default font styles are
	 * applied in the renderer, it is ignorant of the individual chart options and must be set globally.
	 */
	@jsweet.lang.Optional
	public CSSObject style;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply styled mode. When in styled mode, no presentational attributes or CSS are applied to the chart
	 * SVG. Instead, CSS rules are required to style the chart. The default style sheet is available from `https://code.highcharts.com/css/highcharts.css`.
	 */
	@jsweet.lang.Optional
	public Boolean styledMode;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The default series type for the chart. Can be any of the chart types listed under plotOptions and series or can
	 * be a series provided by an additional module.
	 *
	 * In TypeScript this option has no effect in sense of typing and instead the `type` option must always be set in the series.
	 */
	@jsweet.lang.Optional
	public String type;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) An explicit width for the chart. By default (when `null`) the width is calculated from the offset width of the
	 * containing element.
	 */
	@jsweet.lang.Optional
	public Union3<Double, String, Object> width;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Set a key to hold when dragging to zoom the chart. This is useful to avoid zooming while moving points. Should
	 * be set different than chart.panKey.
	 */
	@jsweet.lang.Optional
	public Object zoomKey;
	/**
	 * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can zoom by dragging the mouse. Can be one of `x`, `y` or `xy`.
	 */
	@jsweet.lang.Optional
	public Union3<def.highcharts.StringTypes.x, def.highcharts.StringTypes.xy, def.highcharts.StringTypes.y> zoomType;

	native public String numberFormatter(Double p1, Double p2, String p3, String p4);

	native public java.lang.Object proj4(java.lang.Object... args);
}
