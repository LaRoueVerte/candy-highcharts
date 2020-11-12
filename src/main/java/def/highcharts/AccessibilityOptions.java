package def.highcharts;
import jsweet.util.union.Union3;
import def.dom.HTMLElement;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for configuring
 * accessibility for the chart. Requires the accessibility module to be loaded.
 * For a description of the module and information on its features, see
 * Highcharts Accessibility.
 */
@jsweet.lang.Interface
public abstract class AccessibilityOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for announcing new data
     * to screen reader users. Useful for dynamic data applications and
     * drilldown.
     *
     * Keep in mind that frequent announcements will not be useful to users, as
     * they won't have time to explore the new data. For these applications,
     * consider making snapshots of the data accessible, and do the
     * announcements in batches.
     */
    @jsweet.lang.Optional
    public AccessibilityAnnounceNewDataOptionsObject announceNewData;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A hook for adding custom
     * components to the accessibility module. Should be an object mapping
     * component names to instances of classes inheriting from the
     * Highcharts.AccessibilityComponent base class. Remember to add the
     * component to the keyboardNavigation.order for the keyboard navigation to
     * be usable.
     */
    @jsweet.lang.Optional
    public Object customComponents;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart.
     *
     * **Note: Prefer using linkedDescription or caption instead.**
     *
     * If the Accessibility module is loaded, this option is included by default
     * as a long description of the chart in the hidden screen reader
     * information region.
     *
     * Note: Since Highcharts now supports captions and linked descriptions, it
     * is preferred to define the description using those methods, as a visible
     * caption/description benefits all users. If the
     * `accessibility.description` option is defined, the linked description is
     * ignored, and the caption is hidden from screen reader users.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility
     * functionality for the chart.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Theme to apply to the chart when
     * Windows High Contrast Mode is detected. By default, a high contrast theme
     * matching the high contrast system system colors is used.
     */
    @jsweet.lang.Optional
    public Object highContrastTheme;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation.
     */
    @jsweet.lang.Optional
    public KeyboardNavigationOptionsObject keyboardNavigation;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Amount of landmarks/regions to
     * create for screen reader users. More landmarks can make navigation with
     * screen readers easier, but can be distracting if there are lots of charts
     * on the page. Three modes are available:
     *
     * - `all`: Adds regions for all series, legend, menu, information region.
     *
     * - `one`: Adds a single landmark per chart.
     *
     * - `disabled`: No landmarks are added.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.all,def.highcharts.StringTypes.disabled,def.highcharts.StringTypes.one> landmarkVerbosity;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Link the chart to an HTML
     * element describing the contents of the chart.
     *
     * It is always recommended to describe charts using visible text, to
     * improve SEO as well as accessibility for users with disabilities. This
     * option lets an HTML element with a description be linked to the chart, so
     * that screen reader users can connect the two.
     *
     * By setting this option to a string, Highcharts runs the string as an HTML
     * selector query on the entire document. If there is only a single match,
     * this element is linked to the chart. The content of the linked element
     * will be included in the chart description for screen reader users.
     *
     * By default, the chart looks for an adjacent sibling element with the
     * `highcharts-description` class.
     *
     * The feature can be disabled by setting the option to an empty string, or
     * overridden by providing the accessibility.description option.
     * Alternatively, the HTML element to link can be passed in directly as an
     * HTML node.
     *
     * If you need the description to be part of the exported image, consider
     * using the caption feature.
     *
     * If you need the description to be hidden visually, use the
     * accessibility.description option.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,HTMLElement> linkedDescription;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for descriptions of
     * individual data points.
     */
    @jsweet.lang.Optional
    public AccessibilityPointOptions point;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
     * screen reader information sections added before and after the chart.
     */
    @jsweet.lang.Optional
    public AccessibilityScreenReaderSectionOptions screenReaderSection;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options global to
     * all data series. Individual series can also have specific accessibility
     * options set.
     */
    @jsweet.lang.Optional
    public AccessibilitySeriesOptions series;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart
     * type.
     *
     * If the Accessibility module is loaded, this will be included in the
     * description of the chart in the screen reader information region.
     *
     * Highcharts will by default attempt to guess the chart type, but for more
     * complex charts it is recommended to specify this property for clarity.
     */
    @jsweet.lang.Optional
    public String typeDescription;
}

