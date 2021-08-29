package akbulut.kazazede.dataAccess.abstracts;

import akbulut.kazazede.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {
}
