package def.highcharts;

import def.dom.HTMLElement;
import def.dom.MouseEvent;
import def.dom.PointerEvent;
import def.dom.TouchEvent;
import def.js.Array;

/**
 * The mouse and touch tracker object. Each Chart item has one assosiated Pointer item that can be accessed from the Chart.pointer property.
 */
public class Pointer extends def.js.Object {
	/**
	 * The mouse and touch tracker object. Each Chart item has one assosiated Pointer item that can be accessed from the Chart.pointer property.
	 *
	 * @param chart The chart instance.
	 *
	 * @param options The root options object. The pointer uses options from the chart and tooltip structures.
	 */
	public Pointer(Chart chart, Options options) {
	}

	/**
	 * Destroys the Pointer object and disconnects DOM events.
	 */
	native public void destroy();

	/**
	 * Finds the closest point to a set of coordinates, using the k-d-tree algorithm.
	 *
	 * @param series All the series to search in.
	 *
	 * @param shared Whether it is a shared tooltip or not.
	 *
	 * @param e The pointer event object, containing chart coordinates of the pointer.
	 *
	 * @return The point closest to given coordinates.
	 */
	native public jsweet.util.union.Union<Point, Object> findNearestKDPoint(Array<Series> series, Boolean shared, PointerEventObject e);

	/**
	 * Return the cached chartPosition if it is available on the Pointer, otherwise find it. Running offset is quite expensive, so it should be avoided when we
	 * know the chart hasn't moved.
	 *
	 * @return The offset of the chart container within the page
	 */
	native public OffsetObject getChartPosition();

	/**
	 * Get the click position in terms of axis values.
	 *
	 * @param e Pointer event, extended with `chartX` and `chartY` properties.
	 */
	native public PointerAxisCoordinatesObject getCoordinates(PointerEventObject e);

	/**
	 * Utility to detect whether an element has, or has a parent with, a specificclass name. Used on detection of tracker objects and on deciding whether
	 * hovering the tooltip should cause the active series to mouse out.
	 *
	 * @param element The element to investigate.
	 *
	 * @param className The class name to look for.
	 *
	 * @return True if either the element or one of its parents has the given class name.
	 */
	native public jsweet.util.union.Union<Boolean, Object> inClass(HTMLElement element, String className);

	/**
	 * Takes a browser event object and extends it with custom Highcharts properties `chartX` and `chartY` in order to work on the internal coordinate system.
	 *
	 * @param e Event object in standard browsers.
	 *
	 * @param chartPosition Additional chart offset.
	 *
	 * @return A browser event with extended properties `chartX` and `chartY`.
	 */
	native public PointerEventObject normalize(MouseEvent e, OffsetObject chartPosition);

	/**
	 * Reset the tracking by hiding the tooltip, the hover series state and the hover point
	 *
	 * @param allowMove Instead of destroying the tooltip altogether, allow moving it if possible.
	 */
	native public void reset(Boolean allowMove, double delay);

	/**
	 * Takes a browser event object and extends it with custom Highcharts properties `chartX` and `chartY` in order to work on the internal coordinate system.
	 *
	 * @param e Event object in standard browsers.
	 *
	 * @param chartPosition Additional chart offset.
	 *
	 * @return A browser event with extended properties `chartX` and `chartY`.
	 */
	native public PointerEventObject normalize(MouseEvent e);

	/**
	 * Reset the tracking by hiding the tooltip, the hover series state and the hover point
	 *
	 * @param allowMove Instead of destroying the tooltip altogether, allow moving it if possible.
	 */
	native public void reset(Boolean allowMove);

	/**
	 * Reset the tracking by hiding the tooltip, the hover series state and the hover point
	 *
	 * @param allowMove Instead of destroying the tooltip altogether, allow moving it if possible.
	 */
	native public void reset();

	/**
	 * Finds the closest point to a set of coordinates, using the k-d-tree algorithm.
	 *
	 * @param series All the series to search in.
	 *
	 * @param shared Whether it is a shared tooltip or not.
	 *
	 * @param e The pointer event object, containing chart coordinates of the pointer.
	 *
	 * @return The point closest to given coordinates.
	 */
	native public jsweet.util.union.Union<Point, Object> findNearestKDPoint(Array<Series> series, Object shared, PointerEventObject e);

	/**
	 * Utility to detect whether an element has, or has a parent with, a specificclass name. Used on detection of tracker objects and on deciding whether
	 * hovering the tooltip should cause the active series to mouse out.
	 *
	 * @param element The element to investigate.
	 *
	 * @param className The class name to look for.
	 *
	 * @return True if either the element or one of its parents has the given class name.
	 */
	native public jsweet.util.union.Union<Boolean, Object> inClass(GlobalSVGElement element, String className);

	/**
	 * Takes a browser event object and extends it with custom Highcharts properties `chartX` and `chartY` in order to work on the internal coordinate system.
	 *
	 * @param e Event object in standard browsers.
	 *
	 * @param chartPosition Additional chart offset.
	 *
	 * @return A browser event with extended properties `chartX` and `chartY`.
	 */
	native public PointerEventObject normalize(TouchEvent e, OffsetObject chartPosition);

	/**
	 * Takes a browser event object and extends it with custom Highcharts properties `chartX` and `chartY` in order to work on the internal coordinate system.
	 *
	 * @param e Event object in standard browsers.
	 *
	 * @param chartPosition Additional chart offset.
	 *
	 * @return A browser event with extended properties `chartX` and `chartY`.
	 */
	native public PointerEventObject normalize(PointerEvent e, OffsetObject chartPosition);

	/**
	 * Takes a browser event object and extends it with custom Highcharts properties `chartX` and `chartY` in order to work on the internal coordinate system.
	 *
	 * @param e Event object in standard browsers.
	 *
	 * @param chartPosition Additional chart offset.
	 *
	 * @return A browser event with extended properties `chartX` and `chartY`.
	 */
	native public PointerEventObject normalize(TouchEvent e);

	/**
	 * Takes a browser event object and extends it with custom Highcharts properties `chartX` and `chartY` in order to work on the internal coordinate system.
	 *
	 * @param e Event object in standard browsers.
	 *
	 * @param chartPosition Additional chart offset.
	 *
	 * @return A browser event with extended properties `chartX` and `chartY`.
	 */
	native public PointerEventObject normalize(PointerEvent e);

	/**
	 * Finds the closest point to a set of coordinates, using the k-d-tree algorithm.
	 *
	 * @param series All the series to search in.
	 *
	 * @param shared Whether it is a shared tooltip or not.
	 *
	 * @param e The pointer event object, containing chart coordinates of the pointer.
	 *
	 * @return The point closest to given coordinates.
	 */
	native public jsweet.util.union.Union<Point, Object> findNearestKDPoint(Series[] series, Boolean shared, PointerEventObject e);

	/**
	 * Finds the closest point to a set of coordinates, using the k-d-tree algorithm.
	 *
	 * @param series All the series to search in.
	 *
	 * @param shared Whether it is a shared tooltip or not.
	 *
	 * @param e The pointer event object, containing chart coordinates of the pointer.
	 *
	 * @return The point closest to given coordinates.
	 */
	// native public jsweet.util.union.Union<Point, Object> findNearestKDPoint(Series[] series, Boolean shared, PointerEventObject e);

	protected Pointer() {
	}
}
