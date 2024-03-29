package com.devloopers.masternote.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data

@Entity
@Table(name = "criterio_critico")
public class CriterioCritico implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_criterio_critico")
    private Long id;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "capacidade_id_capacidade")
    private Capacidade capacidade;

    // getters e setters
}
