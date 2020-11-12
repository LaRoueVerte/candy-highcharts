package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
import def.dom.HTMLElement;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) The Data module provides a
 * simplified interface for adding data to a chart from sources like CVS, HTML
 * tables or grid views. See also the tutorial article on the Data module.
 *
 * It requires the `modules/data.js` file to be loaded.
 *
 * Please note that the default way of adding data in Highcharts, without the
 * need of a module, is through the series._type_.data option.
 */
@jsweet.lang.Interface
public abstract class DataOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function to modify
     * the CSV before parsing it. Return the modified string.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<String,String> beforeParse;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A two-dimensional array
     * representing the input data on tabular form. This input can be used when
     * the data is already parsed, for example from a grid view component. Each
     * cell can be a string or number. If not switchRowsAndColumns is set, the
     * columns are interpreted as series.
     */
    @jsweet.lang.Optional
    public Array<Array<Union3<Double,String,Object>>> columns;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
     * structured as a column array. Will be fetched when the chart is created
     * using Ajax.
     */
    @jsweet.lang.Optional
    public String columnsURL;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The callback that is evaluated
     * when the data is finished loading, optionally from an external source,
     * and parsed. The first argument passed is a finished chart options object,
     * containing the series. These options can be extended with additional
     * options and passed directly to the chart constructor.
     */
    @jsweet.lang.Optional
    public java.util.function.Consumer<Options> complete;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A comma delimited string to be
     * parsed. Related options are startRow, endRow, startColumn and endColumn
     * to delimit what part of the table is used. The lineDelimiter and
     * itemDelimiter options define the CSV delimiter formats.
     *
     * The built-in CSV parser doesn't support all flavours of CSV, so in some
     * cases it may be necessary to use an external CSV parser. See this example
     * of parsing CSV through the MIT licensed Papa Parse library.
     */
    @jsweet.lang.Optional
    public String csv;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An URL to a remote CSV dataset.
     * Will be fetched when the chart is created using Ajax.
     */
    @jsweet.lang.Optional
    public String csvURL;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Sets the refresh rate for data
     * polling when importing remote dataset by setting data.csvURL,
     * data.rowsURL, data.columnsURL, or data.googleSpreadsheetKey.
     *
     * Note that polling must be enabled by setting data.enablePolling to true.
     *
     * The value is the number of seconds between pollings. It cannot be set to
     * less than 1 second.
     */
    @jsweet.lang.Optional
    public double dataRefreshRate;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Which of the predefined date
     * formats in Date.prototype.dateFormats to use to parse date values.
     * Defaults to a best guess based on what format gives valid and ordered
     * dates. Valid options include: `YYYY/mm/dd`, `dd/mm/YYYY`, `mm/dd/YYYY`,
     * `dd/mm/YY`, `mm/dd/YY`.
     */
    @jsweet.lang.Optional
    public Object dateFormat;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The decimal point used for
     * parsing numbers in the CSV.
     *
     * If both this and data.delimiter is set to `undefined`, the parser will
     * attempt to deduce the decimal point automatically.
     */
    @jsweet.lang.Optional
    public String decimalPoint;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enables automatic refetching of
     * remote datasets every _n_ seconds (defined by setting
     * data.dataRefreshRate).
     *
     * Only works when either data.csvURL, data.rowsURL, data.columnsURL, or
     * data.googleSpreadsheetKey.
     */
    @jsweet.lang.Optional
    public Boolean enablePolling;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
     * column (indexed by 0) to use. Defaults to the last column containing
     * data.
     */
    @jsweet.lang.Optional
    public double endColumn;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
     * row (indexed by 0) to use. Defaults to the last row containing data.
     */
    @jsweet.lang.Optional
    public double endRow;
    /**
     * (Highcharts, Highstock, Gantt) Whether to use the first row in the data
     * set as series names.
     */
    @jsweet.lang.Optional
    public Boolean firstRowAsNames;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The key for a Google Spreadsheet
     * to load. See general information on GS.
     */
    @jsweet.lang.Optional
    public String googleSpreadsheetKey;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Google Spreadsheet worksheet
     * to use in combination with googleSpreadsheetKey. The available id's from
     * your sheet can be read from
     * `https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic`.
     */
    @jsweet.lang.Optional
    public String googleSpreadsheetWorksheet;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Item or cell delimiter for
     * parsing CSV. Defaults to the tab character `\t` if a tab character is
     * found in the CSV string, if not it defaults to `,`.
     *
     * If this is set to false or undefined, the parser will attempt to deduce
     * the delimiter automatically.
     */
    @jsweet.lang.Optional
    public String itemDelimiter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Line delimiter for parsing CSV.
     */
    @jsweet.lang.Optional
    public String lineDelimiter;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function to access
     * the parsed columns, the two-dimentional input data array directly, before
     * they are interpreted into series data and categories. Return `false` to
     * stop completion, or call `this.complete()` to continue async.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<Array<Array<?>>,jsweet.util.union.Union<Boolean,Object>> parsed;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function to parse
     * string representations of dates into JavaScript timestamps. Should return
     * an integer timestamp on success.
     */
    @jsweet.lang.Optional
    public java.util.function.Function<String,Double> parseDate;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The same as the columns input
     * option, but defining rows intead of columns.
     */
    @jsweet.lang.Optional
    public Array<Array<Union3<Double,String,Object>>> rows;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
     * structured as a row array. Will be fetched when the chart is created
     * using Ajax.
     */
    @jsweet.lang.Optional
    public String rowsURL;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array containing dictionaries
     * for each series. A dictionary exists of Point property names as the key
     * and the CSV column index as the value.
     */
    @jsweet.lang.Optional
    public Array<Dictionary<Double>> seriesMapping;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
     * column (indexed by 0) to use.
     */
    @jsweet.lang.Optional
    public double startColumn;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
     * row (indexed by 0) to use.
     */
    @jsweet.lang.Optional
    public double startRow;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Switch rows and columns of the
     * input data, so that `this.columns` effectively becomes the rows of the
     * data set, and the rows are interpreted as series.
     */
    @jsweet.lang.Optional
    public Boolean switchRowsAndColumns;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An HTML table or the id of such
     * to be parsed as input data. Related options are `startRow`, `endRow`,
     * `startColumn` and `endColumn` to delimit what part of the table is used.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,HTMLElement> table;
}

