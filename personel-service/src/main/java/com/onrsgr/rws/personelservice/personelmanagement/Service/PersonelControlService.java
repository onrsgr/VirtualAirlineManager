package com.onrsgr.rws.personelservice.personelmanagement.Service;

import com.onrsgr.rws.personelservice.personelmanagement.Model.Personel;
import com.onrsgr.rws.personelservice.personelmanagement.Repository.PersonelRepository;
import com.onrsgr.rws.personelservice.personelmanagement.ResponseMessages.PersonelPublicRespMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonelControlService {

    private PersonelRepository personelRepository;
    private PersonelPublicRespMessage personelPublicRespMessage;

    @Autowired
    public PersonelControlService(PersonelRepository personelRepository, PersonelPublicRespMessage personelPublicRespMessage) {
        this.personelRepository = personelRepository;
        this.personelPublicRespMessage = personelPublicRespMessage;
    }

    public List<Personel> getAllPersonel(){
        return personelRepository.findAll(Sort.by(Sort.Direction.ASC,("personelCallsign")));
    }

    public void getAllPersonelForMainPage(){

    }

    public void addNewPersonel(Personel personel) {
        personelRepository.save(personel);
    }

    public void deletePersonel(Personel personel) {

    }

    public void updateCurrentPersonel(Personel personel) {

    }


    // Frontend için hazırlanacak
    public List<PersonelPublicRespMessage> getPersonelListForPublicView(List<Personel> personel){

        return null;

    }
}
