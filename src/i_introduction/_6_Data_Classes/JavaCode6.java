package i_introduction._6_Data_Classes;

import util.JavaCode;

public class JavaCode6 extends JavaCode {

    public static class Workshop {
        private final String name;
        private final String location;

        public Workshop(String name, String location) {
            this.name = name;
            this.location = location;
        }

        public String getName() {
            return name;
        }

        public String getLocation() {
            return location;
        }
    }
}
