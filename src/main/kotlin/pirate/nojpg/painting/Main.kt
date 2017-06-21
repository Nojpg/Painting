package pirate.nojpg.painting

import org.w3c.fetch.*
import org.w3c.workers.FunctionalEvent
import pirate.nojpg.painting.controller.fetchRequest
import pirate.nojpg.painting.model.Square
import pirate.nojpg.painting.view.launch
import pirate.nojpg.painting.view.singleSquare
import pirate.nojpg.painting.view.viewAllSquares
import kotlin.browser.window
import kotlin.js.Promise
import kotlin.js.json

/**
 * Created by Nojpg on 20.06.17.
 */

const val URL = "http://localhost:8000/api/"
const val POST: String = "POST"
const val GET: String = "GET"
const val PUT: String = "PUT"
const val DELETE: String = "DELETE"
const val integrity: String = ""

val credentials: RequestCredentials = RequestCredentials.INCLUDE
val redirect: RequestRedirect = RequestRedirect.FOLLOW
val cache: RequestCache = RequestCache.ONLY_IF_CACHED
val mode: RequestMode = RequestMode.SAME_ORIGIN
val referrerPolicy: dynamic = "origin-when-cross-origin"
val headers = json("Content-Type" to "application/json")

fun main(args: Array<String>) {

    launch()

//    fetchRequest(method = GET, body = null, url = "squares/1", fn = "getSingleSquare")
//    val body = JSON.stringify(json("id" to "1", "name" to "test"))
//    println(JSON.stringify(body))
//
//    val body = JSON.stringify(Square("76", "tests"))
//    fetchRequest(method = POST,body = body , url = "squares/")

}
