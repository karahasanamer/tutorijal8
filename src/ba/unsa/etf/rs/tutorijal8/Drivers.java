package ba.unsa.etf.rs.tutorijal8;

import java.time.LocalDate;
import java.util.Objects;

public class Drivers {

    String name, surname;
    int JMB;
    LocalDate birthDate, employmentDate;

    public Drivers() {
    }


    public Drivers(String name, String surname, int JMB, LocalDate birthDate, LocalDate employmentDate) {
        this.name = name;
        this.surname = surname;
        this.JMB = JMB;
        this.birthDate = birthDate;
        this.employmentDate = employmentDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getJMB() {
        return JMB;
    }

    public void setJMB(int JMB) {
        this.JMB = JMB;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drivers drivers = (Drivers) o;
        return JMB == drivers.JMB &&
                Objects.equals(name, drivers.name) &&
                Objects.equals(surname, drivers.surname) &&
                Objects.equals(birthDate, drivers.birthDate) &&
                Objects.equals(employmentDate, drivers.employmentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, JMB, birthDate, employmentDate);
    }

}
