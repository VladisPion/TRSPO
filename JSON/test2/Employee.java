package test2;

import java.util.Arrays;

public class Employee {
    private int id;
    private String name;
    private boolean permanent;
    private Address address;
    private long[] phonenumbers;
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long[] getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(long[] phonenumbers) {
        this.phonenumbers = phonenumbers;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("*****Employee details:\n");
        sb.append("ID=" + getId() + "\n");
        sb.append("Name=" + getName() + "\n");
        sb.append("Permanent=" + isPermanent() + "\n");
        sb.append("Role=" + getRole() + "\n");
        sb.append("Phone Numbers=" + Arrays.toString(getPhonenumbers()) + "\n");
        sb.append("Address=" + getAddress());
        sb.append("\n*****************");
        return sb.toString();
    }
}
