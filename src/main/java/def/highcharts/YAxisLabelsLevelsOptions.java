package def.highcharts;
/**
 * (Gantt) Set options on specific levels in a tree grid axis. Takes precedence
 * over labels options.
 */
@jsweet.lang.Interface
public abstract class YAxisLabelsLevelsOptions extends def.js.Object {
    /**
     * (Gantt) Specify the level which the options within this object applies
     * to.
     */
    @jsweet.lang.Optional
    public double level;
    @jsweet.lang.Optional
    public CSSObject style;
}

