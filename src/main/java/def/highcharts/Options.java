package def.highcharts;

import def.js.Array;

@jsweet.lang.Interface
public abstract class Options extends def.js.Object {
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Options for configuring accessibility for the chart. Requires the accessibility module to be loaded. For a
	 * description of the module and information on its features, see Highcharts Accessibility.
	 */
	@jsweet.lang.Optional
	public AccessibilityOptions accessibility;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) A basic type of an annotation. It allows to add custom labels or shapes. The items can be tied to points, axis
	 * coordinates or chart pixel coordinates.
	 */
	@jsweet.lang.Optional
	public Array<AnnotationsOptions> annotations;
	@jsweet.lang.Optional
	public BoostOptions boost;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The chart's caption, which will render below the chart and will be part of exported charts. The caption can be
	 * updated after chart initialization through the `Chart.update` or `Chart.caption.update` methods.
	 */
	@jsweet.lang.Optional
	public CaptionOptions caption;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) General options for the chart.
	 */
	@jsweet.lang.Optional
	public ChartOptions chart;
	/**
	 * (Highcharts, Highstock, Highmaps) A color axis for series. Visually, the color axis will appear as a gradient or as separate items inside the legend,
	 * depending on whether the axis is scalar or based on data classes.
	 *
	 * For supported color formats, see the docs article about colors.
	 *
	 * A scalar color axis is represented by a gradient. The colors either range between the minColor and the maxColor, or for more fine grained control the
	 * colors can be defined in stops. Often times, the color axis needs to be adjusted to get the right color spread for the data. In addition to stops,
	 * consider using a logarithmic axis type, or setting min and max to avoid the colors being determined by outliers.
	 *
	 * When dataClasses are used, the ranges are subdivided into separate classes like categories based on their values. This can be used for ranges between two
	 * values, but also for a true category. However, when your data is categorized, it may be as convenient to add each category to a separate series.
	 *
	 * Color axis does not work with: `sankey`, `sunburst`, `dependencywheel`, `networkgraph`, `wordcloud`, `venn`, `gauge` and `solidgauge` series types.
	 *
	 * Since v7.2.0 `colorAxis` can also be an array of options objects.
	 *
	 * See the Axis object for programmatic access to the axis.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<ColorAxisOptions, Array<ColorAxisOptions>> colorAxis;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) An array containing the default colors for the chart's series. When all colors are used, new colors are pulled
	 * from the start again.
	 *
	 * Default colors can also be set on a series or series.type basis, see column.colors, pie.colors.
	 *
	 * In styled mode, the colors option doesn't exist. Instead, colors are defined in CSS and applied either through series or point class names, or through
	 * the chart.colorCount option.
	 *
	 * ### Legacy
	 *
	 * In Highcharts 3.x, the default colors were: (see online documentation for example)
	 *
	 * In Highcharts 2.x, the default colors were: (see online documentation for example)
	 */
	@jsweet.lang.Optional
	public Array<String> colors;
	/**
	 * (Gantt) The Pathfinder module allows you to define connections between any two points, represented as lines - optionally with markers for the start
	 * and/or end points. Multiple algorithms are available for calculating how the connecting lines are drawn.
	 *
	 * Connector functionality requires Highcharts Gantt to be loaded. In Gantt charts, the connectors are used to draw dependencies between tasks.
	 */
	@jsweet.lang.Optional
	public ConnectorsOptions connectors;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Highchart by default puts a credits label in the lower right corner of the chart. This can be changed using
	 * these options.
	 */
	@jsweet.lang.Optional
	public CreditsOptions credits;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The Data module provides a simplified interface for adding data to a chart from sources like CVS, HTML tables or
	 * grid views. See also the tutorial article on the Data module.
	 *
	 * It requires the `modules/data.js` file to be loaded.
	 *
	 * Please note that the default way of adding data in Highcharts, without the need of a module, is through the series._type_.data option.
	 */
	@jsweet.lang.Optional
	public DataOptions data;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Options for configuring markers for annotations.
	 *
	 * An example of the arrow marker: (see online documentation for example)
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<DefsOptions, Dictionary<SVGDefinitionObject>> defs;
	/**
	 * (Highcharts, Highmaps) Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart items like columns
	 * or pie slices.
	 *
	 * The drilldown feature requires the drilldown.js file to be loaded, found in the modules directory of the download package, or online at
	 * code.highcharts.com/modules/drilldown.js.
	 */
	@jsweet.lang.Optional
	public DrilldownOptions drilldown;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Options for the exporting module. For an overview on the matter, see the docs.
	 */
	@jsweet.lang.Optional
	public ExportingOptions exporting;
	@jsweet.lang.Optional
	public GlobalOptions global;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Language object. The language object is global and it can't be set on each chart initialization. Instead, use
	 * `Highcharts.setOptions` to set it before any chart is initialized. (see online documentation for example)
	 */
	@jsweet.lang.Optional
	public LangOptions lang;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The legend is a box containing a symbol and name for each series item or point item in the chart. Each series
	 * (or points in case of pie charts) is represented by a symbol and its name in the legend.
	 *
	 * It is possible to override the symbol creator function and create custom legend symbols.
	 */
	@jsweet.lang.Optional
	public LegendOptions legend;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The loading options control the appearance of the loading screen that covers the plot area on chart operations.
	 * This screen only appears after an explicit call to `chart.showLoading()`. It is a utility for developers to communicate to the end user that something is
	 * going on, for example while retrieving new data via an XHR connection. The "Loading..." text itself is not part of this configuration object, but part of
	 * the `lang` object.
	 */
	@jsweet.lang.Optional
	public LoadingOptions loading;
	@jsweet.lang.Optional
	public MapNavigationOptions mapNavigation;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for buttons and menus appearing in the exporting module.
	 */
	@jsweet.lang.Optional
	public NavigationOptions navigation;
	/**
	 * (Highstock, Gantt) The navigator is a small series below the main series, displaying a view of the entire data set. It provides tools to zoom in and out
	 * on parts of the data as well as panning across the dataset.
	 */
	@jsweet.lang.Optional
	public NavigatorOptions navigator;
	/**
	 * (Highcharts, Highstock, Gantt) Options for displaying a message like "No data to display". This feature requires the file no-data-to-display.js to be
	 * loaded in the page. The actual text to display is set in the lang.noData option.
	 */
	@jsweet.lang.Optional
	public NoDataOptions noData;
	/**
	 * (Highcharts) The pane serves as a container for axes and backgrounds for circular gauges and polar charts.
	 */
	@jsweet.lang.Optional
	public PaneOptions pane;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The plotOptions is a wrapper object for config objects for each series type. The config objects for each series
	 * can also be overridden for each series item as given in the series array.
	 *
	 * Configuration options for the series are given in three levels. Options for all series in a chart are given in the plotOptions.series object. Then
	 * options for all series of a specific type are given in the plotOptions of that type, for example `plotOptions.line`. Next, options for one single series
	 * are given in the series array.
	 */
	@jsweet.lang.Optional
	public PlotOptions plotOptions;
	/**
	 * (Highstock, Gantt) The range selector is a tool for selecting ranges to display within the chart. It provides buttons to select preconfigured ranges in
	 * the chart, like 1 day, 1 week, 1 month etc. It also provides input boxes where min and max dates can be manually input.
	 */
	@jsweet.lang.Optional
	public RangeSelectorOptions rangeSelector;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Allows setting a set of rules to apply for different screen or chart sizes. Each rule specifies additional chart
	 * options.
	 */
	@jsweet.lang.Optional
	public ResponsiveOptions responsive;
	/**
	 * (Highstock, Gantt) The scrollbar is a means of panning over the X axis of a stock chart. Scrollbars can also be applied to other types of axes.
	 *
	 * Another approach to scrollable charts is the chart.scrollablePlotArea option that is especially suitable for simpler cartesian charts on mobile.
	 *
	 * In styled mode, all the presentational options for the scrollbar are replaced by the classes `.highcharts-scrollbar-thumb`,
	 * `.highcharts-scrollbar-arrow`, `.highcharts-scrollbar-button`, `.highcharts-scrollbar-rifles` and `.highcharts-scrollbar-track`.
	 */
	@jsweet.lang.Optional
	public ScrollbarOptions scrollbar;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Series options for specific data and the data itself. In TypeScript you have to cast the series options to
	 * specific series types, to get all possible options for a series.
	 */
	@jsweet.lang.Optional
	public Array<SeriesOptions> series;
	/**
	 * (Highstock) Configure the stockTools gui strings in the chart. Requires the [stockTools module]() to be loaded. For a description of the module and
	 * information on its features, see [Highcharts StockTools]().
	 */
	@jsweet.lang.Optional
	public StockToolsOptions stockTools;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The chart's subtitle. This can be used both to display a subtitle below the main title, and to display random
	 * text anywhere in the chart. The subtitle can be updated after chart initialization through the `Chart.setTitle` method.
	 */
	@jsweet.lang.Optional
	public SubtitleOptions subtitle;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Time options that can apply globally or to individual charts. These settings affect how `datetime` axes are laid
	 * out, how tooltips are formatted, how series pointIntervalUnit works and how the Highstock range selector handles time.
	 *
	 * The common use case is that all charts in the same Highcharts object share the same time settings, in which case the global settings are set using
	 * `setOptions`. (see online documentation for example)
	 *
	 * Since v6.0.5, the time options were moved from the `global` obect to the `time` object, and time options can be set on each individual chart.
	 */
	@jsweet.lang.Optional
	public TimeOptions time;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The chart's main title.
	 */
	@jsweet.lang.Optional
	public TitleOptions title;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Options for the tooltip that appears when the user hovers over a series or point.
	 */
	@jsweet.lang.Optional
	public TooltipOptions tooltip;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The X axis or category axis. Normally this is the horizontal axis, though if the chart is inverted this is the
	 * vertical axis. In case of multiple axes, the xAxis node is an array of configuration objects.
	 *
	 * See the Axis class for programmatic access to the axis.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<XAxisOptions, Array<XAxisOptions>> xAxis;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The Y axis or value axis. Normally this is the vertical axis, though if the chart is inverted this is the
	 * horizontal axis. In case of multiple axes, the yAxis node is an array of configuration objects.
	 *
	 * See the Axis object for programmatic access to the axis.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<YAxisOptions, Array<YAxisOptions>> yAxis;
	/**
	 * (Highcharts) The Z axis or depth axis for 3D plots.
	 *
	 * See the Axis class for programmatic access to the axis.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<ZAxisOptions, Array<ZAxisOptions>> zAxis;
}
