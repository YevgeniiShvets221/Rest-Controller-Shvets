package buem.pro.shvets_coursework.service.studyPlan.impls;

import buem.pro.shvets_coursework.module.Student;
import buem.pro.shvets_coursework.module.StudyPlan;
import buem.pro.shvets_coursework.repository.StudyPlanFakeRepository;
import buem.pro.shvets_coursework.service.studyPlan.interfaces.IStudyPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class StudyPlanServiceImpl implements IStudyPlanService {

    @Autowired
    StudyPlanFakeRepository repository;
    @Override
    public StudyPlan create(StudyPlan studyPlan) {
        return  repository.save(studyPlan);
    }

    @Override
    public StudyPlan update(StudyPlan studyPlan) {

        return repository.update(studyPlan);
    }

    @Override
    public StudyPlan get(String id) {

        return repository.findByID(id);
    }

    @Override
    public void delete(String id) {

        repository.deleteById(id);
    }

    @Override
    public List<StudyPlan> getAll() {

        return this.repository.findAll();
    }
}
