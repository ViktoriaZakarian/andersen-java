package lesson_9;

import java.time.LocalTime;

public class Park {

    public class Attraction {

        private String name;
        private LocalTime startTime;
        private LocalTime endTime;
        private int cost;

        public Attraction(String name, LocalTime startTime, LocalTime endTime, int cost) {
            this.name = name;
            this.startTime = startTime;
            this.endTime = endTime;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalTime getStartTime() {
            return startTime;
        }

        public void setStartTime(LocalTime startTime) {
            this.startTime = startTime;
        }

        public LocalTime getEndTime() {
            return endTime;
        }

        public void setEndTime(LocalTime endTime) {
            this.endTime = endTime;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", startTime=" + startTime +
                    ", endTime=" + endTime +
                    ", cost=" + cost +
                    '}';
        }
    }
}
