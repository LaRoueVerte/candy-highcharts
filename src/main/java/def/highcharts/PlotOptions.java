package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) The plotOptions is a wrapper object
 * for config objects for each series type. The config objects for each series
 * can also be overridden for each series item as given in the series array.
 *
 * Configuration options for the series are given in three levels. Options for
 * all series in a chart are given in the plotOptions.series object. Then
 * options for all series of a specific type are given in the plotOptions of
 * that type, for example `plotOptions.line`. Next, options for one single
 * series are given in the series array.
 */
@jsweet.lang.Interface
public abstract class PlotOptions extends def.js.Object {
    /**
     * (Highstock) Acceleration bands (ABANDS). This series requires the
     * `linkedTo` option to be set and should be loaded after the
     * `stock/indicators/indicators.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `abands` series are defined in plotOptions.abands.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotAbandsOptions abands;
    /**
     * (Highstock) Accumulation Distribution (AD). This series requires
     * `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `ad` series are defined in plotOptions.ad.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotAdOptions ad;
    /**
     * (Highstock) Awesome Oscillator. This series requires the `linkedTo`
     * option to be set and should be loaded after the
     * `stock/indicators/indicators.js`
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `ao` series are defined in plotOptions.ao.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotAoOptions ao;
    /**
     * (Highstock) Absolute Price Oscillator. This series requires the
     * `linkedTo` option to be set and should be loaded after the
     * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `apo` series are defined in plotOptions.apo.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotApoOptions apo;
    /**
     * (Highcharts, Highstock) The area series type.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `area` series are defined in plotOptions.area.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotAreaOptions area;
    /**
     * (Highcharts, Highstock) The area range series is a carteseian series with
     * higher and lower values for each point along an X axis, where the area
     * between the values is shaded.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `arearange` series are defined in
     * plotOptions.arearange.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotArearangeOptions arearange;
    /**
     * (Highcharts, Highstock) The area spline series is an area series where
     * the graph between the points is smoothed into a spline.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `areaspline` series are defined in
     * plotOptions.areaspline.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotAreasplineOptions areaspline;
    /**
     * (Highcharts, Highstock) The area spline range is a cartesian series type
     * with higher and lower Y values along an X axis. The area inside the range
     * is colored, and the graph outlining the area is a smoothed spline.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `areasplinerange` series are defined in
     * plotOptions.areasplinerange.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotAreasplinerangeOptions areasplinerange;
    /**
     * (Highstock) Aroon. This series requires the `linkedTo` option to be set
     * and should be loaded after the `stock/indicators/indicators.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `aroon` series are defined in plotOptions.aroon.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotAroonOptions aroon;
    /**
     * (Highstock) Aroon Oscillator. This series requires the `linkedTo` option
     * to be set and should be loaded after the `stock/indicators/indicators.js`
     * and `stock/indicators/aroon.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `aroonoscillator` series are defined in
     * plotOptions.aroonoscillator.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotAroonoscillatorOptions aroonoscillator;
    /**
     * (Highstock) Average true range indicator (ATR). This series requires
     * `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `atr` series are defined in plotOptions.atr.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotAtrOptions atr;
    /**
     * (Highcharts) A bar series is a special type of column series where the
     * columns are horizontal.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `bar` series are defined in plotOptions.bar.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotBarOptions bar;
    /**
     * (Highstock) Bollinger bands (BB). This series requires the `linkedTo`
     * option to be set and should be loaded after the
     * `stock/indicators/indicators.js` file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `bb` series are defined in plotOptions.bb.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotBbOptions bb;
    /**
     * (Highcharts) A bell curve is an areaspline series which represents the
     * probability density function of the normal distribution. It calculates
     * mean and standard deviation of the base series data and plots the curve
     * according to the calculated parameters.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `bellcurve` series are defined in
     * plotOptions.bellcurve.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotBellcurveOptions bellcurve;
    /**
     * (Highcharts) A box plot is a convenient way of depicting groups of data
     * through their five-number summaries: the smallest observation (sample
     * minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and
     * largest observation (sample maximum).
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `boxplot` series are defined in plotOptions.boxplot.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotBoxplotOptions boxplot;
    /**
     * (Highcharts, Highstock) A bubble series is a three dimensional series
     * type where each point renders an X, Y and Z value. Each points is drawn
     * as a bubble where the position along the X and Y axes mark the X and Y
     * values, and the size of the bubble relates to the Z value.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `bubble` series are defined in plotOptions.bubble.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotBubbleOptions bubble;
    /**
     * (Highcharts) A bullet graph is a variation of a bar graph. The bullet
     * graph features a single measure, compares it to a target, and displays it
     * in the context of qualitative ranges of performance that could be set
     * using plotBands on yAxis.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `bullet` series are defined in plotOptions.bullet.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotBulletOptions bullet;
    /**
     * (Highstock) A candlestick chart is a style of financial chart used to
     * describe price movements over time.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `candlestick` series are defined in
     * plotOptions.candlestick.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotCandlestickOptions candlestick;
    /**
     * (Highstock) Commodity Channel Index (CCI). This series requires
     * `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `cci` series are defined in plotOptions.cci.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotCciOptions cci;
    /**
     * (Highstock) Chaikin Oscillator. This series requires the `linkedTo`
     * option to be set and should be loaded after the
     * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `chaikin` series are defined in plotOptions.chaikin.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotChaikinOptions chaikin;
    /**
     * (Highstock) Chaikin Money Flow indicator (cmf).
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `cmf` series are defined in plotOptions.cmf.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotCmfOptions cmf;
    /**
     * (Highcharts, Highstock) Column series display one column per value along
     * an X axis.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `column` series are defined in plotOptions.column.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotColumnOptions column;
    /**
     * (Highcharts, Highstock) Column pyramid series display one pyramid per
     * value along an X axis. To display horizontal pyramids, set chart.inverted
     * to `true`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `columnpyramid` series are defined in
     * plotOptions.columnpyramid.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotColumnpyramidOptions columnpyramid;
    /**
     * (Highcharts, Highstock) The column range is a cartesian series type with
     * higher and lower Y values along an X axis. To display horizontal bars,
     * set chart.inverted to `true`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `columnrange` series are defined in
     * plotOptions.columnrange.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotColumnrangeOptions columnrange;
    /**
     * (Highcharts) A cylinder graph is a variation of a 3d column graph. The
     * cylinder graph features cylindrical points.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `cylinder` series are defined in plotOptions.cylinder.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotCylinderOptions cylinder;
    /**
     * (Highstock) Double exponential moving average (DEMA) indicator. This
     * series requires `linkedTo` option to be set and should be loaded after
     * the `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `dema` series are defined in plotOptions.dema.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotDemaOptions dema;
    /**
     * (Highcharts) A dependency wheel chart is a type of flow diagram, where
     * all nodes are laid out in a circle, and the flow between the are drawn as
     * link bands.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `dependencywheel` series are defined in
     * plotOptions.dependencywheel.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotDependencywheelOptions dependencywheel;
    /**
     * (Highstock) Detrended Price Oscillator. This series requires the
     * `linkedTo` option to be set and should be loaded after the
     * `stock/indicators/indicators.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `dpo` series are defined in plotOptions.dpo.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotDpoOptions dpo;
    /**
     * (Highcharts, Highstock) The dumbbell series is a cartesian series with
     * higher and lower values for each point along an X axis, connected with a
     * line between the values. Requires `highcharts-more.js` and
     * `modules/dumbbell.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `dumbbell` series are defined in plotOptions.dumbbell.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotDumbbellOptions dumbbell;
    /**
     * (Highstock) Exponential moving average indicator (EMA). This series
     * requires the `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `ema` series are defined in plotOptions.ema.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotEmaOptions ema;
    /**
     * (Highcharts, Highstock) Error bars are a graphical representation of the
     * variability of data and are used on graphs to indicate the error, or
     * uncertainty in a reported measurement.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `errorbar` series are defined in plotOptions.errorbar.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotErrorbarOptions errorbar;
    /**
     * (Highstock) Flags are used to mark events in stock charts. They can be
     * added on the timeline, or attached to a specific series.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `flags` series are defined in plotOptions.flags.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotFlagsOptions flags;
    /**
     * (Highcharts) Funnel charts are a type of chart often used to visualize
     * stages in a sales project, where the top are the initial stages with the
     * most clients. It requires that the modules/funnel.js file is loaded.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `funnel` series are defined in plotOptions.funnel.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotFunnelOptions funnel;
    /**
     * (Highcharts) A funnel3d is a 3d version of funnel series type. Funnel
     * charts are a type of chart often used to visualize stages in a sales
     * project, where the top are the initial stages with the most clients.
     *
     * It requires that the `highcharts-3d.js`, `cylinder.js` and `funnel3d.js`
     * module are loaded.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `funnel3d` series are defined in plotOptions.funnel3d.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotFunnel3dOptions funnel3d;
    /**
     * (Gantt) A `gantt` series. If the type option is not specified, it is
     * inherited from chart.type.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `gantt` series are defined in plotOptions.gantt.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotGanttOptions gantt;
    /**
     * (Highcharts) Gauges are circular plots displaying one or more values with
     * a dial pointing to values along the perimeter.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `gauge` series are defined in plotOptions.gauge.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotGaugeOptions gauge;
    /**
     * (Highcharts, Highmaps) A heatmap is a graphical representation of data
     * where the individual values contained in a matrix are represented as
     * colors.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `heatmap` series are defined in plotOptions.heatmap.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotHeatmapOptions heatmap;
    /**
     * (Highcharts) A histogram is a column series which represents the
     * distribution of the data set in the base series. Histogram splits data
     * into bins and shows their frequencies.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `histogram` series are defined in
     * plotOptions.histogram.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotHistogramOptions histogram;
    /**
     * (Highstock) Ichimoku Kinko Hyo (IKH). This series requires `linkedTo`
     * option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `ikh` series are defined in plotOptions.ikh.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotIkhOptions ikh;
    /**
     * (Highcharts) An item chart is an infographic chart where a number of
     * items are laid out in either a rectangular or circular pattern. It can be
     * used to visualize counts within a group, or for the circular pattern,
     * typically a parliament.
     *
     * The circular layout has much in common with a pie chart. Many of the item
     * series options, like `center`, `size` and data label positioning, are
     * inherited from the pie series and don't apply for rectangular layouts.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `item` series are defined in plotOptions.item.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotItemOptions item;
    /**
     * (Highstock) Keltner Channels. This series requires the `linkedTo` option
     * to be set and should be loaded after the
     * `stock/indicators/indicators.js`, `stock/indicators/atr.js`, and
     * `stock/ema/.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `keltnerchannels` series are defined in
     * plotOptions.keltnerchannels.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotKeltnerchannelsOptions keltnerchannels;
    /**
     * (Highcharts, Highstock) A line series displays information as a series of
     * data points connected by straight line segments.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `line` series are defined in plotOptions.line.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotLineOptions line;
    /**
     * (Highstock) Linear regression indicator. This series requires `linkedTo`
     * option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `linearregression` series are defined in
     * plotOptions.linearregression.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotLinearregressionOptions linearregression;
    /**
     * (Highstock) Linear regression angle indicator. This series requires
     * `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `linearregressionangle` series are defined in
     * plotOptions.linearregressionangle.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotLinearregressionangleOptions linearregressionangle;
    /**
     * (Highstock) Linear regression intercept indicator. This series requires
     * `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `linearregressionintercept` series are defined in
     * plotOptions.linearregressionintercept.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotLinearregressioninterceptOptions linearregressionintercept;
    /**
     * (Highstock) Linear regression slope indicator. This series requires
     * `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `linearregressionslope` series are defined in
     * plotOptions.linearregressionslope.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotLinearregressionslopeOptions linearregressionslope;
    /**
     * (Highcharts, Highstock) The lollipop series is a carteseian series with a
     * line anchored from the x axis and a dot at the end to mark the value.
     * Requires `highcharts-more.js`, `modules/dumbbell.js` and
     * `modules/lollipop.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `lollipop` series are defined in plotOptions.lollipop.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotLollipopOptions lollipop;
    /**
     * (Highstock) Moving Average Convergence Divergence (MACD). This series
     * requires `linkedTo` option to be set and should be loaded after the
     * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `macd` series are defined in plotOptions.macd.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotMacdOptions macd;
    /**
     * (Highmaps) The map series is used for basic choropleth maps, where each
     * map area has a color based on its value.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `map` series are defined in plotOptions.map.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotMapOptions map;
    /**
     * (Highmaps) A map bubble series is a bubble series laid out on top of a
     * map series, where each bubble is tied to a specific map area.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `mapbubble` series are defined in
     * plotOptions.mapbubble.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotMapbubbleOptions mapbubble;
    /**
     * (Highmaps) A mapline series is a special case of the map series where the
     * value colors are applied to the strokes rather than the fills. It can
     * also be used for freeform drawing, like dividers, in the map.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `mapline` series are defined in plotOptions.mapline.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotMaplineOptions mapline;
    /**
     * (Highmaps) A mappoint series is a special form of scatter series where
     * the points can be laid out in map coordinates on top of a map.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `mappoint` series are defined in plotOptions.mappoint.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotMappointOptions mappoint;
    /**
     * (Highstock) Money Flow Index. This series requires `linkedTo` option to
     * be set and should be loaded after the `stock/indicators/indicators.js`
     * file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `mfi` series are defined in plotOptions.mfi.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotMfiOptions mfi;
    /**
     * (Highstock) Momentum. This series requires `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `momentum` series are defined in plotOptions.momentum.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotMomentumOptions momentum;
    /**
     * (Highstock) Normalized average true range indicator (NATR). This series
     * requires `linkedTo` option to be set and should be loaded after the
     * `stock/indicators/indicators.js` and `stock/indicators/atr.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `natr` series are defined in plotOptions.natr.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotNatrOptions natr;
    /**
     * (Highcharts) A networkgraph is a type of relationship chart, where
     * connnections (links) attracts nodes (points) and other nodes repulse each
     * other.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `networkgraph` series are defined in
     * plotOptions.networkgraph.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotNetworkgraphOptions networkgraph;
    /**
     * (Highstock) An OHLC chart is a style of financial chart used to describe
     * price movements over time. It displays open, high, low and close values
     * per data point.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `ohlc` series are defined in plotOptions.ohlc.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotOhlcOptions ohlc;
    /**
     * (Highcharts) An organization chart is a diagram that shows the structure
     * of an organization and the relationships and relative ranks of its parts
     * and positions.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `organization` series are defined in
     * plotOptions.organization.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotOrganizationOptions organization;
    /**
     * (Highcharts) A packed bubble series is a two dimensional series type,
     * where each point renders a value in X, Y position. Each point is drawn as
     * a bubble where the bubbles don't overlap with each other and the radius
     * of the bubble relates to the value.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `packedbubble` series are defined in
     * plotOptions.packedbubble.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotPackedbubbleOptions packedbubble;
    /**
     * (Highcharts) A pareto diagram is a type of chart that contains both bars
     * and a line graph, where individual values are represented in descending
     * order by bars, and the cumulative total is represented by the line.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `pareto` series are defined in plotOptions.pareto.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotParetoOptions pareto;
    /**
     * (Highstock) Price channel (PC). This series requires the `linkedTo`
     * option to be set and should be loaded after the
     * `stock/indicators/indicators.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `pc` series are defined in plotOptions.pc.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotPcOptions pc;
    /**
     * (Highcharts) A pie chart is a circular graphic which is divided into
     * slices to illustrate numerical proportion.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `pie` series are defined in plotOptions.pie.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotPieOptions pie;
    /**
     * (Highstock) Pivot points indicator. This series requires the `linkedTo`
     * option to be set and should be loaded after
     * `stock/indicators/indicators.js` file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `pivotpoints` series are defined in
     * plotOptions.pivotpoints.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotPivotpointsOptions pivotpoints;
    /**
     * (Highcharts, Highstock) A polygon series can be used to draw any freeform
     * shape in the cartesian coordinate system. A fill is applied with the
     * `color` option, and stroke is applied through `lineWidth` and `lineColor`
     * options.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `polygon` series are defined in plotOptions.polygon.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotPolygonOptions polygon;
    /**
     * (Highstock) Percentage Price Oscillator. This series requires the
     * `linkedTo` option to be set and should be loaded after the
     * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `ppo` series are defined in plotOptions.ppo.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotPpoOptions ppo;
    /**
     * (Highstock) Price envelopes indicator based on SMA calculations. This
     * series requires the `linkedTo` option to be set and should be loaded
     * after the `stock/indicators/indicators.js` file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `priceenvelopes` series are defined in
     * plotOptions.priceenvelopes.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotPriceenvelopesOptions priceenvelopes;
    /**
     * (Highstock) Parabolic SAR. This series requires `linkedTo` option to be
     * set and should be loaded after `stock/indicators/indicators.js` file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `psar` series are defined in plotOptions.psar.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotPsarOptions psar;
    /**
     * (Highcharts) A pyramid series is a special type of funnel, without neck
     * and reversed by default.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `pyramid` series are defined in plotOptions.pyramid.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotPyramidOptions pyramid;
    /**
     * (Highcharts) A pyramid3d is a 3d version of pyramid series type. Pyramid
     * charts are a type of chart often used to visualize stages in a sales
     * project, where the top are the initial stages with the most clients.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `pyramid3d` series are defined in
     * plotOptions.pyramid3d.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotPyramid3dOptions pyramid3d;
    /**
     * (Highstock) Rate of change indicator (ROC). The indicator value for each
     * point is defined as:
     *
     * `(C - Cn) / Cn * 100`
     *
     * where: `C` is the close value of the point of the same x in the linked
     * series and `Cn` is the close value of the point `n` periods ago. `n` is
     * set through period.
     *
     * This series requires `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `roc` series are defined in plotOptions.roc.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotRocOptions roc;
    /**
     * (Highstock) Relative strength index (RSI) technical indicator. This
     * series requires the `linkedTo` option to be set and should be loaded
     * after the `stock/indicators/indicators.js` file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `rsi` series are defined in plotOptions.rsi.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotRsiOptions rsi;
    /**
     * (Highcharts) A sankey diagram is a type of flow diagram, in which the
     * width of the link between two nodes is shown proportionally to the flow
     * quantity.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `sankey` series are defined in plotOptions.sankey.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotSankeyOptions sankey;
    /**
     * (Highcharts, Highstock) A scatter plot uses cartesian coordinates to
     * display values for two variables for a set of data.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `scatter` series are defined in plotOptions.scatter.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotScatterOptions scatter;
    /**
     * (Highcharts) A 3D scatter plot uses x, y and z coordinates to display
     * values for three variables for a set of data.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `scatter3d` series are defined in
     * plotOptions.scatter3d.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotScatter3dOptions scatter3d;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) General options for all series
     * types.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `line` series are defined in plotOptions.line.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotSeriesOptions series;
    /**
     * (Highstock) Slow Stochastic oscillator. This series requires the
     * `linkedTo` option to be set and should be loaded after
     * `stock/indicators/indicators.js` and `stock/indicators/stochastic.js`
     * files.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `slowstochastic` series are defined in
     * plotOptions.slowstochastic.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotSlowstochasticOptions slowstochastic;
    /**
     * (Highstock) Simple moving average indicator (SMA). This series requires
     * `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `sma` series are defined in plotOptions.sma.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotSmaOptions sma;
    /**
     * (Highcharts) A solid gauge is a circular gauge where the value is
     * indicated by a filled arc, and the color of the arc may variate with the
     * value.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `solidgauge` series are defined in
     * plotOptions.solidgauge.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotSolidgaugeOptions solidgauge;
    /**
     * (Highcharts, Highstock) A spline series is a special type of line series,
     * where the segments between the data points are smoothed.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `spline` series are defined in plotOptions.spline.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotSplineOptions spline;
    /**
     * (Highstock) Stochastic oscillator. This series requires the `linkedTo`
     * option to be set and should be loaded after the
     * `stock/indicators/indicators.js` file.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `stochastic` series are defined in
     * plotOptions.stochastic.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotStochasticOptions stochastic;
    /**
     * (Highcharts, Highstock) A streamgraph is a type of stacked area graph
     * which is displaced around a central axis, resulting in a flowing, organic
     * shape.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `streamgraph` series are defined in
     * plotOptions.streamgraph.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotStreamgraphOptions streamgraph;
    /**
     * (Highcharts) A Sunburst displays hierarchical data, where a level in the
     * hierarchy is represented by a circle. The center represents the root node
     * of the tree. The visualization bears a resemblance to both treemap and
     * pie charts.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `sunburst` series are defined in plotOptions.sunburst.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotSunburstOptions sunburst;
    /**
     * (Highstock) Supertrend indicator. This series requires the `linkedTo`
     * option to be set and should be loaded after the
     * `stock/indicators/indicators.js` and `stock/indicators/sma.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `supertrend` series are defined in
     * plotOptions.supertrend.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotSupertrendOptions supertrend;
    /**
     * (Highstock) Triple exponential moving average (TEMA) indicator. This
     * series requires `linkedTo` option to be set and should be loaded after
     * the `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `tema` series are defined in plotOptions.tema.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotTemaOptions tema;
    /**
     * (Highcharts, Highmaps) A tilemap series is a type of heatmap where the
     * tile shapes are configurable.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `tilemap` series are defined in plotOptions.tilemap.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotTilemapOptions tilemap;
    /**
     * (Highcharts) The timeline series presents given events along a drawn
     * line.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `timeline` series are defined in plotOptions.timeline.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotTimelineOptions timeline;
    /**
     * (Highcharts) A treemap displays hierarchical data using nested
     * rectangles. The data can be laid out in varying ways depending on
     * options.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `treemap` series are defined in plotOptions.treemap.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotTreemapOptions treemap;
    /**
     * (Highstock) Trendline (linear regression) fits a straight line to the
     * selected data using a method called the Sum Of Least Squares. This series
     * requires the `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `trendline` series are defined in
     * plotOptions.trendline.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotTrendlineOptions trendline;
    /**
     * (Highstock) Triple exponential average (TRIX) oscillator. This series
     * requires `linkedTo` option to be set.
     *
     * Requires https://code.highcharts.com/stock/indicators/ema.js and
     * https://code.highcharts.com/stock/indicators/tema.js.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `trix` series are defined in plotOptions.trix.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotTrixOptions trix;
    /**
     * (Highcharts) A variable pie series is a two dimensional series type,
     * where each point renders an Y and Z value. Each point is drawn as a pie
     * slice where the size (arc) of the slice relates to the Y value and the
     * radius of pie slice relates to the Z value.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `variablepie` series are defined in
     * plotOptions.variablepie.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotVariablepieOptions variablepie;
    /**
     * (Highcharts) A variwide chart (related to marimekko chart) is a column
     * chart with a variable width expressing a third dimension.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `variwide` series are defined in plotOptions.variwide.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotVariwideOptions variwide;
    /**
     * (Highstock) Volume By Price indicator.
     *
     * This series requires `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `vbp` series are defined in plotOptions.vbp.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotVbpOptions vbp;
    /**
     * (Highcharts, Highstock) A vector plot is a type of cartesian chart where
     * each point has an X and Y position, a length and a direction. Vectors are
     * drawn as arrows.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `vector` series are defined in plotOptions.vector.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotVectorOptions vector;
    /**
     * (Highcharts) A Venn diagram displays all possible logical relations
     * between a collection of different sets. The sets are represented by
     * circles, and the relation between the sets are displayed by the overlap
     * or lack of overlap between them. The venn diagram is a special case of
     * Euler diagrams, which can also be displayed by this series type.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `venn` series are defined in plotOptions.venn.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotVennOptions venn;
    /**
     * (Highstock) Volume Weighted Average Price indicator.
     *
     * This series requires `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `vwap` series are defined in plotOptions.vwap.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotVwapOptions vwap;
    /**
     * (Highcharts) A waterfall chart displays sequentially introduced positive
     * or negative values in cumulative columns.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `waterfall` series are defined in
     * plotOptions.waterfall.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotWaterfallOptions waterfall;
    /**
     * (Highstock) Williams %R. This series requires the `linkedTo` option to be
     * set and should be loaded after the `stock/indicators/indicators.js`.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `williamsr` series are defined in
     * plotOptions.williamsr.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotWilliamsrOptions williamsr;
    /**
     * (Highcharts, Highstock) Wind barbs are a convenient way to represent wind
     * speed and direction in one graphical form. Wind direction is given by the
     * stem direction, and wind speed by the number and shape of barbs.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `windbarb` series are defined in plotOptions.windbarb.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotWindbarbOptions windbarb;
    /**
     * (Highstock) Weighted moving average indicator (WMA). This series requires
     * `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `wma` series are defined in plotOptions.wma.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotWmaOptions wma;
    /**
     * (Highcharts) A word cloud is a visualization of a set of words, where the
     * size and placement of a word is determined by how it is weighted.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `wordcloud` series are defined in
     * plotOptions.wordcloud.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotWordcloudOptions wordcloud;
    /**
     * (Highcharts, Highstock, Gantt) The X-range series displays ranges on the
     * X axis, typically time intervals with a start and end date.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `xrange` series are defined in plotOptions.xrange.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotXrangeOptions xrange;
    /**
     * (Highstock) Zig Zag indicator.
     *
     * This series requires `linkedTo` option to be set.
     *
     * In TypeScript the type option must always be set.
     *
     * Configuration options for the series are given in three levels:
     *
     * 1. Options for all series in a chart are defined in the
     * plotOptions.series object.
     *
     * 2. Options for all `zigzag` series are defined in plotOptions.zigzag.
     *
     * 3. Options for one single series are given in the series instance array.
     * (see online documentation for example)
     */
    @jsweet.lang.Optional
    public PlotZigzagOptions zigzag;
}

