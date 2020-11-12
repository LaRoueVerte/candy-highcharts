package def.highcharts;
/**
 * Holds a pattern definition.
 */
@jsweet.lang.Interface
public abstract class PatternObject extends def.js.Object {
    /**
     * Animation options for the image pattern loading.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Partial2<AnimationOptionsObject>> animation;
    /**
     * Pattern options
     */
    public PatternOptionsObject pattern;
    /**
     * Optionally an index referencing which pattern to use. Highcharts adds 10
     * default patterns to the `Highcharts.patterns` array. Additional pattern
     * definitions can be pushed to this array if desired. This option is an
     * index into this array.
     */
    @jsweet.lang.Optional
    public double patternIndex;
}

