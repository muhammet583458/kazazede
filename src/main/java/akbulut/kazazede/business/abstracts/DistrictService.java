package akbulut.kazazede.business.abstracts;

import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.entities.concretes.District;

import java.util.List;

public interface DistrictService {
    DataResult<List<District>> getAll();
    DataResult<List<District>> getByCityId(int city);

}
