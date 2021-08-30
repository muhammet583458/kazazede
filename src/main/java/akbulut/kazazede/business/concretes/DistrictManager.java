package akbulut.kazazede.business.concretes;

import akbulut.kazazede.business.abstracts.DistrictService;
import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.core.utilities.results.SuccessDataResult;
import akbulut.kazazede.core.utilities.results.SuccessResult;
import akbulut.kazazede.dataAccess.abstracts.CityDao;
import akbulut.kazazede.dataAccess.abstracts.DistrictDao;
import akbulut.kazazede.entities.concretes.City;
import akbulut.kazazede.entities.concretes.District;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictManager implements DistrictService {
    private DistrictDao districtDao;

    @Autowired
    public DistrictManager(DistrictDao districtDao) {
        super();
        this.districtDao = districtDao;
    }
    @Override
    public DataResult<List<District>> getAll() {
        return new SuccessDataResult<List<District>>(this.districtDao.findAll(), "Data Listelendi");
    }


}
