package akbulut.kazazede.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name="sufferers")
public class Sufferer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sufferer_id")
    private int id;

    @Column(name="sufferer_name")
    private String suffererName;
    @Column(name="sufferer_lastname")
    private String suffererLastName;
    @Column(name="sufferer_address")
    private String suffererAddress;
    @Column(name="sufferer_status")
    private boolean suffererStatus;
    @ManyToOne()
    @JoinColumn(name="city_id")
    private City city;

    @ManyToOne()
    @JoinColumn(name="district_id")
    private District district;

    public Sufferer() {
    }

    public Sufferer(int id, String suffererName, String suffererLastName, String suffererAddress, boolean suffererStatus, City city, District district) {
        this.id = id;
        this.suffererName = suffererName;
        this.suffererLastName = suffererLastName;
        this.suffererAddress = suffererAddress;
        this.suffererStatus = suffererStatus;
        this.city = city;
        this.district = district;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSuffererName() {
        return suffererName;
    }

    public void setSuffererName(String suffererName) {
        this.suffererName = suffererName;
    }

    public String getSuffererLastName() {
        return suffererLastName;
    }

    public void setSuffererLastName(String suffererLastName) {
        this.suffererLastName = suffererLastName;
    }

    public String getSuffererAddress() {
        return suffererAddress;
    }

    public void setSuffererAddress(String suffererAddress) {
        this.suffererAddress = suffererAddress;
    }

    public boolean isSuffererStatus() {
        return suffererStatus;
    }

    public void setSuffererStatus(boolean suffererStatus) {
        this.suffererStatus = suffererStatus;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
