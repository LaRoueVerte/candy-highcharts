package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * (Highstock, Gantt) Options for the handles for dragging the zoomed area.
 */
@jsweet.lang.Interface
public abstract class NavigatorHandlesOptions extends def.js.Object {
    /**
     * (Highstock, Gantt) The fill for the handle.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> backgroundColor;
    /**
     * (Highstock, Gantt) The stroke for the handle border and the stripes
     * inside.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> borderColor;
    /**
     * (Highstock, Gantt) Allows to enable/disable handles.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock, Gantt) Height for handles.
     */
    @jsweet.lang.Optional
    public double height;
    /**
     * (Highstock, Gantt) The width for the handle border and the stripes
     * inside.
     */
    @jsweet.lang.Optional
    public Object lineWidth;
    /**
     * (Highstock, Gantt) Array to define shapes of handles. 0-index for left,
     * 1-index for right.
     *
     * Additionally, the URL to a graphic can be given on this form:
     * `url(graphic.png)`. Note that for the image to be applied to exported
     * charts, its URL needs to be accessible by the export server.
     *
     * Custom callbacks for symbol path generation can also be added to
     * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
     * its method name, as shown in the demo.
     */
    @jsweet.lang.Optional
    public Array<String> symbols;
    /**
     * (Highstock, Gantt) Width for handles.
     */
    @jsweet.lang.Optional
    public double width;
}

