package def.highcharts;
import def.dom.PointerEvent;
/**
 * A native browser mouse or touch event, extended with position information
 * relative to the Chart.container.
 */
@jsweet.lang.Interface
public abstract class PointerEventObject extends PointerEvent {
    /**
     * The X coordinate of the pointer interaction relative to the chart.
     */
    public double chartX;
    /**
     * The Y coordinate of the pointer interaction relative to the chart.
     */
    public double chartY;
}

