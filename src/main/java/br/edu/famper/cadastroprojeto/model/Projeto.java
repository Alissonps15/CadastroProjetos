package br.edu.famper.cadastroprojeto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Table(name = "tbl_projeto")
@Data
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "projeto_id")
    private Long codigo;

    @Column(name= "descricao", length = 150)
    private String descricao;

    @Column(name = "dataInicio")
    private LocalDate dataInicio;

    @Column(name = "dataFim")
    private LocalDate dataFim;
}