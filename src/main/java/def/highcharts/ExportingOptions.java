package def.highcharts;
import def.js.Error;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the exporting module.
 * For an overview on the matter, see the docs.
 */
@jsweet.lang.Interface
public abstract class ExportingOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
     * exporting menu. Requires the Accessibility module.
     */
    @jsweet.lang.Optional
    public ExportingAccessibilityOptions accessibility;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Experimental setting to allow
     * HTML inside the chart (added through the `useHTML` options), directly in
     * the exported image. This allows you to preserve complicated HTML
     * structures like tables or bi-directional text in exported charts.
     *
     * Disclaimer: The HTML is rendered in a `foreignObject` tag in the
     * generated SVG. The official export server is based on PhantomJS, which
     * supports this, but other SVG clients, like Batik, does not support it.
     * This also applies to downloaded SVG that you want to open in a desktop
     * client.
     */
    @jsweet.lang.Optional
    public Boolean allowHTML;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the export related
     * buttons, print and export. In addition to the default buttons listed
     * here, custom buttons can be added. See navigation.buttonOptions for
     * general options.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<ExportingButtonsOptions,Dictionary<ExportingButtonsOptionsObject>> buttons;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Additional chart options to be
     * merged into the chart before exporting to an image format. This does not
     * apply to printing the chart via the export menu.
     *
     * For example, a common use case is to add data labels to improve
     * readability of the exported chart, or to add a printer-friendly color
     * scheme to exported PDFs.
     */
    @jsweet.lang.Optional
    public Options chartOptions;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for exporting data to
     * CSV or ExCel, or displaying the data in a HTML table or a JavaScript
     * structure.
     *
     * This module adds data export options to the export menu and provides
     * functions like `Chart.getCSV`, `Chart.getTable`, `Chart.getDataRows` and
     * `Chart.viewData`.
     *
     * The XLS converter is limited and only creates a HTML string that is
     * passed for download, which works but creates a warning before opening.
     * The workaround for this is to use a third party XLSX converter, as
     * demonstrated in the sample below.
     */
    @jsweet.lang.Optional
    public ExportingCsvOptions csv;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the exporting
     * module. Disabling the module will hide the context button, but API
     * methods will still be available.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Function to call if the
     * offline-exporting module fails to export a chart on the client side, and
     * fallbackToExportServer is disabled. If left undefined, an exception is
     * thrown instead. Receives two parameters, the exporting options, and the
     * error from the module.
     */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<ExportingOptions,Error> error;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to fall back to
     * the export server if the offline-exporting module is unable to export the
     * chart on the client side. This happens for certain browsers, and certain
     * features (e.g. allowHTML), depending on the image type exporting to. For
     * very complex charts, it is possible that export can fail in browsers that
     * don't support Blob objects, due to data URL length limits. It is
     * recommended to define the exporting.error handler if disabling fallback,
     * in order to notify users in case export fails.
     */
    @jsweet.lang.Optional
    public Boolean fallbackToExportServer;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The filename, without extension,
     * to use for the exported chart.
     */
    @jsweet.lang.Optional
    public String filename;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An object containing additional
     * key value data for the POST form that sends the SVG to the export server.
     * For example, a `target` can be set to make sure the generated image is
     * received in another frame, or a custom `enctype` or `encoding` can be
     * set.
     */
    @jsweet.lang.Optional
    public Dictionary<?> formAttributes;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Path where Highcharts will look
     * for export module dependencies to load on demand if they don't already
     * exist on `window`. Should currently point to location of CanVG library,
     * RGBColor.js, jsPDF and svg2pdf.js, required for client side export in
     * certain browsers.
     */
    @jsweet.lang.Optional
    public String libURL;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An object consisting of
     * definitions for the menu items in the context menu. Each key value pair
     * has a `key` that is referenced in the menuItems setting, and a `value`,
     * which is an object with the following properties:
     *
     * - **onclick:** The click handler for the menu item
     *
     * - **text:** The text for the menu item
     *
     * - **textKey:** If internationalization is required, the key to a language
     * string
     *
     * Custom text for the "exitFullScreen" can be set only in lang options (it
     * is not a separate button).
     */
    @jsweet.lang.Optional
    public Dictionary<ExportingMenuObject> menuItemDefinitions;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When printing the chart from the
     * menu item in the burger menu, if the on-screen chart exceeds this width,
     * it is resized. After printing or cancelled, it is restored. The default
     * width makes the chart fit into typical paper format. Note that this does
     * not affect the chart when printing the web page as a whole.
     */
    @jsweet.lang.Optional
    public double printMaxWidth;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Defines the scale or zoom factor
     * for the exported image compared to the on-screen display. While for
     * instance a 600px wide chart may look good on a website, it will look bad
     * in print. The default scale of 2 makes this chart export to a 1200px PNG
     * or JPG.
     */
    @jsweet.lang.Optional
    public double scale;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Show a HTML table below the
     * chart with the chart's current data.
     */
    @jsweet.lang.Optional
    public Boolean showTable;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Analogous to sourceWidth.
     */
    @jsweet.lang.Optional
    public double sourceHeight;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The width of the original chart
     * when exported, unless an explicit chart.width is set, or a pixel width is
     * set on the container. The width exported raster image is then multiplied
     * by scale.
     */
    @jsweet.lang.Optional
    public double sourceWidth;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Caption for the data table. Same
     * as chart title by default. Set to `false` to disable.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,String> tableCaption;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Default MIME type for exporting
     * if `chart.exportChart()` is called without specifying a `type` option.
     * Possible values are `image/png`, `image/jpeg`, `application/pdf` and
     * `image/svg+xml`.
     */
    @jsweet.lang.Optional
    public Object type;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The URL for the server module
     * converting the SVG string to an image format. By default this points to
     * Highchart's free web service.
     */
    @jsweet.lang.Optional
    public String url;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Use multi level headers in data
     * table. If csv.columnHeaderFormatter is defined, it has to return objects
     * in order for multi level headers to work.
     */
    @jsweet.lang.Optional
    public Boolean useMultiLevelHeaders;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) If using multi level table
     * headers, use rowspans for headers that have only one level.
     */
    @jsweet.lang.Optional
    public Boolean useRowspanHeaders;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of charts
     * exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is
     * a function of the chart.width or exporting.sourceWidth and the
     * exporting.scale.
     */
    @jsweet.lang.Optional
    public double width;
}

