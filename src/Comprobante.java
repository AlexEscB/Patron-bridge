public abstract class Comprobante {

    // Las tres "partes" del puente (composición 1 a 1)
    protected ExportadorFormato exportador;
    protected CanalEnvio canal;
    protected ProveedorFirma firma;

    public Comprobante(ExportadorFormato exportador, CanalEnvio canal, ProveedorFirma firma) {
        this.exportador = exportador;
        this.canal = canal;
        this.firma = firma;
    }

    // Cada subclase de comprobante define su propio contenido
    protected abstract String construirContenido();

    // Método concreto, heredado sin cambios: delega en los
    // tres implementadores, en orden fijo.
    public void procesar() {
        String contenido = construirContenido();
        exportador.exportar(contenido);
        canal.enviar(contenido);
        firma.firmar(contenido);
    }
}
