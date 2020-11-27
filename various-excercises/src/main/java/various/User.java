package various;

public class User {
    private String name;
    private String surname;
    private String sex;
    private String age;
    private String mail;
    private boolean isDeleted;

    public User(String name, String surname, String sex, String age, String mail) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.mail = mail;
    }

    public boolean logIn(String name){
        if(this.name.equals(name)) {
            return true;
        }
        return false;
    }

    public void deleteUser(){
        isDeleted = true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public boolean isDeleted() {
        return isDeleted;
    }
}





