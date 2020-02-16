package principioinversaodependenciaerrado;
public class Moto {
    private boolean motorLigado; 

    public Moto(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }
    
    public boolean ligarMotor(){
        if(!this.motorLigado){
            this.motorLigado = true; 
        }
        return motorLigado; 
    } 
    
    public boolean desligarMotor(){
        if(motorLigado){
            motorLigado = false; 
        }
        return motorLigado; 
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }
    
}
