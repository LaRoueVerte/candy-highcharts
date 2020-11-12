package def.highcharts;
/**
 * (Highstock) The opposite state of a hover for series.
 */
@jsweet.lang.Interface
public abstract class SeriesStatesInactiveOptionsObject extends def.js.Object {
    /**
     * (Highstock) Animation when not hovering over the marker.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highstock) Enable or disable the inactive state for a series
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts) Opacity for the links between nodes in the sankey diagram in
     * inactive mode.
     */
    @jsweet.lang.Optional
    public double linkOpacity;
    /**
     * (Highstock) Opacity of inactive markers.
     */
    @jsweet.lang.Optional
    public double opacity;
}

