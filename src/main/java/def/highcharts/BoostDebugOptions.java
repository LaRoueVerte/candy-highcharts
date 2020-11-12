package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Debugging options for boost. Useful
 * for benchmarking, and general timing.
 */
@jsweet.lang.Interface
public abstract class BoostDebugOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Show the number of points
     * skipped through culling.
     *
     * When set to true, the number of points skipped in series processing is
     * outputted. Points are skipped if they are closer than 1 pixel from each
     * other.
     */
    @jsweet.lang.Optional
    public Boolean showSkipSummary;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Time the WebGL to SVG buffer
     * copy
     *
     * After rendering, the result is copied to an image which is injected into
     * the SVG.
     *
     * If this property is set to true, the time it takes for the buffer copy to
     * complete is outputted.
     */
    @jsweet.lang.Optional
    public Boolean timeBufferCopy;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Time the building of the k-d
     * tree.
     *
     * This outputs the time spent building the k-d tree used for markers etc.
     *
     * Note that the k-d tree is built async, and runs post-rendering.
     * Following, it does not affect the performance of the rendering itself.
     */
    @jsweet.lang.Optional
    public Boolean timeKDTree;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Time the series rendering.
     *
     * This outputs the time spent on actual rendering in the console when set
     * to true.
     */
    @jsweet.lang.Optional
    public Boolean timeRendering;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Time the series processing.
     *
     * This outputs the time spent on transforming the series data to vertex
     * buffers when set to true.
     */
    @jsweet.lang.Optional
    public Boolean timeSeriesProcessing;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Time the the WebGL setup.
     *
     * This outputs the time spent on setting up the WebGL context, creating
     * shaders, and textures.
     */
    @jsweet.lang.Optional
    public Boolean timeSetup;
}

