package def.highcharts;

import def.dom.HTMLElement;
import def.js.Array;
import def.js.Function;
import def.js.RegExp;

/**
 * The SVGElement prototype is a JavaScript wrapper for SVG elements used in the rendering layer of Highcharts. Combined with the Highcharts.SVGRenderer object,
 * these prototypes allow freeform annotation in the charts or even in HTML pages without instanciating a chart. The SVGElement can also wrap HTML labels, when
 * `text` or `label` elements are created with the `useHTML` parameter.
 *
 * The SVGElement instances are created through factory functions on the Highcharts.SVGRenderer object, like rect, path, text, label, g and more.
 */
// @jsweet.lang.Mixin(target=def.dom.SVGElement.class)
public class SVGElement2 extends def.dom.SVGElement {
	/**
	 * The primary DOM node. Each `SVGElement` instance wraps a main DOM node, but may also represent more nodes.
	 */
	public jsweet.util.union.Union<HTMLElement, GlobalSVGElement> element;
	/**
	 * The renderer that the SVGElement belongs to.
	 */
	public SVGRenderer renderer;

	/**
	 * Add the element to the DOM. All elements must be added this way.
	 *
	 * @param parent The parent item to add it to. If undefined, the element is added to the Highcharts.SVGRenderer.box.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 add(SVGElement2 parent);

	/**
	 * Add a class name to an element.
	 *
	 * @param className The new class name to add.
	 *
	 * @param replace When true, the existing class name(s) will be overwritten with the new one. When false, the new one is added.
	 *
	 * @return Return the SVG element for chainability.
	 */
	native public SVGElement2 addClass(String className, Boolean replace);

	/**
	 * Align the element relative to the chart or another box.
	 *
	 * @param alignOptions The alignment options. The function can be called without this parameter in order to re-align an element after the box has been
	 *            updated.
	 *
	 * @param alignByTranslate Align element by translation.
	 *
	 * @param box The box to align to, needs a width and height. When the box is a string, it refers to an object in the Renderer. For example, when box is
	 *            `spacingBox`, it refers to `Renderer.spacingBox` which holds `width`, `height`, `x` and `y` properties.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 align(AlignObject alignOptions, Boolean alignByTranslate, String box);

	/**
	 * Animate to given attributes or CSS properties.
	 *
	 * @param params SVG attributes or CSS to animate.
	 *
	 * @param options Animation options.
	 *
	 * @param complete Function to perform at the end of animation.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 animate(SVGAttributes params, Boolean options, Function complete);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, double val, Function complete, Boolean continueAnimation);

	/**
	 * Apply a clipping rectangle to this element.
	 *
	 * @param clipRect The clipping rectangle. If skipped, the current clip is removed.
	 *
	 * @return Returns the SVG element to allow chaining.
	 */
	native public SVGElement2 clip(SVGElement2 clipRect);

	/**
	 * Calculate the coordinates needed for drawing a rectangle crisply and return the calculated attributes.
	 *
	 * @param rect Rectangle to crisp.
	 *
	 * @param strokeWidth The stroke width to consider when computing crisp positioning. It can also be set directly on the rect parameter.
	 *
	 * @return The modified rectangle arguments.
	 */
	native public RectangleObject crisp(RectangleObject rect, double strokeWidth);

	/**
	 * Set styles for the element. In addition to CSS styles supported by native SVG and HTML elements, there are also some custom made for Highcharts, like
	 * `width`, `ellipsis` and `textOverflow` for SVG text elements.
	 *
	 * @param styles The new CSS styles.
	 *
	 * @return Return the SVG element for chaining.
	 */
	native public SVGElement2 css(CSSObject styles);

	/**
	 * Destroy the element and element wrapper and clear up the DOM and event hooks.
	 */
	native public void destroy();

	/**
	 * Fade out an element by animating its opacity down to 0, and hide it on complete. Used internally for the tooltip.
	 *
	 * @param duration The fade duration in milliseconds.
	 */
	native public void fadeOut(double duration);

	/**
	 * Get the bounding box (width, height, x and y) for the element. Generally used to get rendered text size. Since this is called a lot in charts, the
	 * results are cached based on text properties, in order to save DOM traffic. The returned bounding box includes the rotation, so for example a single text
	 * line of rotation 90 will report a greater height, and a width corresponding to the line-height.
	 *
	 * @param reload Skip the cache and get the updated DOM bouding box.
	 *
	 * @param rot Override the element's rotation. This is internally used on axis labels with a value of 0 to find out what the bounding box would be have been
	 *            if it were not rotated.
	 *
	 * @return The bounding box with `x`, `y`, `width` and `height` properties.
	 */
	native public BBoxObject getBBox(Boolean reload, double rot);

	/**
	 * Get the computed style. Only in styled mode.
	 *
	 * @param prop The property name to check for.
	 *
	 * @return The current computed value.
	 */
	native public String getStyle(String prop);

	/**
	 * Check if an element has the given class name.
	 *
	 * @param className The class name to check for.
	 *
	 * @return Whether the class name is found.
	 */
	native public Boolean hasClass(String className);

	/**
	 * Hide the element, similar to setting the `visibility` attribute to `hidden`.
	 *
	 * @param hideByTranslation The flag to determine if element should be hidden by moving out of the viewport. Used for example for dataLabels.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 hide(Boolean hideByTranslation);

	/**
	 * Initialize the SVG element. This function only exists to make the initialization process overridable. It should not be called directly.
	 *
	 * @param renderer The SVGRenderer instance to initialize to.
	 *
	 * @param nodeName The SVG node name.
	 */
	native public void init(SVGRenderer renderer, String nodeName);

	/**
	 * Invert a group, rotate and flip. This is used internally on inverted charts, where the points and graphs are drawn as if not inverted, then the series
	 * group elements are inverted.
	 *
	 * @param inverted Whether to invert or not. An inverted shape can be un-inverted by setting it to false.
	 *
	 * @return Return the SVGElement for chaining.
	 */
	native public SVGElement2 invert(Boolean inverted);

	/**
	 * Add an event listener. This is a simple setter that replaces all other events of the same type, opposed to the Highcharts#addEvent function.
	 *
	 * @param eventType The event type. If the type is `click`, Highcharts will internally translate it to a `touchstart` event on touch devices, to prevent the
	 *            browser from waiting for a click event from firing.
	 *
	 * @param handler The handler callback.
	 *
	 * @return The SVGElement for chaining.
	 */
	native public SVGElement2 on(String eventType, Function handler);

	/**
	 * Remove a class name from the element.
	 *
	 * @param className The class name to remove.
	 *
	 * @return Returns the SVG element for chainability.
	 */
	native public SVGElement2 removeClass(String className);

	/**
	 * Set the coordinates needed to draw a consistent radial gradient across a shape regardless of positioning inside the chart. Used on pie slices to make all
	 * the slices have the same radial reference point.
	 *
	 * @param coordinates The center reference. The format is `[centerX, centerY, diameter]` in pixels.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 setRadialReference(Array<Double> coordinates);

	/**
	 * Add a shadow to the element. Must be called after the element is added to the DOM. In styled mode, this method is not used, instead use `defs` and
	 * filters.
	 *
	 * @param shadowOptions The shadow options. If `true`, the default options are applied. If `false`, the current shadow will be removed.
	 *
	 * @param group The SVG group element where the shadows will be applied. The default is to add it to the same parent as the current element. Internally,
	 *            this is ised for pie slices, where all the shadows are added to an element behind all the slices.
	 *
	 * @param cutOff Used internally for column shadows.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 shadow(Boolean shadowOptions, SVGElement2 group, Boolean cutOff);

	/**
	 * Show the element after it has been hidden.
	 *
	 * @param inherit Set the visibility attribute to `inherit` rather than `visible`. The difference is that an element with `visibility="visible"` will be
	 *            visible even if the parent is hidden.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 show(Boolean inherit);

	/**
	 * Get the computed stroke width in pixel values. This is used extensively when drawing shapes to ensure the shapes are rendered crisp and positioned
	 * correctly relative to each other. Using `shape-rendering: crispEdges` leaves us less control over positioning, for example when we want to stack columns
	 * next to each other, or position things pixel-perfectly within the plot box.
	 *
	 * The common pattern when placing a shape is:
	 *
	 * - Create the SVGElement and add it to the DOM. In styled mode, it will now receive a stroke width from the style sheet. In classic mode we will add the
	 * `stroke-width` attribute.
	 *
	 * - Read the computed `elem.strokeWidth()`.
	 *
	 * - Place it based on the stroke width.
	 *
	 * @return The stroke width in pixels. Even if the given stroke widtch (in CSS or by attributes) is based on `em` or other units, the pixel size is
	 *         returned.
	 */
	native public double strokeWidth();

	/**
	 * Bring the element to the front. Alternatively, a new zIndex can be set.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 toFront();

	/**
	 * Move an object and its children by x and y values.
	 *
	 * @param x The x value.
	 *
	 * @param y The y value.
	 */
	native public SVGElement2 translate(double x, double y);

	/**
	 * Add the element to the DOM. All elements must be added this way.
	 *
	 * @param parent The parent item to add it to. If undefined, the element is added to the Highcharts.SVGRenderer.box.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 add();

	/**
	 * Add a class name to an element.
	 *
	 * @param className The new class name to add.
	 *
	 * @param replace When true, the existing class name(s) will be overwritten with the new one. When false, the new one is added.
	 *
	 * @return Return the SVG element for chainability.
	 */
	native public SVGElement2 addClass(String className);

	/**
	 * Align the element relative to the chart or another box.
	 *
	 * @param alignOptions The alignment options. The function can be called without this parameter in order to re-align an element after the box has been
	 *            updated.
	 *
	 * @param alignByTranslate Align element by translation.
	 *
	 * @param box The box to align to, needs a width and height. When the box is a string, it refers to an object in the Renderer. For example, when box is
	 *            `spacingBox`, it refers to `Renderer.spacingBox` which holds `width`, `height`, `x` and `y` properties.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 align(AlignObject alignOptions, Boolean alignByTranslate);

	/**
	 * Align the element relative to the chart or another box.
	 *
	 * @param alignOptions The alignment options. The function can be called without this parameter in order to re-align an element after the box has been
	 *            updated.
	 *
	 * @param alignByTranslate Align element by translation.
	 *
	 * @param box The box to align to, needs a width and height. When the box is a string, it refers to an object in the Renderer. For example, when box is
	 *            `spacingBox`, it refers to `Renderer.spacingBox` which holds `width`, `height`, `x` and `y` properties.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 align(AlignObject alignOptions);

	/**
	 * Align the element relative to the chart or another box.
	 *
	 * @param alignOptions The alignment options. The function can be called without this parameter in order to re-align an element after the box has been
	 *            updated.
	 *
	 * @param alignByTranslate Align element by translation.
	 *
	 * @param box The box to align to, needs a width and height. When the box is a string, it refers to an object in the Renderer. For example, when box is
	 *            `spacingBox`, it refers to `Renderer.spacingBox` which holds `width`, `height`, `x` and `y` properties.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 align();

	/**
	 * Animate to given attributes or CSS properties.
	 *
	 * @param params SVG attributes or CSS to animate.
	 *
	 * @param options Animation options.
	 *
	 * @param complete Function to perform at the end of animation.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 animate(SVGAttributes params, Boolean options);

	/**
	 * Animate to given attributes or CSS properties.
	 *
	 * @param params SVG attributes or CSS to animate.
	 *
	 * @param options Animation options.
	 *
	 * @param complete Function to perform at the end of animation.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 animate(SVGAttributes params);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, double val, Function complete);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, double val);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr();

	/**
	 * Apply a clipping rectangle to this element.
	 *
	 * @param clipRect The clipping rectangle. If skipped, the current clip is removed.
	 *
	 * @return Returns the SVG element to allow chaining.
	 */
	native public SVGElement2 clip();

	/**
	 * Calculate the coordinates needed for drawing a rectangle crisply and return the calculated attributes.
	 *
	 * @param rect Rectangle to crisp.
	 *
	 * @param strokeWidth The stroke width to consider when computing crisp positioning. It can also be set directly on the rect parameter.
	 *
	 * @return The modified rectangle arguments.
	 */
	native public RectangleObject crisp(RectangleObject rect);

	/**
	 * Fade out an element by animating its opacity down to 0, and hide it on complete. Used internally for the tooltip.
	 *
	 * @param duration The fade duration in milliseconds.
	 */
	native public void fadeOut();

	/**
	 * Get the bounding box (width, height, x and y) for the element. Generally used to get rendered text size. Since this is called a lot in charts, the
	 * results are cached based on text properties, in order to save DOM traffic. The returned bounding box includes the rotation, so for example a single text
	 * line of rotation 90 will report a greater height, and a width corresponding to the line-height.
	 *
	 * @param reload Skip the cache and get the updated DOM bouding box.
	 *
	 * @param rot Override the element's rotation. This is internally used on axis labels with a value of 0 to find out what the bounding box would be have been
	 *            if it were not rotated.
	 *
	 * @return The bounding box with `x`, `y`, `width` and `height` properties.
	 */
	native public BBoxObject getBBox(Boolean reload);

	/**
	 * Get the bounding box (width, height, x and y) for the element. Generally used to get rendered text size. Since this is called a lot in charts, the
	 * results are cached based on text properties, in order to save DOM traffic. The returned bounding box includes the rotation, so for example a single text
	 * line of rotation 90 will report a greater height, and a width corresponding to the line-height.
	 *
	 * @param reload Skip the cache and get the updated DOM bouding box.
	 *
	 * @param rot Override the element's rotation. This is internally used on axis labels with a value of 0 to find out what the bounding box would be have been
	 *            if it were not rotated.
	 *
	 * @return The bounding box with `x`, `y`, `width` and `height` properties.
	 */
	native public BBoxObject getBBox();

	/**
	 * Hide the element, similar to setting the `visibility` attribute to `hidden`.
	 *
	 * @param hideByTranslation The flag to determine if element should be hidden by moving out of the viewport. Used for example for dataLabels.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 hide();

	/**
	 * Add a shadow to the element. Must be called after the element is added to the DOM. In styled mode, this method is not used, instead use `defs` and
	 * filters.
	 *
	 * @param shadowOptions The shadow options. If `true`, the default options are applied. If `false`, the current shadow will be removed.
	 *
	 * @param group The SVG group element where the shadows will be applied. The default is to add it to the same parent as the current element. Internally,
	 *            this is ised for pie slices, where all the shadows are added to an element behind all the slices.
	 *
	 * @param cutOff Used internally for column shadows.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 shadow(Boolean shadowOptions, SVGElement2 group);

	/**
	 * Add a shadow to the element. Must be called after the element is added to the DOM. In styled mode, this method is not used, instead use `defs` and
	 * filters.
	 *
	 * @param shadowOptions The shadow options. If `true`, the default options are applied. If `false`, the current shadow will be removed.
	 *
	 * @param group The SVG group element where the shadows will be applied. The default is to add it to the same parent as the current element. Internally,
	 *            this is ised for pie slices, where all the shadows are added to an element behind all the slices.
	 *
	 * @param cutOff Used internally for column shadows.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 shadow(Boolean shadowOptions);

	/**
	 * Add a shadow to the element. Must be called after the element is added to the DOM. In styled mode, this method is not used, instead use `defs` and
	 * filters.
	 *
	 * @param shadowOptions The shadow options. If `true`, the default options are applied. If `false`, the current shadow will be removed.
	 *
	 * @param group The SVG group element where the shadows will be applied. The default is to add it to the same parent as the current element. Internally,
	 *            this is ised for pie slices, where all the shadows are added to an element behind all the slices.
	 *
	 * @param cutOff Used internally for column shadows.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 shadow();

	/**
	 * Show the element after it has been hidden.
	 *
	 * @param inherit Set the visibility attribute to `inherit` rather than `visible`. The difference is that an element with `visibility="visible"` will be
	 *            visible even if the parent is hidden.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 show();

	/**
	 * Align the element relative to the chart or another box.
	 *
	 * @param alignOptions The alignment options. The function can be called without this parameter in order to re-align an element after the box has been
	 *            updated.
	 *
	 * @param alignByTranslate Align element by translation.
	 *
	 * @param box The box to align to, needs a width and height. When the box is a string, it refers to an object in the Renderer. For example, when box is
	 *            `spacingBox`, it refers to `Renderer.spacingBox` which holds `width`, `height`, `x` and `y` properties.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 align(AlignObject alignOptions, Boolean alignByTranslate, BBoxObject box);

	/**
	 * Animate to given attributes or CSS properties.
	 *
	 * @param params SVG attributes or CSS to animate.
	 *
	 * @param options Animation options.
	 *
	 * @param complete Function to perform at the end of animation.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 animate(SVGAttributes params, Partial2<AnimationOptionsObject> options, Function complete);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, String val, Function complete, Boolean continueAnimation);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, Array<?> val, Function complete, Boolean continueAnimation);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, Array<?> val, Function complete, Boolean continueAnimation);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, String val, Function complete, Boolean continueAnimation);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, double val, Function complete, Boolean continueAnimation);

	/**
	 * Remove a class name from the element.
	 *
	 * @param className The class name to remove.
	 *
	 * @return Returns the SVG element for chainability.
	 */
	native public SVGElement2 removeClass(RegExp className);

	/**
	 * Add a shadow to the element. Must be called after the element is added to the DOM. In styled mode, this method is not used, instead use `defs` and
	 * filters.
	 *
	 * @param shadowOptions The shadow options. If `true`, the default options are applied. If `false`, the current shadow will be removed.
	 *
	 * @param group The SVG group element where the shadows will be applied. The default is to add it to the same parent as the current element. Internally,
	 *            this is ised for pie slices, where all the shadows are added to an element behind all the slices.
	 *
	 * @param cutOff Used internally for column shadows.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 shadow(ShadowOptionsObject shadowOptions, SVGElement2 group, Boolean cutOff);

	/**
	 * Animate to given attributes or CSS properties.
	 *
	 * @param params SVG attributes or CSS to animate.
	 *
	 * @param options Animation options.
	 *
	 * @param complete Function to perform at the end of animation.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 animate(SVGAttributes params, Partial2<AnimationOptionsObject> options);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, String val, Function complete);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, Array<?> val, Function complete);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, String val, Function complete);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, Array<?> val, Function complete);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, double val, Function complete);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, Array<?> val);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, Array<?> val);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, String val);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, double val);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, String val);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash);

	/**
	 * Add a shadow to the element. Must be called after the element is added to the DOM. In styled mode, this method is not used, instead use `defs` and
	 * filters.
	 *
	 * @param shadowOptions The shadow options. If `true`, the default options are applied. If `false`, the current shadow will be removed.
	 *
	 * @param group The SVG group element where the shadows will be applied. The default is to add it to the same parent as the current element. Internally,
	 *            this is ised for pie slices, where all the shadows are added to an element behind all the slices.
	 *
	 * @param cutOff Used internally for column shadows.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 shadow(ShadowOptionsObject shadowOptions, SVGElement2 group);

	/**
	 * Add a shadow to the element. Must be called after the element is added to the DOM. In styled mode, this method is not used, instead use `defs` and
	 * filters.
	 *
	 * @param shadowOptions The shadow options. If `true`, the default options are applied. If `false`, the current shadow will be removed.
	 *
	 * @param group The SVG group element where the shadows will be applied. The default is to add it to the same parent as the current element. Internally,
	 *            this is ised for pie slices, where all the shadows are added to an element behind all the slices.
	 *
	 * @param cutOff Used internally for column shadows.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 shadow(ShadowOptionsObject shadowOptions);

	/**
	 * Set the coordinates needed to draw a consistent radial gradient across a shape regardless of positioning inside the chart. Used on pie slices to make all
	 * the slices have the same radial reference point.
	 *
	 * @param coordinates The center reference. The format is `[centerX, centerY, diameter]` in pixels.
	 *
	 * @return Returns the SVGElement for chaining.
	 */
	native public SVGElement2 setRadialReference(Double[] coordinates);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, Object[] val, Function complete, Boolean continueAnimation);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, Object[] val, Function complete, Boolean continueAnimation);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, Object[] val, Function complete);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, Object[] val, Function complete);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(SVGAttributes hash, Object[] val);

	/**
	 * Apply native and custom attributes to the SVG elements.
	 *
	 * In order to set the rotation center for rotation, set x and y to 0 and use `translateX` and `translateY` attributes to position the element instead.
	 *
	 * Attributes frequently used in Highcharts are `fill`, `stroke`, `stroke-width`.
	 *
	 * @param hash The native and custom SVG attributes.
	 *
	 * @param val If the type of the first argument is `string`, the second can be a value, which will serve as a single attribute setter. If the first argument
	 *            is a string and the second is undefined, the function serves as a getter and the current value of the property is returned.
	 *
	 * @param complete A callback function to execute after setting the attributes. This makes the function compliant and interchangeable with the
	 *            SVGElement#animate function.
	 *
	 * @param continueAnimation Used internally when `.attr` is called as part of an animation step. Otherwise, calling `.attr` for an attribute will stop
	 *            animation for that attribute.
	 *
	 * @return If used as a setter, it returns the current Highcharts.SVGElement so the calls can be chained. If used as a getter, the current value of the
	 *         attribute is returned.
	 */
	native public SVGElement2 attr(String hash, Object[] val);
}
