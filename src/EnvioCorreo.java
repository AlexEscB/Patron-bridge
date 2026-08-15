public class EnvioCorreo implements CanalEnvio {
    @Override
    public void enviar(String contenido) {
        System.out.println("[Correo] Enviando: " + contenido);
    }
}
