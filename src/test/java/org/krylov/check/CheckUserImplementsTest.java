package org.krylov.check;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.krylov.entity.database.DataBase;


public class CheckUserImplementsTest {
    @Test
    void setLogin(){
        CheckUserImplements checkUserImplements = new CheckUserImplements();
        DataBase dataBase = new DataBase();
        boolean check = checkUserImplements.checkUser("admin", dataBase.getUsers());
        Assertions.assertTrue(check);
    }
}
