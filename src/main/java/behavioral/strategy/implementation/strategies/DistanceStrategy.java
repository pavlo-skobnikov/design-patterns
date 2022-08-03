package behavioral.strategy.implementation.strategies;

public interface DistanceStrategy {

  double convertMetersIntoStrategyUnits(final int meters);

  String getUnitName();

}
