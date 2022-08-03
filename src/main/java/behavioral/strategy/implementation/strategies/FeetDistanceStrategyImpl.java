package behavioral.strategy.implementation.strategies;

class FeetDistanceStrategyImpl implements DistanceStrategy {

  @Override
  public double convertMetersIntoStrategyUnits(final int meters) {
    return meters * 3.28084;
  }

  @Override
  public String getUnitName() {
    return "Foot";
  }

}
