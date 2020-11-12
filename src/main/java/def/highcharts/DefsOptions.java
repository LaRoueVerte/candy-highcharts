package def.highcharts;
/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for configuring markers for
 * annotations.
 *
 * An example of the arrow marker: (see online documentation for example)
 */
@jsweet.lang.Interface
public abstract class DefsOptions extends def.js.Object {
    @jsweet.lang.Optional
    public jsweet.util.union.Union<DefsArrowOptions,SVGDefinitionObject> arrow;
    @jsweet.lang.Name("reverse-arrow")
    @jsweet.lang.Optional
    public jsweet.util.union.Union<DefsReverseArrowOptions,SVGDefinitionObject> reverse_arrow;
}

