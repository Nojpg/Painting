package pirate.nojpg.painting.controller

import org.w3c.fetch.Request
import org.w3c.fetch.RequestInit
import pirate.nojpg.painting.*
import pirate.nojpg.painting.view.viewAllSquares
//import pirate.nojpg.painting.view.viewOneSquare
import kotlin.browser.window
import kotlin.js.Promise

/**
 * Created by Nojpg on 21.06.17.
 */



fun fetchRequest(method: String, body: dynamic, url: String, fn: dynamic = ""){
    println("$method $body $url")
    println(JSON.stringify(headers))
    val request: Request = Request(
            input = URL + url,
            init = RequestInit(
                    redirect = redirect,
                    cache = cache,
                    mode = mode,
                    credentials = credentials,
                    headers = headers,
                    referrerPolicy = referrerPolicy,
                    method = method,
                    body = body,
                    integrity = integrity
            )
    )

    window.fetch(request).then(
            fun (response): Promise<Any?> {
                println(response.ok)
                println(response.url)
                println(response.status)
                when(fn){
                    "deleteSingleSquare" -> fetchRequest(method = GET, body = null, url = "squares",fn = "getAllSquares")
                    "deleteSingleBalloon" -> fetchRequest(method = GET, body = null, url = "balloons",fn = "getAllBalloons")
                }
                return response.json()
            }).then( fun (res){
        when(fn){
            "getAllSquares" -> getAllSquares(res)
            "getSingleSquare" -> getSingleSquare(res)
            "getAllBalloons" -> getAllBalloons(res)
            "getSingleBalloon" -> getSingleBalloon(res)
            "getAllPaints" -> getAllPaints(res)
            "getSinglePaint" -> getSinglePaint(res)
        }

    })
}

