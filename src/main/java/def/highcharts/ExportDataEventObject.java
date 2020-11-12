package def.highcharts;
import def.js.Array;
/**
 * Contains information about the export data event.
 */
@jsweet.lang.Interface
public abstract class ExportDataEventObject extends def.js.Object {
    /**
     * Contains the data rows for the current export task and can be modified.
     */
    public Array<Array<String>> dataRows;
}

