package org.krylov.check;

import java.time.LocalDate;

public class Check_date_implements implements Check_date {

    //проверка переданных данных в текущем месяце
    @Override
    public boolean check_date(int month) {
        return month != LocalDate.now().getMonth().getValue();
    }
}
