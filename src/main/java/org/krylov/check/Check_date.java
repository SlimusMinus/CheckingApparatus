package org.krylov.check;

import org.krylov.entity.User;

import java.time.LocalDate;

public interface Check_date {

    public boolean check_date(int month, int year, User user);

}
