package com.onrsgr.rws.personelservice.personelmanagement.Service;

import com.onrsgr.rws.personelservice.personelmanagement.Model.Personel;
import com.onrsgr.rws.personelservice.personelmanagement.Repository.PersonelRepository;
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

    public List<PersonelPublicRespMessage> getAllPersonelForMainPage() {

        return null;
    }

    public void addNewPersonel(Personel personel) {
        personelRepository.save(personel);
    }

    public void deletePersonel(Personel personel) {
        personelRepository.delete(personel);
    }

    @Modifying
    public void updateCurrentPersonel(Personel personel) {
        //personelRepository.updatePersonel(personel.getPersonelId(),personel);
        personelRepository.save(personel);
    }
}
