package com.ogbik.htmxapp.appmodule.controller;

import com.ogbik.htmxapp.appmodule.model.AppmoduleDTO;
import com.ogbik.htmxapp.appmodule.service.AppmoduleService;
import com.ogbik.htmxapp.util.WebUtils;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/appmodules")
public class AppmoduleController {

    private final AppmoduleService appmoduleService;

    public AppmoduleController(final AppmoduleService appmoduleService) {
        this.appmoduleService = appmoduleService;
    }

    @GetMapping
    public String list(final Model model) {
        model.addAttribute("appmodules", appmoduleService.findAll());
        return "appmodule/list";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute("appmodule") final AppmoduleDTO appmoduleDTO) {
        return "appmodule/add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("appmodule") @Valid final AppmoduleDTO appmoduleDTO,
            final BindingResult bindingResult, final RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "appmodule/add";
        }
        appmoduleService.create(appmoduleDTO);
        redirectAttributes.addFlashAttribute(WebUtils.MSG_SUCCESS, WebUtils.getMessage("appmodule.create.success"));
        return "redirect:/appmodules";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable(name = "id") final Long id, final Model model) {
        model.addAttribute("appmodule", appmoduleService.get(id));
        return "appmodule/edit";
    }

    @PostMapping("/edit/{id}")
    public String edit(@PathVariable(name = "id") final Long id,
            @ModelAttribute("appmodule") @Valid final AppmoduleDTO appmoduleDTO,
            final BindingResult bindingResult, final RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "appmodule/edit";
        }
        appmoduleService.update(id, appmoduleDTO);
        redirectAttributes.addFlashAttribute(WebUtils.MSG_SUCCESS, WebUtils.getMessage("appmodule.update.success"));
        return "redirect:/appmodules";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") final Long id,
            final RedirectAttributes redirectAttributes) {
        appmoduleService.delete(id);
        redirectAttributes.addFlashAttribute(WebUtils.MSG_INFO, WebUtils.getMessage("appmodule.delete.success"));
        return "redirect:/appmodules";
    }

}
