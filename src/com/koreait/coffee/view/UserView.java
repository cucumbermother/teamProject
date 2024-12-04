package com.koreait.coffee.view;

import com.koreait.coffee.controller.UserController;
import com.koreait.coffee.model.dto.User;

import java.util.Scanner;

public class UserView {
public Scanner sc = new Scanner(System.in);
public UserController userController = new UserController();
    public User signIn(){
        while (true){
            System.out.println("  1.핸드폰번호 입력    2.적립안함");
            int choose = 0;
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR");
                sc.nextLine();
                continue;
            }
            switch (choose){
                case 1:
                    System.out.println("핸드폰번호를 입력하세요:");
                    String phoneNumber = sc.next();
                    System.out.println("이름을 입력해 주세요.");
                    String name = sc.next();
                    User user = userController.getUserByPhoneNumber(phoneNumber);
                    if (user == null){
                        User newUser = new User();
                        newUser.setPhoneNumber(phoneNumber);
                        newUser.setName(name);
                        newUser.setPoint(0);
                        userController.addUser(newUser);
                        return newUser;
                    }

                    return user;
                case 2:
                    return null;

            }
        }
    }



}



