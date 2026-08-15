// Requisito de extensión: nuevo formato agregado SIN tocar
// Comprobante ni ninguna de sus subclases.
public class ExportadorEDI implements ExportadorFormato {
    @Override
    public void exportar(String contenido) {
        System.out.println("[EDI] Exportando: " + contenido);
    }
}
