/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fast
 */

// Classe CurriculoFuncional representa um currículo funcional que herda da classe CurriculoBase
public class CurriculoFuncional extends CurriculoBase {
    private String resumoProfissional;
    private String competencias;
    private String formacaoAcademica;
    private String outrasInformacoes;

    // Construtor da classe CurriculoFuncional
    public CurriculoFuncional(Pessoa pessoa, String resumoProfissional, String competencias, String experienciaProfissional, String formacaoAcademica, String outrasInformacoes) {
        super(pessoa, experienciaProfissional);
        this.resumoProfissional = resumoProfissional;
        this.competencias = competencias;
        this.formacaoAcademica = formacaoAcademica;
        this.outrasInformacoes = outrasInformacoes;
    }

    // Métodos getters para obter os atributos específicos do currículo funcional
    public String getResumoProfissional() {
        return resumoProfissional;
    }

    public String getCompetencias() {
        return competencias;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public String getOutrasInformacoes() {
        return outrasInformacoes;
    }

    // Implementação do método abstrato obterDetalhes() da classe CurriculoBase
    @Override
    public String obterDetalhes() {
        StringBuilder detalhes = new StringBuilder();
        
         // Gera a representação em formato de texto com todos os detalhes do currículo funcional
        // Retorna uma string com todos os atributos concatenados
        detalhes.append("Nome: ").append(getPessoa().getNome()).append("\r\n");
        detalhes.append("Endereço: ").append(getPessoa().getEndereco()).append("\r\n");
        detalhes.append("Telefone: ").append(getPessoa().getTelefone()).append("\r\n");
        detalhes.append("E-mail: ").append(getPessoa().getEmail()).append("\r\n");

        detalhes.append("Resumo Profissional:\n").append(resumoProfissional).append("\r\n");

        detalhes.append("Competências:\n").append(competencias).append("\r\n");

        detalhes.append("Experiência Profissional:\n").append(getExperienciaProfissional()).append("\r\n");

        detalhes.append("Formação Acadêmica:\n").append(formacaoAcademica).append("\r\n");

        detalhes.append("Outras Informações:\n").append(outrasInformacoes).append("\r\n");

        return detalhes.toString();
    }
}