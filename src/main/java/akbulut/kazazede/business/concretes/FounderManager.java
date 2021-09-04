package akbulut.kazazede.business.concretes;

import akbulut.kazazede.business.abstracts.FounderService;
import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.core.utilities.results.SuccessDataResult;
import akbulut.kazazede.core.utilities.results.SuccessResult;
import akbulut.kazazede.dataAccess.abstracts.FounderDao;
import akbulut.kazazede.dataAccess.abstracts.ReporterDao;
import akbulut.kazazede.entities.concretes.Founder;
import akbulut.kazazede.entities.concretes.Reporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FounderManager implements FounderService {
    private FounderDao founderDao;

    @Autowired
    public FounderManager(FounderDao founderDao) {
        super();
        this.founderDao = founderDao;
    }

    @Override
    public DataResult<List<Founder>> getAll() {
        return new SuccessDataResult<List<Founder>>(this.founderDao.findAll(), "Data Listelendi");
    }

    @Override
    public Result add(Founder founder) {
        this.founderDao.save(founder);
        return new SuccessResult("Bulan Eklendi");
    }

    @Override
    public DataResult<List<Founder>> getById(int id) {
        return new SuccessDataResult<List<Founder>>(this.founderDao.getById(id), "Data Listelendi");
    }
}
