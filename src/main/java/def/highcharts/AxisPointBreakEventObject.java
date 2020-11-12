package def.highcharts;
import def.js.Function;
@jsweet.lang.Interface
public abstract class AxisPointBreakEventObject extends def.js.Object {
    public Dictionary<Double> brk;
    public Point point;
    public Function preventDefault;
    public SVGElement2 target;
    public jsweet.util.union.Union<def.highcharts.StringTypes.pointBreak,def.highcharts.StringTypes.pointInBreak> type;
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

