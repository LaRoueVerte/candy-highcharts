package def.highcharts;
/**
 * (Highcharts, Highstock, Gantt) A declarative filter to control of which data
 * labels to display. The declarative filter is designed for use when callback
 * functions are not available, like when the chart options require a pure JSON
 * structure or for use with graphical editors. For programmatic control, use
 * the `formatter` instead, and return `undefined` to disable a single data
 * label.
 */
@jsweet.lang.Interface
public abstract class DataLabelsFilterOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) The operator to compare by. Can be one of
     * `>`, `<`, `>=`, `<=`, `==`, and `===`.
     */
    @jsweet.lang.Optional
    public Object operator;
    /**
     * (Highcharts, Highstock, Gantt) The point property to filter by. Point
     * options are passed directly to properties, additionally there are `y`
     * value, `percentage` and others listed under Highcharts.Point members.
     */
    @jsweet.lang.Optional
    public String property;
    /**
     * (Highcharts, Highstock, Gantt) The value to compare against.
     */
    @jsweet.lang.Optional
    public double value;
}

