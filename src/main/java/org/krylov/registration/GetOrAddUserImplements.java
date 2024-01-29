package org.krylov.registration;

import org.krylov.check.CheckUser;
import org.krylov.check.CheckUserImplements;
import org.krylov.entity.database.*;
import org.krylov.entity.database.AddNewUserImpl;
import org.krylov.entity.database.DataBase;
import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.User;
import org.krylov.readings.SetReadings;
import org.krylov.readings.SetReadingsImplements;

import java.time.LocalDate;
import java.util.*;

public class GetOrAddUserImplements extends DataBase implements GetOrAddUser {
    Scanner in = new Scanner(System.in);
    /**checking for user presence in the database*/
    CheckUser checkUser = new CheckUserImplements();

    /**link to add a new user*/
    AddNewUser newUser = new AddNewUserImpl();
    /**transfer of readings (dates and readings themselves)*/
    private SetReadings setReadings = new SetReadingsImplements();

    /**
     * getting user from database*/
    @Override
    public void getUser(User user) {
        if (checkUser.checkUser(user.getLogin(), super.getUsers())) {
            System.out.println("Hello " + user.getLogin());

        } else {
            System.out.println("Your login or password incorrect");
            System.exit(1);
        }
    }

    /**
     * creating a new user and transferring readings
     *      @param user - object for creating a new user*/
    @Override
    public void addUser(User user) {
        System.out.println("Welcome new user, input your personal data");
        System.out.println("Input your login");
        user.setLogin(in.next());
        System.out.println("Input your password");
        user.setPassword(in.next());
        System.out.println("Input your name");
        user.setName(in.next());
        System.out.println("Input your age");
        user.setAge(in.nextInt());
        System.out.println("Input your city");
        user.setCity(in.next());
        System.out.println("Welcome new user is" + user.getName() + "input your recordings");
        ReadingsAbstract readingsAbstract = setReadings.setReadings();
        LocalDate date = setReadings.setDate(user);
        newUser.addNewUser(user, date, readingsAbstract);
        System.out.println("Your submitted recordings");
        System.out.println(date + " " + readingsAbstract);
    }



}
