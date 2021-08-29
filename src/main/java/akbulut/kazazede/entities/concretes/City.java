package akbulut.kazazede.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name="cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="city_id")
    private int id;
    @Column(name="city_name")
    private String cityName;

    public City() {
    }

    public City(int id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
