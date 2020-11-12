package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highcharts, Highstock, Highmaps) The bubble legend is an additional element
 * in legend which presents the scale of the bubble series. Individual bubble
 * ranges can be defined by user or calculated from series. In the case of
 * automatically calculated ranges, a 1px margin of error is permitted.
 */
@jsweet.lang.Interface
public abstract class LegendBubbleLegendOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps) The color of the ranges borders, can be
     * also defined for an individual range.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highcharts, Highstock, Highmaps) The width of the ranges borders in
     * pixels, can be also defined for an individual range.
     */
    @jsweet.lang.Optional
    public double borderWidth;
    /**
     * (Highcharts, Highstock, Highmaps) An additional class name to apply to
     * the bubble legend' circle graphical elements. This option does not
     * replace default class names of the graphical element.
     */
    @jsweet.lang.Optional
    public String className;
    /**
     * (Highcharts, Highstock, Highmaps) The main color of the bubble legend.
     * Applies to ranges, if individual color is not defined.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> color;
    /**
     * (Highcharts, Highstock, Highmaps) An additional class name to apply to
     * the bubble legend's connector graphical elements. This option does not
     * replace default class names of the graphical element.
     */
    @jsweet.lang.Optional
    public String connectorClassName;
    /**
     * (Highcharts, Highstock, Highmaps) The color of the connector, can be also
     * defined for an individual range.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> connectorColor;
    /**
     * (Highcharts, Highstock, Highmaps) The length of the connectors in pixels.
     * If labels are centered, the distance is reduced to 0.
     */
    @jsweet.lang.Optional
    public double connectorDistance;
    /**
     * (Highcharts, Highstock, Highmaps) The width of the connectors in pixels.
     */
    @jsweet.lang.Optional
    public double connectorWidth;
    /**
     * (Highcharts, Highstock, Highmaps) Enable or disable the bubble legend.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highcharts, Highstock, Highmaps) Options for the bubble legend labels.
     */
    @jsweet.lang.Optional
    public LegendBubbleLegendLabelsOptions labels;
    /**
     * (Highcharts, Highstock, Highmaps) The position of the bubble legend in
     * the legend.
     */
    @jsweet.lang.Optional
    public double legendIndex;
    /**
     * (Highcharts, Highstock, Highmaps) Miximum bubble legend range size. If
     * values for ranges are not specified, the `minSize` and the `maxSize` are
     * calculated from bubble series.
     */
    @jsweet.lang.Optional
    public double maxSize;
    /**
     * (Highcharts, Highstock, Highmaps) Minimum bubble legend range size. If
     * values for ranges are not specified, the `minSize` and the `maxSize` are
     * calculated from bubble series.
     */
    @jsweet.lang.Optional
    public double minSize;
    /**
     * (Highcharts, Highstock, Highmaps) Options for specific range. One range
     * consists of bubble, label and connector.
     */
    @jsweet.lang.Optional
    public Array<LegendBubbleLegendRangesOptions> ranges;
    /**
     * (Highcharts, Highstock, Highmaps) Whether the bubble legend range value
     * should be represented by the area or the width of the bubble. The
     * default, area, corresponds best to the human perception of the size of
     * each bubble.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.area,def.highcharts.StringTypes.width> sizeBy;
    /**
     * (Highcharts, Highstock, Highmaps) When this is true, the absolute value
     * of z determines the size of the bubble. This means that with the default
     * zThreshold of 0, a bubble of value -1 will have the same size as a bubble
     * of value 1, while a bubble of value 0 will have a smaller size according
     * to minSize.
     */
    @jsweet.lang.Optional
    public Boolean sizeByAbsoluteValue;
    /**
     * (Highcharts, Highstock, Highmaps) Define the visual z index of the bubble
     * legend.
     */
    @jsweet.lang.Optional
    public double zIndex;
    /**
     * (Highcharts, Highstock, Highmaps) Ranges with with lower value than
     * zThreshold, are skipped.
     */
    @jsweet.lang.Optional
    public double zThreshold;
}

