package akbulut.kazazede.api.controllers;

import akbulut.kazazede.business.abstracts.CityService;
import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.entities.concretes.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/cities")
public class CitiesController {
    private CityService cityService;
    @Autowired
    public CitiesController(CityService cityService) {
        super();
        this.cityService = cityService;
    }
    @GetMapping("/getall")
    public DataResult<List<City>> getAll(){
        return this.cityService.getAll();
    }

}
