public class EnvioWhatsApp implements CanalEnvio {
    @Override
    public void enviar(String contenido) {
        System.out.println("[WhatsApp] Enviando: " + contenido);
    }
}
