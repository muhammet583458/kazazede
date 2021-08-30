package akbulut.kazazede.dataAccess.abstracts;

import akbulut.kazazede.entities.concretes.Reporter;
import akbulut.kazazede.entities.concretes.Sufferer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReporterDao extends JpaRepository<Reporter,Integer> {
    Reporter getByReporterName(String reporterName);
    Reporter getByReporterLastName(String reporterLastName);
}
