package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) The front of the frame around a 3D chart.
 */
@jsweet.lang.Interface
public abstract class Chart3dFrameFrontOptions extends def.js.Object {
    /**
     * (Highcharts) The color of the panel.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts) The thickness of the panel.
     */
    @jsweet.lang.Optional
    public double size;
    /**
     * (Highcharts) Whether to display the frame. Possible values are `true`,
     * `false`, `"auto"` to display only the frames behind the data, and
     * `"default"` to display faces behind the data based on the axis layout,
     * ignoring the point of view.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.auto,def.highcharts.StringTypes.Default,Boolean> visible;
}

