package org.krylov.entity.database;

import org.krylov.entity.User;
import org.krylov.entity.baseReadings.ReadingsAbstract;

import java.time.LocalDate;

public interface AddRecordingsOldUser {
    public void addRecordingsOldUser(User user, LocalDate date, ReadingsAbstract readingsAbstract);
}
