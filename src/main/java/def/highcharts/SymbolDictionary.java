package def.highcharts;
import def.js.Function;
/**
 * An extendable collection of functions for defining symbol paths. Symbols are
 * used internally for point markers, button and label borders and backgrounds,
 * or custom shapes. Extendable by adding to SVGRenderer#symbols.
 */
@jsweet.lang.Interface
public abstract class SymbolDictionary extends def.js.Object {
    native public jsweet.util.union.Union<Function,Object> $get(String key);
    @jsweet.lang.Optional
    public Function arc;
    @jsweet.lang.Optional
    public Function callout;
    @jsweet.lang.Optional
    public Function circle;
    @jsweet.lang.Optional
    public Function diamond;
    @jsweet.lang.Optional
    public Function square;
    @jsweet.lang.Optional
    public Function triangle;
    native public java.lang.Object arc(java.lang.Object... args);
    native public java.lang.Object callout(java.lang.Object... args);
    native public java.lang.Object circle(java.lang.Object... args);
    native public java.lang.Object diamond(java.lang.Object... args);
    native public java.lang.Object square(java.lang.Object... args);
    native public java.lang.Object triangle(java.lang.Object... args);
}

