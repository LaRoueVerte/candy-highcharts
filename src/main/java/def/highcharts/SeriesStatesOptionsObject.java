package def.highcharts;
/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 */
@jsweet.lang.Interface
public abstract class SeriesStatesOptionsObject extends def.js.Object {
    /**
     * (Highstock) Options for the hovered series. These settings override the
     * normal state options when a series is moused over or touched.
     */
    @jsweet.lang.Optional
    public SeriesStatesHoverOptionsObject hover;
    /**
     * (Highstock) The opposite state of a hover for series.
     */
    @jsweet.lang.Optional
    public SeriesStatesInactiveOptionsObject inactive;
    /**
     * (Highstock) The normal state of a series, or for point items in column,
     * pie and similar series. Currently only used for setting animation when
     * returning to normal state from hover.
     */
    @jsweet.lang.Optional
    public SeriesStatesNormalOptionsObject normal;
    /**
     * (Highstock) Specific options for point in selected states, after being
     * selected by allowPointSelect or programmatically.
     */
    @jsweet.lang.Optional
    public SeriesStatesSelectOptionsObject select;
}

