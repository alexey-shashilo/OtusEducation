package org.lecture.Lecture12;

public class Client {
    private final String name;
    private final int yearOfBirth;

    public Client(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name ='" + name + '\n' +
                ", yearOfBirth =" + yearOfBirth + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (yearOfBirth != client.yearOfBirth) return false;
        return name.equals(client.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + yearOfBirth;
        return result;
    }
}
