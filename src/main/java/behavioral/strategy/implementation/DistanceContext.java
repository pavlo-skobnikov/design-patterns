package behavioral.strategy.implementation;

import behavioral.strategy.implementation.strategies.DistanceStrategies;
import behavioral.strategy.implementation.strategies.DistanceStrategy;

public class DistanceContext {

  private final DistanceStrategy distanceStrategy;

  private DistanceContext(final DistanceStrategy distanceStrategy) {
    this.distanceStrategy = distanceStrategy;
  }

  public static DistanceContext ofFeet() {
    return new DistanceContext(DistanceStrategies.FEET);
  }

  public static DistanceContext ofKilometers() {
    return new DistanceContext(DistanceStrategies.KILOMETER);
  }

  public static DistanceContext ofMiles() {
    return new DistanceContext(DistanceStrategies.MILE);
  }

  public String convertAndComposeMessage(final int meters) {
    return "[%d] meters is [%2f] in [%s] units"
        .formatted(
            meters,
            distanceStrategy.convertMetersIntoStrategyUnits(meters),
            distanceStrategy.getUnitName()
        );
  }

}
