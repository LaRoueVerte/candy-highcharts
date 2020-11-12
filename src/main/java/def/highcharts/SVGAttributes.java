package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Array;
/**
 * An object of key-value pairs for SVG attributes. Attributes in Highcharts
 * elements for the most parts correspond to SVG, but some are specific to
 * Highcharts, like `zIndex`, `rotation`, `rotationOriginX`, `rotationOriginY`,
 * `translateX`, `translateY`, `scaleX` and `scaleY`. SVG attributes containing
 * a hyphen are _not_ camel-cased, they should be quoted to preserve the hyphen.
 */
@jsweet.lang.Interface
public abstract class SVGAttributes extends def.js.Object {
    native public java.lang.Object $get(String key);
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Array<?>> d;
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> fill;
    @jsweet.lang.Optional
    public Boolean inverted;
    @jsweet.lang.Optional
    public Array<Double> matrix;
    @jsweet.lang.Optional
    public double rotation;
    @jsweet.lang.Optional
    public double rotationOriginX;
    @jsweet.lang.Optional
    public double rotationOriginY;
    @jsweet.lang.Optional
    public double scaleX;
    @jsweet.lang.Optional
    public double scaleY;
    @jsweet.lang.Optional
    public Union3<String,GradientColorObject,PatternObject> stroke;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,CSSObject> style;
    @jsweet.lang.Optional
    public double translateX;
    @jsweet.lang.Optional
    public double translateY;
    @jsweet.lang.Optional
    public double zIndex;
}

