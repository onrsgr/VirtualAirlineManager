package com.onrsgr.rws.personelservice.personelmanagement.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "rws_personel")
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer personel_id;
    String personelRegistration;
    String personelCallsign;
    String name;
    String surname;
    Date dateOfBirth;
    String rank;

    public Personel() {
    }

    public Personel(Integer personel_id, String personelRegistration, String personelCallsign, String name, String surname, Date dateOfBirth, String rank) {
        this.personel_id = personel_id;
        this.personelRegistration = personelRegistration;
        this.personelCallsign = personelCallsign;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.rank = rank;
    }

    public Integer getPersonel_id() {
        return personel_id;
    }

    public void setPersonel_id(Integer personel_id) {
        this.personel_id = personel_id;
    }

    public String getPersonelRegistration() {
        return personelRegistration;
    }

    public void setPersonelRegistration(String personelRegistration) {
        this.personelRegistration = personelRegistration;
    }

    public String getPersonelCallsign() {
        return personelCallsign;
    }

    public void setPersonelCallsign(String personelCallsign) {
        this.personelCallsign = personelCallsign;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "personel_id=" + personel_id +
                ", personelRegistration='" + personelRegistration + '\'' +
                ", personelCallsign='" + personelCallsign + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", rank='" + rank + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personel personel = (Personel) o;
        return Objects.equals(personel_id, personel.personel_id) && Objects.equals(personelRegistration, personel.personelRegistration) && Objects.equals(personelCallsign, personel.personelCallsign) && Objects.equals(name, personel.name) && Objects.equals(surname, personel.surname) && Objects.equals(dateOfBirth, personel.dateOfBirth) && Objects.equals(rank, personel.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personel_id, personelRegistration, personelCallsign, name, surname, dateOfBirth, rank);
    }
}
