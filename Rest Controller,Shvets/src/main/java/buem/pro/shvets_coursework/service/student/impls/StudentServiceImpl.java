package buem.pro.shvets_coursework.service.student.impls;

import buem.pro.shvets_coursework.module.Student;
import buem.pro.shvets_coursework.repository.StudentFakeRepository;
import buem.pro.shvets_coursework.service.student.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    StudentFakeRepository repository;

    @Override
    public Student create(Student student) {
        return  repository.save(student);
    }

    @Override
    public Student update(Student student) {

        return repository.update(student);
    }

    @Override
    public Student get(String id) {

        return repository.findByID(id);
    }

    @Override
    public void delete(String id) {

        repository.deleteById(id);
    }

    @Override
    public List<Student> getAll() {

        return this.repository.findAll();
    }
}
