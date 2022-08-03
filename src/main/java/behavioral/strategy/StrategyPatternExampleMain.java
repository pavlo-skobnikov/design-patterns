package behavioral.strategy;

import behavioral.strategy.implementation.DistanceContext;

import java.util.Scanner;

public class StrategyPatternExampleMain {

  public static void main(final String[] args) {
    System.out.println("Please input the meters you'd like to convert to other units: ");
    final var lengthInMeters = new Scanner(System.in).nextInt();

    var context = DistanceContext.ofFeet();
    System.out.println(context.convertAndComposeMessage(lengthInMeters));

    context = DistanceContext.ofKilometers();
    System.out.println(context.convertAndComposeMessage(lengthInMeters));

    context = DistanceContext.ofMiles();
    System.out.println(context.convertAndComposeMessage(lengthInMeters));
  }

}
