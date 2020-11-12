package def.highcharts;
/**
 * (Highcharts, Highstock, Gantt) Options for a label text which should follow
 * marker's shape. Border and background are disabled for a label that follows a
 * path.
 *
 * **Note:** Only SVG-based renderer supports this option. Setting `useHTML` to
 * true will disable this option.
 */
@jsweet.lang.Interface
public abstract class DataLabelsTextPathOptionsObject extends def.js.Object {
    /**
     * (Highcharts, Highstock, Gantt) Presentation attributes for the text path.
     */
    @jsweet.lang.Optional
    public SVGAttributes attributes;
    /**
     * (Highcharts, Highstock, Gantt) Enable or disable `textPath` option for
     * link's or marker's data labels.
     */
    @jsweet.lang.Optional
    public Boolean enabled;
}

