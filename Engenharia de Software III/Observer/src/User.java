public class User implements Observer {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(Notification notification) {
        System.out.println("Usuário " + name + " recebeu a seguinte notificação: " + notification.getMessage());
    }

    public String getEmail() {
        return email;
    }
}
