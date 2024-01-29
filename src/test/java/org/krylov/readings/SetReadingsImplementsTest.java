package org.krylov.readings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.krylov.entity.User;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SetReadingsImplementsTest {
    private User user;
    @Mock
    SetReadings readings;
    @BeforeEach
    void setUser(){
        user = new User("admin", "admin");
    }

    @Test
    void setReadings() {
        readings.setReadings();
        Mockito.verify(readings).setReadings();
    }

    @Test
    void setDate() {
        readings.setDate(user);
        Mockito.verify(readings).setDate(user);
    }

    @Test
    void registrationUser() {
        readings.registrationUser();
        Mockito.verify(readings).registrationUser();
    }
}