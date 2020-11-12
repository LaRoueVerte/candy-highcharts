package def.highcharts;
import def.js.Function;
@jsweet.lang.Interface
public abstract class AnnotationsMeasureTypeLabelOptions extends def.js.Object {
    /**
     * (Highstock) Enable or disable the label text (min, max, average, bins
     * values).
     *
     * Defaults to true.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highstock) Formatter function for the label text.
     *
     * Available data are:
     *
     *  (see online documentation for example)
     */
    @jsweet.lang.Optional
    public Function formatter;
    /**
     * (Highstock) CSS styles for the measure label.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<AnnotationsMeasureTypeLabelStyleOptions,CSSObject> style;
    native public java.lang.Object formatter(java.lang.Object... args);
}

