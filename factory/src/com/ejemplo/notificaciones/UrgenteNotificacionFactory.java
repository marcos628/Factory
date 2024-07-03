package com.ejemplo.notificaciones;

public class UrgenteNotificacionFactory implements notifac{
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
