/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fast
 */

// Classe CurriculoCombinado representa um currículo combinado que herda da classe CurriculoFuncional
public class CurriculoCombinado extends CurriculoFuncional {
    private CurriculoCronologico curriculoCronologico;

    // Construtor da classe CurriculoCombinado
    public CurriculoCombinado(Pessoa pessoa, String resumoProfissional, String competencias, String experienciaProfissionalFuncional, String formacaoAcademicaFuncional, String outrasInformacoes, CurriculoCronologico curriculoCronologico) {
        super(pessoa, resumoProfissional, competencias, experienciaProfissionalFuncional, formacaoAcademicaFuncional, outrasInformacoes);
        this.curriculoCronologico = curriculoCronologico;
    }

    // Método getter para obter o currículo cronológico do currículo combinado
    public CurriculoCronologico getCurriculoCronologico() {
        return curriculoCronologico;
    }

    
    // Implementação do método obterDetalhes() da classe CurriculoBase
    @Override
    public String obterDetalhes() {
        StringBuilder detalhes = new StringBuilder();

        detalhes.append(super.obterDetalhes());
        detalhes.append("\n\n=== Currículo Cronológico ===\n\n");
        detalhes.append(curriculoCronologico.obterDetalhes());

        return detalhes.toString();
    }
}