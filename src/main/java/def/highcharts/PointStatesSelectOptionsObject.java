package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock) The appearance of the point marker when selected. In
 * order to allow a point to be selected, set the `series.allowPointSelect`
 * option to true.
 */
@jsweet.lang.Interface
public abstract class PointStatesSelectOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock) Enable or disable visible feedback for selection.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock) The fill color of the point marker.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fillColor;
    /**
     * (Highcharts, Highmaps) Set the marker's fixed height on select state.
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
     * `undefined`, the series' or point's color is used.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> lineColor;
    /**
     * (Highcharts, Highstock) The width of the point marker's outline.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highcharts, Highstock) The radius of the point marker. In hover state,
     * it defaults to the normal state's radius + 2.
     */
    @jsweet.lang.Optional
    public double radius;
    /**
     * (Highcharts, Highmaps) Set the marker's fixed width on select state.
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

