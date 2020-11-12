package def.highcharts;
/**
 * (Highmaps) The individual buttons for the map navigation. This usually
 * includes the zoom in and zoom out buttons. Properties for each button is
 * inherited from mapNavigation.buttonOptions, while individual options can be
 * overridden. But default, the `onclick`, `text` and `y` options are
 * individual.
 */
@jsweet.lang.Interface
public abstract class MapNavigationButtonsOptions extends def.js.Object {
    /**
     * (Highmaps) Options for the zoom in button. Properties for the zoom in and
     * zoom out buttons are inherited from mapNavigation.buttonOptions, while
     * individual options can be overridden. By default, the `onclick`, `text`
     * and `y` options are individual.
     */
    @jsweet.lang.Optional
    public MapNavigationButtonsZoomInOptions zoomIn;
    /**
     * (Highmaps) Options for the zoom out button. Properties for the zoom in
     * and zoom out buttons are inherited from mapNavigation.buttonOptions,
     * while individual options can be overridden. By default, the `onclick`,
     * `text` and `y` options are individual.
     */
    @jsweet.lang.Optional
    public MapNavigationButtonsZoomOutOptions zoomOut;
}

