package def.highcharts;
@jsweet.lang.Interface
public abstract class PlotMappointClusterEventsOptions extends def.js.Object {
    /**
     * (Highcharts, Highmaps) Fires when the cluster point is clicked and
     * `drillToCluster` is enabled. One parameter, `event`, is passed to the
     * function. The default action is to zoom to the cluster points range. This
     * can be prevented by calling `event.preventDefault()`.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Point,PointClickEventObject> drillToCluster;
}

