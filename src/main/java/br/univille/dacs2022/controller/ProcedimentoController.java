package br.univille.dacs2022.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.dacs2022.dto.ProcedimentoDTO;
import br.univille.dacs2022.service.ProcedimentoService;

@Controller
@RequestMapping("/procedimento")
public class ProcedimentoController {
    @Autowired
    private ProcedimentoService service;

    @GetMapping
    public ModelAndView index() {
        List<ProcedimentoDTO> listaProcedimentos = service.getAll();

        return new ModelAndView("procedimento/index",
                "listaProcedimentos", listaProcedimentos);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var procedimento = new ProcedimentoDTO();
        return new ModelAndView("procedimento/form",
                "procedimento", procedimento);
    }

    @PostMapping(params = "form")
    public ModelAndView save(ProcedimentoDTO procedimento) {
        service.save(procedimento);
        return new ModelAndView("redirect:/procedimento");
    }

    @GetMapping(path = "/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Long id) {
        ProcedimentoDTO paciente = service.findById(id);
        return new ModelAndView("procedimento/form", "procedimento", paciente);

    }

    @GetMapping(path = "/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {
        service.delete(id);
        return new ModelAndView("redirect:/paciente");

    }
}
