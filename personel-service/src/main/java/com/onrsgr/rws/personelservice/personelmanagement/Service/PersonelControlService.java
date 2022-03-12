package com.onrsgr.rws.personelservice.personelmanagement.Service;

import com.onrsgr.rws.personelservice.personelmanagement.Model.Personel;
import com.onrsgr.rws.personelservice.personelmanagement.Repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonelControlService {

    private PersonelRepository personelRepository;

    @Autowired
    public PersonelControlService(PersonelRepository personelRepository) {
        this.personelRepository = personelRepository;
    }

    public void addNewPersonel(Personel personel){
        personelRepository.save(personel);
    }

    public void deletePersonel(Personel personel){


    }

    public void updateCurrentPersonel(Personel personel){

    }
}
