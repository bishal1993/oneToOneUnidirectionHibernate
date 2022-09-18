import javax.persistence.*;

@Entity
@Table(name="passport")
public class Passport {

    @Id
    @Column(name="id_number")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNumber;

    public Passport() {
    }

    

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "idNumber=" + idNumber +
                '}';
    }
}
