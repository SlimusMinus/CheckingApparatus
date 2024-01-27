package org.krylov.entity.database;

import org.krylov.entity.User;
import org.krylov.entity.baseReadings.ReadingsAbstract;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AddNewUserImpl extends DataBase implements AddNewUser{

    //добавление нового пользователя
    public void addNewUser(User user, LocalDate date, ReadingsAbstract readingsAbstract) {
        Map<LocalDate, ReadingsAbstract> newUser = new TreeMap<>();
        newUser.put(date, readingsAbstract);
        Map<User, Map<LocalDate, ReadingsAbstract>> fullUser1 = new HashMap<>();
        fullUser1.put(user, newUser);
        super.getUsers().add(fullUser1);
    }
}
