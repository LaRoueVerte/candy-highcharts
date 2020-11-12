package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the series data labels,
 * appearing next to each data point.
 *
 * Since v6.2.0, multiple data labels can be applied to each single point by
 * defining them as an array of configs.
 *
 * In styled mode, the data labels can be styled with the
 * `.highcharts-data-label-box` and `.highcharts-data-label` class names (see
 * example).
 */
@jsweet.lang.Interface
public abstract class PlotSmaDataLabelsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The alignment of the data label
     * compared to the point. If `right`, the right side of the label should be
     * touching the point. For points with an extent, like columns, the
     * alignments also dictates how to align it inside the box, as given with
     * the inside option. Can be one of `left`, `center` or `right`.
     */
    @jsweet.lang.Optional
    public Object align;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow data labels to
     * overlap. To make the labels less sensitive for overlapping, the
     * dataLabels.padding can be set to 0.
     */
    @jsweet.lang.Optional
    public Boolean allowOverlap;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the initial
     * animation when a series is displayed for the `dataLabels`. The animation
     * can also be set as a configuration object. Please note that this option
     * only applies to the initial animation. For other animations, see
     * chart.animation and the animation parameter under the API methods. The
     * following properties are supported:
     *
     * - `defer`: The animation delay time in milliseconds.
     */
    @jsweet.lang.Optional
    public Union3<Boolean,PlotSmaDataLabelsAnimationOptions,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
     * for the data label.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> backgroundColor;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
     * label. Defaults to `undefined`.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
     * the data label.
     */
    @jsweet.lang.Optional
    public double borderRadius;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
     * the data label.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A class name for the data label.
     * Particularly in styled mode, this can be used to give each series' or
     * point's data label unique styling. In addition to this option, a default
     * color class name is added so that we can give the labels a contrast text
     * shadow.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
     * labels. Defaults to `undefined`. For certain series types, like column or
     * map, the data labels can be drawn inside the points. In this case the
     * data label will be drawn with maximum contrast by default. Additionally,
     * it will be given a `text-outline` style with the opposite color, to
     * further increase the contrast. This can be overridden by setting the
     * `text-outline` style to `none` in the `dataLabels.style` option.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide data labels that
     * are outside the plot area. By default, the data label is moved inside the
     * plot area according to the overflow option.
     */
    @jsweet.lang.Optional
    public Boolean crop;
    /**
     * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
     * labels until the initial series animation has finished. Setting to
     * `false` renders the data label immediately. If set to `true` inherits the
     * defer time set in plotOptions.series.animation.
     */
    @jsweet.lang.Optional
    public Boolean defer;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the data
     * labels.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A declarative filter to control
     * of which data labels to display. The declarative filter is designed for
     * use when callback functions are not available, like when the chart
     * options require a pure JSON structure or for use with graphical editors.
     * For programmatic control, use the `formatter` instead, and return
     * `undefined` to disable a single data label.
     */
    @jsweet.lang.Optional
    public DataLabelsFilterOptionsObject filter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
     * label. Available variables are the same as for `formatter`.
     */
    @jsweet.lang.Optional
    public String format;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
     * format the data label. Note that if a `format` is defined, the format
     * takes precedence and the formatter is ignored.
     */
    @jsweet.lang.Optional
    public Object formatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) For points with an extent, like
     * columns or map areas, whether to align the data label inside the box or
     * to the actual value point. Defaults to `false` in most cases, `true` in
     * stacked columns.
     */
    @jsweet.lang.Optional
    public Boolean inside;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
     * of null. Works analogously to format. `nullFormat` can be applied only to
     * series which support displaying null points.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,String> nullFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function
     * that defines formatting for points with the value of null. Works
     * analogously to formatter. `nullPointFormatter` can be applied only to
     * series which support displaying null points.
     */
    @jsweet.lang.Optional
    public Object nullFormatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) How to handle data labels that
     * flow outside the plot area. The default is `"justify"`, which aligns them
     * inside the plot area. For columns and bars, this means it will be moved
     * inside the bar. To display data labels outside the plot area, set `crop`
     * to `false` and `overflow` to `"allow"`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.allow,def.highcharts.StringTypes.justify> overflow;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When either the `borderWidth` or
     * the `backgroundColor` is set, this is the padding within the box.
     */
    @jsweet.lang.Optional
    public double padding;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Aligns data labels relative to
     * points. If `center` alignment is not possible, it defaults to `right`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> position;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Text rotation in degrees. Note
     * that due to a more complex structure, backgrounds, borders and padding
     * will be lost on a rotated data label.
     */
    @jsweet.lang.Optional
    public double rotation;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
     * best with `borderWidth` or `backgroundColor`. Since 2.3 the shadow can be
     * an object configuration containing `color`, `offsetX`, `offsetY`,
     * `opacity` and `width`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,ShadowOptionsObject> shadow;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
     * the border around the label. Symbols are predefined functions on the
     * Renderer object.
     */
    @jsweet.lang.Optional
    public String shape;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Styles for the label. The
     * default `color` setting is `"contrast"`, which is a pseudo color that
     * Highcharts picks up and applies the maximum contrast to the underlying
     * point item, for example the bar in a bar chart.
     *
     * The `textOutline` is a pseudo property that applies an outline of the
     * given width with the given color, which by default is the maximum
     * contrast to the text. So a bright text color will result in a black text
     * outline for maximum readability on a mixed background. In some cases,
     * especially with grayscale text, the text outline doesn't work well, in
     * which cases it can be disabled by setting it to `"none"`. When `useHTML`
     * is true, the `textOutline` will not be picked up. In this, case, the same
     * effect can be acheived through the `text-shadow` CSS property.
     *
     * For some series types, where each point has an extent, like for example
     * tree maps, the data label may overflow the point. There are two
     * strategies for handling overflow. By default, the text will wrap to
     * multiple lines. The other strategy is to set `style.textOverflow` to
     * `ellipsis`, which will keep the text on one line plus it will break
     * inside long words.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for a label text which
     * should follow marker's shape. Border and background are disabled for a
     * label that follows a path.
     *
     * **Note:** Only SVG-based renderer supports this option. Setting `useHTML`
     * to true will disable this option.
     */
    @jsweet.lang.Optional
    public DataLabelsTextPathOptionsObject textPath;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
     * the labels.
     */
    @jsweet.lang.Optional
    public Boolean useHTML;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of a data
     * label. Can be one of `top`, `middle` or `bottom`. The default value
     * depends on the data, for instance in a column chart, the label is above
     * positive values and below negative values.
     */
    @jsweet.lang.Optional
    public Object verticalAlign;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
     * label relative to the point in pixels.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
     * label relative to the point in pixels.
     */
    @jsweet.lang.Optional
    public double y;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the data labels.
     * The default Z index puts it above the series. Use a Z index of 2 to
     * display it behind the series.
     */
    @jsweet.lang.Optional
    public double z;
}

