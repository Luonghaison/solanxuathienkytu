package rikkei.academy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi m muốn kiểm tra: ");
        String str = sc.nextLine();
        System.out.println("Nhập ký tự muốn kiểm tra: ");
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự đó là: "+ count);
    }
}
