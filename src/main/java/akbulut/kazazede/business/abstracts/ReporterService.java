package akbulut.kazazede.business.abstracts;

import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.entities.concretes.Reporter;
import akbulut.kazazede.entities.concretes.Sufferer;

import java.util.List;

public interface ReporterService {
    DataResult<List<Reporter>> getAll();
    Result add(Reporter reporter);
    DataResult<Reporter> getByReporterName(String reporterName);
    DataResult<Reporter> getByReporterLastName(String reporterLastName);

}