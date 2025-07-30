import java.util.Scanner;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<=nums.length;i++){
            for (int j=1;j<=nums.length;j++){
               int sum = nums[i]+nums[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{};
           
        
    }
     public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int[] nums =  {sc.nextInt()};
                int target = sc.nextInt();
                int [] ans = (twoSum(nums,target));
                System.out.println("["+ans[0]+","+ans[1]+"]");
                // int[] target = sc.nextInt();
                // System.out.println(nums[i]+nums[j]=target);
            }
}