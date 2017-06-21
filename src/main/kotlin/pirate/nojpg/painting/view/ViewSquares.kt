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
fun viewAllSquares () {

    val root: Element = document.getElementById("root")!!
    root.innerHTML = ""


    val getSquareView: Element = document.create.div{
        id = "allSquares"

    }

    root.appendChild(getSquareView)
}
//get all
@JsName("singleSquare")
fun singleSquare(id: Int, name: String, r: Byte, g: Byte, b: Byte){

    val allSquares: Element = document.getElementById("allSquares")!!

    val square: Element = document.create.div {
        classes = setOf("square")
        style = "background: rgb($r,$g,$b)"
    }

    val descSquare: Element = document.create.span {
        + "id = $id, name = $name"
    }

    allSquares.appendChild(square)
    allSquares.appendChild(descSquare)
}

//get id
@JsName("viewOneSquare")
fun viewOneSquare(idS: Int, name: String, r: Byte, g: Byte, b: Byte){

    val root: Element = document.getElementById("root")!!
    root.innerHTML = ""


    val getSquareView: Element = document.create.div{
        id = "allSquares"
        div {
            classes = setOf("square")
            style = "background: rgb($r,$g,$b)"
        }

        span {
            + "id = $idS name = $name"
        }

    }
    root.appendChild(getSquareView)
}
