package akbulut.kazazede.api.controllers;

import akbulut.kazazede.business.abstracts.FounderService;
import akbulut.kazazede.business.abstracts.ReporterService;
import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.entities.concretes.Founder;
import akbulut.kazazede.entities.concretes.Reporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/founders")
public class FoundersController {
    private FounderService founderService;
    @Autowired
    public FoundersController(FounderService founderService) {
        super();
        this.founderService = founderService;
    }
    @GetMapping("/getall")
    public DataResult<List<Founder>> getAll(){
        return this.founderService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Founder founder) {
        return this.founderService.add(founder);
    }
    @GetMapping("/getbyfounderid")
    public DataResult<List<Founder>> getById(@RequestParam int id){
        return this.founderService.getById(id);
    }
}
