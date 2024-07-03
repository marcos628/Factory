package com.ejemplo.notificaciones;

public class RegularNotificacionFactory implements notifac{
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion();
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion();
    }

    @Override
    public AppNotificacion crearAppNotificacion() {
        return new AppNotificacion();
    }
}
