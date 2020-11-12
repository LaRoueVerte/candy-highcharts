package def.highcharts;
/**
 * Context for the formatter function.
 */
@jsweet.lang.Interface
public abstract class SeriesPackedBubbleDataLabelsFormatterContextObject extends PointLabelObject {
    /**
     * The color of the node.
     */
    public String color;
    /**
     * The ID of the node.
     */
    public String key;
    /**
     * The point (node) object. The node name, if defined, is available through
     * `this.point.name`. Arrays: `this.point.linksFrom` and
     * `this.point.linksTo` contains all nodes connected to this point.
     */
    public Point point;
}

