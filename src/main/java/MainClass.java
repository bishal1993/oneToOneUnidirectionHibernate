import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {
public static void main(String [] args){

System.out.println("Project started.....");
   SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(Passport.class).buildSessionFactory();
      Session session = sessionFactory.openSession();

   try{


    Passport passport = new Passport( );

    Person bishal = new Person("Bishal","Maharjan");



    Person radhika = new Person("Radhika","Ghatani");


    Person pukule = new Person("pukule","pukule");
    Passport passport1 = new Passport();



    Person person = new Person("no first Name", "no last Name");
    Passport passport2 = new Passport();




    /**
     * associationg passport to bishal.
     */
    bishal.setPassport(passport);
    pukule.setPassport(passport1);
    person.setPassport(passport2);


    session.beginTransaction();

    /*
       System.out.println("person created..."+radhika);
       System.out.println("person created..."+pukule);
       System.out.println("person created..."+person);
       System.out.println("saving persons....");
       session.save(radhika);
       session.save(pukule);
       session.save(person);
     */
      int  pasportid =8;
      Person deletePerson = session.get(Person.class,pasportid);
      session.delete(deletePerson);

    session.getTransaction().commit();
    System.out.println("created....");

   } catch (Exception ex){
    System.out.println("Error...."+ex.getLocalizedMessage());

   } finally {
    sessionFactory.close();
   }


















    System.out.println("deleted....");
    System.out.println("");
    System.out.println("");
    System.out.println("");
}

}
