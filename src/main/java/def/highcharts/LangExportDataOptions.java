package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) The text for exported table.
 */
@jsweet.lang.Interface
public abstract class LangExportDataOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The annotation column title.
     */
    @jsweet.lang.Optional
    public String annotationHeader;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The category column title when
     * axis type set to "datetime".
     */
    @jsweet.lang.Optional
    public String categoryDatetimeHeader;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The category column title.
     */
    @jsweet.lang.Optional
    public String categoryHeader;
}

