package me.thewing.refactoring._21_alternative_classes_with_different_interfaces;

public class OrderProcessor {

    private NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyShipping(Shipping shipping) {
        Notification notification = Notification.newNotification(
            shipping.getOrder() + " is shipped")
            .receiver(shipping.getEmail())
            .sender("sujl95@naver.com");
        sendNotification(notification);
    }

    private void sendNotification(Notification notification) {
        notificationService.sendNotification(notification);
    }

}
