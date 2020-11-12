package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) The axis title, showing next to the
 * axis line.
 */
@jsweet.lang.Interface
public abstract class YAxisTitleOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Alignment of the title relative
     * to the axis values. Possible values are "low", "middle" or "high".
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.high,def.highcharts.StringTypes.low,def.highcharts.StringTypes.middle> align;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel distance between the
     * axis labels and the title. Positive values are outside the axis line,
     * negative are inside.
     */
    @jsweet.lang.Optional
    public double margin;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The distance of the axis title
     * from the axis line. By default, this distance is computed from the offset
     * width of the labels, the labels' distance from the axis and the title's
     * margin. However when the offset option is set, it overrides all this.
     */
    @jsweet.lang.Optional
    public double offset;
    /**
     * (Highcharts) Defines how the title is repositioned according to the 3D
     * chart orientation.
     *
     * - `'offset'`: Maintain a fixed horizontal/vertical distance from the tick
     * marks, despite the chart orientation. This is the backwards compatible
     * behavior, and causes skewing of X and Z axes.
     *
     * - `'chart'`: Preserve 3D position relative to the chart. This looks nice,
     * but hard to read if the text isn't forward-facing.
     *
     * - `'flap'`: Rotated text along the axis to compensate for the chart
     * orientation. This tries to maintain text as legible as possible on all
     * orientations.
     *
     * - `'ortho'`: Rotated text along the axis direction so that the labels are
     * orthogonal to the axis. This is very similar to `'flap'`, but prevents
     * skewing the labels (X and Y scaling are still present).
     *
     * - `undefined`: Will use the config from `labels.position3d`
     */
    @jsweet.lang.Optional
    public Object position3d;
    /**
     * (Highcharts, Highstock, Gantt) Whether to reserve space for the title
     * when laying out the axis.
     */
    @jsweet.lang.Optional
    public Boolean reserveSpace;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The rotation of the text in
     * degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
     */
    @jsweet.lang.Optional
    public double rotation;
    /**
     * (Highcharts) If enabled, the axis title will skewed to follow the
     * perspective.
     *
     * This will fix overlapping labels and titles, but texts become less
     * legible due to the distortion.
     *
     * The final appearance depends heavily on `title.position3d`.
     *
     * A `null` value will use the config from `labels.skew3d`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Object> skew3d;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title. If the
     * title text is longer than the axis length, it will wrap to multiple lines
     * by default. This can be customized by setting `textOverflow: 'ellipsis'`,
     * by setting a specific `width` or by setting `whiteSpace: 'nowrap'`.
     *
     * In styled mode, the stroke width is given in the `.highcharts-axis-title`
     * class.
     */
    @jsweet.lang.Optional
    public CSSObject style;
    /**
     * (Highcharts, Highstock, Gantt) The actual text of the axis title.
     * Horizontal texts can contain HTML, but rotated texts are painted using
     * vector techniques and must be clean text. The Y axis title is disabled by
     * setting the `text` option to `undefined`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Object> text;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Alignment of the text, can be
     * `"left"`, `"right"` or `"center"`. Default alignment depends on the
     * title.align:
     *
     * Horizontal axes:
     *
     * - for `align` = `"low"`, `textAlign` is set to `left`
     *
     * - for `align` = `"middle"`, `textAlign` is set to `center`
     *
     * - for `align` = `"high"`, `textAlign` is set to `right`
     *
     * Vertical axes:
     *
     * - for `align` = `"low"` and `opposite` = `true`, `textAlign` is set to
     * `right`
     *
     * - for `align` = `"low"` and `opposite` = `false`, `textAlign` is set to
     * `left`
     *
     * - for `align` = `"middle"`, `textAlign` is set to `center`
     *
     * - for `align` = `"high"` and `opposite` = `true` `textAlign` is set to
     * `left`
     *
     * - for `align` = `"high"` and `opposite` = `false` `textAlign` is set to
     * `right`
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> textAlign;
    /**
     * (Highcharts, Highstock, Gantt) Whether to use HTML to render the axis
     * title.
     */
    @jsweet.lang.Optional
    public Boolean useHTML;
    /**
     * (Highcharts, Highstock, Gantt) Horizontal pixel offset of the title
     * position.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock, Gantt) Vertical pixel offset of the title
     * position.
     */
    @jsweet.lang.Optional
    public double y;
}

