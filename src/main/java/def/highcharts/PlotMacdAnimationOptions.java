package def.highcharts;
/**
 * (Highstock) Enable or disable the initial animation when a series is
 * displayed. The animation can also be set as a configuration object. Please
 * note that this option only applies to the initial animation of the series
 * itself. For other animations, see chart.animation and the animation parameter
 * under the API methods. The following properties are supported:
 *
 * - `defer`: The animation delay time in milliseconds.
 *
 * - `duration`: The duration of the animation in milliseconds.
 *
 * - `easing`: Can be a string reference to an easing function set on the `Math`
 * object or a function. See the _Custom easing function_ demo below.
 *
 * Due to poor performance, animation is disabled in old IE browsers for several
 * chart types.
 */
@jsweet.lang.Interface
public abstract class PlotMacdAnimationOptions extends def.js.Object {
    @jsweet.lang.Optional
    public double defer;
}

