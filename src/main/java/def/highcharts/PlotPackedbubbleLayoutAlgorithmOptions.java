package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Function;
/**
 * (Highcharts) Options for layout algorithm when simulation is enabled. Inside
 * there are options to change the speed, padding, initial bubbles positions and
 * more.
 */
@jsweet.lang.Interface
public abstract class PlotPackedbubbleLayoutAlgorithmOptions extends def.js.Object {
    /**
     * (Highcharts) The distance between two bubbles, when the algorithm starts
     * to treat two bubbles as overlapping. The `bubblePadding` is also the
     * expected distance between all the bubbles on simulation end.
     */
    @jsweet.lang.Optional
    public double bubblePadding;
    /**
     * (Highcharts) In case of split series, this option allows user to drag and
     * drop points between series, for changing point related series.
     */
    @jsweet.lang.Optional
    public Boolean dragBetweenSeries;
    /**
     * (Highcharts) Experimental. Enables live simulation of the algorithm
     * implementation. All nodes are animated as the forces applies on them.
     */
    @jsweet.lang.Optional
    public Boolean enableSimulation;
    /**
     * (Highcharts) Friction applied on forces to prevent nodes rushing to fast
     * to the desired positions.
     */
    @jsweet.lang.Optional
    public double friction;
    /**
     * (Highcharts) Gravitational const used in the barycenter force of the
     * algorithm.
     */
    @jsweet.lang.Optional
    public double gravitationalConstant;
    /**
     * (Highcharts) When `initialPositions` are set to 'circle',
     * `initialPositionRadius` is a distance from the center of circle, in which
     * nodes are created.
     */
    @jsweet.lang.Optional
    public double initialPositionRadius;
    /**
     * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
     * of the built-in options ("circle", "random") or a function where
     * positions should be set on each node (`this.nodes`) as `node.plotX` and
     * `node.plotY`.
     */
    @jsweet.lang.Optional
    public Union3<def.highcharts.StringTypes.circle,def.highcharts.StringTypes.random,Function> initialPositions;
    /**
     * (Highcharts) Integration type. Available options are `'euler'` and
     * `'verlet'`. Integration determines how forces are applied on particles.
     * In Euler integration, force is applied direct as `newPosition +=
     * velocity;`. In Verlet integration, new position is based on a previous
     * posittion without velocity: `newPosition += previousPosition -
     * newPosition`.
     *
     * Note that different integrations give different results as forces are
     * different.
     *
     * In Highcharts v7.0.x only `'euler'` integration was supported.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.euler,def.highcharts.StringTypes.verlet> integration;
    /**
     * (Highcharts) Ideal length (px) of the link between two nodes. When not
     * defined, length is calculated as: `Math.pow(availableWidth *
     * availableHeight / nodesLength, 0.4);`
     *
     * Note: Because of the algorithm specification, length of each link might
     * be not exactly as specified.
     */
    @jsweet.lang.Optional
    public double linkLength;
    /**
     * (Highcharts) Max number of iterations before algorithm will stop. In
     * general, algorithm should find positions sooner, but when rendering huge
     * number of nodes, it is recommended to increase this value as finding
     * perfect graph positions can require more time.
     */
    @jsweet.lang.Optional
    public double maxIterations;
    /**
     * (Highcharts) Max speed that node can get in one iteration. In terms of
     * simulation, it's a maximum translation (in pixels) that a node can move
     * (in both, x and y, dimensions). While `friction` is applied on all nodes,
     * max speed is applied only for nodes that move very fast, for example
     * small or disconnected ones.
     */
    @jsweet.lang.Optional
    public double maxSpeed;
    /**
     * (Highcharts) Whether bubbles should interact with their parentNode to
     * keep them inside.
     */
    @jsweet.lang.Optional
    public Boolean parentNodeLimit;
    /**
     * (Highcharts) Layout algorithm options for parent nodes.
     */
    @jsweet.lang.Optional
    public PlotPackedbubbleLayoutAlgorithmParentNodeOptions parentNodeOptions;
    /**
     * (Highcharts) Whether series should interact with each other or not. When
     * `parentNodeLimit` is set to true, thi option should be set to false to
     * avoid sticking points in wrong series parentNode.
     */
    @jsweet.lang.Optional
    public Boolean seriesInteraction;
    /**
     * (Highcharts) Whether to split series into individual groups or to mix all
     * series together.
     */
    @jsweet.lang.Optional
    public String splitSeries;
    /**
     * (Highcharts) Type of the algorithm used when positioning nodes.
     */
    @jsweet.lang.Optional
    public def.highcharts.StringTypes.reingold_fruchterman type;
}

