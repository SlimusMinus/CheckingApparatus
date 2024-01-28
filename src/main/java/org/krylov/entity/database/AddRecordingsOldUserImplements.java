package org.krylov.entity.database;

import org.krylov.entity.User;
import org.krylov.entity.baseReadings.ReadingsAbstract;

import java.time.LocalDate;
import java.util.Map;

/**
 * class for changing user data from the database*/
public class AddRecordingsOldUserImplements extends DataBase implements AddRecordingsOldUser{

    /**
     * changing user data from the database
     *      @param readingsAbstract - transmission of readings
     *       @param user - user from the database
     *       @param date - date of transmission of readings */
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
