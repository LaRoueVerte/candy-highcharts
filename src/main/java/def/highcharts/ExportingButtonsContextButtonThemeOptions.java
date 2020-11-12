package def.highcharts;
import jsweet.util.union.Union3;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) A configuration object for the
 * button theme. The object accepts SVG properties like `stroke-width`, `stroke`
 * and `fill`. Tri-state button styles are supported by the `states.hover` and
 * `states.select` objects.
 */
@jsweet.lang.Interface
public abstract class ExportingButtonsContextButtonThemeOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The default fill exists only to
     * capture hover events.
     */
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fill;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Padding for the button.
     */
    @jsweet.lang.Optional
    public double padding;
    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Default stroke for the buttons.
     */
    @jsweet.lang.Optional
    public String stroke;
}

