package buem.pro.shvets_coursework.service.subjects.impls;

import buem.pro.shvets_coursework.module.Subjects;
import buem.pro.shvets_coursework.repository.SubjectsFakeRepository;
import buem.pro.shvets_coursework.service.subjects.interfaces.ISubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectsServiceImpl implements ISubjectsService {
    @Autowired
    SubjectsFakeRepository repository;

    @Override
    public Subjects create(Subjects subjects) {
        return  repository.save(subjects);
    }

    @Override
    public Subjects update(Subjects subjects) {

        return repository.update(subjects);
    }

    @Override
    public Subjects get(String id) {

        return repository.findByID(id);
    }

    @Override
    public void delete(String id) {

        repository.deleteById(id);
    }

    @Override
    public List<Subjects> getAll() {

        return this.repository.findAll();
    }
}