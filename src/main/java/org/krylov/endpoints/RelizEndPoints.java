package org.krylov.endpoints;

import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.User;
import org.krylov.registration.RegistrationUsers;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

/**
 * class for implementing registered user actions*/
public class RelizEndPoints {
    Scanner in = new Scanner(System.in);

    /**
     * output of current data to the console
     * @param user - specific user
     * @param users - database
     */
    public void currentIndications(RegistrationUsers users, User user ){
        for(Map<User, Map<LocalDate, ReadingsAbstract>> item : users.getDataBase()){
            for(Map<User, Map<LocalDate, ReadingsAbstract>> items : users.getDataBase()){
                for(Map.Entry<User, Map<LocalDate, ReadingsAbstract>> allUsers : items.entrySet()){
                    if(allUsers.getKey().getLogin().equals(user.getLogin())){
                        final int maplength = allUsers.getValue().size();
                        Object object =  allUsers.getValue().entrySet().stream().toArray()[maplength-1];
                        System.out.println(allUsers.getKey().getName() + "\n" + object);
                        return;
                    }
                }
            }
        }
    }

    /**
     * output to the console data for a specific month
     *      @param user - specific user
     *      @param users - database
     */
    public void specificMonth(RegistrationUsers users, User user){
        System.out.println("Input your month");
        int month = in.nextInt();

        for(Map<User, Map<LocalDate, ReadingsAbstract>> item : users.getDataBase()) {
            for (Map.Entry<User, Map<LocalDate, ReadingsAbstract>> allUsers : item.entrySet()) {
                if (allUsers.getKey().getLogin().equals(user.getLogin())) {
                    Map<LocalDate, ReadingsAbstract> allMonth = allUsers.getValue();
                    for (Map.Entry<LocalDate, ReadingsAbstract> items : allMonth.entrySet()) {
                        if (items.getKey().getMonth().getValue() == month)
                            System.out.println(items);
                        else
                            System.out.println("No data this month");
                    }
                }
            }
        }
    }

    /**
     * output to the console all readings of the current user
     *       @param user - specific user
     *       @param users - database
     */
    public void allRecordings(RegistrationUsers users, User user){
        for(Map<User, Map<LocalDate, ReadingsAbstract>> item : users.getDataBase()) {
            for (Map.Entry<User, Map<LocalDate, ReadingsAbstract>> allUsers : item.entrySet()) {
                if (allUsers.getKey().getLogin().equals(user.getLogin()))
                    System.out.println(allUsers.getKey().getName() + "\n" + allUsers.getValue());
            }
        }
    }
    /**
     output to the console of all readings of all users for the administrator
     * @param user - specific user
     * @param users - database
     */
    public void allRecordingsForAdmin(RegistrationUsers users, User user){
        if(user.getLogin().equals("admin")){
            for(Map<User, Map<LocalDate, ReadingsAbstract>> item : users.getDataBase()) {
                for (Map.Entry<User, Map<LocalDate, ReadingsAbstract>> allUsers : item.entrySet()) {
                    System.out.println(allUsers.getKey().getName() + "\n" + allUsers.getValue());
                }
            }
        }
        else {
            System.out.println("You do not have access rights");
            System.exit(1);
        }

    }
}
