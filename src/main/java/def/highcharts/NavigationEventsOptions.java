package def.highcharts;
import def.js.Function;
/**
 * (Highcharts, Highstock) Events to communicate between Stock Tools and custom
 * GUI.
 */
@jsweet.lang.Interface
public abstract class NavigationEventsOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock) A `closePopup` event. Fired when Popup should be
     * hidden, for example when clicking on an annotation again.
     */
    @jsweet.lang.Optional
    public Function closePopup;
    /**
     * (Highcharts, Highstock) Event fired when button state should change, for
     * example after adding an annotation.
     */
    @jsweet.lang.Optional
    public Function deselectButton;
    /**
     * (Highcharts, Highstock) Event fired on a button click.
     */
    @jsweet.lang.Optional
    public Function selectButton;
    /**
     * (Highcharts, Highstock) A `showPopup` event. Fired when selecting for
     * example an annotation.
     */
    @jsweet.lang.Optional
    public Function showPopup;
    native public java.lang.Object closePopup(java.lang.Object... args);
    native public java.lang.Object deselectButton(java.lang.Object... args);
    native public java.lang.Object selectButton(java.lang.Object... args);
    native public java.lang.Object showPopup(java.lang.Object... args);
}

