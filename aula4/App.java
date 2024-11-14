

public class App {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("filho");
        System.out.println(eu.getNome());

        Pessoa mae = new Pessoa("mae");

        Pessoa pai = new Pessoa("pai");
        
        Pessoa gfM = new Pessoa("avôMaterno");
        Pessoa gmM= new Pessoa("avóMaterna");
        Pessoa gfP= new Pessoa("avôPaterno");
        Pessoa gmP = new Pessoa("avóPaterna");

        eu.setMae(mae);
        eu.setPai(pai);
        pai.setPai(gfP);
        pai.setMae(gmP);
        mae.setPai(gfM);
        mae.setMae(gmM);


        for(Pessoa p : eu.getAntepassados()){
            System.out.println(p);
        }

    }
}
