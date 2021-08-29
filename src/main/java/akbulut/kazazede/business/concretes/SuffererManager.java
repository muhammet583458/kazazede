package akbulut.kazazede.business.concretes;

import akbulut.kazazede.business.abstracts.SuffererService;
import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.core.utilities.results.SuccessDataResult;
import akbulut.kazazede.core.utilities.results.SuccessResult;
import akbulut.kazazede.dataAccess.abstracts.SuffererDao;
import akbulut.kazazede.entities.concretes.Sufferer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuffererManager implements SuffererService {

    private SuffererDao suffererDao;

    @Autowired
    public SuffererManager(SuffererDao suffererDao) {
        super();
        this.suffererDao = suffererDao;
    }
    @Override
    public DataResult<List<Sufferer>> getAll() {
        return new SuccessDataResult<List<Sufferer>>(this.suffererDao.findAll(), "Data Listelendi");
    }

    @Override
    public Result add(Sufferer sufferer) {
        this.suffererDao.save(sufferer);
        return new SuccessResult("Ürün Eklendi");
    }

    @Override
    public DataResult<Sufferer> getBySuffererName(String suffererName) {
        return new SuccessDataResult<Sufferer>(this.suffererDao.getBySuffererName(suffererName), "Data Listelendi");
    }

    @Override
    public DataResult<List<Sufferer>> getByCityId(int city) {
        return new SuccessDataResult<List<Sufferer>>(this.suffererDao.getByCityId(city), "Data Listelendi");
    }

    @Override
    public DataResult<List<Sufferer>> getByDistrictId(int district) {
        return new SuccessDataResult<List<Sufferer>>(this.suffererDao.getByDistrictId(district), "Data Listelendi");
    }
}
