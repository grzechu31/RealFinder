package codecool.cc.DataHandler;

import java.util.Date;

public class UserData {
    private long id;
    private String name;
    private String surname;
    private String Email;
    private Date date;

    public UserData(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        Email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return Email;
    }

    public Date getDate() {
        return date;
    }
}
