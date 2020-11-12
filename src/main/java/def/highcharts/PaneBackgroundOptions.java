package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) An array of background items for the pane.
 */
@jsweet.lang.Interface
public abstract class PaneBackgroundOptions extends def.js.Object {
    /**
     * (Highcharts) The background color or gradient for the pane.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> backgroundColor;
    /**
     * (Highcharts) The pane background border color.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highcharts) The pixel border width of the pane background.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) The class name for this background.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts) The inner radius of the pane background. Can be either
     * numeric (pixels) or a percentage string.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> innerRadius;
    /**
     * (Highcharts) The outer radius of the circular pane background. Can be
     * either numeric (pixels) or a percentage string.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> outerRadius;
    /**
     * (Highcharts) The shape of the pane background. When `solid`, the
     * background is circular. When `arc`, the background extends only from the
     * min to the max of the value axis.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.arc,def.highcharts.StringTypes.circle,def.highcharts.StringTypes.solid> shape;
}

