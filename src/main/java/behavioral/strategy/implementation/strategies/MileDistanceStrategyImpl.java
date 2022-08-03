package behavioral.strategy.implementation.strategies;

class MileDistanceStrategyImpl implements DistanceStrategy {

  @Override
  public double convertMetersIntoStrategyUnits(final int meters) {
    return meters * 0.000621371;
  }

  @Override
  public String getUnitName() {
    return "Mile";
  }

}
