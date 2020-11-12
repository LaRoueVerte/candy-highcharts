package def.highcharts;
/**
 * (Highcharts, Highstock) Configure the Popup strings in the chart. Requires
 * the `annotations.js` or `annotations-advanced.src.js` module to be loaded.
 */
@jsweet.lang.Interface
public abstract class LangNavigationOptions extends def.js.Object {
    /**
     * (Highcharts, Highstock) Translations for all field names used in popup.
     */
    @jsweet.lang.Optional
    public LangNavigationPopupOptions popup;
}

