package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    public List<Produto> produtos = new ArrayList<Produto>();

    public ProdutoController() {
        produtos.add(new Produto("123456", "Caneca", 80, 40));
        produtos.add(new Produto("635746", "Toalha", 30, 15));
        produtos.add(new Produto("193402", "Tênis", 100, 50));
        produtos.add(new Produto("130090", "Camiseta", 50, 25));
    }

    @GetMapping
    public String getProdutos(Model model) {
        model.addAttribute("produtos", produtos);
        return "produtos";
    }
}