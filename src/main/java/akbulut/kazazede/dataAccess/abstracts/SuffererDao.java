package akbulut.kazazede.dataAccess.abstracts;

import akbulut.kazazede.entities.concretes.Sufferer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuffererDao extends JpaRepository<Sufferer,Integer> {
    Sufferer getBySuffererName(String productName);
    List<Sufferer> getByCityId(int city);
    List<Sufferer> getByDistrictId(int district);
}
