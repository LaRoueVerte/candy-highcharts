package def.highcharts;
import def.js.Function;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for exporting data to CSV or
 * ExCel, or displaying the data in a HTML table or a JavaScript structure.
 *
 * This module adds data export options to the export menu and provides
 * functions like `Chart.getCSV`, `Chart.getTable`, `Chart.getDataRows` and
 * `Chart.viewData`.
 *
 * The XLS converter is limited and only creates a HTML string that is passed
 * for download, which works but creates a warning before opening. The
 * workaround for this is to use a third party XLSX converter, as demonstrated
 * in the sample below.
 */
@jsweet.lang.Interface
public abstract class ExportingCsvOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for annotations in the
     * export-data table.
     */
    @jsweet.lang.Optional
    public ExportingCsvAnnotationsOptions annotations;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Formatter callback for the
     * column headers. Parameters are:
     *
     * - `item` - The series or axis object)
     *
     * - `key` - The point key, for example y or z
     *
     * - `keyLength` - The amount of value keys for this item, for example a
     * range series has the keys `low` and `high` so the key length is 2.
     *
     * If useMultiLevelHeaders is true, columnHeaderFormatter by default returns
     * an object with columnTitle and topLevelColumnTitle for each key. Columns
     * with the same topLevelColumnTitle have their titles merged into a single
     * cell with colspan for table/Excel export.
     *
     * If `useMultiLevelHeaders` is false, or for CSV export, it returns the
     * series name, followed by the key if there is more than one key.
     *
     * For the axis it returns the axis title or "Category" or "DateTime" by
     * default.
     *
     * Return `false` to use Highcharts' proposed header.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Function,Object> columnHeaderFormatter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Which date format to use for
     * exported dates on a datetime X axis. See `Highcharts.dateFormat`.
     */
    @jsweet.lang.Optional
    public String dateFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Which decimal point to use for
     * exported CSV. Defaults to the same as the browser locale, typically `.`
     * (English) or `,` (German, French etc).
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Object> decimalPoint;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The item delimiter in the
     * exported data. Use `;` for direct exporting to Excel. Defaults to a best
     * guess based on the browser locale. If the locale _decimal point_ is `,`,
     * the `itemDelimiter` defaults to `;`, otherwise the `itemDelimiter`
     * defaults to `,`.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Object> itemDelimiter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The line delimiter in the
     * exported data, defaults to a newline.
     */
    @jsweet.lang.Optional
    public String lineDelimiter;
}

