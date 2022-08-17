package buem.pro.shvets_coursework.service.subjects.interfaces;

import buem.pro.shvets_coursework.module.Subjects;

import java.util.List;

public interface ISubjectsService {
    Subjects create (Subjects subjects);
    Subjects  update (Subjects subjects);
    Subjects get (String id);
    void  delete (String id);
    List<Subjects> getAll();

}
