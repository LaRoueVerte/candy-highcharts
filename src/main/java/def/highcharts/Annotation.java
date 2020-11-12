package def.highcharts;

/**
 * An annotation class which serves as a container for items like labels or shapes. Created items are positioned on the chart either by linking them to existing
 * points or created mock points
 */
public class Annotation extends def.js.Object {
	/**
	 * An annotation class which serves as a container for items like labels or shapes. Created items are positioned on the chart either by linking them to
	 * existing points or created mock points
	 *
	 * @param chart a chart instance
	 *
	 * @param userOptions the options object
	 */
	public Annotation(Chart chart, AnnotationsOptions userOptions) {
	}

	/**
	 * The group svg element.
	 */
	public SVGElement2 group;
	/**
	 * The group svg element of the annotation's labels.
	 */
	public SVGElement2 labelsGroup;
	/**
	 * The options for the annotations.
	 */
	public AnnotationsOptions options;
	/**
	 * The group svg element of the annotation's shapes.
	 */
	public SVGElement2 shapesGroup;
	/**
	 * The user options for the annotations.
	 */
	public AnnotationsOptions userOptions;

	/**
	 * Updates an annotation.
	 *
	 * @param userOptions New user options for the annotation.
	 */
	// native public void update(Partial<AnnotationsOptions> userOptions);
	protected Annotation() {
	}
}
