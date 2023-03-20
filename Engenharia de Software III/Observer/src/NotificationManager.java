import java.util.ArrayList;
import java.util.List;

public class NotificationManager implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Notification notification) {
        for (Observer observer : observers) {
            observer.update(notification);
        }
    }

    public void sendNotification(Notification notification) {
        notifyObservers(notification);
    }
}
