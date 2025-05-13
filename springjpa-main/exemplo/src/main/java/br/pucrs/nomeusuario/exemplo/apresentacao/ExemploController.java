package br.pucrs.nomeusuario.exemplo.apresentacao;

import br.pucrs.nomeusuario.exemplo.persistencia.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/biblioteca")
public class ExemploController {
    private IAcervoRepository acervo;
    private IEditoraRepository editora;

    @Autowired
    public ExemploController(IAcervoRepository acervo, IEditoraRepository editora) {
        this.acervo = acervo;   
        this.editora = editora;     
    }

    @GetMapping("")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
    public List<Livro> getLivros() {
        return acervo.getLivros();
    }

    @GetMapping("/livroid/{id}")
    public Livro getLivroTitulo(@PathVariable("id") long id) {
        return acervo.getLivroId(id);
    }

    @GetMapping("/editoras")
    public List<Editora> getEditoras(){
        return editora.getEditoras();
    }

    @GetMapping("/editoraid/{id}")
    public Editora getEditoraById(@PathVariable long id){
        return editora.findEditora(id);
    } 

}