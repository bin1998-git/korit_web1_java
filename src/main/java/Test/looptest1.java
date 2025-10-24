package Test;

public class looptest1 {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3,4,5}, // 자료형 -> int[]
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        // nums에 있는 짝수들을 모두 더한 값을 출력해 주세요!
        int evensum = 0;
        for (int i = 0; i < nums.length; i++) {
            int[]num = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int addnum = num[j];
                if (addnum % 2 == 0) {
                    evensum += addnum;
                }
            }
        }
        System.out.println("짝수들을 더한값을 출력하세요: " + evensum);
    }
}
