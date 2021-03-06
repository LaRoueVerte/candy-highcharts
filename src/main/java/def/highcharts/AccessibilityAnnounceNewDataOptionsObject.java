package def.highcharts;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for announcing new data to screen reader users. Useful for dynamic data applications and drilldown.
 *
 * Keep in mind that frequent announcements will not be useful to users, as they won't have time to explore the new data. For these applications, consider
 * making snapshots of the data accessible, and do the announcements in batches.
 */
@jsweet.lang.Interface
public abstract class AccessibilityAnnounceNewDataOptionsObject extends def.js.Object {
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Optional formatter callback for the announcement. Receives up to three arguments. The first argument is always
	 * an array of all series that received updates. If an announcement is already queued, the series that received updates for that announcement are also
	 * included in this array. The second argument is provided if `chart.addSeries` was called, and there is a new series. In that case, this argument is a
	 * reference to the new series. The third argument, similarly, is provided if `series.addPoint` was called, and there is a new point. In that case, this
	 * argument is a reference to the new point.
	 *
	 * The function should return a string with the text to announce to the user. Return empty string to not announce anything. Return `false` to use the
	 * default announcement format.
	 */
	// @jsweet.lang.Optional
	// public jsweet.util.function.TriFunction<Array<Series>,Series,Point,jsweet.util.union.Union<Boolean,String>> announcementFormatter;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Enable announcing new data to screen reader users
	 */
	// @jsweet.lang.Optional
	// public Boolean enabled;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Choose whether or not the announcements should interrupt the screen reader. If not enabled, the user will be
	 * notified once idle. It is recommended not to enable this setting unless there is a specific reason to do so.
	 */
	@jsweet.lang.Optional
	public Boolean interruptUser;
	/**
	 * (Highcharts, Highstock, Highmaps, Gantt) Minimum interval between announcements in milliseconds. If new data arrives before this amount of time has
	 * passed, it is queued for announcement. If another new data event happens while an announcement is queued, the queued announcement is dropped, and the
	 * latest announcement is queued instead. Set to 0 to allow all announcements, but be warned that frequent announcements are disturbing to users.
	 */
	@jsweet.lang.Optional
	public double minAnnounceInterval;
}
