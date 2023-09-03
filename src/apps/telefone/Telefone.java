package apps.telefone;

import interfaces.AppTelefone;

public class Telefone implements AppTelefone {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para :" + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }
    
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio eletrônico");
    }
}
