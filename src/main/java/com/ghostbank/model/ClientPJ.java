package com.ghostbank.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Objects;

@Getter
@Setter
@Entity
public class ClientPJ extends Client{

 private String cnpj;

    public ClientPJ() {
    }

    public ClientPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClientPJ clientPJ = (ClientPJ) o;
        return Objects.equals(cnpj, clientPJ.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cnpj);
    }
}
