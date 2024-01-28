package org.krylov.check;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.krylov.entity.User;

class Check_date_implementsTest {
    private  User user;
    @BeforeEach
    void setUser(){
        user = new User("admin", "admin");
    }

    @Test
    void checkDate(){
        Check_date_implements checkDateImplements = new Check_date_implements();
        boolean check = checkDateImplements.check_date(10, 2023, user);
        Assertions.assertTrue(check);
    }

}
