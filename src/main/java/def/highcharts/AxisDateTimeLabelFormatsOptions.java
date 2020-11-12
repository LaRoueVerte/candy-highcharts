package def.highcharts;
/**
 * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
 * automatically adjust to the appropriate unit. This member gives the default
 * string representations used for each unit. For intermediate values, different
 * units may be used, for example the `day` unit can be used on midnight and
 * `hour` unit be used for intermediate values on the same axis.
 *
 * For an overview of the replacement codes, see dateFormat.
 *
 * Defaults to: (see online documentation for example)
 */
@jsweet.lang.Interface
public abstract class AxisDateTimeLabelFormatsOptions extends def.js.Object {
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,AxisDateTimeLabelFormatsOptionsObject> day;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,AxisDateTimeLabelFormatsOptionsObject> hour;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,AxisDateTimeLabelFormatsOptionsObject> millisecond;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,AxisDateTimeLabelFormatsOptionsObject> minute;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,AxisDateTimeLabelFormatsOptionsObject> month;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,AxisDateTimeLabelFormatsOptionsObject> second;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,AxisDateTimeLabelFormatsOptionsObject> week;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,AxisDateTimeLabelFormatsOptionsObject> year;
}

