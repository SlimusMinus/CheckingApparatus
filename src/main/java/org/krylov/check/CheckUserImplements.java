package org.krylov.check;

import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class CheckUserImplements implements CheckUser{

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
