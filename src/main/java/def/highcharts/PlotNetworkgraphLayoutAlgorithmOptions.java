package def.highcharts;
import jsweet.util.union.Union3;
import def.js.Function;
@jsweet.lang.Interface
public abstract class PlotNetworkgraphLayoutAlgorithmOptions extends def.js.Object {
    /**
     * (Highcharts) Approximation used to calculate repulsive forces affecting
     * nodes. By default, when calculateing net force, nodes are compared
     * against each other, which gives O(N^2) complexity. Using Barnes-Hut
     * approximation, we decrease this to O(N log N), but the resulting graph
     * will have different layout. Barnes-Hut approximation divides space into
     * rectangles via quad tree, where forces exerted on nodes are calculated
     * directly for nearby cells, and for all others, cells are treated as a
     * separate node with center of mass.
     */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<def.highcharts.StringTypes.barnes_hut,def.highcharts.StringTypes.none> approximation;
    /**
     * (Highcharts) Attraction force applied on a node which is conected to
     * another node by a link. Passed are two arguments:
     *
     * - `d` - which is current distance between two nodes
     *
     * - `k` - which is desired distance between two nodes
     *
     * In `verlet` integration, defaults to: `function (d, k) { return (k - d) /
     * d; }`
     */
    @jsweet.lang.Optional
    public Function attractiveForce;
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
     * of built-in options ("circle", "random") or a function where positions
     * should be set on each node (`this.nodes`) as `node.plotX` and
     * `node.plotY`
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
     * (Highcharts) Verlet integration only. Max speed that node can get in one
     * iteration. In terms of simulation, it's a maximum translation (in pixels)
     * that node can move (in both, x and y, dimensions). While `friction` is
     * applied on all nodes, max speed is applied only for nodes that move very
     * fast, for example small or disconnected ones.
     */
    @jsweet.lang.Optional
    public double maxSpeed;
    /**
     * (Highcharts) Repulsive force applied on a node. Passed are two arguments:
     *
     * - `d` - which is current distance between two nodes
     *
     * - `k` - which is desired distance between two nodes
     *
     * In `verlet` integration, defaults to: `function (d, k) { return (k - d) /
     * d * (k > d ? 1 : 0) }`
     */
    @jsweet.lang.Optional
    public Function repulsiveForce;
    /**
     * (Highcharts) Barnes-Hut approximation only. Deteremines when distance
     * between cell and node is small enough to caculate forces. Value of
     * `theta` is compared directly with quotient `s / d`, where `s` is the size
     * of the cell, and `d` is distance between center of cell's mass and
     * currently compared node.
     */
    @jsweet.lang.Optional
    public double theta;
    /**
     * (Highcharts) Type of the algorithm used when positioning nodes.
     */
    @jsweet.lang.Optional
    public def.highcharts.StringTypes.reingold_fruchterman type;
    native public java.lang.Object attractiveForce(java.lang.Object... args);
    native public java.lang.Object repulsiveForce(java.lang.Object... args);
}

