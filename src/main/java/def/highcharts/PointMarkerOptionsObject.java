package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock) Options for the point markers of line-like series.
 */
@jsweet.lang.Interface
public abstract class PointMarkerOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps) Animation for the marker as it moves
     * between values. Set to `false` to disable animation. Defaults to `{
     * duration: 50 }`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts, Highstock, Highmaps) The color of the marker.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Highstock) Enable or disable the point marker. If
     * `undefined`, the markers are hidden when the data is dense, and shown for
     * more widespread data points.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock) The threshold for how dense the point markers
     * should be before they are hidden, given that `enabled` is not defined.
     * The number indicates the horizontal distance between the two closest
     * points in the series, as multiples of the `marker.radius`. In other
     * words, the default value of 2 means points are hidden if overlapping
     * horizontally.
     */
    @jsweet.lang.Optional
    public double enabledThreshold;
    /**
     * (Highcharts, Highstock) The fill color of the point marker. When
     * `undefined`, the series' or point's color is used.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fillColor;
    /**
     * (Highcharts) The fill opacity of the bubble markers.
     */
    @jsweet.lang.Optional
    public double fillOpacity;
    /**
     * (Highcharts, Highstock) Image markers only. Set the image width
     * explicitly. When using this option, a `width` must also be set.
     */
    @jsweet.lang.Optional
    public double height;
    /**
     * (Highcharts, Highstock) The color of the point marker's outline. When
     * `undefined`, the series' or point's color is used.
     */
    @jsweet.lang.Optional
    public Object lineColor;
    /**
     * (Highcharts, Highstock) The width of the point marker's outline.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highcharts, Highstock) The radius of the point marker.
     */
    @jsweet.lang.Optional
    public double radius;
    /**
     * (Highcharts, Highstock) States for a single point marker.
     */
    @jsweet.lang.Optional
    public PointStatesOptionsObject states;
    /**
     * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
     * undefined, the symbol is pulled from options.symbols. Other possible
     * values are `'circle'`, `'square'`,`'diamond'`, `'triangle'` and
     * `'triangle-down'`.
     *
     * Additionally, the URL to a graphic can be given on this form:
     * `'url(graphic.png)'`. Note that for the image to be applied to exported
     * charts, its URL needs to be accessible by the export server.
     *
     * Custom callbacks for symbol path generation can also be added to
     * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
     * its method name, as shown in the demo.
     */
    @jsweet.lang.Optional
    public Object symbol;
    /**
     * (Highcharts, Highstock) Image markers only. Set the image width
     * explicitly. When using this option, a `height` must also be set.
     */
    @jsweet.lang.Optional
    public double width;
}

