package dev.javax.CadastroDeNinjas.Missoes;

import dev.javax.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;
    //OneToMany - Uma missão pode ter varios ninjas
    @OneToMany (mappedBy = "missoes")
    private List<NinjaModel> ninja;

    public MissoesModel() {}

    public MissoesModel(String nome) {
        this.nomeMissao = nome;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nome) {
        this.nomeMissao = nome;
    }

    public Long getId() {
        return id;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
