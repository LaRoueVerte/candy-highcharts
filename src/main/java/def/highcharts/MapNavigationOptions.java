package def.highcharts;
@jsweet.lang.Interface
public abstract class MapNavigationOptions extends def.js.Object {
    /**
     * (Highmaps) General options for the map navigation buttons. Individual
     * options can be given from the mapNavigation.buttons option set.
     */
    @jsweet.lang.Optional
    public MapNavigationButtonOptions buttonOptions;
    /**
     * (Highmaps) The individual buttons for the map navigation. This usually
     * includes the zoom in and zoom out buttons. Properties for each button is
     * inherited from mapNavigation.buttonOptions, while individual options can
     * be overridden. But default, the `onclick`, `text` and `y` options are
     * individual.
     */
    @jsweet.lang.Optional
    public MapNavigationButtonsOptions buttons;
    /**
     * (Highmaps) Whether to enable navigation buttons. By default it inherits
     * the enabled setting.
     */
    @jsweet.lang.Optional
    public Boolean enableButtons;
    /**
     * (Highmaps) Whether to enable map navigation. The default is not to enable
     * navigation, as many choropleth maps are simple and don't need it.
     * Additionally, when touch zoom and mousewheel zoom is enabled, it breaks
     * the default behaviour of these interactions in the website, and the
     * implementer should be aware of this.
     *
     * Individual interactions can be enabled separately, namely buttons,
     * multitouch zoom, double click zoom, double click zoom to element and
     * mousewheel zoom.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
    /**
     * (Highmaps) Enables zooming in on an area on double clicking in the map.
     * By default it inherits the enabled setting.
     */
    @jsweet.lang.Optional
    public Boolean enableDoubleClickZoom;
    /**
     * (Highmaps) Whether to zoom in on an area when that area is double
     * clicked.
     */
    @jsweet.lang.Optional
    public Boolean enableDoubleClickZoomTo;
    /**
     * (Highmaps) Enables zooming by mouse wheel. By default it inherits the
     * enabled setting.
     */
    @jsweet.lang.Optional
    public Boolean enableMouseWheelZoom;
    /**
     * (Highmaps) Whether to enable multitouch zooming. Note that if the chart
     * covers the viewport, this prevents the user from using multitouch and
     * touchdrag on the web page, so you should make sure the user is not
     * trapped inside the chart. By default it inherits the enabled setting.
     */
    @jsweet.lang.Optional
    public Boolean enableTouchZoom;
    /**
     * (Highmaps) Sensitivity of mouse wheel or trackpad scrolling. 1 is no
     * sensitivity, while with 2, one mousewheel delta will zoom in 50%.
     */
    @jsweet.lang.Optional
    public double mouseWheelSensitivity;
}

