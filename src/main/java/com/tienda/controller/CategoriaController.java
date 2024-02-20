package com.tienda.controller;

import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria") //Se indica el prefijo de todos los controladores(para el caso de que todos se llamaran igual)
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @RequestMapping("/listado")
    public String listado(Model model) {
        List<Categoria> lista = categoriaService.getcategorias(false);
        model.addAttribute("categorias", lista);
        model.addAttribute("totalCategorias", lista.size());
        return "/categoria/listado";
    }

}
