package org.krylov.check;

import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public interface CheckUser {
    public boolean checkUser(String login, ArrayList<Map<User, Map<LocalDate, ReadingsAbstract>>> allUsers);
}
