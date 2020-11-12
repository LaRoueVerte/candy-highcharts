package def.highcharts;
/**
 * (Highcharts, Highmaps) Options for the drill up button that appears when
 * drilling down on a series. The text for the button is defined in
 * lang.drillUpText.
 */
@jsweet.lang.Interface
public abstract class DrilldownDrillUpButtonOptions extends def.js.Object {
    /**
     * (Highcharts, Highmaps) Positioning options for the button within the
     * `relativeTo` box. Available properties are `x`, `y`, `align` and
     * `verticalAlign`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<AlignObject,DrilldownDrillUpButtonPositionOptions> position;
    /**
     * (Highcharts, Highmaps) What box to align the button to. Can be either
     * `plotBox` or `spacingBox`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.plotBox,def.highcharts.StringTypes.spacingBox> relativeTo;
    /**
     * (Highcharts, Highmaps) A collection of attributes for the button. The
     * object takes SVG attributes like `fill`, `stroke`, `stroke-width` or `r`,
     * the border radius. The theme also supports `style`, a collection of CSS
     * properties for the text. Equivalent attributes for the hover state are
     * given in `theme.states.hover`.
     *
     * In styled mode, drill-up button styles can be applied with the
     * `.highcharts-drillup-button` class.
     */
    @jsweet.lang.Optional
    public Object theme;
}

