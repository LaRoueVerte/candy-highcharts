package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * The generic point options for all series.
 *
 * In TypeScript you have to extend `PointOptionsObject` with an additional
 * declaration to allow custom data options: (see online documentation for
 * example)
 */
@jsweet.lang.Interface
public abstract class PointOptionsObject extends def.js.Object {
    /**
     * (Highcharts) Accessibility options for a data point.
     */
    @jsweet.lang.Optional
    public PointAccessibilityOptionsObject accessibility;
    /**
     * (Highcharts, Highstock) The color of the border surrounding the column or
     * bar.
     *
     * In styled mode, the border stroke can be set with the `.highcharts-point`
     * rule.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highcharts, Highstock) The width of the border surrounding the column or
     * bar.
     *
     * In styled mode, the stroke width can be set with the `.highcharts-point`
     * rule.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts) The dash style of the box.
     */
    @jsweet.lang.Optional
    public Object boxDashStyle;
    /**
     * (Highcharts, Gantt) An additional, individual class name for the data
     * point's graphic representation.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highstock) The closing value of each data point.
     */
    @jsweet.lang.Optional
    public double close;
    /**
     * (Highcharts, Highstock, Gantt) Individual color for the point. By default
     * the color is pulled from the global `colors` array.
     *
     * In styled mode, the `color` option doesn't take effect. Instead, use
     * `colorIndex`.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Gantt) A specific color index to use for the point, so its
     * graphic representations are given the class name `highcharts-color-{n}`.
     * In styled mode this will change the color of the graphic. In non-styled
     * mode, the color by is set by the `fill` attribute, so the change in class
     * name won't have a visual effect by default.
     */
    @jsweet.lang.Optional
    public double colorIndex;
    /**
     * (Highcharts) Serves a purpose only if a `colorAxis` object is defined in
     * the chart options. This value will decide which color the point gets from
     * the scale of the colorAxis.
     */
    @jsweet.lang.Optional
    public double colorValue;
    /**
     * (Highcharts, Highstock) Color of the line that connects the dumbbell
     * point's values. By default it is the series' color.
     */
    @jsweet.lang.Optional
    public String connectorColor;
    /**
     * (Highcharts, Highstock) Pixel width of the line that connects the
     * dumbbell point's values.
     */
    @jsweet.lang.Optional
    public double connectorWidth;
    /**
     * (Highcharts) A reserved subspace to store options and values for
     * customized functionality. Here you can add additional data for your own
     * event callbacks and formatter callbacks.
     */
    @jsweet.lang.Optional
    public Dictionary<?> custom;
    /**
     * (Highcharts) A name for the dash style to use for the column or bar.
     * Overrides dashStyle on the series.
     *
     * In styled mode, the stroke dash-array can be set with the same classes as
     * listed under data.color.
     */
    @jsweet.lang.Optional
    public Object dashStyle;
    /**
     * (Highcharts, Highstock, Gantt) Individual data label for each point. The
     * options are the same as the ones for plotOptions.series.dataLabels.
     */
    @jsweet.lang.Optional
    public Object dataLabels;
    /**
     * (Highcharts) A description of the point to add to the screen reader
     * information about the point.
     */
    @jsweet.lang.Optional
    public String description;
    /**
     * (Highcharts, Highstock) The wind direction in degrees, where 0 is north
     * (pointing towards south).
     */
    @jsweet.lang.Optional
    public double direction;
    /**
     * (Highcharts) Point specific options for the draggable-points module.
     * Overrides options on `series.dragDrop`.
     */
    @jsweet.lang.Optional
    public SeriesLineDataDragDropOptions dragDrop;
    /**
     * (Highcharts) The `id` of a series in the drilldown.series array to use
     * for a drilldown for this point.
     */
    @jsweet.lang.Optional
    public String drilldown;
    /**
     * (Highcharts, Highstock, Gantt) The individual point events.
     */
    @jsweet.lang.Optional
    public PointEventsOptionsObject events;
    /**
     * (Highstock) The fill color of an individual flag. By default it inherits
     * from the series color.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fillColor;
    /**
     * (Highcharts) The node that the link runs from.
     */
    @jsweet.lang.Optional
    public String from;
    /**
     * (Highcharts, Highstock) The high or maximum value for each data point.
     */
    @jsweet.lang.Optional
    public double high;
    /**
     * (Highcharts, Highstock, Gantt) An id for the point. This can be used
     * after render time to get a pointer to the point object through
     * `chart.get()`.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * (Highcharts) The inner radius of an individual point in a solid gauge.
     * Can be given as a number (pixels) or percentage string.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> innerRadius;
    /**
     * (Highcharts) When this property is true, the points acts as a summary
     * column for the values added or substracted since the last intermediate
     * sum, or since the start of the series. The `y` value is ignored.
     */
    @jsweet.lang.Optional
    public Boolean isIntermediateSum;
    /**
     * (Highcharts) When this property is true, the point display the total sum
     * across the entire series. The `y` value is ignored.
     */
    @jsweet.lang.Optional
    public Boolean isSum;
    /**
     * (Highcharts) The label of event.
     */
    @jsweet.lang.Optional
    public String label;
    /**
     * (Highcharts) The rank for this point's data label in case of collision.
     * If two data labels are about to overlap, only the one with the highest
     * `labelrank` will be drawn.
     */
    @jsweet.lang.Optional
    public double labelrank;
    /**
     * (Highcharts) The sequential index of the data point in the legend.
     */
    @jsweet.lang.Optional
    public double legendIndex;
    /**
     * (Highcharts, Highstock) The length of the vector. The rendered length
     * will relate to the `vectorLength` setting.
     */
    @jsweet.lang.Optional
    public double length;
    /**
     * (Highcharts, Highstock) The low or minimum value for each data point.
     */
    @jsweet.lang.Optional
    public double low;
    /**
     * (Highcharts, Highstock) Color of the start markers in a dumbbell graph.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> lowColor;
    /**
     * (Highcharts, Highstock) Options for the point markers of line-like
     * series.
     */
    @jsweet.lang.Optional
    public PointMarkerOptionsObject marker;
    /**
     * (Highcharts) The median for each data point. This is drawn as a line
     * through the middle area of the box.
     */
    @jsweet.lang.Optional
    public double median;
    /**
     * (Highcharts) The dash style of the median.
     */
    @jsweet.lang.Optional
    public Object medianDashStyle;
    /**
     * (Highcharts) The name of the point as shown in the legend, tooltip,
     * dataLabels, etc.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> name;
    /**
     * (Highstock) The opening value of each data point.
     */
    @jsweet.lang.Optional
    public double open;
    /**
     * (Highcharts) Only for treemap. Use this option to build a tree structure.
     * The value should be the id of the point which is the parent. If no points
     * has a matching id, or this option is undefined, then the parent will be
     * set to the root.
     */
    @jsweet.lang.Optional
    public String parent;
    /**
     * (Highcharts, Highmaps) Point padding for a single point.
     */
    @jsweet.lang.Optional
    public double pointPadding;
    /**
     * (Highcharts, Highstock, Gantt) A pixel value specifying a fixed width for
     * the column or bar. Overrides pointWidth on the series. The width effects
     * the dimension that is not based on the point value.
     */
    @jsweet.lang.Optional
    public double pointWidth;
    /**
     * (Highcharts) The lower quartile for each data point. This is the bottom
     * of the box.
     */
    @jsweet.lang.Optional
    public double q1;
    /**
     * (Highcharts) The higher quartile for each data point. This is the top of
     * the box.
     */
    @jsweet.lang.Optional
    public double q3;
    /**
     * (Highcharts) The outer radius of an individual point in a solid gauge.
     * Can be given as a number (pixels) or percentage string.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> radius;
    /**
     * (Highcharts, Highstock, Gantt) Whether the data point is selected
     * initially.
     */
    @jsweet.lang.Optional
    public Boolean selected;
    /**
     * (Highcharts) The set or sets the options will be applied to. If a single
     * entry is defined, then it will create a new set. If more than one entry
     * is defined, then it will define the overlap between the sets in the
     * array.
     */
    @jsweet.lang.Optional
    public Array<String> sets;
    /**
     * (Highcharts) Whether to display a slice offset from the center.
     */
    @jsweet.lang.Optional
    public Boolean sliced;
    /**
     * (Highcharts) The dash style of the stem.
     */
    @jsweet.lang.Optional
    public Object stemDashStyle;
    /**
     * (Highcharts) The target value of a point.
     */
    @jsweet.lang.Optional
    public double target;
    /**
     * (Highcharts) Individual target options for each point.
     */
    @jsweet.lang.Optional
    public SeriesBulletDataTargetOptions targetOptions;
    /**
     * (Highstock) The longer text to be shown in the flag's tooltip.
     */
    @jsweet.lang.Optional
    public String text;
    /**
     * (Highstock) The short text to be shown on the flag.
     */
    @jsweet.lang.Optional
    public String title;
    /**
     * (Highcharts) The node that the link runs to.
     */
    @jsweet.lang.Optional
    public String to;
    /**
     * (Highcharts, Highstock) The wind speed in meters per second.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> value;
    /**
     * (Highcharts) The weighting of a word. The weight decides the relative
     * size of a word compared to the rest of the collection.
     */
    @jsweet.lang.Optional
    public double weight;
    /**
     * (Highcharts) The dash style of the whiskers.
     */
    @jsweet.lang.Optional
    public Object whiskerDashStyle;
    /**
     * (Highcharts, Highstock) The x value of the point. For datetime axes, the
     * X value is the timestamp in milliseconds since 1970.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * (Highcharts, Highstock) The y value of the point.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> y;
    /**
     * (Highcharts) The relative width for each column. On a category axis, the
     * widths are distributed so they sum up to the X axis length. On linear and
     * datetime axes, the columns will be laid out from the X value and Z units
     * along the axis.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Object> z;
}

