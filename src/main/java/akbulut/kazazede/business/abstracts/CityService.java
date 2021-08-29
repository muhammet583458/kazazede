package akbulut.kazazede.business.abstracts;

import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.entities.concretes.City;


import java.util.List;

public interface CityService {
    DataResult<List<City>> getAll();
    Result add(City city);
}
