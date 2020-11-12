package def.highcharts;
/**
 * Pattern options
 */
@jsweet.lang.Interface
public abstract class PatternOptionsObject extends def.js.Object {
    /**
     * For automatically calculated width and height on images, it is possible
     * to set an aspect ratio. The image will be zoomed to fill the bounding
     * box, maintaining the aspect ratio defined.
     */
    public double aspectRatio;
    /**
     * Background color for the pattern if a `path` is set (not images).
     */
    public String backgroundColor;
    /**
     * Pattern color, used as default path stroke.
     */
    public String color;
    /**
     * Analogous to pattern.width.
     */
    public double height;
    /**
     * ID to assign to the pattern. This is automatically computed if not added,
     * and identical patterns are reused. To refer to an existing pattern for a
     * Highcharts color, use `color: "url(#pattern-id)"`.
     */
    @jsweet.lang.Optional
    public String id;
    /**
     * URL to an image to use as the pattern.
     */
    public String image;
    /**
     * Opacity of the pattern as a float value from 0 to 1.
     */
    public double opacity;
    /**
     * Either an SVG path as string, or an object. As an object, supply the path
     * string in the `path.d` property. Other supported properties are standard
     * SVG attributes like `path.stroke` and `path.fill`. If a path is supplied
     * for the pattern, the `image` property is ignored.
     */
    public jsweet.util.union.Union<String,SVGAttributes> path;
    /**
     * SVG `patternTransform` to apply to the entire pattern.
     */
    public String patternTransform;
    /**
     * Width of the pattern. For images this is automatically set to the width
     * of the element bounding box if not supplied. For non-image patterns the
     * default is 32px. Note that automatic resizing of image patterns to fill a
     * bounding box dynamically is only supported for patterns with an
     * automatically calculated ID.
     */
    public double width;
    /**
     * Horizontal offset of the pattern. Defaults to 0.
     */
    @jsweet.lang.Optional
    public double x;
    /**
     * Vertical offset of the pattern. Defaults to 0.
     */
    @jsweet.lang.Optional
    public double y;
}

