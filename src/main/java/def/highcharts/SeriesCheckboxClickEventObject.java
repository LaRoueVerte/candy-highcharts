package def.highcharts;
/**
 * Event information regarding check of a series box.
 */
@jsweet.lang.Interface
public abstract class SeriesCheckboxClickEventObject extends def.js.Object {
    /**
     * Whether the box has been checked.
     */
    public Boolean checked;
    /**
     * Related series.
     */
    public Series item;
    /**
     * Related series.
     */
    public Series target;
    /**
     * Event type.
     */
    public def.highcharts.StringTypes.checkboxClick type;
}

