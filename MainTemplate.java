package com.dsdaaa.acm;

import java.util.Scanner
/**
* ACM输入模板（多数之和）
* @author yupi
*/
public class MainTemplate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            System.out.println("输出结果:" + sum);
    scanner.close();
    }
}
