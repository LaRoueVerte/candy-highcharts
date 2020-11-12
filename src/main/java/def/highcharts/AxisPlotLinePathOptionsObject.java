package def.highcharts;
/**
 * Options for the path on the Axis to be calculated.
 */
@jsweet.lang.Interface
public abstract class AxisPlotLinePathOptionsObject extends def.js.Object {
    /**
     * Used in Highstock. When `true`, plot paths (crosshair, plotLines,
     * gridLines) will be rendered on all axes when defined on the first axis.
     */
    @jsweet.lang.Optional
    public Boolean acrossPanes;
    /**
     * If `false`, the function will return null when it falls outside the axis
     * bounds. If `true`, the function will return a path aligned to the plot
     * area sides if it falls outside. If `pass`, it will return a path outside.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,String> force;
    /**
     * Line width used for calculation crisp line coordinates. Defaults to 1.
     */
    @jsweet.lang.Optional
    public double lineWidth;
    /**
     * Use old coordinates (for resizing and rescaling). If not set, defaults to
     * `false`.
     */
    @jsweet.lang.Optional
    public Boolean old;
    /**
     * Used in Polar axes. Reverse the positions for concatenation of polygonal
     * plot bands
     */
    @jsweet.lang.Optional
    public Boolean reverse;
    /**
     * If given, return the plot line path of a pixel position on the axis.
     */
    @jsweet.lang.Optional
    public double translatedValue;
    /**
     * Axis value.
     */
    @jsweet.lang.Optional
    public double value;
}

