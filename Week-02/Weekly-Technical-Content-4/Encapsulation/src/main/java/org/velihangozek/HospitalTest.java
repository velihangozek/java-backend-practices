package org.velihangozek;

public class HospitalTest {

    public static void main(String[] args) {
        // Patient patient = new Patient("123");
        Patient patient = new Patient("123");
        // patient.identityNumber = "123";
        patient.setFirstName("Ali");
        patient.setLastName("Taş");
        patient.setAge(32);

        Patient secondPatient = new Patient("1234");
        patient.setFirstName("Aslı");
        patient.setLastName("Gök");

        Patient thirdPatient = new Patient("12345678901");
        patient.setFirstName("Burcu");
        patient.setLastName("Ayaz");

    }

}