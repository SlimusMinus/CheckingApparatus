package org.krylov.readings;

import org.krylov.check.Check_date;
import org.krylov.check.Check_date_implements;
import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.baseReadings.Readings;
import org.krylov.entity.User;

import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * class for creating and transmitting new counter readingsв*/
public class SetReadingsImplements implements SetReadings{
    Scanner in = new Scanner(System.in);
    /**
     * variable for transmitting readings*/
    ReadingsAbstract readingsAbstract = new Readings();
    /**
     * variable for checking transmitted readings*/
    Check_date date = new Check_date_implements();

    /**
     * setting new readings*/
    @Override
    public ReadingsAbstract setReadings() {
        try {
            System.out.println("Input readings cold water");
            readingsAbstract.setCold_waters(in.nextInt());
            System.out.println("Input readings hot water");
            readingsAbstract.setHot_waters(in.nextInt());
            System.out.println("Input readings heating");
            readingsAbstract.setHeating(in.nextInt());
        }
        catch (InputMismatchException exception){
            System.out.println("Incorrect data format");
            System.exit(0);
        }
        return readingsAbstract;
    }
    /**
     *date of transmission of evidence*/
    @Override
    public LocalDate setDate(User user) {
        int day = 0, month = 0, year = 0;
        try {
            System.out.println("Input day");
            day = in.nextInt();
            System.out.println("Input month");
            month = in.nextInt();
            System.out.println("Input year");
            year = in.nextInt();
        }
        catch (InputMismatchException exception){
            System.out.println("Incorrect data format");
            System.exit(0);
        }
        if(date.check_date(month, year, user)){
            System.out.println("This month the data has already been transferred");
            System.exit(0);
        }

        return LocalDate.of(year, month, day);
    }

    /**
     * New User Registration*/
    @Override
    public User registrationUser() {
        Scanner in = new Scanner(System.in);
        User user = new User();
        try{
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
            System.out.println("Congratulations new user, please input your readings");
        }
        catch (InputMismatchException exception){
            System.out.println("Incorrect data format");
            System.exit(0);
        }
        return user;
    }


}
