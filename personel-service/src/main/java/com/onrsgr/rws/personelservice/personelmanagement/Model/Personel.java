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
    @NotNull
    @Column(name = "ivao_id")
    Integer ivaoID;

    public Personel() {
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

    public Integer getIvaoID() {
        return ivaoID;
    }

    public void setIvaoID(Integer ivaoID) {
        this.ivaoID = ivaoID;
    }
}
