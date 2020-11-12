package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) A collection of options for the individual nodes. The nodes in a
 * sankey diagram are auto-generated instances of `Highcharts.Point`, but
 * options can be applied here and linked by the `id`.
 */
@jsweet.lang.Interface
public abstract class SeriesSankeyNodesOptionsObject extends def.js.Object {
    /**
     * (Highcharts) The color of the auto generated node.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts) The color index of the auto generated node, especially for
     * use in styled mode.
     */
    @jsweet.lang.Optional
    public double colorIndex;
    /**
     * (Highcharts) An optional column index of where to place the node. The
     * default behaviour is to place it next to the preceding node. Note that
     * this option name is counter intuitive in inverted charts, like for
     * example an organization chart rendered top down. In this case the
     * "columns" are horizontal.
     */
    @jsweet.lang.Optional
    public double column;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Individual data label for each
     * node. The options are the same as the ones for series.sankey.dataLabels.
     */
    @jsweet.lang.Optional
    public Object dataLabels;
    /**
     * (Highcharts) The job description for the node card, will be inserted by
     * the default `dataLabel.nodeFormatter`.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highcharts) The id of the auto-generated node, refering to the `from` or
     * `to` setting of the link.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highcharts) An image for the node card, will be inserted by the default
     * `dataLabel.nodeFormatter`.
     */
    @jsweet.lang.Optional
    public String image;
    /**
     * (Highcharts) Layout for the node's children. If `hanging`, this node's
     * children will hang below their parent, allowing a tighter packing of
     * nodes in the diagram.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.hanging,def.highcharts.StringTypes.normal> layout;
    /**
     * (Highcharts) An optional level index of where to place the node. The
     * default behaviour is to place it next to the preceding node. Alias of
     * `nodes.column`, but in inverted sankeys and org charts, the levels are
     * laid out as rows.
     */
    @jsweet.lang.Optional
    public double level;
    /**
     * (Highcharts) The name to display for the node in data labels and
     * tooltips. Use this when the name is different from the `id`. Where the id
     * must be unique for each node, this is not necessary for the name.
     */
    @jsweet.lang.Optional
    public String name;
    /**
     * (Highcharts) In a horizontal layout, the vertical offset of a node in
     * terms of weight. Positive values shift the node downwards, negative shift
     * it upwards. In a vertical layout, like organization chart, the offset is
     * horizontal.
     *
     * If a percantage string is given, the node is offset by the percentage of
     * the node size plus `nodePadding`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> offset;
    /**
     * (Highcharts) The job title for the node card, will be inserted by the
     * default `dataLabel.nodeFormatter`.
     */
    @jsweet.lang.Optional
    public String title;
}

