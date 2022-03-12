package com.onrsgr.rws.personelservice.personelmanagement.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "rws_personel")
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer personelId;
    @NotNull
    String personelRegistration;
    @NotNull
    String personelCallsign;
    @NotNull
    String personelName;
    @NotNull
    String personelSurname;
    @NotNull
    Date personelDateOfBirth;
    @NotNull
    String personelRank;

    public Personel() {
    }

    public Personel(Integer personelId, String personelRegistration, String personelCallsign, String personelName, String personelSurname, Date personelDateOfBirth, String personelRank) {
        this.personelId = personelId;
        this.personelRegistration = personelRegistration;
        this.personelCallsign = personelCallsign;
        this.personelName = personelName;
        this.personelSurname = personelSurname;
        this.personelDateOfBirth = personelDateOfBirth;
        this.personelRank = personelRank;
    }

    public Integer getPersonelId() {
        return personelId;
    }

    public void setPersonelId(Integer personelId) {
        this.personelId = personelId;
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

    public String getPersonelName() {
        return personelName;
    }

    public void setPersonelName(String personelName) {
        this.personelName = personelName;
    }

    public String getPersonelSurname() {
        return personelSurname;
    }

    public void setPersonelSurname(String personelSurname) {
        this.personelSurname = personelSurname;
    }

    public Date getPersonelDateOfBirth() {
        return personelDateOfBirth;
    }

    public void setPersonelDateOfBirth(Date personelDateOfBirth) {
        this.personelDateOfBirth = personelDateOfBirth;
    }

    public String getPersonelRank() {
        return personelRank;
    }

    public void setPersonelRank(String personelRank) {
        this.personelRank = personelRank;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "personelId=" + personelId +
                ", personelRegistration='" + personelRegistration + '\'' +
                ", personelCallsign='" + personelCallsign + '\'' +
                ", personelName='" + personelName + '\'' +
                ", personelSurname='" + personelSurname + '\'' +
                ", personelDateOfBirth=" + personelDateOfBirth +
                ", personelRank='" + personelRank + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personel personel = (Personel) o;
        return Objects.equals(personelId, personel.personelId) && Objects.equals(personelRegistration, personel.personelRegistration) && Objects.equals(personelCallsign, personel.personelCallsign) && Objects.equals(personelName, personel.personelName) && Objects.equals(personelSurname, personel.personelSurname) && Objects.equals(personelDateOfBirth, personel.personelDateOfBirth) && Objects.equals(personelRank, personel.personelRank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personelId, personelRegistration, personelCallsign, personelName, personelSurname, personelDateOfBirth, personelRank);
    }
}
