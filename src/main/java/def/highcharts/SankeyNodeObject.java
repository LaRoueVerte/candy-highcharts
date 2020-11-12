package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts) A node in a sankey diagram.
 */
@jsweet.lang.Interface
public abstract class SankeyNodeObject extends Point {
    /**
     * The color of the auto generated node.
     */
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * The color index of the auto generated node, especially for use in styled
     * mode.
     */
    public double colorIndex;
    /**
     * An optional column index of where to place the node. The default
     * behaviour is to place it next to the preceding node.
     */
    public double column;
    /**
     * The id of the auto-generated node, refering to the `from` or `to` setting
     * of the link.
     */
    public String id;
    /**
     * (Highcharts) The name to display for the node in data labels and
     * tooltips. Use this when the name is different from the `id`. Where the id
     * must be unique for each node, this is not necessary for the name.
     */
    public String name;
    /**
     * The vertical offset of a node in terms of weight. Positive values shift
     * the node downwards, negative shift it upwards.
     */
    public double offset;
}

