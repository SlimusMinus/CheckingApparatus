package org.krylov.entity.database;

import org.krylov.entity.User;
import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.baseReadings.Readings;

import java.time.LocalDate;
import java.util.*;
import java.util.Map;

//создание общей базы данных
public class DataBase {

    //база пользователей
    private ArrayList<Map<User, Map<LocalDate, ReadingsAbstract>>> users = new ArrayList<>();

    //геттер
    public ArrayList<Map<User, Map<LocalDate, ReadingsAbstract>>> getUsers() {
        return users;
    }

    //заполнение базы данных при создании экземпляра БД
    public DataBase() {
        startAddUsers();
    }

    //Создание БД
    public void startAddUsers() {

        Map<LocalDate, ReadingsAbstract> dataUser1 = new TreeMap<>();
        dataUser1.put(LocalDate.of(2023, 10, 2), new Readings(100, 200, 150));
        dataUser1.put(LocalDate.of(2023, 11, 3), new Readings(110, 202, 400));
        dataUser1.put(LocalDate.of(2023, 12, 4), new Readings(115, 302, 718));
        User user1 = new User("admin", "admin", "Pol", 25, "London", dataUser1);
        Map<User, Map<LocalDate, ReadingsAbstract>> fullUser1 = new HashMap<>();
        fullUser1.put(user1, dataUser1);

        Map<LocalDate, ReadingsAbstract> dataUser2 = new TreeMap<>();
        dataUser2.put(LocalDate.of(2023, 10, 5), new Readings(99, 200, 150));
        dataUser2.put(LocalDate.of(2023, 11, 6), new Readings(48, 41, 400));
        dataUser2.put(LocalDate.of(2023, 12, 7), new Readings(19, 302, 718));
        User user2 = new User("Tom", "Tom", "Tom", 33, "Moscow", dataUser2);
        Map<User, Map<LocalDate, ReadingsAbstract>> fullUser2 = new HashMap<>();
        fullUser2.put(user2, dataUser2);

        Map<LocalDate, ReadingsAbstract> dataUser3 = new TreeMap<>();
        dataUser3.put(LocalDate.of(2023, 10, 8), new Readings(15, 200, 150));
        dataUser3.put(LocalDate.of(2023, 11, 9), new Readings(55, 30, 400));
        dataUser3.put(LocalDate.of(2023, 12, 10), new Readings(99, 302, 718));
        User user3 = new User("Kris", "Kris", "Kris", 25, "London", dataUser3);
        Map<User, Map<LocalDate, ReadingsAbstract>> fullUser3 = new HashMap<>();
        fullUser3.put(user3, dataUser3);

        Map<LocalDate, ReadingsAbstract> dataUser4 = new TreeMap<>();
        dataUser4.put(LocalDate.of(2023, 10, 11), new Readings(44, 200, 150));
        dataUser4.put(LocalDate.of(2023, 11, 12), new Readings(66, 30, 400));
        dataUser4.put(LocalDate.of(2023, 12, 13), new Readings(78, 302, 718));
        User user4 = new User("Jack", "Jack", "Jack", 25, "London", dataUser4);
        Map<User, Map<LocalDate, ReadingsAbstract>> fullUser4 = new HashMap<>();
        fullUser4.put(user4, dataUser4);

        users.add(fullUser1);
        users.add(fullUser2);
        users.add(fullUser3);
        users.add(fullUser4);

    }


}
