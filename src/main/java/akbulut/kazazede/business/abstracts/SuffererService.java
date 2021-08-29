package akbulut.kazazede.business.abstracts;

import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.entities.concretes.Sufferer;

import java.util.List;

public interface SuffererService {
    DataResult<List<Sufferer>> getAll();
    Result add(Sufferer sufferer);
    DataResult<Sufferer> getBySuffererName(String suffererName);
    DataResult<List<Sufferer>> getByCityId(int city);
    DataResult<List<Sufferer>> getByDistrictId(int district);
}
