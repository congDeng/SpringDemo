package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Value("21")
    private int age;
//    Field injection
//    @Autowired
//    @Qualifier("laptop!")
    private Computer com;

    public Alien() {
        System.out.println("Alien object created");
    }

    public Computer getCom() {
        return com;
    }

    //  setter injection
    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    void coding() {
        System.out.println("coding");
        com.compile();
    }
}
