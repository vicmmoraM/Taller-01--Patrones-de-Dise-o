package ec.edu.espol;

public class NotificationSystem {

    interface Notification {
        void sendNotification();
    }

    static class ConcreteNotification implements Notification {
        @Override
        public void sendNotification() {
            System.out.println("Enviando notificación básica.");
        }
    }

    static abstract class NotificationDecorator implements Notification {
        protected Notification notification;

        public NotificationDecorator(Notification notification) {
            this.notification = notification;
        }

        @Override
        public void sendNotification() {
            notification.sendNotification();
        }
    }

    static class WhatsappDecorator extends NotificationDecorator {
        public WhatsappDecorator(Notification notification) {
            super(notification);
        }

        @Override
        public void sendNotification() {
            super.sendNotification();
            System.out.println("Enviando notificación por WhatsApp.");
        }
    }

    static class SignalDecorator extends NotificationDecorator {
        public SignalDecorator(Notification notification) {
            super(notification);
        }

        @Override
        public void sendNotification() {
            super.sendNotification();
            System.out.println("Enviando notificación por Signal.");
        }
    }

    static class WireDecorator extends NotificationDecorator {
        public WireDecorator(Notification notification) {
            super(notification);
        }

        @Override
        public void sendNotification() {
            super.sendNotification();
            System.out.println("Enviando notificación por Wire.");
        }
    }

    static class TelegramDecorator extends NotificationDecorator {
        public TelegramDecorator(Notification notification) {
            super(notification);
        }

        @Override
        public void sendNotification() {
            super.sendNotification();
            System.out.println("Enviando notificación por Telegram.");
        }
    }
}