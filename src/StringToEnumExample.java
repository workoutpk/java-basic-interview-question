import java.util.Map;
import java.util.stream.Stream;

public enum StringToEnumExample {

        NORTH("north"),
        SOUTH("south"),
        WEST("west"),
        EAST("east");
        private static Map<String, StringToEnumExample> nameToValue;
        private final String name;

        StringToEnumExample(String name) {
                this.name = name;
        }

        public static StringToEnumExample fromValueVersion1(String givenName) {
                for (StringToEnumExample direction : values()) {
                        if (direction.name.equals(givenName)) {
                                return direction;
                        }
                }

                return null;
        }

        public static StringToEnumExample fromValueVersion2(String givenName) {
                return Stream.of(values())
                    .filter(direction -> direction.name.equals(givenName))
                    .findFirst()
                    .orElse(null);
        }

        public static StringToEnumExample fromValueVersion3(String givenName) {
                return nameToValue.get(givenName);
        }

        public String getName() {
                return name;
        }
}
