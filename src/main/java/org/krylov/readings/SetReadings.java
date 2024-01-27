package org.krylov.readings;

import org.krylov.entity.baseReadings.ReadingsAbstract;
import org.krylov.entity.User;

import java.time.LocalDate;

public interface SetReadings {
    public ReadingsAbstract setReadings();
    public LocalDate setDate();
    public User registrationUser();
}
