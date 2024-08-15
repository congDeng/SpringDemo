package org.example;

public class Alien {

    private Computer com;
    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    void coding() {
        System.out.println("coding");
        com.compile();
    }
}
