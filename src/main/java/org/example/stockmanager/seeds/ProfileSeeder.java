package org.example.stockmanager.seeds;

import org.example.stockmanager.models.Profile;
import org.example.stockmanager.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfileSeeder implements CommandLineRunner {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public void run(String... args) throws Exception {
        if (profileRepository.count() == 0) {
            createProfile("Administrador");
            createProfile("Gerente de Estoque");
            createProfile("Comprador");
            createProfile("Vendedor");
            createProfile("Financeiro");

            System.out.println("Perfis padrão criados com sucesso.");
        } else {
            System.out.println("Perfis já existem, seed ignorado.");
        }
    }

    private void createProfile(String name) {
        Profile profile = new Profile();
        profile.setName(name);
        profileRepository.save(profile);
    }
}