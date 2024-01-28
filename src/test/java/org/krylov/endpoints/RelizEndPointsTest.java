package org.krylov.endpoints;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.krylov.entity.User;
import org.krylov.registration.RegistrationUsers;
import org.krylov.registration.RegistrationUsersImplements;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class RelizEndPointsTest {
   @Mock
    RelizEndPoints endPoints ;
    RegistrationUsers users;
    User user;
    @BeforeEach
    void setUp(){
        users = new RegistrationUsersImplements();
        user = new User("admin", "admin");
        endPoints = new RelizEndPoints();
    }
    @Test
    void currentIndications(){
        verify(endPoints, Mockito.times(1)).currentIndications(users, user);
    }
    @Test
    void specificMonth(){
        verify(endPoints, Mockito.times(1)).specificMonth(users, user);
    }
    @Test
    void allRecordings(){
        verify(endPoints, Mockito.times(1)).allRecordings(users, user);
    }
    @Test
    void allRecordingsForAdmin(){
        verify(endPoints, Mockito.times(1)).allRecordingsForAdmin(users, user);
    }

}
