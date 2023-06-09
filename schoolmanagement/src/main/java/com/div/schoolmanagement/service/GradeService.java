package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Grade;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.inter.GradeServiceInter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GradeService implements GradeServiceInter {
    private List<Grade> gradeList = Statics.gradeList;

    @Override
    public void create(Grade grade) {
        Statics.gradeList.add(grade);
    }


    @Override
    public Grade getGradeById(int id) {
        return Statics.gradeList.stream().filter(grade -> grade.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Grade> getAll(Grade grade) {
        return Statics.gradeList;
    }

    @Override
    public void delete(int id) {
        Statics.gradeList.removeIf(grade -> grade.getId() == id);
    }


    @Override
    public void updateById(int id, Grade grade) {
        Grade oldGrade = Statics.gradeList.stream()
                .filter(grade1 -> grade1.getId() == id)
                .findFirst()
                .orElse(null);
        if (oldGrade != null) {
            oldGrade.setId(oldGrade.getId());
            oldGrade.setPoint(oldGrade.getPoint());

        }
    }
}
