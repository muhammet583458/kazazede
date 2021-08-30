package akbulut.kazazede.business.concretes;

import akbulut.kazazede.business.abstracts.CityService;
import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.core.utilities.results.SuccessDataResult;
import akbulut.kazazede.core.utilities.results.SuccessResult;
import akbulut.kazazede.dataAccess.abstracts.CityDao;
import akbulut.kazazede.dataAccess.abstracts.SuffererDao;
import akbulut.kazazede.entities.concretes.City;
import akbulut.kazazede.entities.concretes.Sufferer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        super();
        this.cityDao = cityDao;
    }
    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "Data Listelendi");
    }


}
