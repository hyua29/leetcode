package java.imp;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] remainedPrerequisites = new int[numCourses];
        for (int[] pair : prerequisites) {
            remainedPrerequisites[pair[0]] += 1;
        }

        boolean[] invalidPairs = new boolean[prerequisites.length];

        for (int i = 0; i < prerequisites.length; i++) {
            for (int j = 0; j < prerequisites.length; j++) {
                if (invalidPairs[j]) continue;
                int[] pair = prerequisites[j];
                if (remainedPrerequisites[pair[1]] == 0) {
                    remainedPrerequisites[pair[0]] -= 1;
                    invalidPairs[j] = true;
                }
            }
        }

        for (int remainedPrerequisite : remainedPrerequisites) {
            if (remainedPrerequisite > 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CourseSchedule courseSchedule = new CourseSchedule();

        System.out.println(courseSchedule.canFinish(3, new int[][]{{1, 0}, {1, 2}, {0, 1}}));
    }
}
