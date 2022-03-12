package com.onrsgr.rws.personelservice.personelmanagement.ResponseMessages;

import com.onrsgr.rws.personelservice.personelmanagement.Model.Personel;

public class PersonelControlRespMessage {

    Personel personel;
    boolean personelControlStatus;
    String errorMessage;

    public PersonelControlRespMessage() {
    }

    public PersonelControlRespMessage(Personel personel, boolean personelControlStatus, String errorMessage) {
        this.personel = personel;
        this.personelControlStatus = personelControlStatus;
        this.errorMessage = errorMessage;
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public boolean isPersonelControlStatus() {
        return personelControlStatus;
    }

    public void setPersonelControlStatus(boolean personelControlStatus) {
        this.personelControlStatus = personelControlStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
