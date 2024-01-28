package org.krylov.check;

import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
/**
 * Class for checking a user to see if he is in the database*/
public class CheckOldUsersImplements implements CheckOldUsers {
    /**
     * checking the user to see if he is in the database
     * @param login -user login
     * @param allUsers - database*/
    @Override
    public User checkUser(String login, ArrayList<Map<User, Map<LocalDate, ReadingsAbstract>>> allUsers) {
        for(Map<User, Map<LocalDate, ReadingsAbstract>> item : allUsers){
            for(Map.Entry<User, Map<LocalDate, ReadingsAbstract>> users : item.entrySet())
                if(users.getKey().getLogin().equals(login))
                    return users.getKey();
        }
        return null;
    }
}
