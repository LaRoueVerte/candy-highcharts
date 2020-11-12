package def.highcharts;
import def.js.Array;
import def.dom.HTMLElement;
/**
 * Tooltip of a chart.
 */
public class Tooltip extends def.js.Object {
    /**
     * Tooltip of a chart.
     *
     * @param chart
     *        The chart instance.
     *
     * @param options
     *        Tooltip options.
     */
    public Tooltip(Chart chart, TooltipOptions options){}
    /**
     * Chart of the tooltip.
     */
    public final Chart chart=null;
    /**
     * Reference to the tooltip's container, when [Highcharts.Tooltip#outside]
     * is set to true, otherwise it's undefined.
     */
    @jsweet.lang.Optional
    public HTMLElement container;
    /**
     * Used tooltip options.
     */
    public final TooltipOptions options=null;
    /**
     * Whether to allow the tooltip to render outside the chart's SVG element
     * box. By default (false), the tooltip is rendered within the chart's SVG
     * element, which results in the tooltip being aligned inside the chart
     * area.
     */
    public final Boolean outside=null;
    /**
     * Reference to the tooltip's renderer, when [Highcharts.Tooltip#outside] is
     * set to true, otherwise it's undefined.
     */
    @jsweet.lang.Optional
    public SVGRenderer renderer;
    /**
     * When the tooltip is shared, the entire plot area will capture mouse
     * movement or touch events.
     */
    @jsweet.lang.Optional
    public final Boolean shared=null;
    /**
     * True, if the tooltip is split into one label per series, with the header
     * close to the axis.
     */
    @jsweet.lang.Optional
    public final Boolean split=null;
    /**
     * In case no user defined formatter is given, this will be used. Note that
     * the context here is an object holding point, series, x, y etc.
     */
    native public Array<String> defaultFormatter(Tooltip tooltip);
    /**
     * Removes and destroys the tooltip and its elements.
     */
    native public void destroy();
    /**
     * Creates the Tooltip label element if it does not exist, then returns it.
     */
    native public SVGElement2 getLabel();
    /**
     * Hides the tooltip with a fade out animation.
     *
     * @param delay
     *        The fade out in milliseconds. If no value is provided the value of
     *        the tooltip.hideDelay option is used. A value of 0 disables the
     *        fade out animation.
     */
    native public void hide(double delay);
    /**
     * Refresh the tooltip's text and position.
     *
     * @param pointOrPoints
     *        Either a point or an array of points.
     *
     * @param mouseEvent
     *        Mouse event, that is responsible for the refresh and should be
     *        used for the tooltip update.
     */
    native public void refresh(Point pointOrPoints, PointerEventObject mouseEvent);
    /**
     * Updates the tooltip with the provided tooltip options.
     *
     * @param options
     *        The tooltip options to update.
     */
    native public void update(TooltipOptions options);
    /**
     * Hides the tooltip with a fade out animation.
     *
     * @param delay
     *        The fade out in milliseconds. If no value is provided the value of
     *        the tooltip.hideDelay option is used. A value of 0 disables the
     *        fade out animation.
     */
    native public void hide();
    /**
     * Refresh the tooltip's text and position.
     *
     * @param pointOrPoints
     *        Either a point or an array of points.
     *
     * @param mouseEvent
     *        Mouse event, that is responsible for the refresh and should be
     *        used for the tooltip update.
     */
    native public void refresh(Point pointOrPoints);
    /**
     * Refresh the tooltip's text and position.
     *
     * @param pointOrPoints
     *        Either a point or an array of points.
     *
     * @param mouseEvent
     *        Mouse event, that is responsible for the refresh and should be
     *        used for the tooltip update.
     */
    native public void refresh(Array<Point> pointOrPoints, PointerEventObject mouseEvent);
    /**
     * Refresh the tooltip's text and position.
     *
     * @param pointOrPoints
     *        Either a point or an array of points.
     *
     * @param mouseEvent
     *        Mouse event, that is responsible for the refresh and should be
     *        used for the tooltip update.
     */
    native public void refresh(Array<Point> pointOrPoints);
    /**
     * Refresh the tooltip's text and position.
     *
     * @param pointOrPoints
     *        Either a point or an array of points.
     *
     * @param mouseEvent
     *        Mouse event, that is responsible for the refresh and should be
     *        used for the tooltip update.
     */
    native public void refresh(Point[] pointOrPoints, PointerEventObject mouseEvent);
    /**
     * Refresh the tooltip's text and position.
     *
     * @param pointOrPoints
     *        Either a point or an array of points.
     *
     * @param mouseEvent
     *        Mouse event, that is responsible for the refresh and should be
     *        used for the tooltip update.
     */
    native public void refresh(Point[] pointOrPoints);
    protected Tooltip(){}
}

