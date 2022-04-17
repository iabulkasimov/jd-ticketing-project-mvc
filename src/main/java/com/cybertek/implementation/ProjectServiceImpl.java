package com.cybertek.implementation;

import com.cybertek.dto.ProjectDTO;
import com.cybertek.enums.Status;
import com.cybertek.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends AbstractMapServices<ProjectDTO,String> implements ProjectService {
    @Override
    public ProjectDTO save(ProjectDTO object) {
        return super.save(object.getProjectCode(),object);
    }

    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void update(ProjectDTO object) {

        ProjectDTO newProject = findByID(object.getProjectCode());
        if (object.getProjectStatus() == null){
            object.setProjectStatus(newProject.getProjectStatus());
        }

        super.update(object.getProjectCode(),object);
    }

    @Override
    public void deleteByID(String projectCode) {
        super.deleteByID(projectCode);
    }

    @Override
    public void delete(ProjectDTO object) {
        super.delete(object);
    }

    @Override
    public ProjectDTO findByID(String projectCode) {
        return super.findByID(projectCode);
    }

    @Override
    public void complete(ProjectDTO project) {
        project.setProjectStatus(Status.COMPLETE);
        super.save(project.getProjectCode(), project);
    }
}
