package def.highcharts;
/**
 * (Highcharts, Highmaps) An array defining zones within marker clusters.
 *
 * In styled mode, the color zones are styled with the
 * `.highcharts-cluster-zone-{n}` class, or custom classed from the `className`
 * option.
 */
@jsweet.lang.Interface
public abstract class PlotVennClusterZonesOptions extends def.js.Object {
    /**
     * (Highcharts, Highmaps) Styled mode only. A custom class name for the
     * zone.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highmaps) The value where the zone starts.
     */
    @jsweet.lang.Optional
    public double from;
    /**
     * (Highcharts, Highmaps) Settings for the cluster marker belonging to the
     * zone.
     */
    @jsweet.lang.Optional
    public PointMarkerOptionsObject marker;
    /**
     * (Highcharts, Highmaps) The value where the zone ends.
     */
    @jsweet.lang.Optional
    public double to;
}

