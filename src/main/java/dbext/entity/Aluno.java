package dbext.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ALUNO
* @generated
*/
@Entity
@Table(name = "\"ALUNO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("dbext.entity.Aluno")
public class Aluno implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, length=255, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_curso", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Curso curso;

    /**
    * @generated
    */
    @Column(name = "nome", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * Construtor
    * @generated
    */
    public Aluno(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Aluno setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém curso
    * return curso
    * @generated
    */
    
    public Curso getCurso(){
        return this.curso;
    }

    /**
    * Define curso
    * @param curso curso
    * @generated
    */
    public Aluno setCurso(Curso curso){
        this.curso = curso;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Aluno setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Aluno object = (Aluno)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}