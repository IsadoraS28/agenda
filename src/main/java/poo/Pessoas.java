package poo;

import java.time.LocalDate;

public class Pessoas {

    private String nome;
    private String sobrenome;
    private LocalDate nataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoas(String n, String s, LocalDate dN){

    }

    public boolean addTelefone(String r, String n){

        return true;

    }

    public boolean addEmail(String r, String e){

        return true;

    }

    public boolean removeTelefone(String r){

        return true;

    }

    public boolean removeEmail(String r){

        return true;

    }

    public boolean updateTelefone(String r, String n){

        return true;

    }

    public boolean updateEmail(String r, String e){

        return true;

    }

    public String toString(){

        return "ola";

    }

}
