package pirate.nojpg.painting.view

import kotlinx.html.*
import kotlinx.html.dom.create
import org.w3c.dom.Element
import kotlin.browser.document

/**
 * Created by Nojpg on 21.06.17.
 */
//TODO
//get all
fun viewAllBalloons(){
    val root: Element = document.getElementById("root")!!
    root.innerHTML = ""


    val getBalloonView: Element = document.create.div{
        id = "allBalloons"

    }

    root.appendChild(getBalloonView)

}
//get all
@JsName("singleBalloon")
fun singleBalloon(idB: Int, name: String, volume: Int, colorDef: String){
    println(colorDef)
    val allBalloons: Element = document.getElementById("allBalloons")!!
    var color: String = ""
    when (colorDef){
        "R" -> color = "red"
        "G" -> color = "green"
        "B" -> color = "blue"
    }
    println(color)
    val square: Element = document.create.div {
        classes = setOf("circle")
        style = "background: $color"
    }

    val descSquare: Element = document.create.span {
        + "id = $idB, name = $name, volume = $volume"
    }

    allBalloons.appendChild(square)
    allBalloons.appendChild(descSquare)

}

@JsName("viewOneBalloon")
fun viewOneBalloon(idB: Int, name: String, volume: Int, colorDef: String){
    val root: Element = document.getElementById("root")!!
    root.innerHTML = ""
    var color: String = ""
    when (colorDef){
        "R", "r" -> color = "red"
        "G", "g" -> color = "green"
        "B", "b" -> color = "blue"
    }
    println(color)

    val getBalloonView: Element = document.create.div{
        id = "allBalloons"
        div {
            classes = setOf("circle")
            style = "background: $color"
        }
        span {
            + "id = $idB name = $name volume = $volume"
        }
    }
    root.appendChild(getBalloonView)
}

