package def.highcharts;
/**
 * (Highcharts, Highmaps) Additional styles to apply to the data label of a
 * point that has drilldown data. By default it is underlined and blue to invite
 * to interaction.
 *
 * In styled mode, active data label styles can be applied with the
 * `.highcharts-drilldown-data-label` class.
 */
@jsweet.lang.Interface
public abstract class DrilldownActiveDataLabelStyleOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String color;
    @jsweet.lang.Optional
    public String cursor;
    @jsweet.lang.Optional
    public String fontWeight;
    @jsweet.lang.Optional
    public String textDecoration;
}

