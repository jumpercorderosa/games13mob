package br.com.daniellepereira.games.controller

import br.com.daniellepereira.games.model.Game
import br.com.daniellepereira.games.service.GameServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

//controller faz o parse da request que vai chegar

//anotação
@RestController
@CrossOrigin //quando a origem da API é diferente da aplicação
@RequestMapping (value = "/game")
class GameController {

    @Autowired
    lateinit var gameService: GameServices

    @GetMapping //get pega
    fun buscarTodos(): List<Game> {
        return gameService.buscarTodos()
    }

    @PostMapping //post vai salvar
    fun salvar(@RequestBody game: Game) {
        gameService.salvar(game)
    }

    //path variable
    @GetMapping(value="/titulo/{titulo}")
    fun buscarPor(@PathVariable(value = "titulo") titulo: String ) : List<Game>{
        return gameService.buscarPor(nome=titulo)
    }

    @DeleteMapping("{id}")
    fun apagar(@PathVariable("id") id: String) {
        gameService.apagar(id)
    }
}