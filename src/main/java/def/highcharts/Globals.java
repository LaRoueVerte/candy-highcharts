package def.highcharts;

import def.dom.Element;
import def.dom.Event;
import def.dom.HTMLElement;
import def.js.Array;
import def.js.Function;
import jsweet.util.StringTypes.object;
import jsweet.util.function.Consumer4;
import jsweet.util.union.Union3;

/** This class holds all the global functions and variables of the def.highcharts package. */
public final class Globals {
	private Globals() {
	}

	/**
	 * An array containing the current chart objects in the page. A chart's position in the array is preserved throughout the page's lifetime. When a chart is
	 * destroyed, the array item becomes `undefined`.
	 */
	public static Array<jsweet.util.union.Union<Chart, Object>> charts;
	/**
	 * A hook for defining additional date format specifiers. New specifiers are defined as key-value pairs by using the specifier as key, and a function which
	 * takes the timestamp as value. This function returns the formatted portion of the date.
	 */
	public static Dictionary<java.util.function.Function<Double, String>> dateFormats;
	/**
	 * Global default settings.
	 */
	public static Options defaultOptions;
	/**
	 * Theme options that should get applied to the chart. In module mode it might not be possible to change this property because of read-only restrictions,
	 * instead use Highcharts.setOptions.
	 */
	public static Options theme;
	/**
	 * Global `Time` object with default options. Since v6.0.5, time settings can be applied individually for each chart. If no individual settings apply, this
	 * `Time` object is shared by all instances.
	 */
	public static Time time;

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	native public static <T> Function addEvent(T el, String type, Function fn, EventOptionsObject options);

	/**
	 * The global animate method, which uses Fx to create individual animators.
	 *
	 * @param el The element to animate.
	 *
	 * @param params An object containing key-value pairs of the properties to animate. Supports numeric as pixel-based CSS properties for HTML objects and
	 *            attributes for SVGElements.
	 *
	 * @param opt Animation options.
	 */
	native public static void animate(HTMLElement el, CSSObject params, Partial2<AnimationOptionsObject> opt);

	/**
	 * Get the animation in object form, where a disabled animation is always returned as `{ duration: 0 }`.
	 *
	 * @param animation An animation setting. Can be an object with duration, complete and easing properties, or a boolean to enable or disable.
	 *
	 * @return An object with at least a duration property.
	 */
	native public static AnimationOptionsObject animObject(Boolean animation);

	/**
	 * Non-recursive method to find the lowest member of an array. `Math.max` raises a maximum call stack size exceeded error in Chrome when trying to apply
	 * more than 150.000 points. This method is slightly slower, but safe.
	 *
	 * @param data An array of numbers.
	 *
	 * @return The highest number.
	 */
	native public static double arrayMax(Array<?> data);

	/**
	 * Non-recursive method to find the lowest member of an array. `Math.min` raises a maximum call stack size exceeded error in Chrome when trying to apply
	 * more than 150.000 points. This method is slightly slower, but safe.
	 *
	 * @param data An array of numbers.
	 *
	 * @return The lowest number.
	 */
	native public static double arrayMin(Array<?> data);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(HTMLElement elem, String prop, double value);

	/**
	 * Factory function for basic charts.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 *
	 * @return Returns the Chart object.
	 */
	native public static Chart chart(Options options, java.util.function.Consumer<Chart> callback);

	/**
	 * Factory function for basic charts.
	 *
	 * @param renderTo The DOM element to render to, or its id.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 *
	 * @return Returns the Chart object.
	 */
	native public static Chart chart(String renderTo, Options options, java.util.function.Consumer<Chart> callback);

	/**
	 * Internal clear timeout. The function checks that the `id` was not removed (e.g. by `chart.destroy()`). For the details see issue .7901.
	 *
	 * @param id Id of a timeout.
	 */
	native public static void clearTimeout(double id);

	/**
	 * Creates a color instance out of a color string.
	 *
	 * @param input The input color in either rbga or hex format
	 *
	 * @return Color instance
	 */
	native public static Color color(String input);

	/**
	 * Fix JS round off float errors.
	 *
	 * @param num A float number to fix.
	 *
	 * @param prec The precision.
	 *
	 * @return The corrected float number.
	 */
	native public static double correctFloat(double num, double prec);

	/**
	 * Utility function to create an HTML element with attributes and styles.
	 *
	 * @param tag The HTML tag.
	 *
	 * @param attribs Attributes as an object of key-value pairs.
	 *
	 * @param styles Styles as an object of key-value pairs.
	 *
	 * @param parent The parent HTML object.
	 *
	 * @param nopad If true, remove all padding, border and margin.
	 *
	 * @return The created DOM element.
	 */
	native public static HTMLElement createElement(String tag, Dictionary<?> attribs, CSSObject styles, HTMLElement parent, Boolean nopad);

	/**
	 * Set CSS on a given element.
	 *
	 * @param el An HTML DOM element.
	 *
	 * @param styles Style object with camel case property names.
	 */
	native public static void css(HTMLElement el, CSSObject styles);

	/**
	 * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970) into a human readable date string. The format is a subset of the formats for PHP's
	 * strftime function. Additional formats can be given in the Highcharts.dateFormats hook.
	 *
	 * Since v6.0.5, all internal dates are formatted through the Highcharts.Chart#time instance to respect chart-level time settings. The
	 * `Highcharts.dateFormat` function only reflects global time settings set with `setOptions`.
	 *
	 * Supported format keys:
	 *
	 * - `%a`: Short weekday, like 'Mon'
	 *
	 * - `%A`: Long weekday, like 'Monday'
	 *
	 * - `%d`: Two digit day of the month, 01 to 31
	 *
	 * - `%e`: Day of the month, 1 through 31
	 *
	 * - `%w`: Day of the week, 0 through 6
	 *
	 * - `%b`: Short month, like 'Jan'
	 *
	 * - `%B`: Long month, like 'January'
	 *
	 * - `%m`: Two digit month number, 01 through 12
	 *
	 * - `%y`: Two digits year, like 09 for 2009
	 *
	 * - `%Y`: Four digits year, like 2009
	 *
	 * - `%H`: Two digits hours in 24h format, 00 through 23
	 *
	 * - `%k`: Hours in 24h format, 0 through 23
	 *
	 * - `%I`: Two digits hours in 12h format, 00 through 11
	 *
	 * - `%l`: Hours in 12h format, 1 through 12
	 *
	 * - `%M`: Two digits minutes, 00 through 59
	 *
	 * - `%p`: Upper case AM or PM
	 *
	 * - `%P`: Lower case AM or PM
	 *
	 * - `%S`: Two digits seconds, 00 through 59
	 *
	 * - `%L`: Milliseconds (naming from Ruby)
	 *
	 * @param format The desired format where various time representations are prefixed with `%`.
	 *
	 * @param timestamp The JavaScript timestamp.
	 *
	 * @param capitalize Upper case first letter in the return.
	 *
	 * @return The formatted date.
	 */
	native public static String dateFormat(String format, double timestamp, Boolean capitalize);

	/**
	 * Check if an object is null or undefined.
	 *
	 * @param obj The object to check.
	 *
	 * @return False if the object is null or undefined, otherwise true.
	 */
	native public static Boolean defined(Object obj);

	/**
	 * Utility method that destroys any SVGElement instances that are properties on the given object. It loops all properties and invokes destroy if there is a
	 * destroy method. The property is then delete.
	 *
	 * @param obj The object to destroy properties on.
	 *
	 * @param except Exception, do not destroy this property, only delete it.
	 */
	native public static void destroyObjectProperties(Object obj, Object except);

	/**
	 * Discard a HTML element by moving it to the bin and delete.
	 *
	 * @param element The HTML node to discard.
	 */
	native public static void discardElement(HTMLElement element);

	/**
	 * Iterate over an array.
	 *
	 * @param arr The array to iterate over.
	 *
	 * @param fn The iterator callback. It passes three arguments:
	 *
	 *            - `item`: The array item.
	 *
	 *            - `index`: The item's index in the array.
	 *
	 *            - `arr`: The array that each is being applied to.
	 *
	 * @param ctx The context.
	 */
	native public static void each(Array<?> arr, Function fn, Object ctx);

	/**
	 * Remove the last occurence of an item from an array.
	 *
	 * @param arr The array.
	 *
	 * @param item The item to remove.
	 */
	native public static void erase(Array<?> arr, Object item);

	/**
	 * Provide error messages for debugging, with links to online explanation. This function can be overridden to provide custom error handling.
	 *
	 * @param code The error code. See errors.xml for available codes. If it is a string, the error message is printed directly in the console.
	 *
	 * @param stop Whether to throw an error or just log a warning in the console.
	 *
	 * @param chart Reference to the chart that causes the error. Used in 'debugger' module to display errors directly on the chart. Important note: This
	 *            argument is undefined for errors that lack access to the Chart instance.
	 *
	 * @param params Additional parameters for the generated message.
	 */
	native public static void error(double code, Boolean stop, Chart chart, Dictionary<String> params);

	/**
	 * Utility function to extend an object with the members of another.
	 *
	 * @param a The object to be extended.
	 *
	 * @param b The object to add to the first one.
	 *
	 * @return Object a, the original object.
	 */
	// native public static <T> T extend(T a, object b);

	/**
	 * Extend a prototyped class by new members.
	 *
	 * @param parent The parent prototype to inherit.
	 *
	 * @param members A collection of prototype members to add or override compared to the parent prototype.
	 *
	 * @return A new prototype.
	 */
	native public static <T> Class<T> extendClass(Class<T> parent, Dictionary<?> members);

	/**
	 * Return the value of the first element in the array that satisfies the provided testing function.
	 *
	 * @param arr The array to test.
	 *
	 * @param callback The callback function. The function receives the item as the first argument. Return `true` if this item satisfies the condition.
	 *
	 * @return The value of the element.
	 */
	native public static <T> jsweet.util.union.Union<T, Object> find(Array<T> arr, Function callback);

	/**
	 * Fire an event that was registered with Highcharts#addEvent.
	 *
	 * @param el The object to fire the event on. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The type of event.
	 *
	 * @param eventArguments Custom event arguments that are passed on as an argument to the event handler.
	 *
	 * @param defaultFunction The default function to execute if the other listeners haven't returned false.
	 */
	native public static <T> void fireEvent(T el, String type, Event eventArguments, Function defaultFunction);

	/**
	 * Format a string according to a subset of the rules of Python's String.format method.
	 *
	 * @param str The string to format.
	 *
	 * @param ctx The context, a collection of key-value pairs where each key is replaced by its value.
	 *
	 * @param chart A `Chart` instance used to get numberFormatter and time.
	 *
	 * @return The formatted string.
	 */
	native public static String format(String str, Record2<String, ?> ctx, Chart chart);

	/**
	 * Get the defer as a number value from series animation options.
	 *
	 * @param chart The chart instance.
	 *
	 * @param animation An animation setting. Can be an object with duration, complete and easing properties, or a boolean to enable or disable.
	 *
	 * @param series Series to defer animation.
	 *
	 * @return The numeric value.
	 */
	native public static double getDeferredAnimation(Chart chart, Boolean animation, Series series);

	/**
	 * Get the magnitude of a number.
	 *
	 * @param num The number.
	 *
	 * @return The magnitude, where 1-9 are magnitude 1, 10-99 magnitude 2 etc.
	 */
	native public static double getMagnitude(double num);

	/**
	 * Get the updated default options. Until 3.0.7, merely exposing defaultOptions for outside modules wasn't enough because the setOptions method created a
	 * new object.
	 */
	native public static Options getOptions();

	/**
	 * Get the computed CSS value for given element and property, only for numerical properties. For width and height, the dimension of the inner box (excluding
	 * padding) is returned. Used for fitting the chart within the container.
	 *
	 * @param el An HTML element.
	 *
	 * @param prop The property name.
	 *
	 * @param toInt Parse to integer.
	 *
	 * @return The numeric value.
	 */
	native public static jsweet.util.union.Union<Double, String> getStyle(HTMLElement el, String prop, Boolean toInt);

	/**
	 * Filter an array by a callback.
	 *
	 * @param arr The array to filter.
	 *
	 * @param callback The callback function. The function receives the item as the first argument. Return `true` if the item is to be preserved.
	 *
	 * @return A new, filtered array.
	 */
	native public static Array<?> grep(Array<?> arr, Function callback);

	/**
	 * Search for an item in an array.
	 *
	 * @param item The item to search for.
	 *
	 * @param arr The array or node collection to search in.
	 *
	 * @param fromIndex The index to start searching from.
	 *
	 * @return The index within the array, or -1 if not found.
	 */
	native public static double inArray(Object item, Array<?> arr, double fromIndex);

	/**
	 * Utility function to check if an item is an array.
	 *
	 * @param obj The item to check.
	 *
	 * @return True if the argument is an array.
	 */
	native public static Boolean isArray(Object obj);

	/**
	 * Utility function to check if an Object is a class.
	 *
	 * @param obj The item to check.
	 *
	 * @return True if the argument is a class.
	 */
	native public static Boolean isClass(object obj);

	/**
	 * Utility function to check if an Object is a HTML Element.
	 *
	 * @param obj The item to check.
	 *
	 * @return True if the argument is a HTML Element.
	 */
	native public static Boolean isDOMElement(Object obj);

	/**
	 * Utility function to check if an item is a number and it is finite (not NaN, Infinity or -Infinity).
	 *
	 * @param n The item to check.
	 *
	 * @return True if the item is a finite number
	 */
	native public static Boolean isNumber(Object n);

	/**
	 * Utility function to check if an item is of type object.
	 *
	 * @param obj The item to check.
	 *
	 * @param strict Also checks that the object is not an array.
	 *
	 * @return True if the argument is an object.
	 */
	native public static Boolean isObject(Object obj, Boolean strict);

	/**
	 * Utility function to check for string type.
	 *
	 * @param s The item to check.
	 *
	 * @return True if the argument is a string.
	 */
	native public static Boolean isString(Object s);

	/**
	 * Returns an array of a given object's own properties.
	 *
	 * @param obj The object of which the properties are to be returned.
	 *
	 * @return An array of strings that represents all the properties.
	 */
	native public static Array<String> keys(Object obj);

	/**
	 * Map an array by a callback.
	 *
	 * @param arr The array to map.
	 *
	 * @param fn The callback function. Return the new value for the new array.
	 *
	 * @return A new array item with modified items.
	 */
	native public static Array<?> map(Array<?> arr, Function fn);

	/**
	 * Utility function to deep merge two or more objects and return a third object. The merge function can also be used with a single object argument to create
	 * a deep copy of an object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	// native public static <T> T merge(T a, Array<Object>... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. If the first argument is true, the contents of the second object is copied
	 * into the first object. The merge function can also be used with a single object argument to create a deep copy of an object.
	 *
	 * @param extend Whether to extend the left-side object (a) or return a whole new object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	// native public static <T> T merge(Boolean extend, T a, Array<Object>... n);

	/**
	 * Take an interval and normalize it to multiples of round numbers.
	 *
	 * @param interval The raw, un-rounded interval.
	 *
	 * @param multiples Allowed multiples.
	 *
	 * @param magnitude The magnitude of the number.
	 *
	 * @param allowDecimals Whether to allow decimals.
	 *
	 * @param hasTickAmount If it has tickAmount, avoid landing on tick intervals lower than original.
	 *
	 * @return The normalized interval.
	 */
	native public static double normalizeTickInterval(double interval, Array<?> multiples, double magnitude, Boolean allowDecimals, Boolean hasTickAmount);

	/**
	 * Format a number and return a string based on input settings.
	 *
	 * @param number The input number to format.
	 *
	 * @param decimals The amount of decimals. A value of -1 preserves the amount in the input number.
	 *
	 * @param decimalPoint The decimal point, defaults to the one given in the lang options, or a dot.
	 *
	 * @param thousandsSep The thousands separator, defaults to the one given in the lang options, or a space character.
	 *
	 * @return The formatted number.
	 */
	native public static String numberFormat(double number, double decimals, String decimalPoint, String thousandsSep);

	/**
	 * Iterate over object key pairs in an object.
	 *
	 * @param obj The object to iterate over.
	 *
	 * @param fn The iterator callback. It passes three arguments:
	 *
	 *            * value - The property value.
	 *
	 *            * key - The property key.
	 *
	 *            * obj - The object that objectEach is being applied to.
	 *
	 * @param ctx The context.
	 */
	native public static <T> void objectEach(Object obj, Consumer4<T, Object, String, Object> fn, T ctx);

	/**
	 * Get the element's offset position, corrected for `overflow: auto`.
	 *
	 * @param el The DOM element.
	 *
	 * @return An object containing `left` and `top` properties for the position in the page.
	 */
	native public static OffsetObject offset(Element el);

	/**
	 * Left-pad a string to a given length by adding a character repetetively.
	 *
	 * @param number The input string or number.
	 *
	 * @param length The desired string length.
	 *
	 * @param padder The character to pad with.
	 *
	 * @return The padded string.
	 */
	native public static String pad(double number, double length, String padder);

	/**
	 * Return the first value that is not null or undefined.
	 *
	 * @param items Variable number of arguments to inspect.
	 *
	 * @return The value of the first argument that is not null or undefined.
	 */
	native public static <T> T pick(@SuppressWarnings("unchecked") ArrayT<T>... items);

	/**
	 * Reduce an array to a single value.
	 *
	 * @param arr The array to reduce.
	 *
	 * @param fn The callback function. Return the reduced value. Receives 4 arguments: Accumulated/reduced value, current value, current array index, and the
	 *            array.
	 *
	 * @param initialValue The initial value of the accumulator.
	 *
	 * @return The reduced value.
	 */
	native public static Object reduce(Array<?> arr, Function fn, Object initialValue);

	/**
	 * Return a length based on either the integer value, or a percentage of a base.
	 *
	 * @param value A percentage string or a number.
	 *
	 * @param base The full length that represents 100%.
	 *
	 * @param offset A pixel offset to apply for percentage values. Used internally in axis positioning.
	 *
	 * @return The computed length.
	 */
	native public static double relativeLength(double value, double base, double offset);

	/**
	 * Remove an event that was added with Highcharts#addEvent.
	 *
	 * @param el The element to remove events on.
	 *
	 * @param type The type of events to remove. If undefined, all events are removed from the element.
	 *
	 * @param fn The specific callback to remove. If undefined, all events that match the element and optionally the type are removed.
	 */
	@jsweet.lang.Name("removeEvent")
	native public static <T> void removeEventFnBiFunction(T el, String type, java.util.function.BiFunction<T, Event, Boolean> fn);

	/**
	 * Factory to create new series prototypes.
	 *
	 * @param type The series type name.
	 *
	 * @param parent The parent series type name. Use `line` to inherit from the basic Series object.
	 *
	 * @param options The additional default options that are merged with the parent's options.
	 *
	 * @param props The properties (functions and primitives) to set on the new prototype.
	 *
	 * @param pointProps Members for a series-specific extension of the Point prototype if needed.
	 *
	 * @return The newly created prototype as extended from Series or its derivatives.
	 */
	native public static Series seriesType(String type, String parent, SeriesOptionsRegistry options, Dictionary<?> props, Dictionary<?> pointProps);

	/**
	 * Set the global animation to either a given value, or fall back to the given chart's animation option.
	 *
	 * @param animation The animation object.
	 *
	 * @param chart The chart instance.
	 */
	native public static void setAnimation(Boolean animation, Chart chart);

	/**
	 * Merge the default options with custom options and return the new options structure. Commonly used for defining reusable templates.
	 *
	 * @param options The new custom chart options.
	 *
	 * @return Updated options.
	 */
	native public static Options setOptions(Options options);

	/**
	 * Test whether at least one element in the array passes the test implemented by the provided function.
	 *
	 * @param arr The array to test
	 *
	 * @param fn The function to run on each item. Return truty to pass the test. Receives arguments `currentValue`, `index` and `array`.
	 *
	 * @param ctx The context.
	 */
	native public static Boolean some(Array<?> arr, Function fn, Object ctx);

	/**
	 * Check if an element is an array, and if not, make it into an array.
	 *
	 * @param obj The object to splat.
	 *
	 * @return The produced or original array.
	 */
	native public static Object[] splat(Object obj);

	/**
	 * Sort an object array and keep the order of equal items. The ECMAScript standard does not specify the behaviour when items are equal.
	 *
	 * @param arr The array to sort.
	 *
	 * @param sortFunction The function to sort it with, like with regular Array.prototype.sort.
	 */
	native public static void stableSort(Array<?> arr, Function sortFunction);

	/**
	 * Stop running animation.
	 *
	 * @param el The SVGElement to stop animation on.
	 *
	 * @param prop The property to stop animating. If given, the stop method will stop a single property from animating, while others continue.
	 */
	native public static void stop(SVGElement2 el, String prop);

	/**
	 * Set a timeout if the delay is given, otherwise perform the function synchronously.
	 *
	 * @param fn The function callback.
	 *
	 * @param delay Delay in milliseconds.
	 *
	 * @param context An optional context to send to the function callback.
	 *
	 * @return An identifier for the timeout that can later be cleared with Highcharts.clearTimeout. Returns -1 if there is no timeout.
	 */
	native public static double syncTimeout(Function fn, double delay, Object context);

	/**
	 * Get a unique key for using in internal element id's and pointers. The key is composed of a random hash specific to this Highcharts instance, and a
	 * counter.
	 *
	 * @return A unique key.
	 */
	native public static String uniqueKey();

	/**
	 * Activates a serial mode for element IDs provided by Highcharts.uniqueKey. This mode can be used in automated tests, where a simple comparison of two
	 * rendered SVG graphics is needed.
	 *
	 * **Note:** This is only for testing purposes and will break functionality in webpages with multiple charts.
	 *
	 * @param mode Changes the state of serial mode.
	 *
	 * @return State of the serial mode.
	 */
	native public static jsweet.util.union.Union<Boolean, Object> useSerialIds(Boolean mode);

	/**
	 * Wrap a method with extended functionality, preserving the original function.
	 *
	 * @param obj The context object that the method belongs to. In real cases, this is often a prototype.
	 *
	 * @param method The name of the method to extend.
	 *
	 * @param func A wrapper function callback. This function is called with the same arguments as the original function, except that the original function is
	 *            unshifted and passed as the first argument.
	 */
	native public static void wrap(Object obj, String method, jsweet.util.function.TriFunction<Object, Object, Object, Object> func);

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	native public static <T> Function addEvent(T el, String type, Function fn);

	/**
	 * The global animate method, which uses Fx to create individual animators.
	 *
	 * @param el The element to animate.
	 *
	 * @param params An object containing key-value pairs of the properties to animate. Supports numeric as pixel-based CSS properties for HTML objects and
	 *            attributes for SVGElements.
	 *
	 * @param opt Animation options.
	 */
	native public static void animate(HTMLElement el, CSSObject params);

	/**
	 * Get the animation in object form, where a disabled animation is always returned as `{ duration: 0 }`.
	 *
	 * @param animation An animation setting. Can be an object with duration, complete and easing properties, or a boolean to enable or disable.
	 *
	 * @return An object with at least a duration property.
	 */
	native public static AnimationOptionsObject animObject();

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(HTMLElement elem, String prop);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(HTMLElement elem);

	/**
	 * Factory function for basic charts.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 *
	 * @return Returns the Chart object.
	 */
	native public static Chart chart(Options options);

	/**
	 * Factory function for basic charts.
	 *
	 * @param renderTo The DOM element to render to, or its id.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 *
	 * @return Returns the Chart object.
	 */
	native public static Chart chart(String renderTo, Options options);

	/**
	 * Fix JS round off float errors.
	 *
	 * @param num A float number to fix.
	 *
	 * @param prec The precision.
	 *
	 * @return The corrected float number.
	 */
	native public static double correctFloat(double num);

	/**
	 * Utility function to create an HTML element with attributes and styles.
	 *
	 * @param tag The HTML tag.
	 *
	 * @param attribs Attributes as an object of key-value pairs.
	 *
	 * @param styles Styles as an object of key-value pairs.
	 *
	 * @param parent The parent HTML object.
	 *
	 * @param nopad If true, remove all padding, border and margin.
	 *
	 * @return The created DOM element.
	 */
	native public static HTMLElement createElement(String tag, Dictionary<?> attribs, CSSObject styles, HTMLElement parent);

	/**
	 * Utility function to create an HTML element with attributes and styles.
	 *
	 * @param tag The HTML tag.
	 *
	 * @param attribs Attributes as an object of key-value pairs.
	 *
	 * @param styles Styles as an object of key-value pairs.
	 *
	 * @param parent The parent HTML object.
	 *
	 * @param nopad If true, remove all padding, border and margin.
	 *
	 * @return The created DOM element.
	 */
	native public static HTMLElement createElement(String tag, Dictionary<?> attribs, CSSObject styles);

	/**
	 * Utility function to create an HTML element with attributes and styles.
	 *
	 * @param tag The HTML tag.
	 *
	 * @param attribs Attributes as an object of key-value pairs.
	 *
	 * @param styles Styles as an object of key-value pairs.
	 *
	 * @param parent The parent HTML object.
	 *
	 * @param nopad If true, remove all padding, border and margin.
	 *
	 * @return The created DOM element.
	 */
	native public static HTMLElement createElement(String tag, Dictionary<?> attribs);

	/**
	 * Utility function to create an HTML element with attributes and styles.
	 *
	 * @param tag The HTML tag.
	 *
	 * @param attribs Attributes as an object of key-value pairs.
	 *
	 * @param styles Styles as an object of key-value pairs.
	 *
	 * @param parent The parent HTML object.
	 *
	 * @param nopad If true, remove all padding, border and margin.
	 *
	 * @return The created DOM element.
	 */
	native public static HTMLElement createElement(String tag);

	/**
	 * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970) into a human readable date string. The format is a subset of the formats for PHP's
	 * strftime function. Additional formats can be given in the Highcharts.dateFormats hook.
	 *
	 * Since v6.0.5, all internal dates are formatted through the Highcharts.Chart#time instance to respect chart-level time settings. The
	 * `Highcharts.dateFormat` function only reflects global time settings set with `setOptions`.
	 *
	 * Supported format keys:
	 *
	 * - `%a`: Short weekday, like 'Mon'
	 *
	 * - `%A`: Long weekday, like 'Monday'
	 *
	 * - `%d`: Two digit day of the month, 01 to 31
	 *
	 * - `%e`: Day of the month, 1 through 31
	 *
	 * - `%w`: Day of the week, 0 through 6
	 *
	 * - `%b`: Short month, like 'Jan'
	 *
	 * - `%B`: Long month, like 'January'
	 *
	 * - `%m`: Two digit month number, 01 through 12
	 *
	 * - `%y`: Two digits year, like 09 for 2009
	 *
	 * - `%Y`: Four digits year, like 2009
	 *
	 * - `%H`: Two digits hours in 24h format, 00 through 23
	 *
	 * - `%k`: Hours in 24h format, 0 through 23
	 *
	 * - `%I`: Two digits hours in 12h format, 00 through 11
	 *
	 * - `%l`: Hours in 12h format, 1 through 12
	 *
	 * - `%M`: Two digits minutes, 00 through 59
	 *
	 * - `%p`: Upper case AM or PM
	 *
	 * - `%P`: Lower case AM or PM
	 *
	 * - `%S`: Two digits seconds, 00 through 59
	 *
	 * - `%L`: Milliseconds (naming from Ruby)
	 *
	 * @param format The desired format where various time representations are prefixed with `%`.
	 *
	 * @param timestamp The JavaScript timestamp.
	 *
	 * @param capitalize Upper case first letter in the return.
	 *
	 * @return The formatted date.
	 */
	native public static String dateFormat(String format, double timestamp);

	/**
	 * Utility method that destroys any SVGElement instances that are properties on the given object. It loops all properties and invokes destroy if there is a
	 * destroy method. The property is then delete.
	 *
	 * @param obj The object to destroy properties on.
	 *
	 * @param except Exception, do not destroy this property, only delete it.
	 */
	native public static void destroyObjectProperties(Object obj);

	/**
	 * Iterate over an array.
	 *
	 * @param arr The array to iterate over.
	 *
	 * @param fn The iterator callback. It passes three arguments:
	 *
	 *            - `item`: The array item.
	 *
	 *            - `index`: The item's index in the array.
	 *
	 *            - `arr`: The array that each is being applied to.
	 *
	 * @param ctx The context.
	 */
	native public static void each(Array<?> arr, Function fn);

	/**
	 * Provide error messages for debugging, with links to online explanation. This function can be overridden to provide custom error handling.
	 *
	 * @param code The error code. See errors.xml for available codes. If it is a string, the error message is printed directly in the console.
	 *
	 * @param stop Whether to throw an error or just log a warning in the console.
	 *
	 * @param chart Reference to the chart that causes the error. Used in 'debugger' module to display errors directly on the chart. Important note: This
	 *            argument is undefined for errors that lack access to the Chart instance.
	 *
	 * @param params Additional parameters for the generated message.
	 */
	native public static void error(double code, Boolean stop, Chart chart);

	/**
	 * Provide error messages for debugging, with links to online explanation. This function can be overridden to provide custom error handling.
	 *
	 * @param code The error code. See errors.xml for available codes. If it is a string, the error message is printed directly in the console.
	 *
	 * @param stop Whether to throw an error or just log a warning in the console.
	 *
	 * @param chart Reference to the chart that causes the error. Used in 'debugger' module to display errors directly on the chart. Important note: This
	 *            argument is undefined for errors that lack access to the Chart instance.
	 *
	 * @param params Additional parameters for the generated message.
	 */
	native public static void error(double code, Boolean stop);

	/**
	 * Provide error messages for debugging, with links to online explanation. This function can be overridden to provide custom error handling.
	 *
	 * @param code The error code. See errors.xml for available codes. If it is a string, the error message is printed directly in the console.
	 *
	 * @param stop Whether to throw an error or just log a warning in the console.
	 *
	 * @param chart Reference to the chart that causes the error. Used in 'debugger' module to display errors directly on the chart. Important note: This
	 *            argument is undefined for errors that lack access to the Chart instance.
	 *
	 * @param params Additional parameters for the generated message.
	 */
	native public static void error(double code);

	/**
	 * Fire an event that was registered with Highcharts#addEvent.
	 *
	 * @param el The object to fire the event on. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The type of event.
	 *
	 * @param eventArguments Custom event arguments that are passed on as an argument to the event handler.
	 *
	 * @param defaultFunction The default function to execute if the other listeners haven't returned false.
	 */
	native public static <T> void fireEvent(T el, String type, Event eventArguments);

	/**
	 * Fire an event that was registered with Highcharts#addEvent.
	 *
	 * @param el The object to fire the event on. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The type of event.
	 *
	 * @param eventArguments Custom event arguments that are passed on as an argument to the event handler.
	 *
	 * @param defaultFunction The default function to execute if the other listeners haven't returned false.
	 */
	native public static <T> void fireEvent(T el, String type);

	/**
	 * Format a string according to a subset of the rules of Python's String.format method.
	 *
	 * @param str The string to format.
	 *
	 * @param ctx The context, a collection of key-value pairs where each key is replaced by its value.
	 *
	 * @param chart A `Chart` instance used to get numberFormatter and time.
	 *
	 * @return The formatted string.
	 */
	native public static String format(String str, Record2<String, ?> ctx);

	/**
	 * Get the defer as a number value from series animation options.
	 *
	 * @param chart The chart instance.
	 *
	 * @param animation An animation setting. Can be an object with duration, complete and easing properties, or a boolean to enable or disable.
	 *
	 * @param series Series to defer animation.
	 *
	 * @return The numeric value.
	 */
	native public static double getDeferredAnimation(Chart chart, Boolean animation);

	/**
	 * Get the computed CSS value for given element and property, only for numerical properties. For width and height, the dimension of the inner box (excluding
	 * padding) is returned. Used for fitting the chart within the container.
	 *
	 * @param el An HTML element.
	 *
	 * @param prop The property name.
	 *
	 * @param toInt Parse to integer.
	 *
	 * @return The numeric value.
	 */
	native public static jsweet.util.union.Union<Double, String> getStyle(HTMLElement el, String prop);

	/**
	 * Search for an item in an array.
	 *
	 * @param item The item to search for.
	 *
	 * @param arr The array or node collection to search in.
	 *
	 * @param fromIndex The index to start searching from.
	 *
	 * @return The index within the array, or -1 if not found.
	 */
	native public static double inArray(Object item, Array<?> arr);

	/**
	 * Utility function to check if an item is of type object.
	 *
	 * @param obj The item to check.
	 *
	 * @param strict Also checks that the object is not an array.
	 *
	 * @return True if the argument is an object.
	 */
	native public static Boolean isObject(Object obj);

	/**
	 * Take an interval and normalize it to multiples of round numbers.
	 *
	 * @param interval The raw, un-rounded interval.
	 *
	 * @param multiples Allowed multiples.
	 *
	 * @param magnitude The magnitude of the number.
	 *
	 * @param allowDecimals Whether to allow decimals.
	 *
	 * @param hasTickAmount If it has tickAmount, avoid landing on tick intervals lower than original.
	 *
	 * @return The normalized interval.
	 */
	native public static double normalizeTickInterval(double interval, Array<?> multiples, double magnitude, Boolean allowDecimals);

	/**
	 * Take an interval and normalize it to multiples of round numbers.
	 *
	 * @param interval The raw, un-rounded interval.
	 *
	 * @param multiples Allowed multiples.
	 *
	 * @param magnitude The magnitude of the number.
	 *
	 * @param allowDecimals Whether to allow decimals.
	 *
	 * @param hasTickAmount If it has tickAmount, avoid landing on tick intervals lower than original.
	 *
	 * @return The normalized interval.
	 */
	native public static double normalizeTickInterval(double interval, Array<?> multiples, double magnitude);

	/**
	 * Take an interval and normalize it to multiples of round numbers.
	 *
	 * @param interval The raw, un-rounded interval.
	 *
	 * @param multiples Allowed multiples.
	 *
	 * @param magnitude The magnitude of the number.
	 *
	 * @param allowDecimals Whether to allow decimals.
	 *
	 * @param hasTickAmount If it has tickAmount, avoid landing on tick intervals lower than original.
	 *
	 * @return The normalized interval.
	 */
	native public static double normalizeTickInterval(double interval, Array<?> multiples);

	/**
	 * Take an interval and normalize it to multiples of round numbers.
	 *
	 * @param interval The raw, un-rounded interval.
	 *
	 * @param multiples Allowed multiples.
	 *
	 * @param magnitude The magnitude of the number.
	 *
	 * @param allowDecimals Whether to allow decimals.
	 *
	 * @param hasTickAmount If it has tickAmount, avoid landing on tick intervals lower than original.
	 *
	 * @return The normalized interval.
	 */
	native public static double normalizeTickInterval(double interval);

	/**
	 * Format a number and return a string based on input settings.
	 *
	 * @param number The input number to format.
	 *
	 * @param decimals The amount of decimals. A value of -1 preserves the amount in the input number.
	 *
	 * @param decimalPoint The decimal point, defaults to the one given in the lang options, or a dot.
	 *
	 * @param thousandsSep The thousands separator, defaults to the one given in the lang options, or a space character.
	 *
	 * @return The formatted number.
	 */
	native public static String numberFormat(double number, double decimals, String decimalPoint);

	/**
	 * Format a number and return a string based on input settings.
	 *
	 * @param number The input number to format.
	 *
	 * @param decimals The amount of decimals. A value of -1 preserves the amount in the input number.
	 *
	 * @param decimalPoint The decimal point, defaults to the one given in the lang options, or a dot.
	 *
	 * @param thousandsSep The thousands separator, defaults to the one given in the lang options, or a space character.
	 *
	 * @return The formatted number.
	 */
	native public static String numberFormat(double number, double decimals);

	/**
	 * Iterate over object key pairs in an object.
	 *
	 * @param obj The object to iterate over.
	 *
	 * @param fn The iterator callback. It passes three arguments:
	 *
	 *            * value - The property value.
	 *
	 *            * key - The property key.
	 *
	 *            * obj - The object that objectEach is being applied to.
	 *
	 * @param ctx The context.
	 */
	native public static <T> void objectEach(Object obj, Consumer4<T, Object, String, Object> fn);

	/**
	 * Left-pad a string to a given length by adding a character repetetively.
	 *
	 * @param number The input string or number.
	 *
	 * @param length The desired string length.
	 *
	 * @param padder The character to pad with.
	 *
	 * @return The padded string.
	 */
	native public static String pad(double number, double length);

	/**
	 * Left-pad a string to a given length by adding a character repetetively.
	 *
	 * @param number The input string or number.
	 *
	 * @param length The desired string length.
	 *
	 * @param padder The character to pad with.
	 *
	 * @return The padded string.
	 */
	native public static String pad(double number);

	/**
	 * Return a length based on either the integer value, or a percentage of a base.
	 *
	 * @param value A percentage string or a number.
	 *
	 * @param base The full length that represents 100%.
	 *
	 * @param offset A pixel offset to apply for percentage values. Used internally in axis positioning.
	 *
	 * @return The computed length.
	 */
	native public static double relativeLength(double value, double base);

	/**
	 * Remove an event that was added with Highcharts#addEvent.
	 *
	 * @param el The element to remove events on.
	 *
	 * @param type The type of events to remove. If undefined, all events are removed from the element.
	 *
	 * @param fn The specific callback to remove. If undefined, all events that match the element and optionally the type are removed.
	 */
	native public static <T> void removeEvent(T el, String type);

	/**
	 * Remove an event that was added with Highcharts#addEvent.
	 *
	 * @param el The element to remove events on.
	 *
	 * @param type The type of events to remove. If undefined, all events are removed from the element.
	 *
	 * @param fn The specific callback to remove. If undefined, all events that match the element and optionally the type are removed.
	 */
	native public static <T> void removeEvent(T el);

	/**
	 * Factory to create new series prototypes.
	 *
	 * @param type The series type name.
	 *
	 * @param parent The parent series type name. Use `line` to inherit from the basic Series object.
	 *
	 * @param options The additional default options that are merged with the parent's options.
	 *
	 * @param props The properties (functions and primitives) to set on the new prototype.
	 *
	 * @param pointProps Members for a series-specific extension of the Point prototype if needed.
	 *
	 * @return The newly created prototype as extended from Series or its derivatives.
	 */
	native public static Series seriesType(String type, String parent, SeriesOptionsRegistry options, Dictionary<?> props);

	/**
	 * Factory to create new series prototypes.
	 *
	 * @param type The series type name.
	 *
	 * @param parent The parent series type name. Use `line` to inherit from the basic Series object.
	 *
	 * @param options The additional default options that are merged with the parent's options.
	 *
	 * @param props The properties (functions and primitives) to set on the new prototype.
	 *
	 * @param pointProps Members for a series-specific extension of the Point prototype if needed.
	 *
	 * @return The newly created prototype as extended from Series or its derivatives.
	 */
	native public static Series seriesType(String type, String parent, SeriesOptionsRegistry options);

	/**
	 * Stop running animation.
	 *
	 * @param el The SVGElement to stop animation on.
	 *
	 * @param prop The property to stop animating. If given, the stop method will stop a single property from animating, while others continue.
	 */
	native public static void stop(SVGElement2 el);

	/**
	 * Set a timeout if the delay is given, otherwise perform the function synchronously.
	 *
	 * @param fn The function callback.
	 *
	 * @param delay Delay in milliseconds.
	 *
	 * @param context An optional context to send to the function callback.
	 *
	 * @return An identifier for the timeout that can later be cleared with Highcharts.clearTimeout. Returns -1 if there is no timeout.
	 */
	native public static double syncTimeout(Function fn, double delay);

	/**
	 * Activates a serial mode for element IDs provided by Highcharts.uniqueKey. This mode can be used in automated tests, where a simple comparison of two
	 * rendered SVG graphics is needed.
	 *
	 * **Note:** This is only for testing purposes and will break functionality in webpages with multiple charts.
	 *
	 * @param mode Changes the state of serial mode.
	 *
	 * @return State of the serial mode.
	 */
	native public static jsweet.util.union.Union<Boolean, Object> useSerialIds();

	/**
	 * Remove an event that was added with Highcharts#addEvent.
	 *
	 * @param el The element to remove events on.
	 *
	 * @param type The type of events to remove. If undefined, all events are removed from the element.
	 *
	 * @param fn The specific callback to remove. If undefined, all events that match the element and optionally the type are removed.
	 */
	native public static <T> void removeEvent(T el, String type, java.util.function.Function<T, Boolean> fn);

	/**
	 * Wrap a method with extended functionality, preserving the original function.
	 *
	 * @param obj The context object that the method belongs to. In real cases, this is often a prototype.
	 *
	 * @param method The name of the method to extend.
	 *
	 * @param func A wrapper function callback. This function is called with the same arguments as the original function, except that the original function is
	 *            unshifted and passed as the first argument.
	 */
	native public static void wrap(Object obj, String method, java.util.function.BiFunction<Object, Object, Object> func);

	/**
	 * Wrap a method with extended functionality, preserving the original function.
	 *
	 * @param obj The context object that the method belongs to. In real cases, this is often a prototype.
	 *
	 * @param method The name of the method to extend.
	 *
	 * @param func A wrapper function callback. This function is called with the same arguments as the original function, except that the original function is
	 *            unshifted and passed as the first argument.
	 */
	native public static void wrap(Object obj, String method, java.util.function.Function<Object, Object> func);

	/**
	 * Wrap a method with extended functionality, preserving the original function.
	 *
	 * @param obj The context object that the method belongs to. In real cases, this is often a prototype.
	 *
	 * @param method The name of the method to extend.
	 *
	 * @param func A wrapper function callback. This function is called with the same arguments as the original function, except that the original function is
	 *            unshifted and passed as the first argument.
	 */
	native public static void wrap(Object obj, String method, java.util.function.Supplier<Object> func);

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	@jsweet.lang.Name("addEvent")
	native public static <T> Function addEventFnBiFunction(Class<T> el, String type, java.util.function.BiFunction<T, Event, Boolean> fn,
			EventOptionsObject options);

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	@jsweet.lang.Name("addEvent")
	native public static <T> Function addEventFnDictionaryAnyBiFunction(Class<T> el, String type, java.util.function.BiFunction<T, Dictionary<?>, Boolean> fn,
			EventOptionsObject options);

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	@jsweet.lang.Name("addEvent")
	native public static <T> Function addEventFnDictionaryAnyBiFunction(T el, String type, java.util.function.BiFunction<T, Dictionary<?>, Boolean> fn,
			EventOptionsObject options);

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	@jsweet.lang.Name("addEvent")
	native public static <T> Function addEventFnBiFunction(T el, String type, java.util.function.BiFunction<T, Event, Boolean> fn, EventOptionsObject options);

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	native public static <T> Function addEvent(Class<T> el, String type, Function fn, EventOptionsObject options);

	/**
	 * The global animate method, which uses Fx to create individual animators.
	 *
	 * @param el The element to animate.
	 *
	 * @param params An object containing key-value pairs of the properties to animate. Supports numeric as pixel-based CSS properties for HTML objects and
	 *            attributes for SVGElements.
	 *
	 * @param opt Animation options.
	 */
	native public static void animate(HTMLElement el, SVGAttributes params, Partial2<AnimationOptionsObject> opt);

	/**
	 * The global animate method, which uses Fx to create individual animators.
	 *
	 * @param el The element to animate.
	 *
	 * @param params An object containing key-value pairs of the properties to animate. Supports numeric as pixel-based CSS properties for HTML objects and
	 *            attributes for SVGElements.
	 *
	 * @param opt Animation options.
	 */
	native public static void animate(SVGElement2 el, SVGAttributes params, Partial2<AnimationOptionsObject> opt);

	/**
	 * The global animate method, which uses Fx to create individual animators.
	 *
	 * @param el The element to animate.
	 *
	 * @param params An object containing key-value pairs of the properties to animate. Supports numeric as pixel-based CSS properties for HTML objects and
	 *            attributes for SVGElements.
	 *
	 * @param opt Animation options.
	 */
	native public static void animate(SVGElement2 el, CSSObject params, Partial2<AnimationOptionsObject> opt);

	/**
	 * Get the animation in object form, where a disabled animation is always returned as `{ duration: 0 }`.
	 *
	 * @param animation An animation setting. Can be an object with duration, complete and easing properties, or a boolean to enable or disable.
	 *
	 * @return An object with at least a duration property.
	 */
	native public static AnimationOptionsObject animObject(AnimationOptionsObject animation);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(HTMLElement elem, Dictionary<?> prop, String value);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(GlobalSVGElement elem, Dictionary<?> prop, double value);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(GlobalSVGElement elem, String prop, String value);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(GlobalSVGElement elem, SVGAttributes prop, double value);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(GlobalSVGElement elem, String prop, double value);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(HTMLElement elem, String prop, String value);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(HTMLElement elem, SVGAttributes prop, String value);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(HTMLElement elem, SVGAttributes prop, double value);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	// native public static Union3<String, Object, Object> attr(GlobalSVGElement elem, Dictionary<?> prop, String value);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(HTMLElement elem, Dictionary<?> prop, double value);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	// native public static Union3<String, Object, Object> attr(GlobalSVGElement elem, SVGAttributes prop, String value);

	/**
	 * Factory function for basic charts.
	 *
	 * @param renderTo The DOM element to render to, or its id.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 *
	 * @return Returns the Chart object.
	 */
	native public static Chart chart(HTMLElement renderTo, Options options, java.util.function.Consumer<Chart> callback);

	/**
	 * Creates a color instance out of a color string.
	 *
	 * @param input The input color in either rbga or hex format
	 *
	 * @return Color instance
	 */
	native public static Color color(GradientColorObject input);

	/**
	 * Creates a color instance out of a color string.
	 *
	 * @param input The input color in either rbga or hex format
	 *
	 * @return Color instance
	 */
	native public static Color color(PatternObject input);

	/**
	 * Set CSS on a given element.
	 *
	 * @param el An HTML DOM element.
	 *
	 * @param styles Style object with camel case property names.
	 */
	// native public static void css(GlobalSVGElement el, CSSObject styles);

	/**
	 * Provide error messages for debugging, with links to online explanation. This function can be overridden to provide custom error handling.
	 *
	 * @param code The error code. See errors.xml for available codes. If it is a string, the error message is printed directly in the console.
	 *
	 * @param stop Whether to throw an error or just log a warning in the console.
	 *
	 * @param chart Reference to the chart that causes the error. Used in 'debugger' module to display errors directly on the chart. Important note: This
	 *            argument is undefined for errors that lack access to the Chart instance.
	 *
	 * @param params Additional parameters for the generated message.
	 */
	native public static void error(String code, Boolean stop, Chart chart, Dictionary<String> params);

	/**
	 * Utility function to extend an object with the members of another.
	 *
	 * @param a The object to be extended.
	 *
	 * @param b The object to add to the first one.
	 *
	 * @return Object a, the original object.
	 */
	native public static <T> T extend(Object a, object b);

	/**
	 * Fire an event that was registered with Highcharts#addEvent.
	 *
	 * @param el The object to fire the event on. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The type of event.
	 *
	 * @param eventArguments Custom event arguments that are passed on as an argument to the event handler.
	 *
	 * @param defaultFunction The default function to execute if the other listeners haven't returned false.
	 */
	native public static <T> void fireEvent(T el, String type, Dictionary<?> eventArguments, Function defaultFunction);

	/**
	 * Fire an event that was registered with Highcharts#addEvent.
	 *
	 * @param el The object to fire the event on. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The type of event.
	 *
	 * @param eventArguments Custom event arguments that are passed on as an argument to the event handler.
	 *
	 * @param defaultFunction The default function to execute if the other listeners haven't returned false.
	 */
	@jsweet.lang.Name("fireEvent")
	native public static <T> void fireEventDefaultFunctionBiFunction(T el, String type, Dictionary<?> eventArguments,
			java.util.function.BiFunction<T, Event, Boolean> defaultFunction);

	/**
	 * Fire an event that was registered with Highcharts#addEvent.
	 *
	 * @param el The object to fire the event on. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The type of event.
	 *
	 * @param eventArguments Custom event arguments that are passed on as an argument to the event handler.
	 *
	 * @param defaultFunction The default function to execute if the other listeners haven't returned false.
	 */
	@jsweet.lang.Name("fireEvent")
	native public static <T> void fireEventDefaultFunctionDictionaryAnyBiFunction(T el, String type, Dictionary<?> eventArguments,
			java.util.function.BiFunction<T, Dictionary<?>, Boolean> defaultFunction);

	/**
	 * Fire an event that was registered with Highcharts#addEvent.
	 *
	 * @param el The object to fire the event on. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The type of event.
	 *
	 * @param eventArguments Custom event arguments that are passed on as an argument to the event handler.
	 *
	 * @param defaultFunction The default function to execute if the other listeners haven't returned false.
	 */
	@jsweet.lang.Name("fireEvent")
	native public static <T> void fireEventDefaultFunctionDictionaryAnyBiFunction(T el, String type, Event eventArguments,
			java.util.function.BiFunction<T, Dictionary<?>, Boolean> defaultFunction);

	/**
	 * Fire an event that was registered with Highcharts#addEvent.
	 *
	 * @param el The object to fire the event on. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The type of event.
	 *
	 * @param eventArguments Custom event arguments that are passed on as an argument to the event handler.
	 *
	 * @param defaultFunction The default function to execute if the other listeners haven't returned false.
	 */
	@jsweet.lang.Name("fireEvent")
	native public static <T> void fireEventDefaultFunctionBiFunction(T el, String type, Event eventArguments,
			java.util.function.BiFunction<T, Event, Boolean> defaultFunction);

	/**
	 * Get the defer as a number value from series animation options.
	 *
	 * @param chart The chart instance.
	 *
	 * @param animation An animation setting. Can be an object with duration, complete and easing properties, or a boolean to enable or disable.
	 *
	 * @param series Series to defer animation.
	 *
	 * @return The numeric value.
	 */
	native public static double getDeferredAnimation(Chart chart, AnimationOptionsObject animation, Series series);

	/**
	 * Utility function to check if an Object is a class.
	 *
	 * @param obj The item to check.
	 *
	 * @return True if the argument is a class.
	 */
	native public static Boolean isClass(Object obj);

	/**
	 * Utility function to deep merge two or more objects and return a third object. The merge function can also be used with a single object argument to create
	 * a deep copy of an object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	native public static <T> T merge(Object a, ArrayUndefined... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. The merge function can also be used with a single object argument to create
	 * a deep copy of an object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	native public static <T> T merge(Object a, Array<Object>... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. The merge function can also be used with a single object argument to create
	 * a deep copy of an object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	// native public static <T> T merge(T a, ArrayUndefined... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. If the first argument is true, the contents of the second object is copied
	 * into the first object. The merge function can also be used with a single object argument to create a deep copy of an object.
	 *
	 * @param extend Whether to extend the left-side object (a) or return a whole new object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	native public static <T> T merge(Boolean extend, T a, ArrayUndefined... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. If the first argument is true, the contents of the second object is copied
	 * into the first object. The merge function can also be used with a single object argument to create a deep copy of an object.
	 *
	 * @param extend Whether to extend the left-side object (a) or return a whole new object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	native public static <T> T merge(Boolean extend, Object a, Array<Object>... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. If the first argument is true, the contents of the second object is copied
	 * into the first object. The merge function can also be used with a single object argument to create a deep copy of an object.
	 *
	 * @param extend Whether to extend the left-side object (a) or return a whole new object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	// native public static <T> T merge(Boolean extend, Object a, ArrayUndefined... n);

	/**
	 * Return the first value that is not null or undefined.
	 *
	 * @param items Variable number of arguments to inspect.
	 *
	 * @return The value of the first argument that is not null or undefined.
	 */
	native public static <T> T pick(ArrayUndefined... items);

	/**
	 * Return the first value that is not null or undefined.
	 *
	 * @param items Variable number of arguments to inspect.
	 *
	 * @return The value of the first argument that is not null or undefined.
	 */
	native public static <T> T pick(ArrayNull... items);

	/**
	 * Return a length based on either the integer value, or a percentage of a base.
	 *
	 * @param value A percentage string or a number.
	 *
	 * @param base The full length that represents 100%.
	 *
	 * @param offset A pixel offset to apply for percentage values. Used internally in axis positioning.
	 *
	 * @return The computed length.
	 */
	native public static double relativeLength(String value, double base, double offset);

	/**
	 * Remove an event that was added with Highcharts#addEvent.
	 *
	 * @param el The element to remove events on.
	 *
	 * @param type The type of events to remove. If undefined, all events are removed from the element.
	 *
	 * @param fn The specific callback to remove. If undefined, all events that match the element and optionally the type are removed.
	 */
	@jsweet.lang.Name("removeEvent")
	native public static <T> void removeEventFnDictionaryAnyBiFunction(Class<T> el, String type, java.util.function.BiFunction<T, Dictionary<?>, Boolean> fn);

	/**
	 * Remove an event that was added with Highcharts#addEvent.
	 *
	 * @param el The element to remove events on.
	 *
	 * @param type The type of events to remove. If undefined, all events are removed from the element.
	 *
	 * @param fn The specific callback to remove. If undefined, all events that match the element and optionally the type are removed.
	 */
	@jsweet.lang.Name("removeEvent")
	native public static <T> void removeEventFnBiFunction(Class<T> el, String type, java.util.function.BiFunction<T, Event, Boolean> fn);

	/**
	 * Remove an event that was added with Highcharts#addEvent.
	 *
	 * @param el The element to remove events on.
	 *
	 * @param type The type of events to remove. If undefined, all events are removed from the element.
	 *
	 * @param fn The specific callback to remove. If undefined, all events that match the element and optionally the type are removed.
	 */
	@jsweet.lang.Name("removeEvent")
	native public static <T> void removeEventFnDictionaryAnyBiFunction(T el, String type, java.util.function.BiFunction<T, Dictionary<?>, Boolean> fn);

	/**
	 * Factory to create new series prototypes.
	 *
	 * @param type The series type name.
	 *
	 * @param parent The parent series type name. Use `line` to inherit from the basic Series object.
	 *
	 * @param options The additional default options that are merged with the parent's options.
	 *
	 * @param props The properties (functions and primitives) to set on the new prototype.
	 *
	 * @param pointProps Members for a series-specific extension of the Point prototype if needed.
	 *
	 * @return The newly created prototype as extended from Series or its derivatives.
	 */
	native public static Series seriesType(String type, String parent, Dictionary<?> options, Dictionary<?> props, Dictionary<?> pointProps);

	/**
	 * Set the global animation to either a given value, or fall back to the given chart's animation option.
	 *
	 * @param animation The animation object.
	 *
	 * @param chart The chart instance.
	 */
	native public static void setAnimation(Object animation, Chart chart);

	/**
	 * Set the global animation to either a given value, or fall back to the given chart's animation option.
	 *
	 * @param animation The animation object.
	 *
	 * @param chart The chart instance.
	 */
	native public static void setAnimation(Partial2<AnimationOptionsObject> animation, Chart chart);

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	native public static <T> Function addEvent(Class<T> el, String type, Function fn);

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	@jsweet.lang.Name("addEvent")
	native public static <T> Function addEventFnDictionaryAnyBiFunction(T el, String type, java.util.function.BiFunction<T, Dictionary<?>, Boolean> fn);

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	@jsweet.lang.Name("addEvent")
	native public static <T> Function addEventFnBiFunction(T el, String type, java.util.function.BiFunction<T, Event, Boolean> fn);

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	@jsweet.lang.Name("addEvent")
	native public static <T> Function addEventFnDictionaryAnyBiFunction(Class<T> el, String type, java.util.function.BiFunction<T, Dictionary<?>, Boolean> fn);

	/**
	 * Add an event listener.
	 *
	 * @param el The element or object to add a listener to. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The event type.
	 *
	 * @param fn The function callback to execute when the event is fired.
	 *
	 * @param options Options for adding the event.
	 *
	 * @return A callback function to remove the added event.
	 */
	@jsweet.lang.Name("addEvent")
	native public static <T> Function addEventFnBiFunction(Class<T> el, String type, java.util.function.BiFunction<T, Event, Boolean> fn);

	/**
	 * The global animate method, which uses Fx to create individual animators.
	 *
	 * @param el The element to animate.
	 *
	 * @param params An object containing key-value pairs of the properties to animate. Supports numeric as pixel-based CSS properties for HTML objects and
	 *            attributes for SVGElements.
	 *
	 * @param opt Animation options.
	 */
	native public static void animate(SVGElement2 el, SVGAttributes params);

	/**
	 * The global animate method, which uses Fx to create individual animators.
	 *
	 * @param el The element to animate.
	 *
	 * @param params An object containing key-value pairs of the properties to animate. Supports numeric as pixel-based CSS properties for HTML objects and
	 *            attributes for SVGElements.
	 *
	 * @param opt Animation options.
	 */
	native public static void animate(HTMLElement el, SVGAttributes params);

	/**
	 * The global animate method, which uses Fx to create individual animators.
	 *
	 * @param el The element to animate.
	 *
	 * @param params An object containing key-value pairs of the properties to animate. Supports numeric as pixel-based CSS properties for HTML objects and
	 *            attributes for SVGElements.
	 *
	 * @param opt Animation options.
	 */
	native public static void animate(SVGElement2 el, CSSObject params);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(GlobalSVGElement elem, Dictionary<?> prop);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(GlobalSVGElement elem, String prop);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(HTMLElement elem, SVGAttributes prop);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(HTMLElement elem, Dictionary<?> prop);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(GlobalSVGElement elem, SVGAttributes prop);

	/**
	 * Set or get an attribute or an object of attributes. To use as a setter, pass a key and a value, or let the second argument be a collection of keys and
	 * values. To use as a getter, pass only a string as the second argument.
	 *
	 * @param elem The DOM element to receive the attribute(s).
	 *
	 * @param prop The property or an object of key-value pairs.
	 *
	 * @param value The value if a single property is set.
	 *
	 * @return When used as a getter, return the value.
	 */
	native public static Union3<String, Object, Object> attr(GlobalSVGElement elem);

	/**
	 * Factory function for basic charts.
	 *
	 * @param renderTo The DOM element to render to, or its id.
	 *
	 * @param options The chart options structure.
	 *
	 * @param callback Function to run when the chart has loaded and and all external images are loaded. Defining a chart.events.load handler is equivalent.
	 *
	 * @return Returns the Chart object.
	 */
	native public static Chart chart(HTMLElement renderTo, Options options);

	/**
	 * Provide error messages for debugging, with links to online explanation. This function can be overridden to provide custom error handling.
	 *
	 * @param code The error code. See errors.xml for available codes. If it is a string, the error message is printed directly in the console.
	 *
	 * @param stop Whether to throw an error or just log a warning in the console.
	 *
	 * @param chart Reference to the chart that causes the error. Used in 'debugger' module to display errors directly on the chart. Important note: This
	 *            argument is undefined for errors that lack access to the Chart instance.
	 *
	 * @param params Additional parameters for the generated message.
	 */
	native public static void error(String code, Boolean stop, Chart chart);

	/**
	 * Provide error messages for debugging, with links to online explanation. This function can be overridden to provide custom error handling.
	 *
	 * @param code The error code. See errors.xml for available codes. If it is a string, the error message is printed directly in the console.
	 *
	 * @param stop Whether to throw an error or just log a warning in the console.
	 *
	 * @param chart Reference to the chart that causes the error. Used in 'debugger' module to display errors directly on the chart. Important note: This
	 *            argument is undefined for errors that lack access to the Chart instance.
	 *
	 * @param params Additional parameters for the generated message.
	 */
	native public static void error(String code, Boolean stop);

	/**
	 * Provide error messages for debugging, with links to online explanation. This function can be overridden to provide custom error handling.
	 *
	 * @param code The error code. See errors.xml for available codes. If it is a string, the error message is printed directly in the console.
	 *
	 * @param stop Whether to throw an error or just log a warning in the console.
	 *
	 * @param chart Reference to the chart that causes the error. Used in 'debugger' module to display errors directly on the chart. Important note: This
	 *            argument is undefined for errors that lack access to the Chart instance.
	 *
	 * @param params Additional parameters for the generated message.
	 */
	native public static void error(String code);

	/**
	 * Fire an event that was registered with Highcharts#addEvent.
	 *
	 * @param el The object to fire the event on. It can be a HTMLDOMElement, an SVGElement or any other object.
	 *
	 * @param type The type of event.
	 *
	 * @param eventArguments Custom event arguments that are passed on as an argument to the event handler.
	 *
	 * @param defaultFunction The default function to execute if the other listeners haven't returned false.
	 */
	native public static <T> void fireEvent(T el, String type, Dictionary<?> eventArguments);

	/**
	 * Get the defer as a number value from series animation options.
	 *
	 * @param chart The chart instance.
	 *
	 * @param animation An animation setting. Can be an object with duration, complete and easing properties, or a boolean to enable or disable.
	 *
	 * @param series Series to defer animation.
	 *
	 * @return The numeric value.
	 */
	native public static double getDeferredAnimation(Chart chart, AnimationOptionsObject animation);

	/**
	 * Return a length based on either the integer value, or a percentage of a base.
	 *
	 * @param value A percentage string or a number.
	 *
	 * @param base The full length that represents 100%.
	 *
	 * @param offset A pixel offset to apply for percentage values. Used internally in axis positioning.
	 *
	 * @return The computed length.
	 */
	native public static double relativeLength(String value, double base);

	/**
	 * Remove an event that was added with Highcharts#addEvent.
	 *
	 * @param el The element to remove events on.
	 *
	 * @param type The type of events to remove. If undefined, all events are removed from the element.
	 *
	 * @param fn The specific callback to remove. If undefined, all events that match the element and optionally the type are removed.
	 */
	native public static <T> void removeEvent(Class<T> el, String type);

	/**
	 * Remove an event that was added with Highcharts#addEvent.
	 *
	 * @param el The element to remove events on.
	 *
	 * @param type The type of events to remove. If undefined, all events are removed from the element.
	 *
	 * @param fn The specific callback to remove. If undefined, all events that match the element and optionally the type are removed.
	 */
	native public static <T> void removeEvent(Class<T> el);

	/**
	 * Factory to create new series prototypes.
	 *
	 * @param type The series type name.
	 *
	 * @param parent The parent series type name. Use `line` to inherit from the basic Series object.
	 *
	 * @param options The additional default options that are merged with the parent's options.
	 *
	 * @param props The properties (functions and primitives) to set on the new prototype.
	 *
	 * @param pointProps Members for a series-specific extension of the Point prototype if needed.
	 *
	 * @return The newly created prototype as extended from Series or its derivatives.
	 */
	native public static Series seriesType(String type, String parent, Dictionary<?> options, Dictionary<?> props);

	/**
	 * Factory to create new series prototypes.
	 *
	 * @param type The series type name.
	 *
	 * @param parent The parent series type name. Use `line` to inherit from the basic Series object.
	 *
	 * @param options The additional default options that are merged with the parent's options.
	 *
	 * @param props The properties (functions and primitives) to set on the new prototype.
	 *
	 * @param pointProps Members for a series-specific extension of the Point prototype if needed.
	 *
	 * @return The newly created prototype as extended from Series or its derivatives.
	 */
	native public static Series seriesType(String type, String parent, Dictionary<?> options);

	/**
	 * Remove an event that was added with Highcharts#addEvent.
	 *
	 * @param el The element to remove events on.
	 *
	 * @param type The type of events to remove. If undefined, all events are removed from the element.
	 *
	 * @param fn The specific callback to remove. If undefined, all events that match the element and optionally the type are removed.
	 */
	native public static <T> void removeEvent(Class<T> el, String type, java.util.function.Function<T, Boolean> fn);

	/**
	 * Non-recursive method to find the lowest member of an array. `Math.max` raises a maximum call stack size exceeded error in Chrome when trying to apply
	 * more than 150.000 points. This method is slightly slower, but safe.
	 *
	 * @param data An array of numbers.
	 *
	 * @return The highest number.
	 */
	native public static double arrayMax(Object[] data);

	/**
	 * Non-recursive method to find the lowest member of an array. `Math.min` raises a maximum call stack size exceeded error in Chrome when trying to apply
	 * more than 150.000 points. This method is slightly slower, but safe.
	 *
	 * @param data An array of numbers.
	 *
	 * @return The lowest number.
	 */
	native public static double arrayMin(Object[] data);

	/**
	 * Iterate over an array.
	 *
	 * @param arr The array to iterate over.
	 *
	 * @param fn The iterator callback. It passes three arguments:
	 *
	 *            - `item`: The array item.
	 *
	 *            - `index`: The item's index in the array.
	 *
	 *            - `arr`: The array that each is being applied to.
	 *
	 * @param ctx The context.
	 */
	native public static void each(Object[] arr, Function fn, Object ctx);

	/**
	 * Remove the last occurence of an item from an array.
	 *
	 * @param arr The array.
	 *
	 * @param item The item to remove.
	 */
	native public static void erase(Object[] arr, Object item);

	/**
	 * Return the value of the first element in the array that satisfies the provided testing function.
	 *
	 * @param arr The array to test.
	 *
	 * @param callback The callback function. The function receives the item as the first argument. Return `true` if this item satisfies the condition.
	 *
	 * @return The value of the element.
	 */
	native public static <T> jsweet.util.union.Union<T, Object> find(T[] arr, Function callback);

	/**
	 * Filter an array by a callback.
	 *
	 * @param arr The array to filter.
	 *
	 * @param callback The callback function. The function receives the item as the first argument. Return `true` if the item is to be preserved.
	 *
	 * @return A new, filtered array.
	 */
	native public static Array<?> grep(Object[] arr, Function callback);

	/**
	 * Search for an item in an array.
	 *
	 * @param item The item to search for.
	 *
	 * @param arr The array or node collection to search in.
	 *
	 * @param fromIndex The index to start searching from.
	 *
	 * @return The index within the array, or -1 if not found.
	 */
	native public static double inArray(Object item, Object[] arr, double fromIndex);

	/**
	 * Map an array by a callback.
	 *
	 * @param arr The array to map.
	 *
	 * @param fn The callback function. Return the new value for the new array.
	 *
	 * @return A new array item with modified items.
	 */
	native public static Array<?> map(Object[] arr, Function fn);

	/**
	 * Utility function to deep merge two or more objects and return a third object. The merge function can also be used with a single object argument to create
	 * a deep copy of an object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	// native public static <T> T merge(T a, Object... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. If the first argument is true, the contents of the second object is copied
	 * into the first object. The merge function can also be used with a single object argument to create a deep copy of an object.
	 *
	 * @param extend Whether to extend the left-side object (a) or return a whole new object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	// native public static <T> T merge(Boolean extend, T a, object... n);

	/**
	 * Take an interval and normalize it to multiples of round numbers.
	 *
	 * @param interval The raw, un-rounded interval.
	 *
	 * @param multiples Allowed multiples.
	 *
	 * @param magnitude The magnitude of the number.
	 *
	 * @param allowDecimals Whether to allow decimals.
	 *
	 * @param hasTickAmount If it has tickAmount, avoid landing on tick intervals lower than original.
	 *
	 * @return The normalized interval.
	 */
	native public static double normalizeTickInterval(double interval, Object[] multiples, double magnitude, Boolean allowDecimals, Boolean hasTickAmount);

	/**
	 * Return the first value that is not null or undefined.
	 *
	 * @param items Variable number of arguments to inspect.
	 *
	 * @return The value of the first argument that is not null or undefined.
	 */
	native public static <T> T pick(@SuppressWarnings("unchecked") T... items);

	/**
	 * Reduce an array to a single value.
	 *
	 * @param arr The array to reduce.
	 *
	 * @param fn The callback function. Return the reduced value. Receives 4 arguments: Accumulated/reduced value, current value, current array index, and the
	 *            array.
	 *
	 * @param initialValue The initial value of the accumulator.
	 *
	 * @return The reduced value.
	 */
	native public static Object reduce(Object[] arr, Function fn, Object initialValue);

	/**
	 * Test whether at least one element in the array passes the test implemented by the provided function.
	 *
	 * @param arr The array to test
	 *
	 * @param fn The function to run on each item. Return truty to pass the test. Receives arguments `currentValue`, `index` and `array`.
	 *
	 * @param ctx The context.
	 */
	native public static Boolean some(Object[] arr, Function fn, Object ctx);

	/**
	 * Sort an object array and keep the order of equal items. The ECMAScript standard does not specify the behaviour when items are equal.
	 *
	 * @param arr The array to sort.
	 *
	 * @param sortFunction The function to sort it with, like with regular Array.prototype.sort.
	 */
	native public static void stableSort(Object[] arr, Function sortFunction);

	/**
	 * Iterate over an array.
	 *
	 * @param arr The array to iterate over.
	 *
	 * @param fn The iterator callback. It passes three arguments:
	 *
	 *            - `item`: The array item.
	 *
	 *            - `index`: The item's index in the array.
	 *
	 *            - `arr`: The array that each is being applied to.
	 *
	 * @param ctx The context.
	 */
	native public static void each(Object[] arr, Function fn);

	/**
	 * Search for an item in an array.
	 *
	 * @param item The item to search for.
	 *
	 * @param arr The array or node collection to search in.
	 *
	 * @param fromIndex The index to start searching from.
	 *
	 * @return The index within the array, or -1 if not found.
	 */
	native public static double inArray(Object item, Object[] arr);

	/**
	 * Take an interval and normalize it to multiples of round numbers.
	 *
	 * @param interval The raw, un-rounded interval.
	 *
	 * @param multiples Allowed multiples.
	 *
	 * @param magnitude The magnitude of the number.
	 *
	 * @param allowDecimals Whether to allow decimals.
	 *
	 * @param hasTickAmount If it has tickAmount, avoid landing on tick intervals lower than original.
	 *
	 * @return The normalized interval.
	 */
	native public static double normalizeTickInterval(double interval, Object[] multiples, double magnitude, Boolean allowDecimals);

	/**
	 * Take an interval and normalize it to multiples of round numbers.
	 *
	 * @param interval The raw, un-rounded interval.
	 *
	 * @param multiples Allowed multiples.
	 *
	 * @param magnitude The magnitude of the number.
	 *
	 * @param allowDecimals Whether to allow decimals.
	 *
	 * @param hasTickAmount If it has tickAmount, avoid landing on tick intervals lower than original.
	 *
	 * @return The normalized interval.
	 */
	native public static double normalizeTickInterval(double interval, Object[] multiples, double magnitude);

	/**
	 * Take an interval and normalize it to multiples of round numbers.
	 *
	 * @param interval The raw, un-rounded interval.
	 *
	 * @param multiples Allowed multiples.
	 *
	 * @param magnitude The magnitude of the number.
	 *
	 * @param allowDecimals Whether to allow decimals.
	 *
	 * @param hasTickAmount If it has tickAmount, avoid landing on tick intervals lower than original.
	 *
	 * @return The normalized interval.
	 */
	native public static double normalizeTickInterval(double interval, Object[] multiples);

	/**
	 * Utility function to deep merge two or more objects and return a third object. The merge function can also be used with a single object argument to create
	 * a deep copy of an object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	native public static <T> T merge(Object a, Object... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. The merge function can also be used with a single object argument to create
	 * a deep copy of an object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	// native public static <T> T merge(Object a, object... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. The merge function can also be used with a single object argument to create
	 * a deep copy of an object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	// native public static <T> T merge(T a, Object... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. If the first argument is true, the contents of the second object is copied
	 * into the first object. The merge function can also be used with a single object argument to create a deep copy of an object.
	 *
	 * @param extend Whether to extend the left-side object (a) or return a whole new object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	native public static <T> T merge(Boolean extend, T a, Object... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. If the first argument is true, the contents of the second object is copied
	 * into the first object. The merge function can also be used with a single object argument to create a deep copy of an object.
	 *
	 * @param extend Whether to extend the left-side object (a) or return a whole new object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	// native public static <T> T merge(Boolean extend, Object a, Object... n);

	/**
	 * Utility function to deep merge two or more objects and return a third object. If the first argument is true, the contents of the second object is copied
	 * into the first object. The merge function can also be used with a single object argument to create a deep copy of an object.
	 *
	 * @param extend Whether to extend the left-side object (a) or return a whole new object.
	 *
	 * @param a The first object to extend. When only this is given, the function returns a deep copy.
	 *
	 * @param n An object to merge into the previous one.
	 *
	 * @return The merged object. If the first argument is true, the return is the same as the second argument.
	 */
	// native public static <T> T merge(Boolean extend, Object a, Object... n);

	/**
	 * Return the first value that is not null or undefined.
	 *
	 * @param items Variable number of arguments to inspect.
	 *
	 * @return The value of the first argument that is not null or undefined.
	 */
	// native public static <T> T pick(Object... items);

	/**
	 * Return the first value that is not null or undefined.
	 *
	 * @param items Variable number of arguments to inspect.
	 *
	 * @return The value of the first argument that is not null or undefined.
	 */
	// native public static <T> T pick(Object... items);

	// /** This class was automatically generated for disambiguating erased method signatures. */
	// @jsweet.lang.Erased
	// public static class Array<Object> extends def.js.Object {
	// public Array<Object>(Array<object>... n) {
	// }
	// }

	/** This class was automatically generated for disambiguating erased method signatures. */
	@jsweet.lang.Erased
	public static class ArrayUndefined extends def.js.Object {
		public ArrayUndefined(Array<Object>... n) {
		}
	}

	/** This class was automatically generated for disambiguating erased method signatures. */
	@jsweet.lang.Erased
	public static class ArrayNull extends def.js.Object {
		public ArrayNull(Array<Object>... items) {
		}
	}

	/** This class was automatically generated for disambiguating erased method signatures. */
	@jsweet.lang.Erased
	public static class ArrayT<T> extends def.js.Object {
		public ArrayT(@SuppressWarnings("unchecked") Array<T>... items) {
		}
	}
}
