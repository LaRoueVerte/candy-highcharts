package def.highcharts;
import def.js.Array;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Allows setting a set of rules to
 * apply for different screen or chart sizes. Each rule specifies additional
 * chart options.
 */
@jsweet.lang.Interface
public abstract class ResponsiveOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A set of rules for responsive
     * settings. The rules are executed from the top down.
     */
    @jsweet.lang.Optional
    public Array<ResponsiveRulesOptions> rules;
}

