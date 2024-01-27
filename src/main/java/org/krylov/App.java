package org.krylov;

import org.krylov.endpoints.RelizEndPoints;
import org.krylov.entity.database.DataBase;
import org.krylov.registration.RegistrationUsers;
import org.krylov.registration.RegistrationUsersImplements;
import org.krylov.entity.User;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        RegistrationUsers users = new RegistrationUsersImplements();
        User user = new User();
        Scanner in = new Scanner(System.in);
        RelizEndPoints endPoints = new RelizEndPoints();

        System.out.println("Hello dear user");
        System.out.println("Input 1 if you are want authorization, 2 if you are want authentication");
        int choice = in.nextInt();
        switch (choice) {
            case (1): {
                users.addUser(user);
            }
            break;
            case (2): {
                System.out.println("Input your login");
                user.setLogin(in.next());
                System.out.println("Input your password");
                user.setPassword(in.next());
                users.getUser(user);
                System.out.println("Input number endpoint");
                System.out.println("1 - endpoint for obtaining current meter readings");
                System.out.println("2 - reading endpoint");
                System.out.println("3 - endpoint for viewing readings for a specific month");
                System.out.println("4 - endpoint for viewing the history of testimony submission");
                System.out.println("5 - endpoint for viewing the history of testimony of all users");
                int endpoint = in.nextInt();
                switch (endpoint) {
                    case (1):
                        endPoints.currentIndications(users, user);
                        break;
                    case (2):
                        users.addRecordings(user);
                        break;
                    case (3):
                        endPoints.specificMonth(users, user);
                        break;
                    case (4):
                        endPoints.allRecordings(users, user);
                        break;
                    case (5):
                        endPoints.allRecordingsForAdmin(users, user);
                        break;
                    default:
                        System.out.println("This endpoint is missing");
                }
            }
        }
    }
}
