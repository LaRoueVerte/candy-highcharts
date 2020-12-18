package def.highcharts;

import def.dom.SVGElement;

/**
 * (Highcharts) Stack of data points
 */
@jsweet.lang.Interface
public abstract class StackItemObject extends def.js.Object {
    /**
     * Alignment settings
     */
    public AlignObject alignOptions;
    /**
     * Related axis
     */
    public Axis axis;
    /**
     * Cumulative value of the stacked data points
     */
    public double cumulative;
    /**
     * True if on the negative side
     */
    public Boolean isNegative;
    /**
     * Related SVG element
     */
	public SVGElement label;
    /**
     * Related stack options
     */
    public YAxisStackLabelsOptions options;
    /**
     * Total value of the stacked data points
     */
    public double total;
    /**
     * Shared x value of the stack
     */
    public double x;
}

