package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Gantt) Marker options for this chart's Pathfinder connectors. Note that this
 * option is overridden by the `startMarker` and `endMarker` options.
 */
@jsweet.lang.Interface
public abstract class ConnectorsMarkerOptions extends def.js.Object {
    /**
     * (Gantt) Horizontal alignment of the markers relative to the points.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.center,def.highcharts.StringTypes.left,def.highcharts.StringTypes.right> align;
    /**
     * (Gantt) Set the color of the connector markers. By default this is the
     * same as the connector color.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Gantt) Enable markers for the connectors.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Gantt) Set the height of the connector markers. If not supplied, this is
     * inferred from the marker radius.
     */
    @jsweet.lang.Optional
    public double height;
    /**
     * (Gantt) Whether or not to draw the markers inside the points.
     */
    @jsweet.lang.Optional
    public Boolean inside;
    /**
     * (Gantt) Set the line/border color of the connector markers. By default
     * this is the same as the marker color.
     */
    @jsweet.lang.Optional
    public String lineColor;
    /**
     * (Gantt) Set the line/border width of the pathfinder markers.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Gantt) Set the radius of the connector markers. The default is
     * automatically computed based on the algorithmMargin setting.
     *
     * Setting marker.width and marker.height will override this setting.
     */
    @jsweet.lang.Optional
    public double radius;
    /**
     * (Gantt) Vertical alignment of the markers relative to the points.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.bottom,def.highcharts.StringTypes.middle,def.highcharts.StringTypes.top> verticalAlign;
    /**
     * (Gantt) Set the width of the connector markers. If not supplied, this is
     * inferred from the marker radius.
     */
    @jsweet.lang.Optional
    public double width;
}

