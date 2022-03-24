package com.onrsgr.rws.personelservice.personelmanagement.ResponseMessages;

import org.springframework.stereotype.Component;

import java.util.Objects;

// Personel List For Public Website

@Component
public class PersonelPublicRespMessage {

    String personelCallsign;
    String personelName;
    String ivaoID;

    public PersonelPublicRespMessage() {
    }

    public PersonelPublicRespMessage(String personelCallsign, String personelName, String ivaoID) {
        this.personelCallsign = personelCallsign;
        this.personelName = personelName;
        this.ivaoID = ivaoID;
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

    public String getIvaoID() {
        return ivaoID;
    }

    public void setIvaoID(String ivaoID) {
        this.ivaoID = ivaoID;
    }

    @Override
    public String toString() {
        return "PersonelPublicRespMessage{" + "personelCallsign='" + personelCallsign + '\'' + ", personelName='" + personelName + '\'' + ", ivaoID='" + ivaoID + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonelPublicRespMessage that = (PersonelPublicRespMessage) o;
        return Objects.equals(personelCallsign, that.personelCallsign) && Objects.equals(personelName, that.personelName) && Objects.equals(ivaoID, that.ivaoID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personelCallsign, personelName, ivaoID);
    }
}
