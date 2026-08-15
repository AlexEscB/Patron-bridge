public class EnvioPortalWeb implements CanalEnvio {
    @Override
    public void enviar(String contenido) {
        System.out.println("[PortalWeb] Enviando: " + contenido);
    }
}
