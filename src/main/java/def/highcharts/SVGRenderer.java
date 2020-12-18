package def.highcharts;

import def.dom.Event;
import def.dom.HTMLElement;
import def.dom.SVGElement;
import def.js.Array;
import def.js.Function;

/**
 * Allows direct access to the Highcharts rendering layer in order to draw primitive shapes like circles, rectangles, paths or text directly on a chart, or
 * independent from any chart. The SVGRenderer represents a wrapper object for SVG in modern browsers. Through the VMLRenderer, part of the `oldie.js` module,
 * it also brings vector graphics to IE <= 8.
 *
 * An existing chart's renderer can be accessed through Chart.renderer. The renderer can also be used completely decoupled from a chart.
 */
public class SVGRenderer extends def.js.Object {
	/**
	 * Allows direct access to the Highcharts rendering layer in order to draw primitive shapes like circles, rectangles, paths or text directly on a chart, or
	 * independent from any chart. The SVGRenderer represents a wrapper object for SVG in modern browsers. Through the VMLRenderer, part of the `oldie.js`
	 * module, it also brings vector graphics to IE <= 8.
	 *
	 * An existing chart's renderer can be accessed through Chart.renderer. The renderer can also be used completely decoupled from a chart.
	 *
	 * @param container Where to put the SVG in the web page.
	 *
	 * @param width The width of the SVG.
	 *
	 * @param height The height of the SVG.
	 *
	 * @param style The box style, if not in styleMode
	 *
	 * @param forExport Whether the rendered content is intended for export.
	 *
	 * @param allowHTML Whether the renderer is allowed to include HTML text, which will be projected on top of the SVG.
	 *
	 * @param styledMode Whether the renderer belongs to a chart that is in styled mode. If it does, it will avoid setting presentational attributes in some
	 *            cases, but not when set explicitly through `.attr` and `.css` etc.
	 */
	public SVGRenderer(HTMLElement container, double width, double height, CSSObject style, Boolean forExport, Boolean allowHTML, Boolean styledMode) {
	}

	/**
	 * The root `svg` node of the renderer.
	 */
	public GlobalSVGElement box;
	/**
	 * The wrapper for the root `svg` node of the renderer.
	 */
	public SVGElement boxWrapper;
	/**
	 * A pointer to the `defs` node of the root SVG.
	 */
	public SVGElement defs;
	/**
	 * A pointer to the renderer's associated Element class. The VMLRenderer will have a pointer to VMLElement here.
	 */
	public SVGElement Element;
	/**
	 * A collection of characters mapped to HTML entities. When `useHTML` on an element is true, these entities will be rendered correctly by HTML. In the SVG
	 * pseudo-HTML, they need to be unescaped back to simple characters, so for example `&lt;` will render as `<`.
	 */
	public Dictionary<String> escapes;
	/**
	 * An extendable collection of functions for defining symbol paths.
	 */
	public SymbolDictionary symbols;

	/**
	 * Draw and return an arc. Overloaded function that takes arguments object.
	 *
	 * @param attribs Initial SVG attributes.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement arc(SVGAttributes attribs);

	/**
	 * Draw and return an arc.
	 *
	 * @param x Center X position.
	 *
	 * @param y Center Y position.
	 *
	 * @param r The outer radius' of the arc.
	 *
	 * @param innerR Inner radius like used in donut charts.
	 *
	 * @param start The starting angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @param end The ending angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement arc(double x, double y, double r, double innerR, double start, double end);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackBiFunction(String text, double x, double y, java.util.function.BiFunction<SVGElement, Event, Boolean> callback,
			SVGAttributes normalState, SVGAttributes hoverState, SVGAttributes pressedState, SVGAttributes disabledState, Object shape, Boolean useHTML);

	/**
	 * Draw a circle, wraps the SVG `circle` element.
	 *
	 * @param attribs The initial attributes.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement circle(SVGAttributes attribs);

	/**
	 * Draw a circle, wraps the SVG `circle` element.
	 *
	 * @param x The center x position.
	 *
	 * @param y The center y position.
	 *
	 * @param r The radius.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement circle(double x, double y, double r);

	/**
	 * Define a clipping rectangle. The clipping rectangle is later applied to SVGElement objects through the SVGElement#clip function.
	 *
	 * @return A clipping rectangle.
	 */
	native public SVGElement clipRect(double x, double y, double width, double height);

	/**
	 * Create a wrapper for an SVG element. Serves as a factory for SVGElement, but this function is itself mostly called from primitive factories like
	 * SVGRenderer#path, SVGRenderer#rect or SVGRenderer#text.
	 *
	 * @param nodeName The node name, for example `rect`, `g` etc.
	 *
	 * @return The generated SVGElement.
	 */
	native public SVGElement createElement(String nodeName);

	/**
	 * Make a straight line crisper by not spilling out to neighbour pixels.
	 *
	 * @param points The original points on the format `[['M', 0, 0], ['L', 100, 0]]`.
	 *
	 * @param width The width of the line.
	 *
	 * @param roundingFunction The rounding function name on the `Math` object, can be one of `round`, `floor` or `ceil`.
	 *
	 * @return The original points array, but modified to render crisply.
	 */
	native public Array<?> crispLine(Array<?> points, double width, String roundingFunction);

	/**
	 * General method for adding a definition to the SVG `defs` tag. Can be used for gradients, fills, filters etc. Styled mode only. A hook for adding general
	 * definitions to the SVG's defs tag. Definitions can be referenced from the CSS by its `id`. Read more in gradients, shadows and patterns. Styled mode
	 * only.
	 *
	 * @param def A serialized form of an SVG definition, including children.
	 *
	 * @return The inserted node.
	 */
	native public SVGElement definition(SVGDefinitionObject def);

	/**
	 * Destroys the renderer and its allocated members.
	 */
	native public Object destroy();

	/**
	 * Dummy function for plugins, called every time the renderer is updated. Prior to Highcharts 5, this was used for the canvg renderer.
	 */
	native public void draw();

	/**
	 * Utility to return the baseline offset and total line height from the font size.
	 *
	 * @param fontSize The current font size to inspect. If not given, the font size will be found from the DOM element.
	 *
	 * @param elem The element to inspect for a current font size.
	 *
	 * @return The font metrics.
	 */
	native public FontMetricsObject fontMetrics(double fontSize, GlobalSVGElement elem);

	/**
	 * Create and return an svg group element. Child Highcharts.SVGElement objects are added to the group by using the group as the first parameter in add().
	 *
	 * @param name The group will be given a class name of `highcharts-{name}`. This can be used for styling and scripting.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement g(String name);

	/**
	 * Returns white for dark colors and black for bright colors.
	 *
	 * @param rgba The color to get the contrast for.
	 *
	 * @return The contrast color, either `#000000` or `#FFFFFF`.
	 */
	native public String getContrast(String rgba);

	/**
	 * Display an image.
	 *
	 * @param src The image source.
	 *
	 * @param x The X position.
	 *
	 * @param y The Y position.
	 *
	 * @param width The image width. If omitted, it defaults to the image file width.
	 *
	 * @param height The image height. If omitted it defaults to the image file height.
	 *
	 * @param onload Event handler for image load.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement image(String src, double x, double y, double width, double height, Function onload);

	/**
	 * Initialize the SVGRenderer. Overridable initializer function that takes the same parameters as the constructor.
	 *
	 * @param container Where to put the SVG in the web page.
	 *
	 * @param width The width of the SVG.
	 *
	 * @param height The height of the SVG.
	 *
	 * @param style The box style, if not in styleMode
	 *
	 * @param forExport Whether the rendered content is intended for export.
	 *
	 * @param allowHTML Whether the renderer is allowed to include HTML text, which will be projected on top of the SVG.
	 *
	 * @param styledMode Whether the renderer belongs to a chart that is in styled mode. If it does, it will avoid setting presentational attributes in some
	 *            cases, but not when set explicitly through `.attr` and `.css` etc.
	 */
	native public void init(HTMLElement container, double width, double height, CSSObject style, Boolean forExport, Boolean allowHTML, Boolean styledMode);

	/**
	 * Detect whether the renderer is hidden. This happens when one of the parent elements has `display: none`. Used internally to detect when we needto render
	 * preliminarily in another div to get the text bounding boxes right.
	 *
	 * @return True if it is hidden.
	 */
	native public Boolean isHidden();

	/**
	 * Draw a label, which is an extended text element with support for border and background. Highcharts creates a `g` element with a text and a `path` or
	 * `rect` inside, to make it behave somewhat like a HTML div. Border and background are set through `stroke`, `stroke-width` and `fill` attributes using the
	 * attr method. To update the text after render, run `label.attr({ text: 'New text' })`.
	 *
	 * @param str The initial text string or (subset) HTML to render.
	 *
	 * @param x The x position of the label's left side.
	 *
	 * @param y The y position of the label's top side or baseline, depending on the `baseline` parameter.
	 *
	 * @param shape The shape of the label's border/background, if any. Defaults to `rect`. Other possible values are `callout` or other shapes defined in
	 *            Highcharts.SVGRenderer#symbols.
	 *
	 * @param anchorX In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param anchorY In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @param baseline Whether to position the label relative to the text baseline, like renderer.text, or to the upper border of the rectangle.
	 *
	 * @param className Class name for the group.
	 *
	 * @return The generated label.
	 */
	native public SVGElement label(String str, double x, double y, String shape, double anchorX, double anchorY, Boolean useHTML, Boolean baseline,
			String className);

	/**
	 * Draw a path, wraps the SVG `path` element.
	 *
	 * @param path An SVG path definition in array form.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement path(Array<?> path);

	/**
	 * Draw a path, wraps the SVG `path` element.
	 *
	 * @param attribs The initial attributes.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement path(SVGAttributes attribs);

	/**
	 * Draw and return a rectangle.
	 *
	 * @param attributes General SVG attributes for the rectangle.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement rect(SVGAttributes attributes);

	/**
	 * Draw and return a rectangle.
	 *
	 * @param x Left position.
	 *
	 * @param y Top position.
	 *
	 * @param width Width of the rectangle.
	 *
	 * @param height Height of the rectangle.
	 *
	 * @param r Border corner radius.
	 *
	 * @param strokeWidth A stroke width can be supplied to allow crisp drawing.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement rect(double x, double y, double width, double height, double r, double strokeWidth);

	/**
	 * Resize the SVGRenderer#box and re-align all aligned child elements.
	 *
	 * @param width The new pixel width.
	 *
	 * @param height The new pixel height.
	 *
	 * @param animate Whether and how to animate.
	 */
	native public void setSize(double width, double height, Boolean animate);

	/**
	 * Apply the global style on the renderer, mixed with the default styles.
	 *
	 * @param style CSS to apply.
	 */
	native public void setStyle(CSSObject style);

	/**
	 * Draw a symbol out of pre-defined shape paths from SVGRenderer#symbols. It is used in Highcharts for point makers, which cake a `symbol` option, and label
	 * and button backgrounds like in the tooltip and stock flags.
	 *
	 * @param symbol The symbol name.
	 *
	 * @param x The X coordinate for the top left position.
	 *
	 * @param y The Y coordinate for the top left position.
	 *
	 * @param width The pixel width.
	 *
	 * @param height The pixel height.
	 *
	 * @param options Additional options, depending on the actual symbol drawn.
	 */
	native public SVGElement symbol(String symbol, double x, double y, double width, double height, SymbolOptionsObject options);

	/**
	 * Draw text. The text can contain a subset of HTML, like spans and anchors and some basic text styling of these. For more advanced features like border and
	 * background, use Highcharts.SVGRenderer#label instead. To update the text after render, run `text.attr({ text: 'New text' })`.
	 *
	 * @param str The text of (subset) HTML to draw.
	 *
	 * @param x The x position of the text's lower left corner.
	 *
	 * @param y The y position of the text's lower left corner.
	 *
	 * @param useHTML Use HTML to render the text.
	 *
	 * @return The text object.
	 */
	native public SVGElement text(String str, double x, double y, Boolean useHTML);

	/**
	 * Allows direct access to the Highcharts rendering layer in order to draw primitive shapes like circles, rectangles, paths or text directly on a chart, or
	 * independent from any chart. The SVGRenderer represents a wrapper object for SVG in modern browsers. Through the VMLRenderer, part of the `oldie.js`
	 * module, it also brings vector graphics to IE <= 8.
	 *
	 * An existing chart's renderer can be accessed through Chart.renderer. The renderer can also be used completely decoupled from a chart.
	 *
	 * @param container Where to put the SVG in the web page.
	 *
	 * @param width The width of the SVG.
	 *
	 * @param height The height of the SVG.
	 *
	 * @param style The box style, if not in styleMode
	 *
	 * @param forExport Whether the rendered content is intended for export.
	 *
	 * @param allowHTML Whether the renderer is allowed to include HTML text, which will be projected on top of the SVG.
	 *
	 * @param styledMode Whether the renderer belongs to a chart that is in styled mode. If it does, it will avoid setting presentational attributes in some
	 *            cases, but not when set explicitly through `.attr` and `.css` etc.
	 */
	public SVGRenderer(HTMLElement container, double width, double height, CSSObject style, Boolean forExport, Boolean allowHTML) {
	}

	/**
	 * Allows direct access to the Highcharts rendering layer in order to draw primitive shapes like circles, rectangles, paths or text directly on a chart, or
	 * independent from any chart. The SVGRenderer represents a wrapper object for SVG in modern browsers. Through the VMLRenderer, part of the `oldie.js`
	 * module, it also brings vector graphics to IE <= 8.
	 *
	 * An existing chart's renderer can be accessed through Chart.renderer. The renderer can also be used completely decoupled from a chart.
	 *
	 * @param container Where to put the SVG in the web page.
	 *
	 * @param width The width of the SVG.
	 *
	 * @param height The height of the SVG.
	 *
	 * @param style The box style, if not in styleMode
	 *
	 * @param forExport Whether the rendered content is intended for export.
	 *
	 * @param allowHTML Whether the renderer is allowed to include HTML text, which will be projected on top of the SVG.
	 *
	 * @param styledMode Whether the renderer belongs to a chart that is in styled mode. If it does, it will avoid setting presentational attributes in some
	 *            cases, but not when set explicitly through `.attr` and `.css` etc.
	 */
	public SVGRenderer(HTMLElement container, double width, double height, CSSObject style, Boolean forExport) {
	}

	/**
	 * Allows direct access to the Highcharts rendering layer in order to draw primitive shapes like circles, rectangles, paths or text directly on a chart, or
	 * independent from any chart. The SVGRenderer represents a wrapper object for SVG in modern browsers. Through the VMLRenderer, part of the `oldie.js`
	 * module, it also brings vector graphics to IE <= 8.
	 *
	 * An existing chart's renderer can be accessed through Chart.renderer. The renderer can also be used completely decoupled from a chart.
	 *
	 * @param container Where to put the SVG in the web page.
	 *
	 * @param width The width of the SVG.
	 *
	 * @param height The height of the SVG.
	 *
	 * @param style The box style, if not in styleMode
	 *
	 * @param forExport Whether the rendered content is intended for export.
	 *
	 * @param allowHTML Whether the renderer is allowed to include HTML text, which will be projected on top of the SVG.
	 *
	 * @param styledMode Whether the renderer belongs to a chart that is in styled mode. If it does, it will avoid setting presentational attributes in some
	 *            cases, but not when set explicitly through `.attr` and `.css` etc.
	 */
	public SVGRenderer(HTMLElement container, double width, double height, CSSObject style) {
	}

	/**
	 * Allows direct access to the Highcharts rendering layer in order to draw primitive shapes like circles, rectangles, paths or text directly on a chart, or
	 * independent from any chart. The SVGRenderer represents a wrapper object for SVG in modern browsers. Through the VMLRenderer, part of the `oldie.js`
	 * module, it also brings vector graphics to IE <= 8.
	 *
	 * An existing chart's renderer can be accessed through Chart.renderer. The renderer can also be used completely decoupled from a chart.
	 *
	 * @param container Where to put the SVG in the web page.
	 *
	 * @param width The width of the SVG.
	 *
	 * @param height The height of the SVG.
	 *
	 * @param style The box style, if not in styleMode
	 *
	 * @param forExport Whether the rendered content is intended for export.
	 *
	 * @param allowHTML Whether the renderer is allowed to include HTML text, which will be projected on top of the SVG.
	 *
	 * @param styledMode Whether the renderer belongs to a chart that is in styled mode. If it does, it will avoid setting presentational attributes in some
	 *            cases, but not when set explicitly through `.attr` and `.css` etc.
	 */
	public SVGRenderer(HTMLElement container, double width, double height) {
	}

	/**
	 * Draw and return an arc.
	 *
	 * @param x Center X position.
	 *
	 * @param y Center Y position.
	 *
	 * @param r The outer radius' of the arc.
	 *
	 * @param innerR Inner radius like used in donut charts.
	 *
	 * @param start The starting angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @param end The ending angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement arc(double x, double y, double r, double innerR, double start);

	/**
	 * Draw and return an arc.
	 *
	 * @param x Center X position.
	 *
	 * @param y Center Y position.
	 *
	 * @param r The outer radius' of the arc.
	 *
	 * @param innerR Inner radius like used in donut charts.
	 *
	 * @param start The starting angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @param end The ending angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement arc(double x, double y, double r, double innerR);

	/**
	 * Draw and return an arc.
	 *
	 * @param x Center X position.
	 *
	 * @param y Center Y position.
	 *
	 * @param r The outer radius' of the arc.
	 *
	 * @param innerR Inner radius like used in donut charts.
	 *
	 * @param start The starting angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @param end The ending angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement arc(double x, double y, double r);

	/**
	 * Draw and return an arc.
	 *
	 * @param x Center X position.
	 *
	 * @param y Center Y position.
	 *
	 * @param r The outer radius' of the arc.
	 *
	 * @param innerR Inner radius like used in donut charts.
	 *
	 * @param start The starting angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @param end The ending angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement arc(double x, double y);

	/**
	 * Draw and return an arc.
	 *
	 * @param x Center X position.
	 *
	 * @param y Center Y position.
	 *
	 * @param r The outer radius' of the arc.
	 *
	 * @param innerR Inner radius like used in donut charts.
	 *
	 * @param start The starting angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @param end The ending angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement arc(double x);

	/**
	 * Draw and return an arc.
	 *
	 * @param x Center X position.
	 *
	 * @param y Center Y position.
	 *
	 * @param r The outer radius' of the arc.
	 *
	 * @param innerR Inner radius like used in donut charts.
	 *
	 * @param start The starting angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @param end The ending angle of the arc in radians, where 0 is to the right and `-Math.PI/2` is up.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement arc();

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackBiFunction(String text, double x, double y, java.util.function.BiFunction<SVGElement, Event, Boolean> callback,
			SVGAttributes normalState, SVGAttributes hoverState, SVGAttributes pressedState, SVGAttributes disabledState, Object shape);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackBiFunction(String text, double x, double y, java.util.function.BiFunction<SVGElement, Event, Boolean> callback,
			SVGAttributes normalState, SVGAttributes hoverState, SVGAttributes pressedState, SVGAttributes disabledState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackBiFunction(String text, double x, double y, java.util.function.BiFunction<SVGElement, Event, Boolean> callback,
			SVGAttributes normalState, SVGAttributes hoverState, SVGAttributes pressedState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackBiFunction(String text, double x, double y, java.util.function.BiFunction<SVGElement, Event, Boolean> callback,
			SVGAttributes normalState, SVGAttributes hoverState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackBiFunction(String text, double x, double y, java.util.function.BiFunction<SVGElement, Event, Boolean> callback,
			SVGAttributes normalState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackBiFunction(String text, double x, double y, java.util.function.BiFunction<SVGElement, Event, Boolean> callback);

	/**
	 * Draw a circle, wraps the SVG `circle` element.
	 *
	 * @param attribs The initial attributes.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement circle();

	/**
	 * Draw a circle, wraps the SVG `circle` element.
	 *
	 * @param x The center x position.
	 *
	 * @param y The center y position.
	 *
	 * @param r The radius.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement circle(double x, double y);

	/**
	 * Draw a circle, wraps the SVG `circle` element.
	 *
	 * @param x The center x position.
	 *
	 * @param y The center y position.
	 *
	 * @param r The radius.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement circle(double x);

	/**
	 * Define a clipping rectangle. The clipping rectangle is later applied to SVGElement objects through the SVGElement#clip function.
	 *
	 * @return A clipping rectangle.
	 */
	native public SVGElement clipRect(double x, double y, double width);

	/**
	 * Define a clipping rectangle. The clipping rectangle is later applied to SVGElement objects through the SVGElement#clip function.
	 *
	 * @return A clipping rectangle.
	 */
	native public SVGElement clipRect(double x, double y);

	/**
	 * Define a clipping rectangle. The clipping rectangle is later applied to SVGElement objects through the SVGElement#clip function.
	 *
	 * @return A clipping rectangle.
	 */
	native public SVGElement clipRect(double x);

	/**
	 * Define a clipping rectangle. The clipping rectangle is later applied to SVGElement objects through the SVGElement#clip function.
	 *
	 * @return A clipping rectangle.
	 */
	native public SVGElement clipRect();

	/**
	 * Utility to return the baseline offset and total line height from the font size.
	 *
	 * @param fontSize The current font size to inspect. If not given, the font size will be found from the DOM element.
	 *
	 * @param elem The element to inspect for a current font size.
	 *
	 * @return The font metrics.
	 */
	native public FontMetricsObject fontMetrics(double fontSize);

	/**
	 * Utility to return the baseline offset and total line height from the font size.
	 *
	 * @param fontSize The current font size to inspect. If not given, the font size will be found from the DOM element.
	 *
	 * @param elem The element to inspect for a current font size.
	 *
	 * @return The font metrics.
	 */
	native public FontMetricsObject fontMetrics();

	/**
	 * Create and return an svg group element. Child Highcharts.SVGElement objects are added to the group by using the group as the first parameter in add().
	 *
	 * @param name The group will be given a class name of `highcharts-{name}`. This can be used for styling and scripting.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement g();

	/**
	 * Display an image.
	 *
	 * @param src The image source.
	 *
	 * @param x The X position.
	 *
	 * @param y The Y position.
	 *
	 * @param width The image width. If omitted, it defaults to the image file width.
	 *
	 * @param height The image height. If omitted it defaults to the image file height.
	 *
	 * @param onload Event handler for image load.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement image(String src, double x, double y, double width, double height);

	/**
	 * Display an image.
	 *
	 * @param src The image source.
	 *
	 * @param x The X position.
	 *
	 * @param y The Y position.
	 *
	 * @param width The image width. If omitted, it defaults to the image file width.
	 *
	 * @param height The image height. If omitted it defaults to the image file height.
	 *
	 * @param onload Event handler for image load.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement image(String src, double x, double y, double width);

	/**
	 * Display an image.
	 *
	 * @param src The image source.
	 *
	 * @param x The X position.
	 *
	 * @param y The Y position.
	 *
	 * @param width The image width. If omitted, it defaults to the image file width.
	 *
	 * @param height The image height. If omitted it defaults to the image file height.
	 *
	 * @param onload Event handler for image load.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement image(String src, double x, double y);

	/**
	 * Display an image.
	 *
	 * @param src The image source.
	 *
	 * @param x The X position.
	 *
	 * @param y The Y position.
	 *
	 * @param width The image width. If omitted, it defaults to the image file width.
	 *
	 * @param height The image height. If omitted it defaults to the image file height.
	 *
	 * @param onload Event handler for image load.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement image(String src, double x);

	/**
	 * Display an image.
	 *
	 * @param src The image source.
	 *
	 * @param x The X position.
	 *
	 * @param y The Y position.
	 *
	 * @param width The image width. If omitted, it defaults to the image file width.
	 *
	 * @param height The image height. If omitted it defaults to the image file height.
	 *
	 * @param onload Event handler for image load.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement image(String src);

	/**
	 * Initialize the SVGRenderer. Overridable initializer function that takes the same parameters as the constructor.
	 *
	 * @param container Where to put the SVG in the web page.
	 *
	 * @param width The width of the SVG.
	 *
	 * @param height The height of the SVG.
	 *
	 * @param style The box style, if not in styleMode
	 *
	 * @param forExport Whether the rendered content is intended for export.
	 *
	 * @param allowHTML Whether the renderer is allowed to include HTML text, which will be projected on top of the SVG.
	 *
	 * @param styledMode Whether the renderer belongs to a chart that is in styled mode. If it does, it will avoid setting presentational attributes in some
	 *            cases, but not when set explicitly through `.attr` and `.css` etc.
	 */
	native public void init(HTMLElement container, double width, double height, CSSObject style, Boolean forExport, Boolean allowHTML);

	/**
	 * Initialize the SVGRenderer. Overridable initializer function that takes the same parameters as the constructor.
	 *
	 * @param container Where to put the SVG in the web page.
	 *
	 * @param width The width of the SVG.
	 *
	 * @param height The height of the SVG.
	 *
	 * @param style The box style, if not in styleMode
	 *
	 * @param forExport Whether the rendered content is intended for export.
	 *
	 * @param allowHTML Whether the renderer is allowed to include HTML text, which will be projected on top of the SVG.
	 *
	 * @param styledMode Whether the renderer belongs to a chart that is in styled mode. If it does, it will avoid setting presentational attributes in some
	 *            cases, but not when set explicitly through `.attr` and `.css` etc.
	 */
	native public void init(HTMLElement container, double width, double height, CSSObject style, Boolean forExport);

	/**
	 * Initialize the SVGRenderer. Overridable initializer function that takes the same parameters as the constructor.
	 *
	 * @param container Where to put the SVG in the web page.
	 *
	 * @param width The width of the SVG.
	 *
	 * @param height The height of the SVG.
	 *
	 * @param style The box style, if not in styleMode
	 *
	 * @param forExport Whether the rendered content is intended for export.
	 *
	 * @param allowHTML Whether the renderer is allowed to include HTML text, which will be projected on top of the SVG.
	 *
	 * @param styledMode Whether the renderer belongs to a chart that is in styled mode. If it does, it will avoid setting presentational attributes in some
	 *            cases, but not when set explicitly through `.attr` and `.css` etc.
	 */
	native public void init(HTMLElement container, double width, double height, CSSObject style);

	/**
	 * Initialize the SVGRenderer. Overridable initializer function that takes the same parameters as the constructor.
	 *
	 * @param container Where to put the SVG in the web page.
	 *
	 * @param width The width of the SVG.
	 *
	 * @param height The height of the SVG.
	 *
	 * @param style The box style, if not in styleMode
	 *
	 * @param forExport Whether the rendered content is intended for export.
	 *
	 * @param allowHTML Whether the renderer is allowed to include HTML text, which will be projected on top of the SVG.
	 *
	 * @param styledMode Whether the renderer belongs to a chart that is in styled mode. If it does, it will avoid setting presentational attributes in some
	 *            cases, but not when set explicitly through `.attr` and `.css` etc.
	 */
	native public void init(HTMLElement container, double width, double height);

	/**
	 * Draw a label, which is an extended text element with support for border and background. Highcharts creates a `g` element with a text and a `path` or
	 * `rect` inside, to make it behave somewhat like a HTML div. Border and background are set through `stroke`, `stroke-width` and `fill` attributes using the
	 * attr method. To update the text after render, run `label.attr({ text: 'New text' })`.
	 *
	 * @param str The initial text string or (subset) HTML to render.
	 *
	 * @param x The x position of the label's left side.
	 *
	 * @param y The y position of the label's top side or baseline, depending on the `baseline` parameter.
	 *
	 * @param shape The shape of the label's border/background, if any. Defaults to `rect`. Other possible values are `callout` or other shapes defined in
	 *            Highcharts.SVGRenderer#symbols.
	 *
	 * @param anchorX In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param anchorY In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @param baseline Whether to position the label relative to the text baseline, like renderer.text, or to the upper border of the rectangle.
	 *
	 * @param className Class name for the group.
	 *
	 * @return The generated label.
	 */
	native public SVGElement label(String str, double x, double y, String shape, double anchorX, double anchorY, Boolean useHTML, Boolean baseline);

	/**
	 * Draw a label, which is an extended text element with support for border and background. Highcharts creates a `g` element with a text and a `path` or
	 * `rect` inside, to make it behave somewhat like a HTML div. Border and background are set through `stroke`, `stroke-width` and `fill` attributes using the
	 * attr method. To update the text after render, run `label.attr({ text: 'New text' })`.
	 *
	 * @param str The initial text string or (subset) HTML to render.
	 *
	 * @param x The x position of the label's left side.
	 *
	 * @param y The y position of the label's top side or baseline, depending on the `baseline` parameter.
	 *
	 * @param shape The shape of the label's border/background, if any. Defaults to `rect`. Other possible values are `callout` or other shapes defined in
	 *            Highcharts.SVGRenderer#symbols.
	 *
	 * @param anchorX In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param anchorY In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @param baseline Whether to position the label relative to the text baseline, like renderer.text, or to the upper border of the rectangle.
	 *
	 * @param className Class name for the group.
	 *
	 * @return The generated label.
	 */
	native public SVGElement label(String str, double x, double y, String shape, double anchorX, double anchorY, Boolean useHTML);

	/**
	 * Draw a label, which is an extended text element with support for border and background. Highcharts creates a `g` element with a text and a `path` or
	 * `rect` inside, to make it behave somewhat like a HTML div. Border and background are set through `stroke`, `stroke-width` and `fill` attributes using the
	 * attr method. To update the text after render, run `label.attr({ text: 'New text' })`.
	 *
	 * @param str The initial text string or (subset) HTML to render.
	 *
	 * @param x The x position of the label's left side.
	 *
	 * @param y The y position of the label's top side or baseline, depending on the `baseline` parameter.
	 *
	 * @param shape The shape of the label's border/background, if any. Defaults to `rect`. Other possible values are `callout` or other shapes defined in
	 *            Highcharts.SVGRenderer#symbols.
	 *
	 * @param anchorX In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param anchorY In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @param baseline Whether to position the label relative to the text baseline, like renderer.text, or to the upper border of the rectangle.
	 *
	 * @param className Class name for the group.
	 *
	 * @return The generated label.
	 */
	native public SVGElement label(String str, double x, double y, String shape, double anchorX, double anchorY);

	/**
	 * Draw a label, which is an extended text element with support for border and background. Highcharts creates a `g` element with a text and a `path` or
	 * `rect` inside, to make it behave somewhat like a HTML div. Border and background are set through `stroke`, `stroke-width` and `fill` attributes using the
	 * attr method. To update the text after render, run `label.attr({ text: 'New text' })`.
	 *
	 * @param str The initial text string or (subset) HTML to render.
	 *
	 * @param x The x position of the label's left side.
	 *
	 * @param y The y position of the label's top side or baseline, depending on the `baseline` parameter.
	 *
	 * @param shape The shape of the label's border/background, if any. Defaults to `rect`. Other possible values are `callout` or other shapes defined in
	 *            Highcharts.SVGRenderer#symbols.
	 *
	 * @param anchorX In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param anchorY In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @param baseline Whether to position the label relative to the text baseline, like renderer.text, or to the upper border of the rectangle.
	 *
	 * @param className Class name for the group.
	 *
	 * @return The generated label.
	 */
	native public SVGElement label(String str, double x, double y, String shape, double anchorX);

	/**
	 * Draw a label, which is an extended text element with support for border and background. Highcharts creates a `g` element with a text and a `path` or
	 * `rect` inside, to make it behave somewhat like a HTML div. Border and background are set through `stroke`, `stroke-width` and `fill` attributes using the
	 * attr method. To update the text after render, run `label.attr({ text: 'New text' })`.
	 *
	 * @param str The initial text string or (subset) HTML to render.
	 *
	 * @param x The x position of the label's left side.
	 *
	 * @param y The y position of the label's top side or baseline, depending on the `baseline` parameter.
	 *
	 * @param shape The shape of the label's border/background, if any. Defaults to `rect`. Other possible values are `callout` or other shapes defined in
	 *            Highcharts.SVGRenderer#symbols.
	 *
	 * @param anchorX In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param anchorY In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @param baseline Whether to position the label relative to the text baseline, like renderer.text, or to the upper border of the rectangle.
	 *
	 * @param className Class name for the group.
	 *
	 * @return The generated label.
	 */
	native public SVGElement label(String str, double x, double y, String shape);

	/**
	 * Draw a label, which is an extended text element with support for border and background. Highcharts creates a `g` element with a text and a `path` or
	 * `rect` inside, to make it behave somewhat like a HTML div. Border and background are set through `stroke`, `stroke-width` and `fill` attributes using the
	 * attr method. To update the text after render, run `label.attr({ text: 'New text' })`.
	 *
	 * @param str The initial text string or (subset) HTML to render.
	 *
	 * @param x The x position of the label's left side.
	 *
	 * @param y The y position of the label's top side or baseline, depending on the `baseline` parameter.
	 *
	 * @param shape The shape of the label's border/background, if any. Defaults to `rect`. Other possible values are `callout` or other shapes defined in
	 *            Highcharts.SVGRenderer#symbols.
	 *
	 * @param anchorX In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param anchorY In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @param baseline Whether to position the label relative to the text baseline, like renderer.text, or to the upper border of the rectangle.
	 *
	 * @param className Class name for the group.
	 *
	 * @return The generated label.
	 */
	native public SVGElement label(String str, double x, double y);

	/**
	 * Draw a label, which is an extended text element with support for border and background. Highcharts creates a `g` element with a text and a `path` or
	 * `rect` inside, to make it behave somewhat like a HTML div. Border and background are set through `stroke`, `stroke-width` and `fill` attributes using the
	 * attr method. To update the text after render, run `label.attr({ text: 'New text' })`.
	 *
	 * @param str The initial text string or (subset) HTML to render.
	 *
	 * @param x The x position of the label's left side.
	 *
	 * @param y The y position of the label's top side or baseline, depending on the `baseline` parameter.
	 *
	 * @param shape The shape of the label's border/background, if any. Defaults to `rect`. Other possible values are `callout` or other shapes defined in
	 *            Highcharts.SVGRenderer#symbols.
	 *
	 * @param anchorX In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param anchorY In case the `shape` has a pointer, like a flag, this is the coordinates it should be pinned to.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @param baseline Whether to position the label relative to the text baseline, like renderer.text, or to the upper border of the rectangle.
	 *
	 * @param className Class name for the group.
	 *
	 * @return The generated label.
	 */
	native public SVGElement label(String str, double x);

	/**
	 * Draw a path, wraps the SVG `path` element.
	 *
	 * @param path An SVG path definition in array form.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement path();

	/**
	 * Draw and return a rectangle.
	 *
	 * @param attributes General SVG attributes for the rectangle.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement rect();

	/**
	 * Draw and return a rectangle.
	 *
	 * @param x Left position.
	 *
	 * @param y Top position.
	 *
	 * @param width Width of the rectangle.
	 *
	 * @param height Height of the rectangle.
	 *
	 * @param r Border corner radius.
	 *
	 * @param strokeWidth A stroke width can be supplied to allow crisp drawing.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement rect(double x, double y, double width, double height, double r);

	/**
	 * Draw and return a rectangle.
	 *
	 * @param x Left position.
	 *
	 * @param y Top position.
	 *
	 * @param width Width of the rectangle.
	 *
	 * @param height Height of the rectangle.
	 *
	 * @param r Border corner radius.
	 *
	 * @param strokeWidth A stroke width can be supplied to allow crisp drawing.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement rect(double x, double y, double width, double height);

	/**
	 * Draw and return a rectangle.
	 *
	 * @param x Left position.
	 *
	 * @param y Top position.
	 *
	 * @param width Width of the rectangle.
	 *
	 * @param height Height of the rectangle.
	 *
	 * @param r Border corner radius.
	 *
	 * @param strokeWidth A stroke width can be supplied to allow crisp drawing.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement rect(double x, double y, double width);

	/**
	 * Draw and return a rectangle.
	 *
	 * @param x Left position.
	 *
	 * @param y Top position.
	 *
	 * @param width Width of the rectangle.
	 *
	 * @param height Height of the rectangle.
	 *
	 * @param r Border corner radius.
	 *
	 * @param strokeWidth A stroke width can be supplied to allow crisp drawing.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement rect(double x, double y);

	/**
	 * Draw and return a rectangle.
	 *
	 * @param x Left position.
	 *
	 * @param y Top position.
	 *
	 * @param width Width of the rectangle.
	 *
	 * @param height Height of the rectangle.
	 *
	 * @param r Border corner radius.
	 *
	 * @param strokeWidth A stroke width can be supplied to allow crisp drawing.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement rect(double x);

	/**
	 * Resize the SVGRenderer#box and re-align all aligned child elements.
	 *
	 * @param width The new pixel width.
	 *
	 * @param height The new pixel height.
	 *
	 * @param animate Whether and how to animate.
	 */
	native public void setSize(double width, double height);

	/**
	 * Draw a symbol out of pre-defined shape paths from SVGRenderer#symbols. It is used in Highcharts for point makers, which cake a `symbol` option, and label
	 * and button backgrounds like in the tooltip and stock flags.
	 *
	 * @param symbol The symbol name.
	 *
	 * @param x The X coordinate for the top left position.
	 *
	 * @param y The Y coordinate for the top left position.
	 *
	 * @param width The pixel width.
	 *
	 * @param height The pixel height.
	 *
	 * @param options Additional options, depending on the actual symbol drawn.
	 */
	native public SVGElement symbol(String symbol, double x, double y, double width, double height);

	/**
	 * Draw a symbol out of pre-defined shape paths from SVGRenderer#symbols. It is used in Highcharts for point makers, which cake a `symbol` option, and label
	 * and button backgrounds like in the tooltip and stock flags.
	 *
	 * @param symbol The symbol name.
	 *
	 * @param x The X coordinate for the top left position.
	 *
	 * @param y The Y coordinate for the top left position.
	 *
	 * @param width The pixel width.
	 *
	 * @param height The pixel height.
	 *
	 * @param options Additional options, depending on the actual symbol drawn.
	 */
	native public SVGElement symbol(String symbol, double x, double y, double width);

	/**
	 * Draw a symbol out of pre-defined shape paths from SVGRenderer#symbols. It is used in Highcharts for point makers, which cake a `symbol` option, and label
	 * and button backgrounds like in the tooltip and stock flags.
	 *
	 * @param symbol The symbol name.
	 *
	 * @param x The X coordinate for the top left position.
	 *
	 * @param y The Y coordinate for the top left position.
	 *
	 * @param width The pixel width.
	 *
	 * @param height The pixel height.
	 *
	 * @param options Additional options, depending on the actual symbol drawn.
	 */
	native public SVGElement symbol(String symbol, double x, double y);

	/**
	 * Draw a symbol out of pre-defined shape paths from SVGRenderer#symbols. It is used in Highcharts for point makers, which cake a `symbol` option, and label
	 * and button backgrounds like in the tooltip and stock flags.
	 *
	 * @param symbol The symbol name.
	 *
	 * @param x The X coordinate for the top left position.
	 *
	 * @param y The Y coordinate for the top left position.
	 *
	 * @param width The pixel width.
	 *
	 * @param height The pixel height.
	 *
	 * @param options Additional options, depending on the actual symbol drawn.
	 */
	native public SVGElement symbol(String symbol, double x);

	/**
	 * Draw a symbol out of pre-defined shape paths from SVGRenderer#symbols. It is used in Highcharts for point makers, which cake a `symbol` option, and label
	 * and button backgrounds like in the tooltip and stock flags.
	 *
	 * @param symbol The symbol name.
	 *
	 * @param x The X coordinate for the top left position.
	 *
	 * @param y The Y coordinate for the top left position.
	 *
	 * @param width The pixel width.
	 *
	 * @param height The pixel height.
	 *
	 * @param options Additional options, depending on the actual symbol drawn.
	 */
	native public SVGElement symbol(String symbol);

	/**
	 * Draw text. The text can contain a subset of HTML, like spans and anchors and some basic text styling of these. For more advanced features like border and
	 * background, use Highcharts.SVGRenderer#label instead. To update the text after render, run `text.attr({ text: 'New text' })`.
	 *
	 * @param str The text of (subset) HTML to draw.
	 *
	 * @param x The x position of the text's lower left corner.
	 *
	 * @param y The y position of the text's lower left corner.
	 *
	 * @param useHTML Use HTML to render the text.
	 *
	 * @return The text object.
	 */
	native public SVGElement text(String str, double x, double y);

	/**
	 * Draw text. The text can contain a subset of HTML, like spans and anchors and some basic text styling of these. For more advanced features like border and
	 * background, use Highcharts.SVGRenderer#label instead. To update the text after render, run `text.attr({ text: 'New text' })`.
	 *
	 * @param str The text of (subset) HTML to draw.
	 *
	 * @param x The x position of the text's lower left corner.
	 *
	 * @param y The y position of the text's lower left corner.
	 *
	 * @param useHTML Use HTML to render the text.
	 *
	 * @return The text object.
	 */
	native public SVGElement text(String str, double x);

	/**
	 * Draw text. The text can contain a subset of HTML, like spans and anchors and some basic text styling of these. For more advanced features like border and
	 * background, use Highcharts.SVGRenderer#label instead. To update the text after render, run `text.attr({ text: 'New text' })`.
	 *
	 * @param str The text of (subset) HTML to draw.
	 *
	 * @param x The x position of the text's lower left corner.
	 *
	 * @param y The y position of the text's lower left corner.
	 *
	 * @param useHTML Use HTML to render the text.
	 *
	 * @return The text object.
	 */
	native public SVGElement text(String str);

	/**
	 * Draw text. The text can contain a subset of HTML, like spans and anchors and some basic text styling of these. For more advanced features like border and
	 * background, use Highcharts.SVGRenderer#label instead. To update the text after render, run `text.attr({ text: 'New text' })`.
	 *
	 * @param str The text of (subset) HTML to draw.
	 *
	 * @param x The x position of the text's lower left corner.
	 *
	 * @param y The y position of the text's lower left corner.
	 *
	 * @param useHTML Use HTML to render the text.
	 *
	 * @return The text object.
	 */
	native public SVGElement text();

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	native public SVGElement button(String text, double x, double y, java.util.function.Function<SVGElement, Boolean> callback, SVGAttributes normalState,
			SVGAttributes hoverState, SVGAttributes pressedState, SVGAttributes disabledState, Object shape, Boolean useHTML);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	native public SVGElement button(String text, double x, double y, java.util.function.Function<SVGElement, Boolean> callback, SVGAttributes normalState,
			SVGAttributes hoverState, SVGAttributes pressedState, SVGAttributes disabledState, Object shape);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	native public SVGElement button(String text, double x, double y, java.util.function.Function<SVGElement, Boolean> callback, SVGAttributes normalState,
			SVGAttributes hoverState, SVGAttributes pressedState, SVGAttributes disabledState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	native public SVGElement button(String text, double x, double y, java.util.function.Function<SVGElement, Boolean> callback, SVGAttributes normalState,
			SVGAttributes hoverState, SVGAttributes pressedState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	native public SVGElement button(String text, double x, double y, java.util.function.Function<SVGElement, Boolean> callback, SVGAttributes normalState,
			SVGAttributes hoverState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	native public SVGElement button(String text, double x, double y, java.util.function.Function<SVGElement, Boolean> callback, SVGAttributes normalState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	native public SVGElement button(String text, double x, double y, java.util.function.Function<SVGElement, Boolean> callback);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackDictionaryAnyBiFunction(String text, double x, double y,
			java.util.function.BiFunction<SVGElement, Dictionary<?>, Boolean> callback, SVGAttributes normalState, SVGAttributes hoverState,
			SVGAttributes pressedState, SVGAttributes disabledState, Object shape, Boolean useHTML);

	/**
	 * Utility to return the baseline offset and total line height from the font size.
	 *
	 * @param fontSize The current font size to inspect. If not given, the font size will be found from the DOM element.
	 *
	 * @param elem The element to inspect for a current font size.
	 *
	 * @return The font metrics.
	 */
	native public FontMetricsObject fontMetrics(double fontSize, SVGElement elem);

	/**
	 * Utility to return the baseline offset and total line height from the font size.
	 *
	 * @param fontSize The current font size to inspect. If not given, the font size will be found from the DOM element.
	 *
	 * @param elem The element to inspect for a current font size.
	 *
	 * @return The font metrics.
	 */
	native public FontMetricsObject fontMetrics(String fontSize, SVGElement elem);

	/**
	 * Utility to return the baseline offset and total line height from the font size.
	 *
	 * @param fontSize The current font size to inspect. If not given, the font size will be found from the DOM element.
	 *
	 * @param elem The element to inspect for a current font size.
	 *
	 * @return The font metrics.
	 */
	native public FontMetricsObject fontMetrics(String fontSize, GlobalSVGElement elem);

	/**
	 * Resize the SVGRenderer#box and re-align all aligned child elements.
	 *
	 * @param width The new pixel width.
	 *
	 * @param height The new pixel height.
	 *
	 * @param animate Whether and how to animate.
	 */
	native public void setSize(double width, double height, Partial2<AnimationOptionsObject> animate);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackDictionaryAnyBiFunction(String text, double x, double y,
			java.util.function.BiFunction<SVGElement, Dictionary<?>, Boolean> callback, SVGAttributes normalState, SVGAttributes hoverState,
			SVGAttributes pressedState, SVGAttributes disabledState, Object shape);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackDictionaryAnyBiFunction(String text, double x, double y,
			java.util.function.BiFunction<SVGElement, Dictionary<?>, Boolean> callback, SVGAttributes normalState, SVGAttributes hoverState,
			SVGAttributes pressedState, SVGAttributes disabledState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackDictionaryAnyBiFunction(String text, double x, double y,
			java.util.function.BiFunction<SVGElement, Dictionary<?>, Boolean> callback, SVGAttributes normalState, SVGAttributes hoverState,
			SVGAttributes pressedState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackDictionaryAnyBiFunction(String text, double x, double y,
			java.util.function.BiFunction<SVGElement, Dictionary<?>, Boolean> callback, SVGAttributes normalState, SVGAttributes hoverState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackDictionaryAnyBiFunction(String text, double x, double y,
			java.util.function.BiFunction<SVGElement, Dictionary<?>, Boolean> callback, SVGAttributes normalState);

	/**
	 * Create a button with preset states.
	 *
	 * @param text The text or HTML to draw.
	 *
	 * @param x The x position of the button's left side.
	 *
	 * @param y The y position of the button's top side.
	 *
	 * @param callback The function to execute on button click or touch.
	 *
	 * @param normalState SVG attributes for the normal state.
	 *
	 * @param hoverState SVG attributes for the hover state.
	 *
	 * @param pressedState SVG attributes for the pressed state.
	 *
	 * @param disabledState SVG attributes for the disabled state.
	 *
	 * @param shape The shape type.
	 *
	 * @param useHTML Wether to use HTML to render the label.
	 *
	 * @return The button element.
	 */
	@jsweet.lang.Name("button")
	native public SVGElement buttonCallbackDictionaryAnyBiFunction(String text, double x, double y,
			java.util.function.BiFunction<SVGElement, Dictionary<?>, Boolean> callback);

	/**
	 * Utility to return the baseline offset and total line height from the font size.
	 *
	 * @param fontSize The current font size to inspect. If not given, the font size will be found from the DOM element.
	 *
	 * @param elem The element to inspect for a current font size.
	 *
	 * @return The font metrics.
	 */
	native public FontMetricsObject fontMetrics(String fontSize);

	/**
	 * Make a straight line crisper by not spilling out to neighbour pixels.
	 *
	 * @param points The original points on the format `[['M', 0, 0], ['L', 100, 0]]`.
	 *
	 * @param width The width of the line.
	 *
	 * @param roundingFunction The rounding function name on the `Math` object, can be one of `round`, `floor` or `ceil`.
	 *
	 * @return The original points array, but modified to render crisply.
	 */
	native public Array<?> crispLine(Object[] points, double width, String roundingFunction);

	/**
	 * Draw a path, wraps the SVG `path` element.
	 *
	 * @param path An SVG path definition in array form.
	 *
	 * @return The generated wrapper element.
	 */
	native public SVGElement path(Object[] path);

	protected SVGRenderer() {
	}
}
