package org.krylov.entity;

import org.krylov.entity.baseReadings.ReadingsAbstract;

import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;

public class User {

    //entity класс содержащий данные о пользователе, геттеры и сеттеры
    private String login;
    private String password;
    private String name;
    private int age;
    private String city;
    private ReadingsAbstract readingsAbstract;
    private Map<LocalDate, ReadingsAbstract> dataUser;

    public ReadingsAbstract getReadings() {
        return readingsAbstract;
    }

    public void setReadings(ReadingsAbstract readingsAbstract) {
        this.readingsAbstract = readingsAbstract;
    }

    public User() {}

    public User(String login, String password, String name, int age, String city,  Map<LocalDate, ReadingsAbstract> dataUser) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.age = age;
        this.city = city;
        this.dataUser = dataUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User " + name + '\'' + ", age= " + age + ", city= '" + city + '\n';
    }
}
