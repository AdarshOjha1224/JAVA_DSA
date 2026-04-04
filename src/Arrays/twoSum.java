package Arrays;

import java.util.Scanner;

public class twoSum {

    public static void sum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i]+nums[j]==target) System.out.println("["+nums[i]+","+nums[j]+"]");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the value : ");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the TARGET : ");
        int target = sc.nextInt();

        sum(nums,target);

        // DID IT MYSELF --
//         boolean flag = false ;
//         for(int i = 0 ; i < arr.length ; i++){
//             for(int j = i+1  ; j < arr.length; j++ ){
//                 if((arr[i]+arr[j])==target) flag = true;
//             }
//         }
//
//        System.out.println( (flag) ? "Found" : "Not Found");


        // FROM THE LEETCODE --
//        for(int i = 0 ; i < nums.length ; i++){
//            for(int j = i+1 ; j < nums.length ; j++){
//                if(nums[i]+nums[j]==target) return new int[] { i, j };
//            }
//        }
//        return new int[] {};


        // FROM THE LECTURE --

//        public static boolean sum(int arr[] , int target){
//            for(int i = 0 ; i < arr.length ; i++){
//                for(int j = i+1 ; j < arr.length ; j++){
//                    if(arr[i]+arr[j] == target) return true ;
//                }
//            }
//            return false ;
//        }


    }
}
