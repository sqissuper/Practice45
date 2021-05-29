package test;

import java.util.*;

/**
 * ClassName:TextDemo8
 * Package:test
 * Description:
 *
 * @Author:HP
 * @date:2021/5/27 17:38
 */
public class TextDemo8 {
    //面试题 03.01. 三合一
//    public int[] arr;
//    public int[] size;
//    public int stackSize;
//    public TripleInOne(int stackSize) {
//        this.stackSize = stackSize;
//        this.arr = new int[stackSize * 3];
//        this.size = new int[3];
//    }
//
//    public void push(int stackNum, int value) {
//        int len = size[stackNum];
//        if(len < stackSize) {
//            arr[len + stackSize * stackNum] = value;
//            size[stackNum] = len + 1;
//        }
//    }
//
//    public int pop(int stackNum) {
//        if(isEmpty(stackNum)) return -1;
//        int tmp = arr[stackNum * stackSize + size[stackNum] - 1];
//        size[stackNum] -= 1;
//        return tmp;
//    }
//
//    public int peek(int stackNum) {
//        if(isEmpty(stackNum)) return -1;
//        int tmp = arr[stackNum * stackSize + size[stackNum] - 1];
//        return tmp;
//    }
//
//    public boolean isEmpty(int stackNum) {
//        return size[stackNum] == 0;
//    }

    //最长无重复子数组
//    public static int maxLength (int[] arr) {
//
////        int max = 1;
////        if(arr.length < 1) return arr.length;
////        int[] dp = new int[arr.length];
////        dp[0] = 1;
////        List<Integer> list = new ArrayList<>();
////        list.add(arr[0]);
////        for(int i = 1; i < arr.length; i++) {
////            if(arr[i] != arr[i - 1] && !list.contains(arr[i])) {
////                dp[i] = dp[i - 1] + 1;
////                max = Math.max(max,dp[i]);
////            } else {
////                dp[i] = 1;
////            }
////            list.add(arr[i]);
////        }
////        return max;
//
//
////        int max = 0;
////        LinkedList<Integer> list = new LinkedList<>();
////        int n = arr.length;
////        if(n < 2) return n;
////        for (int i = 0; i < n; i++) {
////            if(list.contains(arr[i])) {
////                int j = list.indexOf(arr[i]);
////                while(j-- >= 0) {
////                    list.removeFirst();
////                }
////            }
////            list.add(arr[i]);
////            max = Math.max(max,list.size());
////        }
////        return max;
//
//    }



    public static void main(String[] args) {
//        int[] arr = {2,2,3,4,8,99,3};
//        System.out.println(maxLength(arr));


        //抄送列表
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String s1 = sc.nextLine();
//            String s2 = sc.nextLine();
//            boolean f = false;
//            int idx = 0;
//            int s = 0,e = 0;
//            for(int i = 0; i < s1.length(); i++) {
//                if(!f && s1.charAt(i) == '\"') {
//                    f = true;
//                    s = i + 1;
//                    continue;
//                }
//                if(f && s1.charAt(i) == '\"') {
//                    f = false;
//                    e = i;
//                    if(s1.substring(s,e).equals(s2)) {
//                        idx = 1;
//                    }
//                    if(i + 1 < s1.length()) {
//                        s = i + 2;
//                        e = i + 2;
//                        i++;
//                        continue;
//                    }
//                }
//                if(!f && s1.charAt(i) == ',') {
//                    e = i;
//                    if(s1.substring(s,e).equals(s2)) {
//                        idx = 1;
//                    }
//                    if(i + 1 < s1.length()) {
//                        s = i + 1;
//                        e = i + 1;
//                    }
//                }
//            }
//            if(s1.substring(s,s1.length()).equals(s2)) idx = 1;
//            if(idx == 1) {
//                System.out.println("Ignore");
//            } else {
//                System.out.println("Important!");
//            }
//        }
    }
}
