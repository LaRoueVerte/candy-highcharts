package def.highcharts;
/**
 * Bounding box of an element.
 */
@jsweet.lang.Interface
public abstract class BBoxObject extends PositionObject {
    /**
     * Height of the bounding box.
     */
    public double height;
    /**
     * Width of the bounding box.
     */
    public double width;
    /**
     * Horizontal position of the bounding box.
     */
    public double x;
    /**
     * Vertical position of the bounding box.
     */
    public double y;
}

