package com.example.root.teoriacomput;

/**
 * Created by alberto on 21/12/2017.
 */

public class Validacao {

    private static final String EXP_NOME = "\\D*";
    private static final String EXP_ENDERECO = ".*";
    private static final String EXP_CPF = "\\d{11}";
    private static final String EXP_RG = "\\d{10}";
    private static final String EXP_DATA = "\\d{2}/\\d{2}/\\d{4}";
    private static final String EXP_E_MAIL = "\\d* @ \\d*";
    private static final String EXP_ALTURA = "\\D{3}";
    private static final String EXP_PESO = "\\D*";

   private String exp = "";

    public void setExp (int i) {

        switch (i) {
            case 1:
                exp = EXP_NOME;
                break;
            case 2:
                exp = EXP_ENDERECO;
                break;
            case 3:
                exp = EXP_CPF;
                break;
            case 4:
                exp = EXP_RG;
                break;
            case 5:
                exp = EXP_DATA;
                break;
            case 6:
                exp = EXP_E_MAIL;
                break;
            case 7:
                exp = EXP_ALTURA;
                break;
            case 8:
                exp = EXP_PESO;
                break;


        }

    }


    public Boolean VerificarNome(String nome)
    {

        return (nome.matches(exp));
    }


    public boolean VerificarEndereco(String endereco)
    {
        return (endereco.matches(exp));

    }


    public boolean VerificarCpf(String CPF)
    {

        return(CPF.matches(exp));
    }


    public boolean VerificarRg(String RG)
    {

        return(RG.matches(exp));
    }


    public boolean VerificarData(String Data)
    {

        return(Data.matches(exp));
    }


    public boolean VerificarEmail(String Email)
    {

        return Email.matches(exp);
    }


    public boolean VerificarAltura(String Altura)
    {

        return Altura.matches(exp);
    }

    public boolean VerificarPeso(String Peso)
    {
        return(Peso.matches(exp));
    }
}
