package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock) An array defining zones within a series. Zones can be
 * applied to the X axis, Y axis or Z axis for bubbles, according to the
 * `zoneAxis` option. The zone definitions have to be in ascending order
 * regarding to the value.
 *
 * In styled mode, the color zones are styled with the `.highcharts-zone-{n}`
 * class, or custom classed from the `className` option (view live demo).
 */
@jsweet.lang.Interface
public abstract class SeriesZonesOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock) Styled mode only. A custom class name for the
     * zone.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock) Defines the color of the series.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Highstock) A name for the dash style to use for the graph.
     */
    @jsweet.lang.Optional
    public Object dashStyle;
    /**
     * (Highcharts, Highstock) Defines the fill color for the series (in area
     * type series)
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fillColor;
    /**
     * (Highcharts, Highstock) The value up to where the zone extends, if
     * undefined the zones stretches to the last value in the series.
     */
    @jsweet.lang.Optional
    public double value;
}

