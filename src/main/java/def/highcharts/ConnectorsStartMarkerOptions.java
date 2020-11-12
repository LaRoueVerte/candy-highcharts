package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Gantt) Marker options specific to the start markers for this chart's
 * Pathfinder connectors. Overrides the generic marker options.
 */
@jsweet.lang.Interface
public abstract class ConnectorsStartMarkerOptions extends def.js.Object {
    /**
     * (Gantt) Horizontal alignment of the markers relative to the points.
     */
    @jsweet.lang.Optional
    public Object align;
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
    @jsweet.lang.Optional
    public String fill;
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
     * (Gantt) Set the symbol of the connector start markers.
     */
    @jsweet.lang.Optional
    public String symbol;
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

