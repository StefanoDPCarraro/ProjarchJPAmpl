package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

public interface IEditoraRepository {
    List<Editora> getEditoras();
    Editora findEditora(long id);
}