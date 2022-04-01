package com.onrsgr.rws.personelservice.personelmanagement.Repository;

import com.onrsgr.rws.personelservice.personelmanagement.Model.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

@Repository
public interface PersonelRepository extends JpaRepository<Personel,Integer> {
}
