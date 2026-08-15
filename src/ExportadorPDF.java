public class ExportadorPDF implements ExportadorFormato {
    @Override
    public void exportar(String contenido) {
        System.out.println("[PDF] Exportando: " + contenido);
    }
}
