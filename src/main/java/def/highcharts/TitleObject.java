package def.highcharts;
/**
 * The chart title. The title has an `update` method that allows modifying the
 * options directly or indirectly via `chart.update`.
 */
@jsweet.lang.Interface
public abstract class TitleObject extends SVGElement2 {
    /**
     * Modify options for the title.
     *
     * @param titleOptions
     *        Options to modify.
     *
     * @param redraw
     *        Whether to redraw the chart after the title is altered. If doing
     *        more operations on the chart, it is a good idea to set redraw to
     *        false and call Chart#redraw after.
     */
    native public void update(TitleOptions titleOptions, Boolean redraw);
    /**
     * Modify options for the title.
     *
     * @param titleOptions
     *        Options to modify.
     *
     * @param redraw
     *        Whether to redraw the chart after the title is altered. If doing
     *        more operations on the chart, it is a good idea to set redraw to
     *        false and call Chart#redraw after.
     */
    native public void update(TitleOptions titleOptions);
}

