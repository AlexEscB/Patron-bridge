public class ComprobanteRetencion extends Comprobante {
    public ComprobanteRetencion(ExportadorFormato exportador, CanalEnvio canal, ProveedorFirma firma) {
        super(exportador, canal, firma);
    }

    @Override
    protected String construirContenido() {
        return "ComprobanteRetencion #004 - Total: 8000";
    }
}
