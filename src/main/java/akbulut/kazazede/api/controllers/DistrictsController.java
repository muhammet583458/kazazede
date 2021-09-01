package akbulut.kazazede.api.controllers;


import akbulut.kazazede.business.abstracts.DistrictService;
import akbulut.kazazede.core.utilities.results.DataResult;

import akbulut.kazazede.entities.concretes.District;
import akbulut.kazazede.entities.concretes.Sufferer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getbycity")
    public DataResult<List<District>> getByCityId(@RequestParam int cityId){
        return this.districtService.getByCityId(cityId);
    }
}
