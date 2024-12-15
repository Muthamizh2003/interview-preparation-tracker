package DailyLeetCode;

//https://www.linkedin.com/posts/muthamizh-kumaran-l-05433724a_leetcode-problemsolving-greedy-activity-7273971517170814976-r6-g?utm_source=share&utm_medium=member_desktop
import java.util.*;
class Solution {
    class Classpair {
        int[] classi;
        double avg;

        Classpair(int[] classi, double avg) {
            this.classi = classi;
            this.avg = avg;
        }
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // 2D int array->classes
        // classes[i]->[pass,toatal] => wkt total stud
        PriorityQueue<Classpair> queue = new PriorityQueue<>((a, b) -> {
            double diffA = ((a.classi[0] + 1) / (double) (a.classi[1] + 1)) - a.avg;
            double diffB = ((b.classi[0] + 1) / (double) (b.classi[1] + 1)) - b.avg;
            return Double.compare(diffB, diffA);
        });
        for (int[] classe : classes) {
            double avg = (classe[0] / (double) classe[1]);
            queue.add(new Classpair(classe, avg));
        }
        for (int i = 0; i < extraStudents; i++)
        {
            Classpair classPair = queue.poll();
            int[] classe = classPair.classi;
            double newAvg = (classe[0] + 1) / (double) (classe[1] + 1);
            queue.add(new Classpair(new int[] { classe[0] + 1, classe[1] + 1 }, newAvg));
        }
        double avgtot = 0;
        while (!queue.isEmpty()) {
            Classpair v = queue.poll();
            avgtot += v.avg;
        }
        return avgtot / classes.length;
    }
}