package def.highcharts;
/**
 * (Highcharts) Enable or disable the initial animation when a series is
 * displayed for the `stackLabels`. The animation can also be set as a
 * configuration object. Please note that this option only applies to the
 * initial animation. For other animations, see chart.animation and the
 * animation parameter under the API methods. The following properties are
 * supported:
 *
 * - `defer`: The animation delay time in milliseconds.
 */
@jsweet.lang.Interface
public abstract class YAxisStackLabelsAnimationOptions extends def.js.Object {
    /**
     * (Highcharts) The animation delay time in milliseconds. Set to `0` renders
     * stackLabel immediately. As `undefined` inherits defer time from the
     * series.animation.defer.
     */
    @jsweet.lang.Optional
    public double defer;
}

