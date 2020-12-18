package def.highcharts;

import def.dom.SVGElement;

/**
 * The object wrapper for plot lines and plot bands
 */
public class PlotLineOrBand extends def.js.Object {
    /**
     * The object wrapper for plot lines and plot bands
     */
    public PlotLineOrBand(Axis axis, Object options){}
    /**
     * SVG element of the label.
     */
	public SVGElement label;
    /**
     * SVG element of the plot line or band.
     */
	public SVGElement svgElement;
    /**
     * Remove the plot line or band.
     */
    native public void destroy();
    /**
     * The object wrapper for plot lines and plot bands
     */
    public PlotLineOrBand(Axis axis){}
    protected PlotLineOrBand(){}
}

