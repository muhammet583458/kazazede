package akbulut.kazazede.dataAccess.abstracts;

import akbulut.kazazede.entities.concretes.District;
import akbulut.kazazede.entities.concretes.Sufferer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictDao extends JpaRepository<District,Integer> {
    List<District> getByCityId(int city);
}
