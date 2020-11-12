package def.highcharts;
import def.js.Array;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Language object. The language object
 * is global and it can't be set on each chart initialization. Instead, use
 * `Highcharts.setOptions` to set it before any chart is initialized. (see
 * online documentation for example)
 */
@jsweet.lang.Interface
public abstract class LangOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Configure the accessibility
     * strings in the chart. Requires the accessibility module to be loaded. For
     * a description of the module and information on its features, see
     * Highcharts Accessibility.
     *
     * For more dynamic control over the accessibility functionality, see
     * accessibility.pointDescriptionFormatter,
     * accessibility.seriesDescriptionFormatter, and
     * accessibility.screenReaderSectionFormatter.
     */
    @jsweet.lang.Optional
    public LangAccessibilityOptions accessibility;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module menu. The
     * tooltip title for the context menu holding print and export menu items.
     */
    @jsweet.lang.Optional
    public String contextButtonTitle;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The default decimal point used
     * in the `Highcharts.numberFormat` method unless otherwise specified in the
     * function arguments.
     */
    @jsweet.lang.Optional
    public String decimalPoint;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
     */
    @jsweet.lang.Optional
    public String downloadCSV;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the JPEG download menu item.
     */
    @jsweet.lang.Optional
    public String downloadJPEG;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the PDF download menu item.
     */
    @jsweet.lang.Optional
    public String downloadPDF;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the PNG download menu item.
     */
    @jsweet.lang.Optional
    public String downloadPNG;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the SVG download menu item.
     */
    @jsweet.lang.Optional
    public String downloadSVG;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
     */
    @jsweet.lang.Optional
    public String downloadXLS;
    /**
     * (Highcharts, Highmaps) The text for the button that appears when drilling
     * down, linking back to the parent series. The parent series' name is
     * inserted for `{series.name}`.
     */
    @jsweet.lang.Optional
    public String drillUpText;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the menu item to exit the chart from full screen.
     */
    @jsweet.lang.Optional
    public String exitFullscreen;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for exported table.
     */
    @jsweet.lang.Optional
    public LangExportDataOptions exportData;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
     */
    @jsweet.lang.Optional
    public String hideData;
    /**
     * (Highcharts, Highstock) What to show in a date field for invalid dates.
     * Defaults to an empty string.
     */
    @jsweet.lang.Optional
    public String invalidDate;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The loading text that appears
     * when the chart is set into the loading state following a call to
     * `chart.showLoading`.
     */
    @jsweet.lang.Optional
    public String loading;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
     * names. Corresponds to the `%B` format in `Highcharts.dateFormat()`.
     */
    @jsweet.lang.Optional
    public Array<String> months;
    /**
     * (Highcharts, Highstock) Configure the Popup strings in the chart.
     * Requires the `annotations.js` or `annotations-advanced.src.js` module to
     * be loaded.
     */
    @jsweet.lang.Optional
    public LangNavigationOptions navigation;
    /**
     * (Highcharts, Highstock) The text to display when the chart contains no
     * data.
     */
    @jsweet.lang.Optional
    public String noData;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The magnitude of numericSymbols
     * replacements. Use 10000 for Japanese, Korean and various Chinese locales,
     * which use symbols for 10^4, 10^8 and 10^12.
     */
    @jsweet.lang.Optional
    public double numericSymbolMagnitude;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Metric prefixes used to shorten
     * high numbers in axis labels. Replacing any of the positions with `null`
     * causes the full number to be written. Setting `numericSymbols` to `null`
     * disables shortening altogether.
     */
    @jsweet.lang.Optional
    public Array<String> numericSymbols;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the menu item to print the chart.
     */
    @jsweet.lang.Optional
    public String printChart;
    /**
     * (Highstock, Gantt) The text for the label for the "from" input box in the
     * range selector.
     */
    @jsweet.lang.Optional
    public String rangeSelectorFrom;
    /**
     * (Highstock, Gantt) The text for the label for the "to" input box in the
     * range selector.
     */
    @jsweet.lang.Optional
    public String rangeSelectorTo;
    /**
     * (Highstock, Gantt) The text for the label for the range selector buttons.
     */
    @jsweet.lang.Optional
    public String rangeSelectorZoom;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for the label appearing
     * when a chart is zoomed.
     */
    @jsweet.lang.Optional
    public String resetZoom;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The tooltip title for the label
     * appearing when a chart is zoomed.
     */
    @jsweet.lang.Optional
    public String resetZoomTitle;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
     * names in abbreviated form. Corresponds to the `%b` format in
     * `Highcharts.dateFormat()`.
     */
    @jsweet.lang.Optional
    public Array<String> shortMonths;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Short week days, starting
     * Sunday. If not specified, Highcharts uses the first three letters of the
     * `lang.weekdays` option.
     */
    @jsweet.lang.Optional
    public Array<String> shortWeekdays;
    /**
     * (Highstock) Configure the stockTools GUI titles(hints) in the chart.
     * Requires the `stock-tools.js` module to be loaded.
     */
    @jsweet.lang.Optional
    public LangStockToolsOptions stockTools;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The default thousands separator
     * used in the `Highcharts.numberFormat` method unless otherwise specified
     * in the function arguments. Defaults to a single space character, which is
     * recommended in ISO 31-0 and works across Anglo-American and continental
     * European languages.
     */
    @jsweet.lang.Optional
    public String thousandsSep;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
     */
    @jsweet.lang.Optional
    public String viewData;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the menu item to view the chart in full screen.
     */
    @jsweet.lang.Optional
    public String viewFullscreen;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array containing the weekday
     * names.
     */
    @jsweet.lang.Optional
    public Array<String> weekdays;
    /**
     * (Highmaps) The title appearing on hovering the zoom in button. The text
     * itself defaults to "+" and can be changed in the button options.
     */
    @jsweet.lang.Optional
    public String zoomIn;
    /**
     * (Highmaps) The title appearing on hovering the zoom out button. The text
     * itself defaults to "-" and can be changed in the button options.
     */
    @jsweet.lang.Optional
    public String zoomOut;
}

