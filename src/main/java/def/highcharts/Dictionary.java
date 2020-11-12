package def.highcharts;
/**
 * Generic dictionary in TypeScript notation. Use the native `Record<string,
 * any>` instead.
 */
@jsweet.lang.Interface
public abstract class Dictionary<T> extends def.js.Object {
    native public T $get(String key);
}

