package java.imp;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxCanReach = 0;
        for (int i=0;i<nums.length;i++) {
            if (maxCanReach < i) return false;
            int canReach = i + nums[i];
            if (maxCanReach < canReach) maxCanReach = canReach;
        }
        return true;
    }
}
