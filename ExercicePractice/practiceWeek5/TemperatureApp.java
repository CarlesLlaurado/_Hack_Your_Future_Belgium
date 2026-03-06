package practiceWeek5;

public class TemperatureApp {

    public static int weekAverage(int[] week) {

        int sum = 0;

        for (int temp : week) {
            sum += temp;
        }
        return sum / week.length;
    }

    public static int coldestTemperature(int[][] temps) {

        int coldest = temps[0][0];

        for (int[] week : temps) {
            for (int temp : week) {
                if (coldest > temp) {
                    coldest = temp;
                }
            }
        }
        return coldest;
    }

    public static void main(String[] args) {

        int[][] temps = {
                {3, 5, 2, 4},   // Week 1
                {6, 1, 0, 2},   // Week 2
                {4, 4, 3, 5}    // Week 3
        };

        for (int i = 0; i < temps.length; i++) {
            int average = weekAverage(temps[i]);
            System.out.println("Week " + (i + 1) + " average: " + average);
        }

        int coldest = coldestTemperature(temps);
        System.out.println("Coldest temperature: " + coldest);
    }
}


