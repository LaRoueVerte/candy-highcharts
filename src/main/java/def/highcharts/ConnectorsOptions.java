package def.highcharts;
/**
 * (Gantt) The Pathfinder module allows you to define connections between any
 * two points, represented as lines - optionally with markers for the start
 * and/or end points. Multiple algorithms are available for calculating how the
 * connecting lines are drawn.
 *
 * Connector functionality requires Highcharts Gantt to be loaded. In Gantt
 * charts, the connectors are used to draw dependencies between tasks.
 */
@jsweet.lang.Interface
public abstract class ConnectorsOptions extends def.js.Object {
    /**
     * (Gantt) Set the default pathfinder margin to use, in pixels. Some
     * Pathfinder algorithms attempt to avoid obstacles, such as other points in
     * the chart. These algorithms use this margin to determine how close lines
     * can be to an obstacle. The default is to compute this automatically from
     * the size of the obstacles in the chart.
     *
     * To draw connecting lines close to existing points, set this to a low
     * number. For more space around existing points, set this number higher.
     */
    @jsweet.lang.Optional
    public double algorithmMargin;
    /**
     * (Gantt) Set the default dash style for this chart's connecting lines.
     */
    @jsweet.lang.Optional
    public String dashStyle;
    /**
     * (Gantt) Enable connectors for this chart. Requires Highcharts Gantt.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Gantt) Marker options specific to the end markers for this chart's
     * Pathfinder connectors. Overrides the generic marker options.
     */
    @jsweet.lang.Optional
    public ConnectorsEndMarkerOptions endMarker;
    /**
     * (Gantt) Set the default color for this chart's Pathfinder connecting
     * lines. Defaults to the color of the point being connected.
     */
    @jsweet.lang.Optional
    public String lineColor;
    /**
     * (Gantt) Set the default pixel width for this chart's Pathfinder
     * connecting lines.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Gantt) Marker options for this chart's Pathfinder connectors. Note that
     * this option is overridden by the `startMarker` and `endMarker` options.
     */
    @jsweet.lang.Optional
    public ConnectorsMarkerOptions marker;
    /**
     * (Gantt) Marker options specific to the start markers for this chart's
     * Pathfinder connectors. Overrides the generic marker options.
     */
    @jsweet.lang.Optional
    public ConnectorsStartMarkerOptions startMarker;
    /**
     * (Gantt) Set the default pathfinder algorithm to use for this chart. It is
     * possible to define your own algorithms by adding them to the
     * Highcharts.Pathfinder.prototype.algorithms object before the chart has
     * been created.
     *
     * The default algorithms are as follows:
     *
     * `straight`: Draws a straight line between the connecting points. Does not
     * avoid other points when drawing.
     *
     * `simpleConnect`: Finds a path between the points using right angles only.
     * Takes only starting/ending points into account, and will not avoid other
     * points.
     *
     * `fastAvoid`: Finds a path between the points using right angles only.
     * Will attempt to avoid other points, but its focus is performance over
     * accuracy. Works well with less dense datasets.
     *
     * Default value: `straight` is used as default for most series types, while
     * `simpleConnect` is used as default for Gantt series, to show dependencies
     * between points.
     */
    @jsweet.lang.Optional
    public Object type;
}

