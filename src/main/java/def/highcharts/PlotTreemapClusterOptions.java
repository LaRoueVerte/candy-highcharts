package def.highcharts;
import def.js.Array;
/**
 * (Highcharts, Highmaps) Options for marker clusters, the concept of sampling
 * the data values into larger blocks in order to ease readability and increase
 * performance of the JavaScript charts.
 *
 * Note: marker clusters module is not working with `boost` and
 * `draggable-points` modules.
 *
 * The marker clusters feature requires the marker-clusters.js file to be
 * loaded, found in the modules directory of the download package, or online at
 * code.highcharts.com/modules/marker-clusters.js.
 */
@jsweet.lang.Interface
public abstract class PlotTreemapClusterOptions extends def.js.Object {
    /**
     * (Highcharts, Highmaps) When set to `false` prevent cluster overlapping -
     * this option works only when `layoutAlgorithm.type = "grid"`.
     */
    @jsweet.lang.Optional
    public Boolean allowOverlap;
    /**
     * (Highcharts, Highmaps) Options for the cluster marker animation.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts, Highmaps) Options for the cluster data labels.
     */
    @jsweet.lang.Optional
    public DataLabelsOptions dataLabels;
    /**
     * (Highcharts, Highmaps) Zoom the plot area to the cluster points range
     * when a cluster is clicked.
     */
    @jsweet.lang.Optional
    public Boolean drillToCluster;
    /**
     * (Highcharts, Highmaps) Whether to enable the marker-clusters module.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    @jsweet.lang.Optional
    public PlotTreemapClusterEventsOptions events;
    /**
     * (Highcharts, Highmaps) Options for layout algorithm. Inside there are
     * options to change the type of the algorithm, gridSize, distance or
     * iterations.
     */
    @jsweet.lang.Optional
    public PlotTreemapClusterLayoutAlgorithmOptions layoutAlgorithm;
    /**
     * (Highcharts, Highmaps) Options for the cluster marker.
     */
    @jsweet.lang.Optional
    public PointMarkerOptionsObject marker;
    /**
     * (Highcharts, Highmaps) The minimum amount of points to be combined into a
     * cluster. This value has to be greater or equal to 2.
     */
    @jsweet.lang.Optional
    public double minimumClusterSize;
    @jsweet.lang.Optional
    public PlotTreemapClusterStatesOptions states;
    /**
     * (Highcharts, Highmaps) An array defining zones within marker clusters.
     *
     * In styled mode, the color zones are styled with the
     * `.highcharts-cluster-zone-{n}` class, or custom classed from the
     * `className` option.
     */
    @jsweet.lang.Optional
    public Array<PlotTreemapClusterZonesOptions> zones;
}

