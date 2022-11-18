package com.ghostbank.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Objects;

@Setter
@Getter
@Entity
public class ClientPF extends Client{

    private String cpf;

    public ClientPF() {
    }

    public ClientPF(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClientPF clientPF = (ClientPF) o;
        return Objects.equals(cpf, clientPF.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cpf);
    }


}
