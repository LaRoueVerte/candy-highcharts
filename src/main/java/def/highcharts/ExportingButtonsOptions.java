package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the export related
 * buttons, print and export. In addition to the default buttons listed here,
 * custom buttons can be added. See navigation.buttonOptions for general
 * options.
 */
@jsweet.lang.Interface
public abstract class ExportingButtonsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the export button.
     *
     * In styled mode, export button styles can be applied with the
     * `.highcharts-contextbutton` class.
     */
    @jsweet.lang.Optional
    public ExportingButtonsOptionsObject contextButton;
}

