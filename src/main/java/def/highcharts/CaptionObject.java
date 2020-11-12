package def.highcharts;
/**
 * The chart caption. The caption has an `update` method that allows modifying
 * the options directly or indirectly via `chart.update`.
 */
@jsweet.lang.Interface
public abstract class CaptionObject extends SVGElement2 {
    /**
     * Modify options for the caption.
     *
     * @param captionOptions
     *        Options to modify.
     *
     * @param redraw
     *        Whether to redraw the chart after the caption is altered. If doing
     *        more operations on the chart, it is a good idea to set redraw to
     *        false and call Chart#redraw after.
     */
    native public void update(CaptionOptions captionOptions, Boolean redraw);
    /**
     * Modify options for the caption.
     *
     * @param captionOptions
     *        Options to modify.
     *
     * @param redraw
     *        Whether to redraw the chart after the caption is altered. If doing
     *        more operations on the chart, it is a good idea to set redraw to
     *        false and call Chart#redraw after.
     */
    native public void update(CaptionOptions captionOptions);
}

