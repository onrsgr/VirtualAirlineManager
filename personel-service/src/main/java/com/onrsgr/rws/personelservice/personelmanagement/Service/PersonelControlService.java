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
import java.util.ArrayList;
import java.util.List;

@Service
@RequestScope
public class PersonelControlService {

    private PersonelRepository personelRepository;
    private PersonelPublicRespMessage personelPublicRespMessage;
    private List<Personel> personelList = new ArrayList<>();

    @Autowired
    public PersonelControlService(PersonelRepository personelRepository, PersonelPublicRespMessage personelPublicRespMessage) {
        this.personelRepository = personelRepository;
        this.personelPublicRespMessage = personelPublicRespMessage;
    }

    public List<Personel> getAllPersonel() {
        return personelRepository.findAll(Sort.by(Sort.Direction.ASC, ("personelCallsign")));
    }

    // Frontend Main Page Liste Güncellemesi İstendiğinde Kullanılacak
    // Admin Panelinde Kullanılacak
    public List<PersonelPublicRespMessage> getAllPersonelForMainPage() {

        return null;
    }

    public PersonelControlRespMessage addNewPersonel(Personel personel) {
        // personelRepository.save(personel);
        return null;
    }

    public PersonelControlRespMessage deletePersonel(Personel personel) {

        personelRepository.delete(personel);
        return null;
    }

    @Modifying
    public PersonelControlRespMessage updateCurrentPersonel(Personel personel) {
        //personelRepository.updatePersonel(personel.getPersonelId(),personel);
        /*
        if (controlNullFieldsForUpdatePersonel(personel)) {
        } else {
        }
        //personelRepository.save(personel);

         */
        return null;
    }

    private final List<PersonelPublicRespMessage> preparePublicPersonelList(){

        List<PersonelPublicRespMessage> publicPersonelList = new ArrayList<>();
        this.personelList = personelRepository.findAll(Sort.by(Sort.Direction.ASC, ("personelCallsign")));
        for(Personel personel:personelList){
            
        }


        return null;
    }

    /*
    public boolean controlNullFieldsForUpdatePersonel(Personel personel) {
        Field[] personelFields = personel.getClass().getDeclaredFields();
        for (Field personelInfo : personelFields) {
            try {
                personelInfo.setAccessible(true);
                if (personelInfo.get(personel) == null || ((String) personelInfo.get(personel)).trim().isEmpty()) {
                    return false;
                }
            } catch (Exception e) {

            }
        }
        return true;
    }
    */
}
