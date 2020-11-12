package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock) The hover state for a single point marker.
 */
@jsweet.lang.Interface
public abstract class PointStatesHoverOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock) Animation when hovering over the marker.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts, Highstock) Enable or disable the point marker.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock) The fill color of the marker in hover state. When
     * `undefined`, the series' or point's fillColor for normal state is used.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fillColor;
    /**
     * (Highcharts, Highmaps) Set the marker's fixed height on hover state.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> height;
    /**
     * (Highcharts, Highstock) The number of pixels to increase the height of
     * the hovered point.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> heightPlus;
    /**
     * (Highcharts, Highstock) The color of the point marker's outline. When
     * `undefined`, the series' or point's lineColor for normal state is used.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> lineColor;
    /**
     * (Highcharts, Highstock) The width of the point marker's outline. When
     * `undefined`, the series' or point's lineWidth for normal state is used.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highcharts, Highstock) The additional line width for a hovered point.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> lineWidthPlus;
    /**
     * (Highcharts, Highstock) The radius of the point marker. In hover state,
     * it defaults to the normal state's radius + 2 as per the radiusPlus
     * option.
     */
    @jsweet.lang.Optional
    public double radius;
    /**
     * (Highcharts, Highstock) The number of pixels to increase the radius of
     * the hovered point.
     */
    @jsweet.lang.Optional
    public double radiusPlus;
    /**
     * (Highcharts, Highmaps) Set the marker's fixed width on hover state.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> width;
    /**
     * (Highcharts, Highstock) The number of pixels to increase the width of the
     * hovered point.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> widthPlus;
}

