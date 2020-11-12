package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highstock) Options for the hovered series. These settings override the
 * normal state options when a series is moused over or touched.
 */
@jsweet.lang.Interface
public abstract class SeriesStatesHoverOptionsObject extends def.js.Object {
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
     * (Highmaps) The relative brightness of the point when hovered, relative to
     * the normal point color.
     */
    @jsweet.lang.Optional
    public double brightness;
    /**
     * (Highmaps) The color of the shape in this state.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highstock) Enable separate styles for the hovered series to visualize
     * that the user hovers either the series itself or the legend.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock) The fill or background color of the flag.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fillColor;
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
     * (Highstock) The color of the line/border of the flag.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> lineColor;
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
    /**
     * (Highcharts, Highstock, Gantt) Opacity for the links between nodes in the
     * sankey diagram in hover mode.
     */
    @jsweet.lang.Optional
    public double linkOpacity;
    /**
     * (Highcharts) The opacity of a point in treemap. When a point has
     * children, the visibility of the children is determined by the opacity.
     */
    @jsweet.lang.Optional
    public double opacity;
    /**
     * (Highcharts) The shadow option for hovered state.
     */
    @jsweet.lang.Optional
    public Boolean shadow;
}

