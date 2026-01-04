package org.example.snapsevise.service;

import org.example.snapsevise.model.Snapsevise;
import org.example.snapsevise.repository.Repository;

import java.util.List;
import java.util.Random;

@org.springframework.stereotype.Service
public class Service {

    private final Repository repository;

    Random random;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Snapsevise> findAlleSnapseviser () {
        return repository.findAlleSnapseviser();
    }
}
