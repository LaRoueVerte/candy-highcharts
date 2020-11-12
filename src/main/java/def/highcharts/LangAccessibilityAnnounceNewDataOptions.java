package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Default announcement for new data in
 * charts. If addPoint or addSeries is used, and only one series/point is added,
 * the `newPointAnnounce` and `newSeriesAnnounce` strings are used. The
 * `...Single` versions will be used if there is only one chart on the page, and
 * the `...Multiple` versions will be used if there are multiple charts on the
 * page. For all other new data events, the `newDataAnnounce` string will be
 * used.
 */
@jsweet.lang.Interface
public abstract class LangAccessibilityAnnounceNewDataOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String newDataAnnounce;
    @jsweet.lang.Optional
    public String newPointAnnounceMultiple;
    @jsweet.lang.Optional
    public String newPointAnnounceSingle;
    @jsweet.lang.Optional
    public String newSeriesAnnounceMultiple;
    @jsweet.lang.Optional
    public String newSeriesAnnounceSingle;
}

