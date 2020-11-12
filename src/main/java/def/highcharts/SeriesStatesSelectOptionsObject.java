package def.highcharts;
/**
 * (Highstock) Specific options for point in selected states, after being
 * selected by allowPointSelect or programmatically.
 */
@jsweet.lang.Interface
public abstract class SeriesStatesSelectOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock) Animation setting for hovering the graph in
     * line-type series.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highmaps) The border color of the point in this state.
     */
    @jsweet.lang.Optional
    public Object borderColor;
    /**
     * (Highmaps) The border width of the point in this state
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highmaps) The color of the shape in this state.
     */
    @jsweet.lang.Optional
    public Object color;
    /**
     * (Highstock) Enable separate styles for the hovered series to visualize
     * that the user hovers either the series itself or the legend.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock) Options for the halo appearing around the hovered
     * point in line-type series as well as outside the hovered slice in pie
     * charts. By default the halo is filled by the current point or series
     * color with an opacity of 0.25\. The halo can be disabled by setting the
     * `halo` option to `null`.
     *
     * In styled mode, the halo is styled with the `.highcharts-halo` class,
     * with colors inherited from `.highcharts-color-{n}`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<SeriesStatesHoverHaloOptionsObject,Object> halo;
    /**
     * (Highcharts, Highstock) Pixel width of the graph line. By default this
     * property is undefined, and the `lineWidthPlus` property dictates how much
     * to increase the linewidth from normal state.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highcharts, Highstock) The additional line width for the graph of a
     * hovered series.
     */
    @jsweet.lang.Optional
    public double lineWidthPlus;
}

