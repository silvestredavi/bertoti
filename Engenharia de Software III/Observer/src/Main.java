public class Main {
    public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager();

        User user1 = new User("João", "joao@mail.com");
        User user2 = new User("Maria", "maria@mail.com");

        notificationManager.registerObserver(user1);
        notificationManager.registerObserver(user2);

        Notification notification = new Notification("Nova mensagem recebida");
        notificationManager.sendNotification(notification);

        notificationManager.removeObserver(user1);

        Notification notification2 = new Notification("Nova mensagem enviada");
        notificationManager.sendNotification(notification2);

    }
}