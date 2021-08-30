package akbulut.kazazede.business.concretes;

import akbulut.kazazede.business.abstracts.ReporterService;
import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.core.utilities.results.SuccessDataResult;
import akbulut.kazazede.core.utilities.results.SuccessResult;
import akbulut.kazazede.dataAccess.abstracts.ReporterDao;
import akbulut.kazazede.dataAccess.abstracts.SuffererDao;
import akbulut.kazazede.entities.concretes.Reporter;
import akbulut.kazazede.entities.concretes.Sufferer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporterManager implements ReporterService {
    private ReporterDao reporterDao;

    @Autowired
    public ReporterManager(ReporterDao reporterDao) {
        super();
        this.reporterDao = reporterDao;
    }
    @Override
    public DataResult<List<Reporter>> getAll() {
        return new SuccessDataResult<List<Reporter>>(this.reporterDao.findAll(), "Data Listelendi");
    }

    @Override
    public Result add(Reporter reporter) {
        this.reporterDao.save(reporter);
        return new SuccessResult("Bildirici Eklendi");
    }

    @Override
    public DataResult<List<Reporter>> getByReporterName(String reporterName) {
        return new SuccessDataResult<List<Reporter>>(this.reporterDao.getByReporterName(reporterName), "Data Listelendi");
    }

    @Override
    public DataResult<List<Reporter>> getByReporterLastName(String reporterLastName) {
        return new SuccessDataResult<List<Reporter>>(this.reporterDao.getByReporterLastName(reporterLastName), "Data Listelendi");
    }
}
