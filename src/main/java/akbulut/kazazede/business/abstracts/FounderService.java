package akbulut.kazazede.business.abstracts;

import akbulut.kazazede.core.utilities.results.DataResult;
import akbulut.kazazede.core.utilities.results.Result;
import akbulut.kazazede.entities.concretes.Founder;
import akbulut.kazazede.entities.concretes.Reporter;

import java.util.List;

public interface FounderService {
    DataResult<List<Founder>> getAll();
    Result add(Founder reporter);
    DataResult<List<Founder>> getById(int id);
    DataResult<Founder> getByFounderPhone(String founderPhone);
}
