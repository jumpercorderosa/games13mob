package br.com.daniellepereira.games.service

import br.com.daniellepereira.games.model.Game
import br.com.daniellepereira.games.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameServices {

    //injeção de dependencia no spring
    @Autowired
    lateinit var gameRepository : GameRepository

    fun buscarTodos() : List<Game>{
        return gameRepository.findAll() //select * from
    }

    fun salvar(game: Game) {
        gameRepository.save(game) //se tiver o ID ele atualiza, senão ele cria um novo
    }

    fun buscarPor(nome: String) : List<Game>{
        return gameRepository.findByNomeIgnoreCaseContaining(nome) //select * from
    }

    fun apagar(id:String) {
        gameRepository.deleteById(id)
    }

}