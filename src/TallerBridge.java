public class TallerBridge {
    public static void main(String[] args) {

        Comprobante c1 = new FacturaVenta(new ExportadorXML(), new EnvioCorreo(), new FirmaLocal());
        Comprobante c2 = new NotaCredito(new ExportadorPDF(), new EnvioWhatsApp(), new FirmaEnNube());
        Comprobante c3 = new NotaDebito(new ExportadorJSON(), new EnvioPortalWeb(), new FirmaHSM());
        Comprobante c4 = new ComprobanteRetencion(new ExportadorXML(), new EnvioWhatsApp(), new FirmaHSM());
        Comprobante c5 = new FacturaVenta(new ExportadorPDF(), new EnvioCorreo(), new FirmaEnNube());

        // Combinación extra usando el nuevo formato EDI, agregado
        // sin modificar Comprobante ni ninguna de sus subclases.
        Comprobante c6 = new NotaCredito(new ExportadorEDI(), new EnvioCorreo(), new FirmaLocal());

        Comprobante[] comprobantes = { c1, c2, c3, c4, c5, c6 };

        for (Comprobante c : comprobantes) {
            System.out.println("---");
            c.procesar();
        }
    }
}
