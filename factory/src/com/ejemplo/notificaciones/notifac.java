package com.ejemplo.notificaciones;

public interface notifac {
    EmailNotificacion crearEmailNotificacion();
    SMSNotificacion crearSMSNotificacion();
    AppNotificacion crearAppNotificacion();
}
