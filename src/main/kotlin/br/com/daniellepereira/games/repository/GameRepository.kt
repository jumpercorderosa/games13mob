package br.com.daniellepereira.games.repository

import br.com.daniellepereira.games.model.Game
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

//: herança
@Repository //conversa com o banco de dados
interface GameRepository : MongoRepository<Game, String> {

    //select * from like
    fun findByNomeIgnoreCaseContaining(nome: String) : List<Game>
}