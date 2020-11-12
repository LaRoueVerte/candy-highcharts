package def.highcharts;

import jsweet.util.union.Union3;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The legend is a box containing a symbol and name for each series item or point item in the chart. Each series (or
 * points in case of pie charts) is represented by a symbol and its name in the legend.
 *
 * It is possible to override the symbol creator function and create custom legend symbols.
 */
@jsweet.lang.Interface
public abstract class LegendOptions extends def.js.Object {
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the legend. Requires the Accessibility module.
	 */
	@jsweet.lang.Optional
	public LegendAccessibilityOptions accessibility;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the legend box within the chart area. Valid values are `left`, `center` and `right`.
	 *
	 * In the case that the legend is aligned in a corner position, the `layout` option will determine whether to place it above/below or on the side of the
	 * plot area.
	 */
	@jsweet.lang.Optional
	public Union3<def.highcharts.StringTypes.center, def.highcharts.StringTypes.left, def.highcharts.StringTypes.right> align;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) If the layout is `horizontal` and the legend items span over two lines or more, whether to align the items into
	 * vertical columns. Setting this to `false` makes room for more items, but will look more messy.
	 */
	@jsweet.lang.Optional
	public Boolean alignColumns;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The background color of the legend.
	 */
	@jsweet.lang.Optional
	public Union3<String, GradientColorObject, PatternObject> backgroundColor;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border around the legend.
	 */
	@jsweet.lang.Optional
	public Union3<String, GradientColorObject, PatternObject> borderColor;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The border corner radius of the legend.
	 */
	@jsweet.lang.Optional
	public double borderRadius;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The width of the drawn border around the legend.
	 */
	@jsweet.lang.Optional
	public double borderWidth;
	/**
	 * (Highcharts, Highstock, Highmaps) The bubble legend is an additional element in legend which presents the scale of the bubble series. Individual bubble
	 * ranges can be defined by user or calculated from series. In the case of automatically calculated ranges, a 1px margin of error is permitted.
	 */
	@jsweet.lang.Optional
	public LegendBubbleLegendOptions bubbleLegend;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the legend. There is also a series-specific option, showInLegend, that can hide the series
	 * from the legend. In some series types this is `false` by default, so it must set to `true` in order to show the legend for the series.
	 */
	@jsweet.lang.Optional
	public Boolean enabled;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) When the legend is floating, the plot area ignores it and is allowed to be placed below it.
	 */
	@jsweet.lang.Optional
	public Boolean floating;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Default styling for the checkbox next to a legend item when `showCheckbox` is true.
	 */
	@jsweet.lang.Optional
	public CSSObject itemCheckboxStyle;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) In a legend with horizontal layout, the itemDistance defines the pixel distance between each item.
	 */
	@jsweet.lang.Optional
	public double itemDistance;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is
	 * supported, notably those options related to text. Properties are inherited from `style` unless overridden here.
	 */
	@jsweet.lang.Optional
	public CSSObject itemHiddenStyle;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related
	 * to text. Properties are inherited from `style` unless overridden here.
	 */
	@jsweet.lang.Optional
	public CSSObject itemHoverStyle;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The pixel bottom margin for each legend item.
	 */
	@jsweet.lang.Optional
	public double itemMarginBottom;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The pixel top margin for each legend item.
	 */
	@jsweet.lang.Optional
	public double itemMarginTop;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text. The
	 * default `textOverflow` property makes long texts truncate. Set it to `undefined` to wrap text instead. A `width` property can be added to control the
	 * text width.
	 */
	@jsweet.lang.Optional
	public CSSObject itemStyle;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The width for each legend item. By default the items are laid out successively. In a horizontal layout, if the
	 * items are laid out across two rows or more, they will be vertically aligned depending on the legend.alignColumns option.
	 */
	@jsweet.lang.Optional
	public double itemWidth;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) A format string for each legend label. Available variables relates to properties on the series, or the point in
	 * case of pies.
	 */
	@jsweet.lang.Optional
	public String labelFormat;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format each of the series' labels. The `this` keyword refers to the series object, or the
	 * point object in case of pie charts. By default the series or point name is printed.
	 */
	@jsweet.lang.Optional
	public java.util.function.Function<String, String> labelFormatter;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The layout of the legend items. Can be one of `horizontal` or `vertical` or `proximate`. When `proximate`, the
	 * legend items will be placed as close as possible to the graphs they're representing, except in inverted charts or when the legend position doesn't allow
	 * it.
	 */
	@jsweet.lang.Optional
	public Union3<def.highcharts.StringTypes.horizontal, def.highcharts.StringTypes.proximate, def.highcharts.StringTypes.vertical> layout;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the
	 * space between the legend and the axis labels or plot area.
	 */
	@jsweet.lang.Optional
	public double margin;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Maximum pixel height for the legend. When the maximum height is extended, navigation will show.
	 */
	@jsweet.lang.Optional
	public double maxHeight;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Options for the paging or navigation appearing when the legend is overflown. Navigation works well on screen,
	 * but not in static exported images. One way of working around that is to increase the chart height in export.
	 */
	@jsweet.lang.Optional
	public LegendNavigationOptions navigation;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The inner padding of the legend box.
	 */
	@jsweet.lang.Optional
	public double padding;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Whether to reverse the order of the legend items compared to the order of the series or points as defined in the
	 * configuration object.
	 */
	@jsweet.lang.Optional
	public Boolean reversed;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the symbol on the right side of the text rather than the left side. This is common in Arabic and
	 * Hebraic.
	 */
	@jsweet.lang.Optional
	public Boolean rtl;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow to the legend. A `backgroundColor` also needs to be applied for this to take
	 * effect. The shadow can be an object configuration containing `color`, `offsetX`, `offsetY`, `opacity` and `width`.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Boolean, CSSObject> shadow;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) When this is true, the legend symbol width will be the same as the symbol height, which in turn defaults to the
	 * font size of the legend items.
	 */
	@jsweet.lang.Optional
	public Boolean squareSymbol;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The pixel height of the symbol for series types that use a rectangle in the legend. Defaults to the font size of
	 * legend items.
	 */
	@jsweet.lang.Optional
	public double symbolHeight;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The pixel padding between the legend item symbol and the legend item text.
	 */
	@jsweet.lang.Optional
	public double symbolPadding;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The border radius of the symbol for series types that use a rectangle in the legend. Defaults to half the
	 * `symbolHeight`.
	 */
	@jsweet.lang.Optional
	public double symbolRadius;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the legend item symbol. When the `squareSymbol` option is set, this defaults to the
	 * `symbolHeight`, otherwise 16.
	 */
	@jsweet.lang.Optional
	public double symbolWidth;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) A title to be added on top of the legend.
	 */
	@jsweet.lang.Optional
	public LegendTitleOptions title;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render the legend item texts.
	 *
	 * Prior to 4.1.7, when using HTML, legend.navigation was disabled.
	 */
	@jsweet.lang.Optional
	public Boolean useHTML;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the legend box. Can be one of `top`, `middle` or `bottom`. Vertical position can be
	 * further determined by the `y` option.
	 *
	 * In the case that the legend is aligned in a corner position, the `layout` option will determine whether to place it above/below or on the side of the
	 * plot area.
	 *
	 * When the layout option is `proximate`, the `verticalAlign` option doesn't apply.
	 */
	@jsweet.lang.Optional
	public Union3<def.highcharts.StringTypes.bottom, def.highcharts.StringTypes.middle, def.highcharts.StringTypes.top> verticalAlign;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The width of the legend box. If a number is set, it translates to pixels. Since v7.0.2 it allows setting a
	 * percent string of the full chart width, for example `40%`.
	 *
	 * Defaults to the full chart width for legends below or above the chart, half the chart width for legends to the left and right.
	 */
	@jsweet.lang.Optional
	public jsweet.util.union.Union<Double, String> width;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The x offset of the legend relative to its horizontal alignment `align` within chart.spacingLeft and
	 * chart.spacingRight. Negative x moves it to the left, positive x moves it to the right.
	 */
	@jsweet.lang.Optional
	public double x;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the legend relative to it's vertical alignment `verticalAlign` within chart.spacingTop
	 * and chart.spacingBottom. Negative y moves it up, positive y moves it down.
	 */
	@jsweet.lang.Optional
	public double y;
}
