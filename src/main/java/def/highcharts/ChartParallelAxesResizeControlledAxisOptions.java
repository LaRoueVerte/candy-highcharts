package def.highcharts;
import def.js.Array;
/**
 * (Highstock) Contains two arrays of axes that are controlled by control line
 * of the axis.
 */
@jsweet.lang.Interface
public abstract class ChartParallelAxesResizeControlledAxisOptions extends def.js.Object {
    /**
     * (Highstock) Array of axes that should move out of the way of resizing
     * being done for the current axis. If not set, the next axis will be used.
     */
    @jsweet.lang.Optional
    public Array<jsweet.util.union.Union<Double,String>> next;
    /**
     * (Highstock) Array of axes that should move with the current axis while
     * resizing.
     */
    @jsweet.lang.Optional
    public Array<jsweet.util.union.Union<Double,String>> prev;
}

