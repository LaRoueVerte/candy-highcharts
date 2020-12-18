package def.highcharts;

import def.dom.SVGElement;

/**
 * The Tick class.
 */
public class Tick extends def.js.Object {
	/**
	 * The Tick class.
	 *
	 * @param axis The axis of the tick.
	 *
	 * @param pos The position of the tick on the axis in terms of axis values.
	 *
	 * @param type The type of tick, either 'minor' or an empty string
	 *
	 * @param noLabel Whether to disable the label or not. Defaults to false.
	 *
	 * @param parameters Optional parameters for the tick.
	 */
	public Tick(Axis axis, double pos, String type, Boolean noLabel, Object parameters) {
	}

	/**
	 * The related axis of the tick.
	 */
	public Axis axis;
	/**
	 * The rendered grid line of the tick.
	 */
	@jsweet.lang.Optional
	public SVGElement gridLine;
	/**
	 * True if the tick is the first one on the axis.
	 */
	@jsweet.lang.Optional
	public final Boolean isFirst = null;
	/**
	 * True if the tick is the last one on the axis.
	 */
	@jsweet.lang.Optional
	public final Boolean isLast = null;
	/**
	 * The rendered text label of the tick.
	 */
	@jsweet.lang.Optional
	public SVGElement label;
	/**
	 * The rendered mark of the tick.
	 */
	@jsweet.lang.Optional
	public SVGElement mark;
	/**
	 * The logical position of the tick on the axis in terms of axis values.
	 */
	public double pos;
	/**
	 * The mark offset of the tick on the axis. Usually `undefined`, numeric for grid axes.
	 */
	@jsweet.lang.Optional
	public double tickmarkOffset;
	/**
	 * The tick type, which can be `"minor"`, or an empty string.
	 */
	public String type;

	/**
	 * The Tick class.
	 *
	 * @param axis The axis of the tick.
	 *
	 * @param pos The position of the tick on the axis in terms of axis values.
	 *
	 * @param type The type of tick, either 'minor' or an empty string
	 *
	 * @param noLabel Whether to disable the label or not. Defaults to false.
	 *
	 * @param parameters Optional parameters for the tick.
	 */
	public Tick(Axis axis, double pos, String type, Boolean noLabel) {
	}

	/**
	 * The Tick class.
	 *
	 * @param axis The axis of the tick.
	 *
	 * @param pos The position of the tick on the axis in terms of axis values.
	 *
	 * @param type The type of tick, either 'minor' or an empty string
	 *
	 * @param noLabel Whether to disable the label or not. Defaults to false.
	 *
	 * @param parameters Optional parameters for the tick.
	 */
	public Tick(Axis axis, double pos, String type) {
	}

	/**
	 * The Tick class.
	 *
	 * @param axis The axis of the tick.
	 *
	 * @param pos The position of the tick on the axis in terms of axis values.
	 *
	 * @param type The type of tick, either 'minor' or an empty string
	 *
	 * @param noLabel Whether to disable the label or not. Defaults to false.
	 *
	 * @param parameters Optional parameters for the tick.
	 */
	public Tick(Axis axis, double pos) {
	}

	protected Tick() {
	}
}
