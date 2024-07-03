package com.ejemplo.notificaciones;

public class Test {
    public static void main(String[] args) {
        NotificacionFactory factory = new NotificacionFactory();

        Notificacion email = factory.crearNotificacion("EMAIL");
        if (email != null) {
            email.enviarMensaje("Hola, esta es una notificación por email.");
        }

        Notificacion sms = factory.crearNotificacion("SMS");
        if (sms != null) {
            sms.enviarMensaje("Hola, esta es una notificación por SMS.");
        }

        Notificacion app = factory.crearNotificacion("APP");
        if (app != null) {
            app.enviarMensaje("Hola, esta es una notificación en la app.");
        }

        notifac urgenteFactory = new UrgenteNotificacionFactory();
        Notificacion urgenteEmail = urgenteFactory.crearEmailNotificacion();
        urgenteEmail.enviarMensaje("Este es un email urgente.");

        notifac regularFactory = new RegularNotificacionFactory();
        Notificacion regularSMS = regularFactory.crearSMSNotificacion();
        regularSMS.enviarMensaje("Este es un SMS regular.");
    }
}
