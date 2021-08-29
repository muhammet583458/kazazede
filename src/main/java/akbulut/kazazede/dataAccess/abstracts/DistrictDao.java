package akbulut.kazazede.dataAccess.abstracts;

import akbulut.kazazede.entities.concretes.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictDao extends JpaRepository<District,Integer> {
}
