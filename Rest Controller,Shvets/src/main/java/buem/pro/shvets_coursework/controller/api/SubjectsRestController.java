package buem.pro.shvets_coursework.controller.api;

import buem.pro.shvets_coursework.module.Subjects;
import buem.pro.shvets_coursework.service.subjects.impls.SubjectsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/subjects")
@RestController
public class SubjectsRestController {
    @Autowired
    SubjectsServiceImpl service;

    @GetMapping("/")
    public List<Subjects> showAll(){

        return service.getAll();
    }
    @GetMapping("/{id}")
    public Subjects showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Subjects insertOne(@RequestBody Subjects subjects){
        return service.create(subjects);
    }

    @PutMapping()
    public Subjects updateOne(@RequestBody Subjects subjects){
        return service.update(subjects);
    }
}