package akbulut.kazazede.entities.concretes;


import javax.persistence.*;

@Entity
@Table(name = "districts")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="district_id")
    private int id;
    @Column(name="district_name")
    private String districtName;

    @ManyToOne()
    @JoinColumn(name="city_id")
    private City city;

    public District() {
    }

    public District(int id, String districtName, City city) {
        this.id = id;
        this.districtName = districtName;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
