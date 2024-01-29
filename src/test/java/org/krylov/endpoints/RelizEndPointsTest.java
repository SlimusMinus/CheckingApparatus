package org.krylov.endpoints;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.krylov.entity.User;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RelizEndPointsTest {
    private User user;
    @Mock
    RelizEndPoints endPoints;
    @BeforeEach
    void setUser(){
        user = new User("admin", "admin");
    }

    @Test
    void currentIndications() {
        endPoints.currentIndications(user);
        Mockito.verify(endPoints).currentIndications(user);
    }

    @Test
    void specificMonth() {
        endPoints.specificMonth(user);
        Mockito.verify(endPoints).specificMonth(user);
    }

    @Test
    void allRecordings() {
        endPoints.allRecordings(user);
        Mockito.verify(endPoints).allRecordings(user);
    }

    @Test
    void allRecordingsForAdmin() {
        endPoints.allRecordingsForAdmin(user);
        Mockito.verify(endPoints).allRecordingsForAdmin(user);
    }
}