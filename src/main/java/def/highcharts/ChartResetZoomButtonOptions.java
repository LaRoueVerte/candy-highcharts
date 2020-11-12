package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) The button that appears after a
 * selection zoom, allowing the user to reset zoom.
 */
@jsweet.lang.Interface
public abstract class ChartResetZoomButtonOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<AlignObject,ChartResetZoomButtonPositionOptions> position;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) What frame the button placement
     * should be related to. Can be either `plotBox` or `spacingBox`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.plotBox,def.highcharts.StringTypes.spacingBox> relativeTo;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A collection of attributes for
     * the button. The object takes SVG attributes like `fill`, `stroke`,
     * `stroke-width` or `r`, the border radius. The theme also supports
     * `style`, a collection of CSS properties for the text. Equivalent
     * attributes for the hover state are given in `theme.states.hover`.
     */
    @jsweet.lang.Optional
    public SVGAttributes theme;
}

