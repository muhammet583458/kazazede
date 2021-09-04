package akbulut.kazazede.dataAccess.abstracts;

import akbulut.kazazede.entities.concretes.Founder;
import akbulut.kazazede.entities.concretes.Reporter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FounderDao extends JpaRepository<Founder,Integer> {
    List<Founder> getById(int id);
}
