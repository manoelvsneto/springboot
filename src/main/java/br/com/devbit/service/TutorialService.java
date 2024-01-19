package br.com.devbit.service;

import java.util.ArrayList;
import java.util.List;

import br.com.devbit.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devbit.model.Tutorial;

@Service
public class TutorialService {

    @Autowired
    TutorialRepository tutorialRepository;
    static List<Tutorial> tutorials = new ArrayList<Tutorial>();
    static long id = 0;

    public List<Tutorial> findAll() {
        return tutorialRepository.findAll();
    }

    public List<Tutorial> findByTitleContaining(String title) {
        return tutorialRepository.findAll();
    }

    public Tutorial findById(long id) {
        return tutorials.stream().filter(tutorial -> id == tutorial.getId()).findAny().orElse(null);
    }

    public Tutorial save(Tutorial tutorial) {
        tutorialRepository.save(tutorial);
        return tutorial;
    }

    public void deleteById(long id) {
      tutorialRepository.deleteById(id);
    }

    public void deleteAll() {
      tutorialRepository.deleteAll();
    }

    public List<Tutorial> findByPublished(boolean isPublished) {
      return tutorialRepository.findAll();

    }
}
