package org.krylov.entity.database;

import org.krylov.entity.User;
import org.krylov.entity.baseReadings.ReadingsAbstract;

import java.time.LocalDate;
import java.util.Map;

public class AddRecordingsOldUserImplements extends DataBase implements AddRecordingsOldUser{

    //изменение данных пользователя из БД
    public void addRecordingsOldUser(User user, LocalDate date, ReadingsAbstract readingsAbstract) {

        for (Map<User, Map<LocalDate, ReadingsAbstract>> item : super.getUsers()) {
            for (Map.Entry<User, Map<LocalDate, ReadingsAbstract>> Map : item.entrySet()) {
                if (Map.getKey().getLogin().equals(user.getLogin())) {
                    Map.getValue().put(date, readingsAbstract);
                }
            }
        }
    }
}
