package def.highcharts;
/**
 * Point information for positioning a tooltip.
 */
@jsweet.lang.Interface
public abstract class TooltipPositionerPointObject extends Point {
    /**
     * If `tooltip.split` option is enabled and positioner is called for each of
     * the boxes separately, this property indicates the call on the xAxis
     * header, which is not a point itself.
     */
    public Boolean isHeader;
    /**
     * The reference point relative to the plot area. Add chart.plotLeft to get
     * the full coordinates.
     */
    public double plotX;
    /**
     * The reference point relative to the plot area. Add chart.plotTop to get
     * the full coordinates.
     */
    public double plotY;
}

