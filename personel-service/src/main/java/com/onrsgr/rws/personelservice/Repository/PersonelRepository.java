package com.onrsgr.rws.personelservice.Repository;

import com.onrsgr.rws.personelservice.Model.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelRepository extends JpaRepository<Personel,Integer> {
}
