public class FacturaVenta extends Comprobante {
    public FacturaVenta(ExportadorFormato exportador, CanalEnvio canal, ProveedorFirma firma) {
        super(exportador, canal, firma);
    }

    @Override
    protected String construirContenido() {
        return "Factura #001 - Total: 150000";
    }
}
