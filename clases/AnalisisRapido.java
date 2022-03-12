package Strategy.clases;

public class AnalisisRapido implements Analisis {
    
    @Override
    public void analizar(){
        
        iniciar();
        RevisarDiscos();
        RevisarCache();
        Detener();
        
    }
    
    private void iniciar(){
        System.out.println("Analisis rapido iniciado");
    }
    
    private void RevisarDiscos(){
         try {
            System.out.println("Analizando los discos...");
            Thread.sleep(2500);
            System.out.println("Discos OK!");
        } catch (Exception e) {
        }
    }
    
    private void RevisarCache(){
         try {
            System.out.println("Analizando la memoria cache...");
            Thread.sleep(2500);
            System.out.println("Cache OK!");
        } catch (Exception e) {
        }
    }
    
    private void Detener(){
          System.out.println("Proceso finalizado");
    }
    
}
