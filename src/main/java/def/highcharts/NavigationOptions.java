package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for buttons
 * and menus appearing in the exporting module.
 */
@jsweet.lang.Interface
public abstract class NavigationOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Additional options to be merged
     * into all annotations.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<AnnotationsOptions,NavigationAnnotationsOptions> annotationsOptions;
    /**
     * (Highcharts, Highstock) Bindings definitions for custom HTML buttons.
     * Each binding implements simple event-driven interface:
     *
     * - `className`: classname used to bind event to
     *
     * - `init`: initial event, fired on button click
     *
     * - `start`: fired on first click on a chart
     *
     * - `steps`: array of sequential events fired one after another on each of
     * users clicks
     *
     * - `end`: last event to be called after last step event
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<NavigationBindingsOptions,Dictionary<NavigationBindingsOptionsObject>> bindings;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name where all
     * bindings will be attached to. Multiple charts on the same page should
     * have separate class names to prevent duplicating events.
     *
     * Default value of versions < 7.0.4 `highcharts-bindings-wrapper`
     */
    @jsweet.lang.Optional
    public String bindingsClassName;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
     * buttons appearing in the exporting module.
     *
     * In styled mode, the buttons are styled with the
     * `.highcharts-contextbutton` and `.highcharts-button-symbol` classes.
     */
    @jsweet.lang.Optional
    public NavigationButtonOptions buttonOptions;
    /**
     * (Highcharts, Highstock) Events to communicate between Stock Tools and
     * custom GUI.
     */
    @jsweet.lang.Optional
    public NavigationEventsOptions events;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Path where Highcharts will look
     * for icons. Change this to use icons from a different server.
     */
    @jsweet.lang.Optional
    public String iconsURL;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the hover state
     * of the individual items within the popup menu appearing by default when
     * the export icon is clicked. The menu items are rendered in HTML.
     */
    @jsweet.lang.Optional
    public CSSObject menuItemHoverStyle;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the individual
     * items within the popup menu appearing by default when the export icon is
     * clicked. The menu items are rendered in HTML. Font size defaults to
     * `11px` on desktop and `14px` on touch devices.
     */
    @jsweet.lang.Optional
    public CSSObject menuItemStyle;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the popup menu
     * appearing by default when the export icon is clicked. This menu is
     * rendered in HTML.
     */
    @jsweet.lang.Optional
    public CSSObject menuStyle;
}

