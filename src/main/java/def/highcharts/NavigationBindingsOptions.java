package def.highcharts;
/**
 * (Highcharts, Highstock) Bindings definitions for custom HTML buttons. Each
 * binding implements simple event-driven interface:
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
@jsweet.lang.Interface
public abstract class NavigationBindingsOptions extends def.js.Object {
    /**
     * (Highstock) A line with arrow annotation. Includes `start` and one event
     * in `steps` array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject arrowInfinityLine;
    /**
     * (Highstock) A ray with an arrow annotation bindings. Includes `start` and
     * one event in `steps` array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject arrowRay;
    /**
     * (Highstock) A segment with an arrow annotation bindings. Includes `start`
     * and one event in `steps` array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject arrowSegment;
    /**
     * (Highcharts, Highstock) A circle annotation bindings. Includes `start`
     * and one event in `steps` array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject circleAnnotation;
    /**
     * (Highstock) Crooked line (three points) annotation bindings. Includes
     * `start` and two events in `steps` (for second and third points in crooked
     * line) array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject crooked3;
    /**
     * (Highstock) Crooked line (five points) annotation bindings. Includes
     * `start` and four events in `steps` (for all consequent points in crooked
     * line) array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject crooked5;
    /**
     * (Highstock) Hides/shows two price indicators:
     *
     * - last price in the dataset
     *
     * - last price in the selected range
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject currentPriceIndicator;
    /**
     * (Highstock) Elliott wave (three points) annotation bindings. Includes
     * `start` and two events in `steps` (for second and third points) array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject elliott3;
    /**
     * (Highstock) Elliott wave (five points) annotation bindings. Includes
     * `start` and four event in `steps` (for all consequent points in Elliott
     * wave) array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject elliott5;
    /**
     * (Highstock) A fibonacci annotation bindings. Includes `start` and two
     * events in `steps` array (updates second point, then height).
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject fibonacci;
    /**
     * (Highstock) A flag series bindings. Includes `start` event. On click,
     * finds the closest point and marks it with a flag with `'circlepin'`
     * shape.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject flagCirclepin;
    /**
     * (Highstock) A flag series bindings. Includes `start` event. On click,
     * finds the closest point and marks it with a flag with `'diamondpin'`
     * shape.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject flagDiamondpin;
    /**
     * (Highstock) A flag series bindings. Includes `start` event. On click,
     * finds the closest point and marks it with a flag without pin shape.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject flagSimplepin;
    /**
     * (Highstock) A flag series bindings. Includes `start` event. On click,
     * finds the closest point and marks it with a flag with `'squarepin'`
     * shape.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject flagSquarepin;
    /**
     * (Highstock) Displays chart in fullscreen.
     *
     * **Note**: Fullscreen is not supported on iPhone due to iOS limitations.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject fullScreen;
    /**
     * (Highstock) A horizontal line annotation. Includes `start` event.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject horizontalLine;
    /**
     * (Highstock) Indicators bindings. Includes `init` event to show a popup.
     *
     * Note: In order to show base series from the chart in the popup's dropdown
     * each series requires series.id to be defined.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject indicators;
    /**
     * (Highstock) A line annotation. Includes `start` and one event in `steps`
     * array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject infinityLine;
    /**
     * (Highcharts, Highstock) A label annotation bindings. Includes `start`
     * event only.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject labelAnnotation;
    /**
     * (Highstock) A measure (x-dimension) annotation bindings. Includes `start`
     * and one event in `steps` array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject measureX;
    /**
     * (Highstock) A measure (xy-dimension) annotation bindings. Includes
     * `start` and one event in `steps` array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject measureXY;
    /**
     * (Highstock) A measure (y-dimension) annotation bindings. Includes `start`
     * and one event in `steps` array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject measureY;
    /**
     * (Highstock) A parallel channel (tunnel) annotation bindings. Includes
     * `start` and two events in `steps` array (updates second point, then
     * height).
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject parallelChannel;
    /**
     * (Highstock) An Andrew's pitchfork annotation bindings. Includes `start`
     * and two events in `steps` array (sets second and third control points).
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject pitchfork;
    /**
     * (Highstock) A ray annotation bindings. Includes `start` and one event in
     * `steps` array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject ray;
    /**
     * (Highcharts, Highstock) A rectangle annotation bindings. Includes `start`
     * and one event in `steps` array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject rectangleAnnotation;
    /**
     * (Highstock) Save a chart in localStorage under `highcharts-chart` key.
     * Stored items:
     *
     * - annotations
     *
     * - indicators (with yAxes)
     *
     * - flags
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject saveChart;
    /**
     * (Highstock) A segment annotation bindings. Includes `start` and one event
     * in `steps` array.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject segment;
    /**
     * (Highstock) Changes main series to `'candlestick'` type.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject seriesTypeCandlestick;
    /**
     * (Highstock) Changes main series to `'line'` type.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject seriesTypeLine;
    /**
     * (Highstock) Changes main series to `'ohlc'` type.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject seriesTypeOhlc;
    /**
     * (Highstock) Hides/shows all annotations on a chart.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject toggleAnnotations;
    /**
     * (Highstock) A vertical arrow annotation bindings. Includes `start` event.
     * On click, finds the closest point and marks it with an arrow. Green arrow
     * when pointing from above, red when pointing from below the point.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject verticalArrow;
    /**
     * (Highstock) A vertical counter annotation bindings. Includes `start`
     * event. On click, finds the closest point and marks it with a numeric
     * annotation - incrementing counter on each add.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject verticalCounter;
    /**
     * (Highstock) A vertical arrow annotation bindings. Includes `start` event.
     * On click, finds the closest point and marks it with an arrow and a label
     * with value.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject verticalLabel;
    /**
     * (Highstock) A vertical line annotation. Includes `start` event.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject verticalLine;
    /**
     * (Highstock) Enables zooming in xAxis on a chart. Includes `start` event
     * which changes chart.zoomType.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject zoomX;
    /**
     * (Highstock) Enables zooming in xAxis and yAxis on a chart. Includes
     * `start` event which changes chart.zoomType.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject zoomXY;
    /**
     * (Highstock) Enables zooming in yAxis on a chart. Includes `start` event
     * which changes chart.zoomType.
     */
    @jsweet.lang.Optional
    public NavigationBindingsOptionsObject zoomY;
}

