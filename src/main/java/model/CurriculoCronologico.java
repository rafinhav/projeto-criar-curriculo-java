/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fast
 */

// Classe CurriculoCronologico representa um currículo cronológico que herda da classe CurriculoBase
public class CurriculoCronologico extends CurriculoBase {
    private String objetivoProfissional;
    private String formacaoAcademica;
    private String habilidades;
    private String idiomas;
    private String atividadesExtracurriculares;
    private String referencias;
    private String observacoes;
    private String dataAssinatura;

     // Construtor da classe CurriculoCronologico
    public CurriculoCronologico(Pessoa pessoa, String objetivoProfissional, String formacaoAcademica, String experienciaProfissional, String habilidades, String idiomas, String atividadesExtracurriculares, String referencias, String observacoes, String dataAssinatura) {
        super(pessoa, experienciaProfissional);
        this.objetivoProfissional = objetivoProfissional;
        this.formacaoAcademica = formacaoAcademica;
        this.habilidades = habilidades;
        this.idiomas = idiomas;
        this.atividadesExtracurriculares = atividadesExtracurriculares;
        this.referencias = referencias;
        this.observacoes = observacoes;
        this.dataAssinatura = dataAssinatura;
    }

    // Métodos getters para obter os atributos específicos do currículo cronológico
    public String getObjetivoProfissional() {
        return objetivoProfissional;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public String getAtividadesExtracurriculares() {
        return atividadesExtracurriculares;
    }

    public String getReferencias() {
        return referencias;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public String getDataAssinatura() {
        return dataAssinatura;
    }

     // Implementação do método abstrato obterDetalhes() da classe CurriculoBase
    @Override
    public String obterDetalhes() {
        StringBuilder detalhes = new StringBuilder();

        // Gera a representação em formato de texto com todos os detalhes do currículo cronológico
        // Retorna uma string com todos os atributos concatenados
        detalhes.append("Nome: ").append(getPessoa().getNome()).append("\r\n");
        detalhes.append("Endereço: ").append(getPessoa().getEndereco()).append("\r\n");
        detalhes.append("Telefone: ").append(getPessoa().getTelefone()).append("\r\n");
        detalhes.append("E-mail: ").append(getPessoa().getEmail()).append("\r\n");

        detalhes.append("Objetivo Profissional:\n").append(objetivoProfissional).append("\r\n");

        detalhes.append("Formação Acadêmica:\n").append(formacaoAcademica).append("\r\n");

        detalhes.append("Experiência Profissional:\n").append(getExperienciaProfissional()).append("\r\n");

        detalhes.append("Habilidades:\n").append(habilidades).append("\r\n");

        detalhes.append("Idiomas:\n").append(idiomas).append("\r\n");

        detalhes.append("Atividades Extracurriculares:\n").append(atividadesExtracurriculares).append("\r\n");

        detalhes.append("Referências:\n").append(referencias).append("\r\n");

        detalhes.append("Observações Adicionais:\n").append(observacoes).append("\r\n");

        detalhes.append("Data e Assinatura:\n").append(dataAssinatura).append("\n").append(getPessoa().getNome()).append("\r\n");

        return detalhes.toString();
    }
}