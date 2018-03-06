package br.com.daniellepereira.games.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


//data class já tem os getters and setters
//val só cria o get, var cria o get e set
@Document // esse arroba diz q vai ter um documento no banco
data class Game(@Id val id:String? = null,
                var nome: String,
                var urlImagem: String,
                var anoLancamento:Integer)


