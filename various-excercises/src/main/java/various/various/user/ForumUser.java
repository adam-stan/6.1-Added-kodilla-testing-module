package various.various.user;

public class ForumUser extends User {

    private String nick;
    private int numberOfPosts;
    private boolean isLogged;

    public ForumUser(String name, String surname, String sex, String age, String mail, String nick, int numberOfPosts, boolean isLogged) {
        super(name, surname, sex, age, mail);
        this.nick = nick;
        this.numberOfPosts = numberOfPosts;
        this.isLogged = isLogged;
    }

    public void publicatePost(String text){
        System.out.println(text);
        numberOfPosts++;
    }
}
