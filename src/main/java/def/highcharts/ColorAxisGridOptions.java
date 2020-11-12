package def.highcharts;
import def.js.Array;
/**
 * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
 */
@jsweet.lang.Interface
public abstract class ColorAxisGridOptions extends def.js.Object {
    /**
     * (Gantt) Set border color for the label grid lines.
     */
    @jsweet.lang.Optional
    public String borderColor;
    /**
     * (Gantt) Set border width of the label grid lines.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Gantt) Set cell height for grid axis labels. By default this is
     * calculated from font size. This option only applies to horizontal axes.
     */
    @jsweet.lang.Optional
    public double cellHeight;
    /**
     * (Gantt) Set specific options for each column (or row for horizontal axes)
     * in the grid. Each extra column/row is its own axis, and the axis options
     * can be set here.
     */
    @jsweet.lang.Optional
    public Array<XAxisOptions> columns;
    /**
     * (Gantt) Enable grid on the axis labels. Defaults to true for Gantt
     * charts.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
}

