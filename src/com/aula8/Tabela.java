package com.aula8;

public class Tabela {
    public static String inserir(Cliente c){
        //Scaping - " \" " serve para as aspas ir dentro do print
        String sql = "INSERT INTO Cliente VALUES(";
        sql = sql + "\"" + c.getNome() + "\"" + ",\""; 
        sql += c.getCpf() + "\")";
        return sql;
    }

    public static String inserir(Produto p){
        String sql = "INSERT INTO Produto VALUES(";
        sql = sql + "\"" + p.getNome() + "\",";
        sql += p.getPreco() + ")";
        return sql;
    }
}