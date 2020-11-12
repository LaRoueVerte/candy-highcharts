package def.highcharts;
/**
 * (Highcharts) The opposite state of a hover for a single point node. Applied
 * to all not connected nodes to the hovered one.
 */
@jsweet.lang.Interface
public abstract class PointStatesInactiveOptionsObject extends def.js.Object {
    /**
     * (Highcharts) Animation when not hovering over the node.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts) Opacity of inactive markers.
     */
    @jsweet.lang.Optional
    public double opacity;
}

