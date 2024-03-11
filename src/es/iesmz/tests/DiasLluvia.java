package es.iesmz.tests;

public class DiasLluvia {

    private boolean [][] haLLovido;

    public DiasLluvia (){
        this.haLLovido = new boolean[12][31];
    }

    public boolean registroDia (int dia, int mes, boolean lluvia){
        if (mes >= 0 && mes <= 11){
            if (mes == 1 && dia >= 0 && dia <= 27){
                haLLovido[mes][dia] = lluvia;
                return true;
            } else if (mes % 2 == 0 && dia >= 0 && dia <= 30){
                haLLovido[mes][dia] = lluvia;
                return true;
            } else if (dia >= 0 && dia <= 29){
                haLLovido[mes][dia] = lluvia;
                return true;
            }
        } return false;
    }

    public boolean consultarDia (int dia, int mes){
        return haLLovido[dia][mes];
    }
}
