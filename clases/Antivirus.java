package Strategy.clases;

public class Antivirus {
    
    private Analisis analisis;

    public void setAnalisis(Analisis analisis) {
        this.analisis = analisis;
    }

    public void AnalizarPc(){
        analisis.analizar();
    }
    
    
}
