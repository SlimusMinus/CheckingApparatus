package org.krylov.registration;

import org.junit.jupiter.api.Test;
import org.krylov.entity.User;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class RegistrationUsersImplementsTest {
    private User user = new User("admin", "admin");
    private RegistrationUsers users = new RegistrationUsersImplements();

    @Test
    void currentIndications(){
        users.getUser(user);
        verify(users, times(1)).getUser(user);
    }
    @Test
    void addUser(){
        users.getUser(user);
        verify(users, Mockito.times(1)).addUser(user);
    }
    @Test
    void addRecordings(){
        users.addRecordings(user);
        verify(users, Mockito.times(1)).addRecordings(user);
    }
}
