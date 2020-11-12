package def.highcharts;
/**
 * (Highstock) The styles for bars when volume is divided into
 * positive/negative.
 */
@jsweet.lang.Interface
public abstract class PlotVbpVolumeDivisionOptions extends def.js.Object {
    /**
     * (Highstock) Option to control if volume is divided.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    @jsweet.lang.Optional
    public PlotVbpVolumeDivisionStylesOptions styles;
}

