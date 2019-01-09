
import java.util.ArrayList;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class Patient {

    private String name;
    private int age;
    private String sex;
    private String address;
    private String severity;
    private Doctor doctor;
    private ArrayList<Billing> billing;

    public Patient(String name, int age, String sex, String address, String severity, Doctor doctor) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.severity = severity;
        this.doctor = doctor;
        billing = new ArrayList<>();
        billing.add(new Billing("Admission Fee", 500));
    }

    public void addBill(String description, float fee) {
        if (fee > 0) {
            this.billing.add(new Billing(description, fee));
        }
    }

    public float getTotalCost() {
        float totalFee = 0;
        for (Billing bill : this.billing) {
            totalFee += bill.getCost();
        }
        return totalFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}
