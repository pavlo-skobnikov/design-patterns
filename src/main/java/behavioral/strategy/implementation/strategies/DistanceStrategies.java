package behavioral.strategy.implementation.strategies;

abstract public class DistanceStrategies {

  public static final DistanceStrategy FEET = new FeetDistanceStrategyImpl();
  public static final DistanceStrategy KILOMETER = new KilometerDistanceStrategyImpl();
  public static final DistanceStrategy MILE = new MileDistanceStrategyImpl();

}
