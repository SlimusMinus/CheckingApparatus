package org.krylov.registration;

import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public interface RegistrationUsers {
   // public void getOrAddUser(User user);
    public ArrayList<Map<User, Map<LocalDate, ReadingsAbstract>>> getDataBase();

    public void getUser (User user);
    public void addUser(User user);

    public void addRecordings(User user);

}
