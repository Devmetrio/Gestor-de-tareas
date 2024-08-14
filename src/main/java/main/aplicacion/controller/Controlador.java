package main.aplicacion.controller;

import main.aplicacion.Domain.TareaEntity;
import main.aplicacion.Domain.TareaControlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class Controlador {
    private final TareaControlador tareaControlador;

    @Autowired
    public Controlador(TareaControlador tareaControlador) {
        this.tareaControlador = tareaControlador;
    }

    @GetMapping
    public String inicio(Model model) {
        List<TareaEntity> tareas = this.tareaControlador.getTareas();
        if (tareas != null) {
            model.addAttribute("tareas", tareas  );
        }
        return "inicio";
    }
}
