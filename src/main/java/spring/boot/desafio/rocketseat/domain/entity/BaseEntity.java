package spring.boot.desafio.rocketseat.domain.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedDate
    @Column(name = "data_inclusao", updatable = false)
    private LocalDateTime dataInclusao;

    @LastModifiedDate
    @Column(name = "data_atualizacao")
    private LocalDateTime dataAlteracao;

    public LocalDateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public LocalDateTime getDataInclusao() {
        return dataInclusao;
    }
}
