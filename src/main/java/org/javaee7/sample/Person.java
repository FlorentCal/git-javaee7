package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta
 */
@XmlRootElement
public class Person {
    private String name;
<<<<<<< HEAD
    private boolean test;
=======
	private int age;
	private char sexe;
>>>>>>> develop

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
