/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fast
 */

// Classe abstrata CurriculoBase que serve como base para os diferentes tipos de currículo
public abstract class CurriculoBase {
    private Pessoa pessoa;
    private String experienciaProfissional;

    // Construtor da classe abstrata CurriculoBase
    public CurriculoBase(Pessoa pessoa, String experienciaProfissional) {
        this.pessoa = pessoa;
        this.experienciaProfissional = experienciaProfissional;
    }

    

    // Métodos getters para obter os atributos do currículo
    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getExperienciaProfissional() {
        return experienciaProfissional;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract String obterDetalhes();
}
