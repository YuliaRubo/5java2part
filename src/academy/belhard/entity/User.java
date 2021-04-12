package academy.belhard.entity;

public class User extends Person {
    private String email;
    private String password;





    public User(String email, String password, String firstname, String lastname) {
        super(firstname, lastname);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo() {
        final String s = "Имя :" + getFullName() + "\n" + "Email :" + email;
        return s;
    }
//    public boolean equals(String password);{
//        return this.password==password;
//    }

    public  boolean isPasswordCorrect(String password) {
        if (this.password.equals(password)) {
            return true;

        } else {
            return false;
        }
    }

}


