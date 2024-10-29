import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int count=nums.length;
        for(int i=0;i<count;i++) {
            for(int j=i+1;j<count;j++) {
                if(nums[i]+nums[j]==target) {
                    nums[0]=i;
                    nums[1]=j;
                    return nums;
                }
            }
        }
        nums[0]=-1;
        nums[1]=-1;
        System.out.println(nums[0]);
        System.out.print(nums[1]);
        return nums;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        sol.twoSum(nums,target);
    }
}