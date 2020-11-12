package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) Titles for yAxes are taken from xAxis.categories. All options
 * for `xAxis.labels` applies to parallel coordinates titles. For example, to
 * style categories, use xAxis.labels.style.
 */
@jsweet.lang.Interface
public abstract class ChartParallelAxesTitleOptions extends def.js.Object {
    @jsweet.lang.Optional
    public Boolean reserveSpace;
    @jsweet.lang.Optional
    public String text;
    /**
     * (Highcharts) Alignment of the text, can be `"left"`, `"right"` or
     * `"center"`. Default alignment depends on the title.align:
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
}

