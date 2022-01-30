package com.dio.models;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Contents> subscribedContents = new LinkedHashSet<>();
    private Set<Contents> completedContents = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp){
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress() {
        Optional<Contents> contents = this.subscribedContents.stream().findFirst();
        if(contents.isPresent()) {
            this.completedContents.add(contents.get());
            this.subscribedContents.remove(contents.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXp() {
        return this.completedContents
                .stream()
                .mapToDouble(Contents::calculateXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Contents> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Contents> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Contents> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Contents> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome)
                && Objects.equals(completedContents, dev.subscribedContents)
                && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, subscribedContents, completedContents);
    }
}
