package akbulut.kazazede.api.controllers;

import akbulut.kazazede.business.abstracts.SuffererService;
import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.entities.concretes.Sufferer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/sufferers")
public class SufferersController {
    private SuffererService suffererService;
    @Autowired
    public SufferersController(SuffererService suffererService) {
        super();
        this.suffererService = suffererService;
    }
    @GetMapping("/getall")
    public DataResult<List<Sufferer>> getAll(){
        return this.suffererService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Sufferer sufferer) {
        return this.suffererService.add(sufferer);
    }
    @GetMapping("/getbysufferername")
    public DataResult<Sufferer> getByProductName(@RequestParam String suffererName){
        return this.suffererService.getBySuffererName(suffererName);
    }
    @GetMapping("/getbycity")
    public DataResult<List<Sufferer>> getByCityId(@RequestParam int cityId){
        return this.suffererService.getByCityId(cityId);
    }
    @GetMapping("/getbydistrict")
    public DataResult<List<Sufferer>> getByDistrictId(@RequestParam int districtId){
        return this.suffererService.getByDistrictId(districtId);
    }
}
