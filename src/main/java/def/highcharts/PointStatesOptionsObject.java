package def.highcharts;
/**
 * (Highcharts, Highstock) States for a single point marker.
 */
@jsweet.lang.Interface
public abstract class PointStatesOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock) The hover state for a single point marker.
     */
    @jsweet.lang.Optional
    public PointStatesHoverOptionsObject hover;
    /**
     * (Highcharts) The opposite state of a hover for a single point node.
     * Applied to all not connected nodes to the hovered one.
     */
    @jsweet.lang.Optional
    public PointStatesInactiveOptionsObject inactive;
    /**
     * (Highcharts, Highstock) The normal state of a single point marker.
     * Currently only used for setting animation when returning to normal state
     * from hover.
     */
    @jsweet.lang.Optional
    public PointStatesNormalOptionsObject normal;
    /**
     * (Highcharts, Highstock) The appearance of the point marker when selected.
     * In order to allow a point to be selected, set the
     * `series.allowPointSelect` option to true.
     */
    @jsweet.lang.Optional
    public PointStatesSelectOptionsObject select;
}

