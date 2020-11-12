package def.highcharts;
import def.js.Array;
/**
 * (Highcharts) A collection of options for the individual nodes. The nodes in a
 * networkgraph diagram are auto-generated instances of `Highcharts.Point`, but
 * options can be applied here and linked by the `id`.
 */
@jsweet.lang.Interface
public abstract class SeriesNetworkgraphNodesOptions extends def.js.Object {
    /**
     * (Highcharts) The color of the auto generated node.
     */
    @jsweet.lang.Optional
    public String color;
    /**
     * (Highcharts) The color index of the auto generated node, especially for
     * use in styled mode.
     */
    @jsweet.lang.Optional
    public double colorIndex;
    /**
     * (Highcharts) Individual data label for each node. The options are the
     * same as the ones for series.networkgraph.dataLabels.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<SeriesNetworkgraphDataLabelsOptionsObject,Array<SeriesNetworkgraphDataLabelsOptionsObject>> dataLabels;
    /**
     * (Highcharts) The id of the auto-generated node, refering to the `from` or
     * `to` setting of the link.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highcharts) Mass of the node. By default, each node has mass equal to
     * it's marker radius . Mass is used to determine how two connected nodes
     * should affect each other:
     *
     * Attractive force is multiplied by the ratio of two connected nodes; if a
     * big node has weights twice as the small one, then the small one will move
     * towards the big one twice faster than the big one to the small one .
     */
    @jsweet.lang.Optional
    public double mass;
    /**
     * (Highcharts) The name to display for the node in data labels and
     * tooltips. Use this when the name is different from the `id`. Where the id
     * must be unique for each node, this is not necessary for the name.
     */
    @jsweet.lang.Optional
    public String name;
}

