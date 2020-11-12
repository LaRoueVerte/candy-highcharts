package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the paging or navigation
 * appearing when the legend is overflown. Navigation works well on screen, but
 * not in static exported images. One way of working around that is to increase
 * the chart height in export.
 */
@jsweet.lang.Interface
public abstract class LegendNavigationOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color for the active up or
     * down arrow in the legend page navigation.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> activeColor;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) How to animate the pages when
     * navigating up or down. A value of `true` applies the default navigation
     * given in the `chart.animation` option. Additional options can be given as
     * an object containing values for easing and duration.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Partial2<AnimationOptionsObject>> animation;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the up and
     * down arrows in the legend paging navigation.
     */
    @jsweet.lang.Optional
    public double arrowSize;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the legend
     * navigation. In most cases, disabling the navigation results in an
     * unwanted overflow.
     *
     * See also the adapt chart to legend plugin for a solution to extend the
     * chart height to make room for the legend, optionally in exported charts
     * only.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the inactive up or
     * down arrow in the legend page navigation. .
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> inactiveColor;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Text styles for the legend page
     * navigation.
     */
    @jsweet.lang.Optional
    public CSSObject style;
}

