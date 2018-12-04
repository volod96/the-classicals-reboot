package com.volod96.theClassicals.reboot.composer;

import com.volod96.theClassicals.reboot.util.AssertionUtility;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComposerService {

    private ComposerRepository composerRepository;

    public ComposerService(ComposerRepository composerRepository) {
        AssertionUtility.assertNullObject(composerRepository);
        this.composerRepository = composerRepository;
    }

    List<Composer> getAllComposers() {
        List<Composer> foundComposers = new ArrayList<>();
        this.composerRepository.findAll().forEach(foundComposers::add);
        return foundComposers;
    }

    Composer getComposer(int id) {
        return this.composerRepository.findById(id).get();
    }

    void addComposer(Composer composer) {
        this.composerRepository.save(composer);
    }

    void updateComposer(Composer composer) {
        this.composerRepository.save(composer);
    }

    void removeComposer(int id) {
        this.composerRepository.deleteById(id);
    }
}
