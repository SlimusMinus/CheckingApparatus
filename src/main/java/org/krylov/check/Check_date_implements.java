package org.krylov.check;

import org.krylov.entity.User;
import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.database.DataBase;

import java.time.LocalDate;
import java.util.Map;


/**
 *class for checking transmitted data in the current month
 */
public class Check_date_implements extends DataBase implements Check_date {
    /**
     * checking the transmitted data in the current month
     * @param month - transferred month
     * @param year - transferred year
     * @param user - verified user
     * */
    @Override
    public boolean check_date(int month, int year, User user) {
        for(Map<User, Map<LocalDate, ReadingsAbstract>> item : super.getUsers()) {
            for (Map.Entry<User, Map<LocalDate, ReadingsAbstract>> allUsers : item.entrySet()) {
                if (allUsers.getKey().getLogin().equals(user.getLogin())) {
                    Map<LocalDate, ReadingsAbstract> allMonth = allUsers.getValue();
                    for (Map.Entry<LocalDate, ReadingsAbstract> items : allMonth.entrySet()) {
                        if (items.getKey().getMonth().getValue() == month && items.getKey().getYear() == year)
                          return true;
                    }
                }
            }
        }
        return false;
    }
}
