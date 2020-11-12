package def.highcharts;
import def.js.Function;
@jsweet.lang.Interface
public abstract class AxisSetExtremesEventObject extends ExtremesObject {
    public Function preventDefault;
    public SVGElement2 target;
    public Object trigger;
    public def.highcharts.StringTypes.setExtremes type;
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

