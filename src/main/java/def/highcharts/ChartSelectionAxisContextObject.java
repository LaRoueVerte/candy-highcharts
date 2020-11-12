package def.highcharts;
/**
 * Axis context of the selection.
 */
@jsweet.lang.Interface
public abstract class ChartSelectionAxisContextObject extends def.js.Object {
    /**
     * The selected Axis.
     */
    public Axis axis;
    /**
     * The maximum axis value, either automatic or set manually.
     */
    public double max;
    /**
     * The minimum axis value, either automatic or set manually.
     */
    public double min;
}

