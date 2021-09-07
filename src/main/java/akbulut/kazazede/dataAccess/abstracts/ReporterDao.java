package akbulut.kazazede.dataAccess.abstracts;

import akbulut.kazazede.entities.concretes.Founder;
import akbulut.kazazede.entities.concretes.Reporter;
import akbulut.kazazede.entities.concretes.Sufferer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReporterDao extends JpaRepository<Reporter,Integer> {
    List<Reporter> getByReporterName(String reporterName);
    List<Reporter> getByReporterLastName(String reporterLastName);
    Reporter getByReporterPhone(String phone);
}
