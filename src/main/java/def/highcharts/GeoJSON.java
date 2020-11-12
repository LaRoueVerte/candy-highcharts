package def.highcharts;
import def.js.Array;
/**
 * Represents the loose structure of a geographic JSON file.
 */
@jsweet.lang.Interface
public abstract class GeoJSON extends def.js.Object {
    /**
     * Full copyright note of the geographic data.
     */
    @jsweet.lang.Optional
    public String copyright;
    /**
     * Short copyright note of the geographic data suitable for watermarks.
     */
    @jsweet.lang.Optional
    public String copyrightShort;
    /**
     * Additional meta information based on the coordinate reference system.
     */
    @jsweet.lang.Optional
    public Dictionary<?> crs;
    /**
     * Data sets of geographic features.
     */
    public Array<GeoJSONFeature> features;
    /**
     * Map projections and transformations to be used when calculating between
     * lat/lon and chart values. Required for lat/lon support on maps. Allows
     * resizing, rotating, and moving portions of a map within its projected
     * coordinate system while still retaining lat/lon support. If using lat/lon
     * on a portion of the map that does not match a `hitZone`, the definition
     * with the key `default` is used.
     */
    @jsweet.lang.Name("hc-transform")
    @jsweet.lang.Optional
    public Dictionary<GeoJSONTranslation> hc_transform;
    /**
     * Title of the geographic data.
     */
    @jsweet.lang.Optional
    public String title;
    /**
     * Type of the geographic data. Type of an optimized map collection is
     * `FeatureCollection`.
     */
    @jsweet.lang.Optional
    public String type;
    /**
     * Version of the geographic data.
     */
    @jsweet.lang.Optional
    public String version;
}

