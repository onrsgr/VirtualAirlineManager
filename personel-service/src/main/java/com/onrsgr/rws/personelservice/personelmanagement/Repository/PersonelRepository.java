package com.onrsgr.rws.personelservice.personelmanagement.Repository;

import com.onrsgr.rws.personelservice.personelmanagement.Model.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

@Repository
public interface PersonelRepository extends JpaRepository<Personel,Integer> {

    /*
    @Modifying
    @Query("update Personel p set p = personel + ?2 where p.personelId=?1")
    void updatePersonel(Long personelID, Personel personel);
    */
}
