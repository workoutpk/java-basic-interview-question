import java.util.Random;

public class RandomDoubleGenerator {

        public static void main(String[] args) {
                final RandomDoubleGenerator randomDoubleGenerator = new RandomDoubleGenerator();
                System.out.println("random number :::");
                randomDoubleGenerator.randomUsingMath(3, 30);
                randomDoubleGenerator.randomUsingStreams(2, 8);

        }

        public double randomUsingRandom(double minInclusive, double maxExclusive) {
                final Random random = new Random();
                if (minInclusive == maxExclusive) {
                        return minInclusive;
                }

                return minInclusive + (random.nextDouble() * (maxExclusive - minInclusive));
        }

        public double randomUsingRandom() {
                return randomUsingRandom(0, Double.MAX_VALUE);
        }

        public double randomUsingStreams(double minInclusive, double maxExclusive) {
                final Random random = new Random();
                return random.doubles(minInclusive, maxExclusive).findFirst().getAsDouble();
        }

        public double randomUsingStreams() {
                return randomUsingStreams(0, Double.MAX_VALUE);
        }

        public double randomUsingMath(double minInclusive, double maxExclusive) {
                if (minInclusive == maxExclusive) {
                        return minInclusive;
                }

                return minInclusive + (Math.random() * (maxExclusive - minInclusive));
        }

        public double randomUsingMath() {
                return randomUsingMath(0, Double.MAX_VALUE);
        }


}