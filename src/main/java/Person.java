import javax.persistence.*;


/**
 * A person can have max. one passport or 0 passport.
 * A Person can exist without passport, but passport alone
 * can not exist itself. Since person can have 0 passport, it is possible
 * that foreign key in person might be null.
 *
 */
@Entity
@Table(name="person")
public class Person {


    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    /**
     * One to One uni direction relation from Person to Passport.
     * If person is deleted, passport will also be deleted.
     * passport_id_number is column in Person, which contains foreign key fpr table Passport.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="passport_id_number")
    private Passport passport;

    @Id
    @Column(name="tax_number")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taxNumber;


    public Person() {
    }


    /**
     *taxnumber is auto generated.thats why we dont give it manually.
     * @param firstName is first name of Person
     * @param lastName is last name of Passport
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.taxNumber = taxNumber;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public Passport getPassport() {
        return passport;
    }

    /**
     * Associating Passport to Person.
     * @param passport
     */
    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passport=" + passport +
                ", taxNumber=" + taxNumber +
                '}';
    }
}
