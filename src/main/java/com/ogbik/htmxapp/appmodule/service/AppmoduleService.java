package com.ogbik.htmxapp.appmodule.service;

import com.ogbik.htmxapp.appmodule.domain.Appmodule;
import com.ogbik.htmxapp.appmodule.model.AppmoduleDTO;
import com.ogbik.htmxapp.appmodule.repos.AppmoduleRepository;
import com.ogbik.htmxapp.util.NotFoundException;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class AppmoduleService {

    private final AppmoduleRepository appmoduleRepository;

    public AppmoduleService(final AppmoduleRepository appmoduleRepository) {
        this.appmoduleRepository = appmoduleRepository;
    }

    public List<AppmoduleDTO> findAll() {
        final List<Appmodule> appmodules = appmoduleRepository.findAll(Sort.by("id"));
        return appmodules.stream()
                .map(appmodule -> mapToDTO(appmodule, new AppmoduleDTO()))
                .toList();
    }

    public AppmoduleDTO get(final Long id) {
        return appmoduleRepository.findById(id)
                .map(appmodule -> mapToDTO(appmodule, new AppmoduleDTO()))
                .orElseThrow(NotFoundException::new);
    }

    public Long create(final AppmoduleDTO appmoduleDTO) {
        final Appmodule appmodule = new Appmodule();
        mapToEntity(appmoduleDTO, appmodule);
        return appmoduleRepository.save(appmodule).getId();
    }

    public void update(final Long id, final AppmoduleDTO appmoduleDTO) {
        final Appmodule appmodule = appmoduleRepository.findById(id)
                .orElseThrow(NotFoundException::new);
        mapToEntity(appmoduleDTO, appmodule);
        appmoduleRepository.save(appmodule);
    }

    public void delete(final Long id) {
        appmoduleRepository.deleteById(id);
    }

    private AppmoduleDTO mapToDTO(final Appmodule appmodule, final AppmoduleDTO appmoduleDTO) {
        appmoduleDTO.setId(appmodule.getId());
        appmoduleDTO.setName(appmodule.getName());
        appmoduleDTO.setDeleted(appmodule.getDeleted());
        appmoduleDTO.setDescription(appmodule.getDescription());
        return appmoduleDTO;
    }

    private Appmodule mapToEntity(final AppmoduleDTO appmoduleDTO, final Appmodule appmodule) {
        appmodule.setName(appmoduleDTO.getName());
        appmodule.setDeleted(appmoduleDTO.getDeleted());
        appmodule.setDescription(appmoduleDTO.getDescription());
        return appmodule;
    }

}
