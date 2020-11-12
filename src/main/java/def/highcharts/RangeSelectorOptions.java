package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highstock, Gantt) The range selector is a tool for selecting ranges to
 * display within the chart. It provides buttons to select preconfigured ranges
 * in the chart, like 1 day, 1 week, 1 month etc. It also provides input boxes
 * where min and max dates can be manually input.
 */
@jsweet.lang.Interface
public abstract class RangeSelectorOptions extends def.js.Object {
    /**
     * (Highstock, Gantt) Whether to enable all buttons from the start. By
     * default buttons are only enabled if the corresponding time range exists
     * on the X axis, but enabling all buttons allows for dynamically loading
     * different time ranges.
     */
    @jsweet.lang.Optional
    public Boolean allButtonsEnabled;
    /**
     * (Highstock, Gantt) Positioning for the button row.
     */
    @jsweet.lang.Optional
    public RangeSelectorButtonPositionOptions buttonPosition;
    /**
     * (Highstock, Gantt) An array of configuration objects for the buttons.
     *
     * Defaults to: (see online documentation for example)
     */
    @jsweet.lang.Optional
    public Array<RangeSelectorButtonsOptions> buttons;
    /**
     * (Highstock, Gantt) The space in pixels between the buttons in the range
     * selector.
     */
    @jsweet.lang.Optional
    public double buttonSpacing;
    /**
     * (Highstock, Gantt) A collection of attributes for the buttons. The object
     * takes SVG attributes like `fill`, `stroke`, `stroke-width`, as well as
     * `style`, a collection of CSS properties for the text.
     *
     * The object can also be extended with states, so you can set
     * presentational options for `hover`, `select` or `disabled` button states.
     *
     * CSS styles for the text label.
     *
     * In styled mode, the buttons are styled by the
     * `.highcharts-range-selector-buttons .highcharts-button` rule with its
     * different states.
     */
    @jsweet.lang.Optional
    public SVGAttributes buttonTheme;
    /**
     * (Highstock, Gantt) Enable or disable the range selector.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock, Gantt) When the rangeselector is floating, the plot area does
     * not reserve space for it. This opens for positioning anywhere on the
     * chart.
     */
    @jsweet.lang.Optional
    public Boolean floating;
    /**
     * (Highstock, Gantt) The border color of the date input boxes.
     */
    @jsweet.lang.Optional
    public String inputBoxBorderColor;
    /**
     * (Highstock, Gantt) The pixel height of the date input boxes.
     */
    @jsweet.lang.Optional
    public double inputBoxHeight;
    /**
     * (Highstock, Gantt) The pixel width of the date input boxes.
     */
    @jsweet.lang.Optional
    public double inputBoxWidth;
    /**
     * (Highstock, Gantt) The date format in the input boxes when not selected
     * for editing. Defaults to `%b %e, %Y`.
     */
    @jsweet.lang.Optional
    public String inputDateFormat;
    /**
     * (Highstock, Gantt) A custom callback function to parse values entered in
     * the input boxes and return a valid JavaScript time as milliseconds since
     * 1970. The first argument passed is a value to parse, second is a boolean
     * indicating use of the UTC time.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<String,Double> inputDateParser;
    /**
     * (Highstock, Gantt) The date format in the input boxes when they are
     * selected for editing. This must be a format that is recognized by
     * JavaScript Date.parse.
     */
    @jsweet.lang.Optional
    public String inputEditDateFormat;
    /**
     * (Highstock, Gantt) Enable or disable the date input boxes. Defaults to
     * enabled when there is enough space, disabled if not (typically mobile).
     */
    @jsweet.lang.Optional
    public Boolean inputEnabled;
    /**
     * (Highstock, Gantt) Positioning for the input boxes. Allowed properties
     * are `align`, `x` and `y`.
     */
    @jsweet.lang.Optional
    public RangeSelectorInputPositionOptions inputPosition;
    /**
     * (Highstock, Gantt) CSS for the HTML inputs in the range selector.
     *
     * In styled mode, the inputs are styled by the `.highcharts-range-input
     * text` rule in SVG mode, and `input.highcharts-range-selector` when
     * active.
     */
    @jsweet.lang.Optional
    public CSSObject inputStyle;
    /**
     * (Highstock, Gantt) CSS styles for the labels - the Zoom, From and To
     * texts.
     *
     * In styled mode, the labels are styled by the `.highcharts-range-label`
     * class.
     */
    @jsweet.lang.Optional
    public CSSObject labelStyle;
    /**
     * (Highstock, Gantt) The index of the button to appear pre-selected.
     */
    @jsweet.lang.Optional
    public double selected;
    /**
     * (Highstock, Gantt) The vertical alignment of the rangeselector box.
     * Allowed properties are `top`, `middle`, `bottom`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Highstock, Gantt) The x offset of the range selector relative to its
     * horizontal alignment within `chart.spacingLeft` and `chart.spacingRight`.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highstock, Gantt) The y offset of the range selector relative to its
     * horizontal alignment within `chart.spacingLeft` and `chart.spacingRight`.
     */
    @jsweet.lang.Optional
    public double y;
}

