package akbulut.kazazede.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name="reporters")
public class Reporter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reporter_id")
    private int id;

    @Column(name="reporter_name")
    private String reporterName;
    @Column(name="reporter_lastname")
    private String reporterLastName;



    @Column(name="reporter_phone")
    private String reporterPhone;
    public Reporter() {
    }

    public Reporter(int id, String reporterName, String reporterLastName, String reporterPhone) {
        this.id = id;
        this.reporterName = reporterName;
        this.reporterLastName = reporterLastName;
        this.reporterPhone = reporterPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getReporterLastName() {
        return reporterLastName;
    }

    public void setReporterLastName(String reporterLastName) {
        this.reporterLastName = reporterLastName;
    }

    public String getReporterPhone() {
        return reporterPhone;
    }

    public void setReporterPhone(String reporterPhone) {
        this.reporterPhone = reporterPhone;
    }
}
