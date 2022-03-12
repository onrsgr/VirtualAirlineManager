package com.onrsgr.rws.personelservice.personelmanagement.Controller;

import com.onrsgr.rws.personelservice.personelmanagement.Service.PersonelControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonelController {

    private PersonelControlService personelControlService;

    @Autowired
    public PersonelController(PersonelControlService personelControlService) {
        this.personelControlService = personelControlService;
    }

    // To Do return all personel
    @GetMapping(value = "getpersonel")
    public String getAllPersonel(){

        return "";
    }

    // Add new personel
    @PostMapping(value = "addnewpersonel")
    public String addNewPersonel(){

        return "test1";
    }

    // Update exiting personel
    @PostMapping(value = "updatepersonel")
    public String updatePersonel(){

        return "test2";
    }

    @DeleteMapping(value = "deletepersonel")
    public String deletePersonel(){

        return "test3";
    }




}
