package def.highcharts;
import def.js.Function;
/**
 * An animation configuration. Animation configurations can also be defined as
 * booleans, where `false` turns off animation and `true` defaults to a duration
 * of 500ms and defer of 0ms.
 */
@jsweet.lang.Interface
public abstract class AnimationOptionsObject extends def.js.Object {
    /**
     * A callback function to exectute when the animation finishes.
     */
    @jsweet.lang.Optional
    public Function complete;
    /**
     * The animation defer in milliseconds.
     */
    @jsweet.lang.Optional
    public double defer;
    /**
     * The animation duration in milliseconds.
     */
    @jsweet.lang.Optional
    public double duration;
    /**
     * The name of an easing function as defined on the `Math` object.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Function> easing;
    /**
     * A callback function to execute on each step of each attribute or CSS
     * property that's being animated. The first argument contains information
     * about the animation and progress.
     */
    @jsweet.lang.Optional
    public Function step;
    native public java.lang.Object complete(java.lang.Object... args);
    native public java.lang.Object step(java.lang.Object... args);
}

