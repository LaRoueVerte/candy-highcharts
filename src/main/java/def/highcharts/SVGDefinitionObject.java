package def.highcharts;
import def.js.Array;
/**
 * Serialized form of an SVG definition, including children. Some key property
 * names are reserved: tagName, textContent, and children.
 */
@jsweet.lang.Interface
public abstract class SVGDefinitionObject extends def.js.Object {
    native public java.lang.Object $get(String key);
    @jsweet.lang.Optional
    public Array<SVGDefinitionObject> children;
    @jsweet.lang.Optional
    public String tagName;
    @jsweet.lang.Optional
    public String textContent;
}

