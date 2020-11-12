package def.highcharts;
/**
 * (Highstock) Options for axis resizing. It adds a thick line between panes
 * which the user can drag in order to resize the panes.
 */
@jsweet.lang.Interface
public abstract class YAxisResizeOptions extends def.js.Object {
    /**
     * (Highstock) Contains two arrays of axes that are controlled by control
     * line of the axis.
     */
    @jsweet.lang.Optional
    public YAxisResizeControlledAxisOptions controlledAxis;
    /**
     * (Highstock) Cursor style for the control line.
     *
     * In styled mode use class `highcharts-axis-resizer` instead.
     */
    @jsweet.lang.Optional
    public String cursor;
    /**
     * (Highstock) Enable or disable resize by drag for the axis.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock) Color of the control line.
     *
     * In styled mode use class `highcharts-axis-resizer` instead.
     */
    @jsweet.lang.Optional
    public String lineColor;
    /**
     * (Highstock) Dash style of the control line.
     *
     * In styled mode use class `highcharts-axis-resizer` instead.
     */
    @jsweet.lang.Optional
    public String lineDashStyle;
    /**
     * (Highstock) Width of the control line.
     *
     * In styled mode use class `highcharts-axis-resizer` instead.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * (Highstock) Horizontal offset of the control line.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highstock) Vertical offset of the control line.
     */
    @jsweet.lang.Optional
    public double y;
}

