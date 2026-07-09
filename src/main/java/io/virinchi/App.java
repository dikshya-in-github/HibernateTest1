package io.virinchi;

import io.virinchi.model.AddressClass;
import io.virinchi.model.PhoneClass;
import io.virinchi.model.UserClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class App {
    /*
        JPA - Java Persistence API
        JPA  enables the java project to map class objects to database tables.
        Model Class Attributes ->Table Columns
        Model class name -> Table Name
        Hibernate Framework utilizes the JPA API
    */

    public static void main( String[] args )
    {
        /*
        Session create garera database ma hibernate ko through table ni banaunu paryo,
        data ni pathauna paryo.

        Session banauxa session factory lay
         */

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        //SessionFactory bata configuration settings taneko

        Session session = sf.openSession();
        //Ek session ma multiple hibernate transaction huna sakxa, tyo open gareko

        UserClass uc = new UserClass();
        uc.setName("Jack");

        UserClass uc2 = new UserClass();
        uc2.setName("Jane");
        //Model ko class jun aba table hunxa tesko column ko data rakheko

        PhoneClass ph = new PhoneClass();
        ph.setPhoneNo("98000000");
        ph.setUserClass(uc);

        AddressClass ad = new AddressClass();
        ad.setAddress("Kathmandu");
        ad.setUserClass(Arrays.asList(uc,uc2));

        uc.setAddressClass(ad);
        uc2.setAddressClass(ad);

        session.persist(uc);
        session.persist(ph);
        session.persist(ad);
        session.persist(uc2);

        //session.persist baneko, yo session ma hamro model ko class ko table banna paryo or
        //banako table ma data basna pryo
        //persist le data rakhne help garxa(save vaneko jastai ho)
        session.beginTransaction().commit();
        //commit le kam suru garxa.
        session.close();
    }
}
