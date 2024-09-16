
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class trial {

    public static int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();
        for (String time : timePoints) {
            String[] timeArray = time.split(":");
            int minute = Integer.parseInt(timeArray[0]) * 60 + Integer.parseInt(timeArray[1]);
            minutes.add(minute);
        }
        Collections.sort(minutes);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < minutes.size() - 1; i++) {
            int diff = minutes.get(i + 1) - minutes.get(i);
            min = Math.min(min, diff);
        }

        int diff = minutes.get(0) + 1440 - minutes.get(minutes.size() - 1);
        min = Math.min(min, diff);

        return min;
    }

    public static void main(String[] args) {
        List<String> timePoints = Arrays.asList("23:59", "00:00");
        int result = findMinDifference(timePoints);
        System.out.println("Minimum time difference: " + result);
    }
}
