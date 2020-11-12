package def.highcharts;
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
    public SVGElement2 label;
    /**
     * SVG element of the plot line or band.
     */
    public SVGElement2 svgElement;
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

