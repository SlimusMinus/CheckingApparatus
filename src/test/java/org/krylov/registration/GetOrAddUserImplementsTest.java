package org.krylov.registration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.krylov.entity.User;
import org.krylov.readings.SetReadings;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class GetOrAddUserImplementsTest {

    private User user;
    @Mock
    GetOrAddUser getOrAddUser;
    @BeforeEach
    void setUser(){
        user = new User("admin", "admin");
    }
    @Test
    void getUser() {
        getOrAddUser.getUser(user);
        Mockito.verify(getOrAddUser).getUser(user);
    }

    @Test
    void addUser() {
        getOrAddUser.addUser(user);
        Mockito.verify(getOrAddUser).addUser(user);
    }
}