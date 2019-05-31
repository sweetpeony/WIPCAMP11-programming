/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class stock {

    public static void main(String[] args) {
        int limit = 10;
        int item = 5;
        System.out.printf("%d \n", limit);
        System.out.printf("%d \n", item);
        System.out.println("Select menu");
        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Check");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter menu : ");

        int menu = sc.nextInt();
        System.out.println("menu : " + menu);
        if (menu == 1) {
            if (item < limit) {
                int amount;
                //Scanner sc = new Scanner(System.in);

                System.out.print("Enter amount to add : ");
                amount = sc.nextInt();
                System.out.println("amount : " + amount);
                if (item + amount > limit) {
                    System.out.print("item เกินลิมิต T_T");
                } else {
                    int item2;
                    item2 = amount + item;
                    System.out.println("Add item แล้วนะ");
                    System.out.printf("%d \n", item2);
                    System.out.printf("%d \n", limit);
                }
            } else {
                System.out.println("item เต็มแล้วจ้า ^^ ");
            }
        } else if (menu == 2) {
            if (item > 0) {
                int amount;
                System.out.print("Enter amount to remove : ");
                amount = sc.nextInt();
                System.out.println("amount : " + amount);
                //Scanner sc = new Scanner(System.in);
                int item2;
                int item3;

                item2 = amount + item;
                if (item - amount < 0) {
                    System.out.print("item มีไม่พอให้ลบ TT");
                } 
                else {
                    System.out.print("Remove item แล้วนะ");
                    item3 = item2 - amount;
                    System.out.printf("%d \n", item3);
                    System.out.printf("%d \n", limit);
                }
            }
            else{
                System.out.print("ไม่มีไอเทมในโกดัง");
            }
            /*else{
            System.out.println("Press 3");       
            //Scanner sc = new Scanner(System.in);
        
            System.out.print("Enter menu : ");

            menu = sc.nextInt();
            System.out.println("menu : " + menu);
            } */
        } else if (menu == 3) {
            System.out.printf("%d \n", item);
            System.out.printf("%d \n", limit);
        } else {
            System.out.print("menu ไม่ถูกต้อง");
        }

    }

}
