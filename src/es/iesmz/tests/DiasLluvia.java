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

    public int contarDiasLLuviosos () {
        int numDias = 0;
        for (int i = 0; i < haLLovido.length; i++) {
            for (int j = 0; j < haLLovido[i].length; j++) {
                if (haLLovido[i][j]) numDias++;
            }
        } return numDias;
    }

    public int trimestreLluvioso() {
        int[] trimestreDiasLluviosos = new int[4];

        for (int i = 0; i < haLLovido.length; i++) {
            for (int j = 0; j < haLLovido[i].length; j++) {
                if (haLLovido[i][j]) {
                    if (j >= 0 && j <= 2) {
                        trimestreDiasLluviosos[0]++;
                    } else if (j >= 3 && j <= 5) {
                        trimestreDiasLluviosos[1]++;
                    } else if (j >= 6 && j <= 8) {
                        trimestreDiasLluviosos[2]++;
                    } else if (j >= 9 && j <= 11) {
                        trimestreDiasLluviosos[3]++;
                    }
                }
            }
        }

        int maxTrimestre = 1;
        int maxDiasLluviosos = trimestreDiasLluviosos[0];

        for (int k = 1; k < trimestreDiasLluviosos.length; k++) {
            if (trimestreDiasLluviosos[k] > maxDiasLluviosos) {
                maxDiasLluviosos = trimestreDiasLluviosos[k];
                maxTrimestre = k + 1;
            }
        }

        return maxTrimestre;
    }

    public int primerDiaLluvia() {
        for (int i = 0; i < haLLovido.length; i++) {
            for (int j = 0; j < haLLovido[i].length; j++) {
                if (haLLovido[i][j]) {
                    return j + i * 31 + 1;
                }
            }
        }

        return -1;
    }

}
