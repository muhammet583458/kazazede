package akbulut.kazazede.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name="founders")
public class Founder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="founder_id")
    private int id;

    @Column(name="founder_name")
    private String founderName;
    @Column(name="founder_lastname")
    private String founderLastName;



    @Column(name="founder_phone")
    private String founderPhone;

    public Founder() {
    }

    public Founder(int id, String founderName, String founderLastName, String founderPhone) {
        this.id = id;
        this.founderName = founderName;
        this.founderLastName = founderLastName;
        this.founderPhone = founderPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFounderName() {
        return founderName;
    }

    public void setFounderName(String founderName) {
        this.founderName = founderName;
    }

    public String getFounderLastName() {
        return founderLastName;
    }

    public void setFounderLastName(String founderLastName) {
        this.founderLastName = founderLastName;
    }

    public String getFounderPhone() {
        return founderPhone;
    }

    public void setFounderPhone(String founderPhone) {
        this.founderPhone = founderPhone;
    }
}
