package akbulut.kazazede.api.controllers;


import akbulut.kazazede.business.abstracts.DistrictService;
import akbulut.kazazede.core.utilities.results.DataResult;

import akbulut.kazazede.entities.concretes.District;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/districts")
public class DistrictsController {
    private DistrictService districtService;
    @Autowired
    public DistrictsController(DistrictService districtService) {
        super();
        this.districtService = districtService;
    }
    @GetMapping("/getall")
    public DataResult<List<District>> getAll(){
        return this.districtService.getAll();
    }

}
