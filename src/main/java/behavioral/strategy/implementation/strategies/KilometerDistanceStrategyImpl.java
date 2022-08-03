package behavioral.strategy.implementation.strategies;

class KilometerDistanceStrategyImpl implements DistanceStrategy {

  @Override
  public double convertMetersIntoStrategyUnits(final int meters) {
    return meters * 0.001;
  }

  @Override
  public String getUnitName() {
    return "Kilometer";
  }

}
