package def.highcharts;
/**
 * (Highcharts) Provides the option to draw a frame around the charts by
 * defining a bottom, front and back panel.
 */
@jsweet.lang.Interface
public abstract class Chart3dFrameOptions extends def.js.Object {
    /**
     * (Highcharts) The back side of the frame around a 3D chart.
     */
    @jsweet.lang.Optional
    public Chart3dFrameBackOptions back;
    /**
     * (Highcharts) The bottom of the frame around a 3D chart.
     */
    @jsweet.lang.Optional
    public Chart3dFrameBottomOptions bottom;
    /**
     * (Highcharts) The front of the frame around a 3D chart.
     */
    @jsweet.lang.Optional
    public Chart3dFrameFrontOptions front;
    /**
     * (Highcharts) The left side of the frame around a 3D chart.
     */
    @jsweet.lang.Optional
    public Chart3dFrameLeftOptions left;
    /**
     * (Highcharts) The right of the frame around a 3D chart.
     */
    @jsweet.lang.Optional
    public Chart3dFrameRightOptions right;
    /**
     * (Highcharts) General pixel thickness for the frame faces.
     */
    @jsweet.lang.Optional
    public double size;
    /**
     * (Highcharts) The top of the frame around a 3D chart.
     */
    @jsweet.lang.Optional
    public Chart3dFrameTopOptions top;
    /**
     * (Highcharts) Whether the frames are visible.
     */
    @jsweet.lang.Optional
    public String visible;
}

