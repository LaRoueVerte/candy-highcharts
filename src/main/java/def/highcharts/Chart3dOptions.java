package def.highcharts;
/**
 * (Highcharts) Options to render charts in 3 dimensions. This feature requires
 * `highcharts-3d.js`, found in the download package or online at
 * code.highcharts.com/highcharts-3d.js.
 */
@jsweet.lang.Interface
public abstract class Chart3dOptions extends def.js.Object {
    /**
     * (Highcharts) One of the two rotation angles for the chart.
     */
    @jsweet.lang.Optional
    public double alpha;
    /**
     * (Highcharts) Set it to `"auto"` to automatically move the labels to the
     * best edge.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.auto,Object> axisLabelPosition;
    /**
     * (Highcharts) One of the two rotation angles for the chart.
     */
    @jsweet.lang.Optional
    public double beta;
    /**
     * (Highcharts) The total depth of the chart.
     */
    @jsweet.lang.Optional
    public double depth;
    /**
     * (Highcharts) Wether to render the chart using the 3D functionality.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts) Whether the 3d box should automatically adjust to the chart
     * plot area.
     */
    @jsweet.lang.Optional
    public Boolean fitToPlot;
    /**
     * (Highcharts) Provides the option to draw a frame around the charts by
     * defining a bottom, front and back panel.
     */
    @jsweet.lang.Optional
    public Chart3dFrameOptions frame;
    /**
     * (Highcharts) Defines the distance the viewer is standing in front of the
     * chart, this setting is important to calculate the perspective effect in
     * column and scatter charts. It is not used for 3D pie charts.
     */
    @jsweet.lang.Optional
    public double viewDistance;
}

