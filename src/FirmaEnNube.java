public class FirmaEnNube implements ProveedorFirma {
    @Override
    public void firmar(String contenido) {
        System.out.println("[FirmaEnNube] Firmando: " + contenido);
    }
}
