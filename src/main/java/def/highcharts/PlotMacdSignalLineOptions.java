package def.highcharts;
import def.js.Array;
/**
 * (Highstock) The styles for signal line
 */
@jsweet.lang.Interface
public abstract class PlotMacdSignalLineOptions extends def.js.Object {
    @jsweet.lang.Optional
    public PlotMacdSignalLineStylesOptions styles;
    /**
     * (Highcharts, Highstock) An array defining zones within a series. Zones
     * can be applied to the X axis, Y axis or Z axis for bubbles, according to
     * the `zoneAxis` option. The zone definitions have to be in ascending order
     * regarding to the value.
     *
     * In styled mode, the color zones are styled with the
     * `.highcharts-zone-{n}` class, or custom classed from the `className`
     * option (view live demo).
     */
    @jsweet.lang.Optional
    public Array<SeriesZonesOptionsObject> zones;
}

