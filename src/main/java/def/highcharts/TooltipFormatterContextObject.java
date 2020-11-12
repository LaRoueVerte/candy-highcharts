package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
@jsweet.lang.Interface
public abstract class TooltipFormatterContextObject extends def.js.Object {
    public Union3<String,GradientColorObject,PatternObject> color;
    @jsweet.lang.Optional
    public double colorIndex;
    public double key;
    @jsweet.lang.Optional
    public double percentage;
    public Point point;
    @jsweet.lang.Optional
    public Array<TooltipFormatterContextObject> points;
    public Series series;
    @jsweet.lang.Optional
    public double total;
    public double x;
    public double y;
}

