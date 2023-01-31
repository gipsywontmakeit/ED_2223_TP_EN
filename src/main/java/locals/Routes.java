package locals;

import interfaces.Route;

public class Routes implements Route {
        private int from;
        private int to;
        private int distance;

        public Routes(int from, int to, int distance) {
            this.from = from;
            this.to = to;
            this.distance = distance;
        }

        @Override
        public int getFrom() {
            return this.from;
        }

        @Override
        public int getTo() {
            return this.to;
        }

        @Override
        public double getDistance() {
            return this.distance;
        }

        @Override
        public String toString() {
            return "Routes{" +
                    "from=" + from +
                    ", to=" + to +
                    ", distance=" + distance +
                    '}';
        }
}
