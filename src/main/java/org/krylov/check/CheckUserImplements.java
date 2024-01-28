package org.krylov.check;

import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

/**
 * class for user authentication*/
public class CheckUserImplements implements CheckUser{
    /**
     * user login verification
     * @param login - user login
     * @param allUsers - database*/
    @Override
    public boolean checkUser(String login, ArrayList<Map<User, Map<LocalDate, ReadingsAbstract>>> allUsers) {
        for(Map<User, Map<LocalDate, ReadingsAbstract>> item : allUsers){
            for(Map.Entry<User, Map<LocalDate, ReadingsAbstract>> users : item.entrySet())
                if(users.getKey().getLogin().equals(login))
                    return true;
        }
        return false;
    }
}
