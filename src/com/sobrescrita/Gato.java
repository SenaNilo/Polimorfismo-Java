package com.sobrescrita;

public class Gato extends Animal{
    
    public Gato(String nome){
        super(nome);
    }

    //Esse override é uma anotação que o compilador poderá usar (como se fosse um comentário usado como metadado). Que indica se a sobrescrita está correta ou não. É uma boa prática!
    //Obs: Modificador de acesso não pode ser maior que a da superclasse.
    //Obs2: O retorno deve ser o mesmo.
    //Obs3: Usar um nome genérico para descrever comportamentos similares é uma boa prática (Generalização)
    @Override
    public void emitirSom(){
        System.out.println("MIAU");
    }

    public void ronrona(){
        System.out.println("Purrrrrrrrr");
    }
}