package com.onrsgr.rws.personelservice.personelmanagement.Service;

import com.onrsgr.rws.personelservice.personelmanagement.Model.Personel;
import com.onrsgr.rws.personelservice.personelmanagement.Repository.PersonelRepository;
import com.onrsgr.rws.personelservice.personelmanagement.ResponseMessages.PersonelControlRespMessage;
import com.onrsgr.rws.personelservice.personelmanagement.ResponseMessages.PersonelPublicRespMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@Service
@RequestScope
public class PersonelControlService {

    private PersonelRepository personelRepository;
    private PersonelPublicRespMessage personelPublicRespMessage;

    @Autowired
    public PersonelControlService(PersonelRepository personelRepository, PersonelPublicRespMessage personelPublicRespMessage) {
        this.personelRepository = personelRepository;
        this.personelPublicRespMessage = personelPublicRespMessage;
    }

    public List<Personel> getAllPersonel() {
        return personelRepository.findAll(Sort.by(Sort.Direction.ASC, ("personelCallsign")));
    }

    // Frontend Main Page Liste Güncellemesi İstediğinde Kullanılacak

    public List<PersonelPublicRespMessage> getAllPersonelForMainPage() {

        return null;
    }

    public PersonelControlRespMessage addNewPersonel(Personel personel) {

        personelRepository.save(personel);
        return null;
    }

    public PersonelControlRespMessage deletePersonel(Personel personel) {

        personelRepository.delete(personel);
        return null;
    }

    @Modifying
    public PersonelControlRespMessage updateCurrentPersonel(Personel personel) {
        //personelRepository.updatePersonel(personel.getPersonelId(),personel);
        personelRepository.save(personel);
        return null;
    }
}
