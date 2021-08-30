package akbulut.kazazede.api.controllers;

import akbulut.kazazede.business.abstracts.ReporterService;
import akbulut.kazazede.business.abstracts.SuffererService;
import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.entities.concretes.Reporter;
import akbulut.kazazede.entities.concretes.Sufferer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/reporters")
public class ReportersController {
    private ReporterService reporterService;
    @Autowired
    public ReportersController(ReporterService reporterService) {
        super();
        this.reporterService = reporterService;
    }
    @GetMapping("/getall")
    public DataResult<List<Reporter>> getAll(){
        return this.reporterService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Reporter reporter) {
        return this.reporterService.add(reporter);
    }
    @GetMapping("/getbyreportername")
    public DataResult<List<Reporter>> getByReporterName(@RequestParam String reporterName){
        return this.reporterService.getByReporterName(reporterName);
    }
    @GetMapping("/getbyreporterlastname")
    public DataResult<List<Reporter>> getByReporterLastName(@RequestParam String reporterLastName){
        return this.reporterService.getByReporterLastName(reporterLastName);
    }
}
