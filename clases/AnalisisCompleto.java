package Strategy.clases;


public class AnalisisCompleto implements Analisis {
    
    @Override
    public void analizar(){
        
        iniciar();
        RevisarDiscos();
        RevisarRam();
        RevisarCache();
        RevisarProcesosIniciales();
        RevisarEntradasSO();
        Detener();
        
    }
    
    private void iniciar(){
        System.out.println("Analisis completo iniciado");
    }
    
    private void RevisarDiscos(){
        try {
            System.out.println("Analizando los discos...");
            Thread.sleep(2500);
            System.out.println("Discos OK!");
        } catch (Exception e) {
        }
    }
    
    private void RevisarRam(){
        try {
            System.out.println("Analizando la memoria RAM...");
            Thread.sleep(2500);
            System.out.println("RAM OK!");
        } catch (Exception e) {
        }
    }
    
    private void RevisarCache(){
    
        try {
            System.out.println("Analizando la memoria cache...");
            Thread.sleep(1000);
            System.out.println("Cache OK!");
        } catch (Exception e) {
        }
        
    }
    
    private void RevisarProcesosIniciales(){
        
        try {
            System.out.println("Revisando los procesos iniciales...");
            Thread.sleep(2000);
            System.out.println("Procesos OK!");
        } catch (Exception e) {
        }
        
    }
    
    private void RevisarEntradasSO(){
        try {
            System.out.println("Revisando las entradas del PC...");
            Thread.sleep(2000);
            System.out.println("Entradas OK!");
        } catch (Exception e) {
        }
    }
    
    private void Detener(){
        System.out.println("Proceso finalizado");
    }
    
}
