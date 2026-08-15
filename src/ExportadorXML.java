public class ExportadorXML implements ExportadorFormato {
    @Override
    public void exportar(String contenido) {
        System.out.println("[XML] Exportando: " + contenido);
    }
}
