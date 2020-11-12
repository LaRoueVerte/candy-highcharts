package def.highcharts;
import def.js.Array;
import def.js.Function;
/**
 * A config object for navigation bindings in annotations.
 */
@jsweet.lang.Interface
public abstract class NavigationBindingsOptionsObject extends def.js.Object {
    /**
     * ClassName of the element for a binding.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * Last event to be fired after last step event.
     */
    @jsweet.lang.Optional
    public Function end;
    /**
     * Initial event, fired on a button click.
     */
    @jsweet.lang.Optional
    public Function init;
    /**
     * Event fired on first click on a chart.
     */
    @jsweet.lang.Optional
    public Function start;
    /**
     * Last event to be fired after last step event. Array of step events to be
     * called sequentially after each user click.
     */
    @jsweet.lang.Optional
    public Array<Function> steps;
    native public java.lang.Object end(java.lang.Object... args);
    native public java.lang.Object init(java.lang.Object... args);
    native public java.lang.Object start(java.lang.Object... args);
}

