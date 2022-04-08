package com.onrsgr.rws.personelservice.personelmanagement.Model;

import org.springframework.web.context.annotation.RequestScope;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "rws_personel")
@RequestScope
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long personelId;
    @NotEmpty
    String personelRegistration;
    @NotEmpty
    String personelCallsign;
    @NotEmpty
    String personelName;
    @NotEmpty
    String personelSurname;
    //@NotEmpty
    Date personelDateOfBirth;

    String personelRank;

    @Column(name = "personel_ivao_id")
    String personelIvaoID;

    public Personel() {
    }

    public Personel(Long personelId, String personelRegistration, String personelCallsign, String personelName, String personelSurname, Date personelDateOfBirth, String personelRank, String personelIvaoID) {
        this.personelId = personelId;
        this.personelRegistration = personelRegistration;
        this.personelCallsign = personelCallsign;
        this.personelName = personelName;
        this.personelSurname = personelSurname;
        this.personelDateOfBirth = personelDateOfBirth;
        this.personelRank = personelRank;
        this.personelIvaoID = personelIvaoID;
    }

    public Long getPersonelId() {
        return personelId;
    }

    public void setPersonelId(Long personelId) {
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

    public String getPersonelIvaoID() {
        return personelIvaoID;
    }

    public void setPersonelIvaoID(String ivaoID) {
        this.personelIvaoID = ivaoID;
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
                ", ivaoID=" + personelIvaoID +
                '}';
    }
}
