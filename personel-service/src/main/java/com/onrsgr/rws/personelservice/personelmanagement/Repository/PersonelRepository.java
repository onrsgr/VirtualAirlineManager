package com.onrsgr.rws.personelservice.personelmanagement.Repository;

import com.onrsgr.rws.personelservice.personelmanagement.Model.Personel;
import com.onrsgr.rws.personelservice.personelmanagement.ResponseMessages.PersonelPublicRespMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
public interface PersonelRepository extends JpaRepository<Personel, Long> {

    // Alternative Usage
    @Modifying
    @Transactional
    @Query(value = "update rws_personel set rws_personel.personel_registration=?2 , rws_personel.personel_callsign=?3" +
            "rws_personel.personel_name=?3, rws_personel.personel_surname=?4, rws_personel.personel_date_of_birth=?5" +
            "rws_personel.personel_rank=?6, rws_personel.personel_ivao_id=?7" +
            " where rws_personel.personel_id=?1", nativeQuery = true)
    void updatePersonel(Long personelId, String personelRegistration, String personelCallsign, String personelName,
                        String personelSurname, Date personelDateOfBirth, String personelRank, String personelIvaoID);

    //List<PersonelPublicRespMessage> findAllByPersonelCallsign();
}
