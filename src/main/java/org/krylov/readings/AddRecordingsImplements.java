package org.krylov.readings;

import org.krylov.check.CheckOldUsers;
import org.krylov.check.CheckOldUsersImplements;
import org.krylov.entity.User;
import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.database.AddRecordingsOldUserImplements;
import org.krylov.entity.database.DataBase;

import java.time.LocalDate;

public class AddRecordingsImplements extends DataBase implements AddRecordings {

    CheckOldUsers checkOldUsers = new CheckOldUsersImplements();
    /**transfer of readings (dates and readings themselves)*/
    private SetReadings setReadings = new SetReadingsImplements();
    /**link to change user data from the database*/
    AddRecordingsOldUserImplements addRecordingsOldUser = new AddRecordingsOldUserImplements();

    /**
     * adding new indications to the user
     *      @param user - to whom we add readings*/
    @Override
    public void addRecordings(User user) {
        User old_user = checkOldUsers.checkUser(user.getLogin(),super.getUsers());
        ReadingsAbstract readingsAbstract = setReadings.setReadings();
        LocalDate date = setReadings.setDate(user);
        addRecordingsOldUser.addRecordingsOldUser(old_user, date, readingsAbstract);
        System.out.println("Your submitted recordings");
        System.out.println(date + " " + readingsAbstract);
    }
}
