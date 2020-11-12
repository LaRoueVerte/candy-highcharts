package def.highcharts;
/**
 * (Highcharts) Rotation options for the words in the wordcloud.
 */
@jsweet.lang.Interface
public abstract class PlotWordcloudRotationOptions extends def.js.Object {
    /**
     * (Highcharts) The smallest degree of rotation for a word.
     */
    @jsweet.lang.Optional
    public double from;
    /**
     * (Highcharts) The number of possible orientations for a word, within the
     * range of `rotation.from` and `rotation.to`. Must be a number larger than
     * 0.
     */
    @jsweet.lang.Optional
    public double orientations;
    /**
     * (Highcharts) The largest degree of rotation for a word.
     */
    @jsweet.lang.Optional
    public double to;
}

