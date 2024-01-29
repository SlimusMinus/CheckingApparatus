package org.krylov.readings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.krylov.endpoints.RelizEndPoints;
import org.krylov.entity.User;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AddRecordingsImplementsTest {
    private User user;
    @Mock
    AddRecordings addRecordings;
    @BeforeEach
    void setUser(){
        user = new User("admin", "admin");
    }

    @Test
    void addRecordings() {
        addRecordings.addRecordings(user);
        Mockito.verify(addRecordings).addRecordings(user);
    }
}