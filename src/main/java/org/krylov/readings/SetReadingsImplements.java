package org.krylov.readings;

import org.krylov.check.Check_date;
import org.krylov.check.Check_date_implements;
import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.baseReadings.Readings;
import org.krylov.entity.User;

import java.time.LocalDate;
import java.util.Scanner;

public class SetReadingsImplements implements SetReadings{
    ReadingsAbstract readingsAbstract = new Readings();
    Scanner in = new Scanner(System.in);
    Check_date date = new Check_date_implements();
    @Override
    public ReadingsAbstract setReadings() {
        System.out.println("Input readings cold water");
        readingsAbstract.setCold_waters(in.nextInt());
        System.out.println("Input readings hot water");
        readingsAbstract.setHot_waters(in.nextInt());
        System.out.println("Input readings heating");
        readingsAbstract.setHeating(in.nextInt());
        return readingsAbstract;
    }

    @Override
    public LocalDate setDate() {
        int month = 0;
        System.out.println("Input day");
        int day = in.nextInt();
        System.out.println("Input month");
        try {
            month = in.nextInt();
            if(!date.check_date(month))
                throw new Exception("you have already entered the data");
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
        System.out.println("Input year");
        int year = in.nextInt();
        return LocalDate.of(year, month, day);
    }

    @Override
    public User registrationUser() {
        Scanner in = new Scanner(System.in);
        User user = new User();
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
        return user;
    }


}
