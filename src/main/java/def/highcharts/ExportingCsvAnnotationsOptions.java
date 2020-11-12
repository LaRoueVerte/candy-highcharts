package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for annotations in the
 * export-data table.
 */
@jsweet.lang.Interface
public abstract class ExportingCsvAnnotationsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The way to mark the separator
     * for annotations combined in one export-data table cell.
     */
    @jsweet.lang.Optional
    public String itemDelimiter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When several labels are assigned
     * to a specific point, they will be displayed in one field in the table.
     */
    @jsweet.lang.Optional
    public Boolean join;
}

