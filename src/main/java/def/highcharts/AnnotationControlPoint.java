package def.highcharts;

/**
 * A control point class which is a connection between controllable transform methods and a user actions.
 */
public class AnnotationControlPoint extends def.js.Object {
	/**
	 * A control point class which is a connection between controllable transform methods and a user actions.
	 *
	 * @param chart A chart instance.
	 *
	 * @param target A controllable instance which is a target for a control point.
	 *
	 * @param options An options object.
	 *
	 * @param index Point index.
	 */
	public AnnotationControlPoint(Chart chart, AnnotationControllable target, AnnotationControlPointOptionsObject options, double index) {
	}

	/**
	 * Set the visibility of the control point.
	 *
	 * @param visible Visibility of the control point.
	 */
	native public void setVisibility(Boolean visible);

	/**
	 * Update the control point.
	 *
	 * @param userOptions New options for the control point.
	 */
	// native public void update(Partial<AnnotationControlPointOptionsObject> userOptions);
	/**
	 * A control point class which is a connection between controllable transform methods and a user actions.
	 *
	 * @param chart A chart instance.
	 *
	 * @param target A controllable instance which is a target for a control point.
	 *
	 * @param options An options object.
	 *
	 * @param index Point index.
	 */
	public AnnotationControlPoint(Chart chart, AnnotationControllable target, AnnotationControlPointOptionsObject options) {
	}

	protected AnnotationControlPoint() {
	}
}
