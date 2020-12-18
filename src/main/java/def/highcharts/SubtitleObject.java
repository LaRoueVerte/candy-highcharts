package def.highcharts;

import def.dom.SVGElement;

/**
 * The chart subtitle. The subtitle has an `update` method that allows modifying
 * the options directly or indirectly via `chart.update`.
 */
@jsweet.lang.Interface
public abstract class SubtitleObject extends SVGElement {
    /**
     * Modify options for the subtitle.
     *
     * @param subtitleOptions
     *        Options to modify.
     *
     * @param redraw
     *        Whether to redraw the chart after the subtitle is altered. If
     *        doing more operations on the chart, it is a good idea to set
     *        redraw to false and call Chart#redraw after.
     */
    native public void update(SubtitleOptions subtitleOptions, Boolean redraw);
    /**
     * Modify options for the subtitle.
     *
     * @param subtitleOptions
     *        Options to modify.
     *
     * @param redraw
     *        Whether to redraw the chart after the subtitle is altered. If
     *        doing more operations on the chart, it is a good idea to set
     *        redraw to false and call Chart#redraw after.
     */
    native public void update(SubtitleOptions subtitleOptions);
}

