package def.highcharts;
/**
 * Options for `dataSorting`.
 */
@jsweet.lang.Interface
public abstract class DataSortingOptionsObject extends def.js.Object {
    /**
     * Enable or disable data sorting for the series.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * Whether to allow matching points by name in an update.
     */
    @jsweet.lang.Optional
    public Boolean matchByName;
    /**
     * Determines what data value should be used to sort by.
     */
    @jsweet.lang.Optional
    public String sortKey;
}

