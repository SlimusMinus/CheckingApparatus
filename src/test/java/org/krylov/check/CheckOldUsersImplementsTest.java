package org.krylov.check;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.krylov.entity.User;
import org.krylov.entity.baseReadings.Readings;
import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.database.DataBase;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

class CheckOldUsersImplementsTest {

    @Test
    void setUser(){
        CheckOldUsersImplements checkOldUsersImplements = new CheckOldUsersImplements();
        DataBase dataBase = new DataBase();
        User user = checkOldUsersImplements.checkUser("admin", dataBase.getUsers());
        Map<LocalDate, ReadingsAbstract> dataUser1 = new TreeMap<>();
        dataUser1.put(LocalDate.of(2023, 10, 2), new Readings(100, 200, 150));
        User user1 = new User("admin", "admin", "Pol", 25, "London", dataUser1);
        Assertions.assertEquals(user, user1);
    }
}
