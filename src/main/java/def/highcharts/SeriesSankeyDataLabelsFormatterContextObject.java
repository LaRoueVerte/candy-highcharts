package def.highcharts;
/**
 * Context for the node formatter function.
 */
@jsweet.lang.Interface
public abstract class SeriesSankeyDataLabelsFormatterContextObject extends PointLabelObject {
    /**
     * The node object. The node name, if defined, is available through
     * `this.point.name`.
     */
    public SankeyNodeObject point;
}

