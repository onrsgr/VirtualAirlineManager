package com.onrsgr.rws.personelservice.personelmanagement.ResponseMessages;

import com.onrsgr.rws.personelservice.personelmanagement.Model.Personel;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "personelPublicRespMessage", types = { Personel.class })
public
interface PersonelPublicRespMessage {
    String getPersonelRegistration();
    String getPersonelCallsign();
    String getPersonelIvaoID();
}
