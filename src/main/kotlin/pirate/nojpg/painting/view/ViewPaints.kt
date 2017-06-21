package pirate.nojpg.painting.view

import kotlinx.html.classes
import kotlinx.html.div
import kotlinx.html.dom.create
import kotlinx.html.id
import kotlinx.html.style
import org.w3c.dom.Element
import kotlin.browser.document

/**
 * Created by Nojpg on 21.06.17.
 */
//TODO
//Paints
//get all
fun viewAllPaints(){
    val root: Element = document.getElementById("root")!!
    root.innerHTML = ""


    val getPaintView: Element = document.create.div{
        id = "allPaints"

    }

    root.appendChild(getPaintView)
}
//get all

@JsName("singlePaint")
fun singlePaint(b_datetime: dynamic, sq_id: Int, bal_id: Int, volume: Int){
    val allPaints: Element = document.getElementById("allPaints")!!


    val paint: Element = document.create.div {
        +"b_datetime = $b_datetime, sq_id = $sq_id, bal_id = $bal_id, volume = $volume"
    }


    allPaints.appendChild(paint)

}
//get one
@JsName("viewOnePaint")
fun viewOnePaint(b_datetime: dynamic, sq_id: Int, bal_id: Int, volume: Int){

    val root: Element = document.getElementById("root")!!
    root.innerHTML = ""


    val getPaintView: Element = document.create.div{
        id = "allPaints"
        +"b_datetime = $b_datetime, sq_id = $sq_id, bal_id = $bal_id, volume = $volume"



    }
    root.appendChild(getPaintView)
}

