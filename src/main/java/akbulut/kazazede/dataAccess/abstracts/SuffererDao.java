package akbulut.kazazede.dataAccess.abstracts;

import akbulut.kazazede.entities.concretes.Sufferer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuffererDao extends JpaRepository<Sufferer,Integer> {
    List<Sufferer> getBySuffererName(String suffererName);
    List<Sufferer> getByCityId(int city);
    List<Sufferer> getByDistrictId(int district);
    List<Sufferer> getBySuffererLastName(String suffererLastName);

}
