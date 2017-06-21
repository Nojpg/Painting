package pirate.nojpg.painting.view

import pirate.nojpg.painting.*
import kotlinx.html.*
import kotlinx.html.dom.create
import kotlinx.html.js.onClickFunction
import kotlinx.html.js.onSubmitFunction
import org.w3c.dom.Element
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.Event
import pirate.nojpg.painting.controller.fetchRequest
import pirate.nojpg.painting.controller.getSingleBalloon
import pirate.nojpg.painting.model.Balloon
import pirate.nojpg.painting.model.Paint
import pirate.nojpg.painting.model.Square
import kotlin.browser.document

/**
 * Created by Nojpg on 21.06.17.
 */

fun launch(){
    val root: Element = document.getElementById("root")!!
    root.innerHTML = ""

    val mainBar: Element = document.create.div {
        id = "main"

        div {
            + " Squares"
            button {
                + "Show all"
                onClickFunction = fun(_: Event){
                    fetchRequest(method = GET, body = null, url = "squares",fn = "getAllSquares")
                    //TODO fun

                }
            }
            form {
                method = FormMethod.get

                input {
                    type = InputType.text
                    placeholder = "Read via Id"
                    id = "readIdSq"
                }
                input {
                    type = InputType.button
                    value = "Submit"
                    onClickFunction = fun (_: Event){
                        val valueOfId = document.getElementById("readIdSq") as HTMLInputElement
                        val url: String = "squares/" + valueOfId.value
                        println(url)
                        fetchRequest(method = GET, body = null, url = url, fn = "getSingleSquare")
                    }
                }

            }
            form {

                method = FormMethod.post

                input {
                    type = InputType.text
                    placeholder = "Id"
                    id = "createIdSq"
                }
                input {
                    type = InputType.text
                    placeholder = "Name"
                    id = "createNameSq"
                }
//
                input {
                    type = InputType.button
                    value = "Submit create Square"
                    onClickFunction = fun (_: Event){

                        val id = document.getElementById("createIdSq") as HTMLInputElement
                        val name = document.getElementById("createNameSq") as HTMLInputElement
                        val body = JSON.stringify(Square(id = id.value, name = name.value))
                        fetchRequest(method = POST, body = body, url = "squares/", fn = "getSingleSquare")

                    }
                }

            }
            form {

                input {
                    type = InputType.text
                    placeholder = "Id delete"
                    id = "deleteIdSq"
                }
                input {
                    type = InputType.button
                    value = "Submit Delete"
                    onClickFunction = fun (_: Event){
                        val valueOfId = document.getElementById("deleteIdSq") as HTMLInputElement
                        val url: String = "squares/" + valueOfId.value
                        println(url)
                        fetchRequest(method = DELETE, body = null, url = url, fn = "deleteSingleSquare")
                    }
                }
            }
        }
        div {
            + " Balloons"
            button {
                + "Show all"
                onClickFunction = fun(_: Event){
                    fetchRequest(method = GET, body = null, url = "balloons",fn = "getAllBalloons")

                }
            }
            form {
                method = FormMethod.get

                input {
                    type = InputType.text
                    placeholder = "Read via Id"
                    id = "readIdBl"
                }
                input {
                    type = InputType.button
                    value = "Submit balloon Id search"
                    onClickFunction = fun(_: Event) {
                        val valueOfId = document.getElementById("readIdBl") as HTMLInputElement
                        val url: String = "balloons/" + valueOfId.value
                        println(url)
                        fetchRequest(method = GET, body = null, url = url, fn = "getSingleBalloon")
                    }
                }
            }
            form {

                method = FormMethod.post

                input {
                    type = InputType.text
                    placeholder = "Id"
                    id = "createIdBl"
                }
                input {
                    type = InputType.text
                    placeholder = "Name"
                    id = "createNameBl"
                }
                input {
                    type = InputType.text
                    placeholder = "r||g||b"
                    id = "colorBl"
                }

                input {
                    type = InputType.button
                    value = "Submit create Balloon"
                    onClickFunction = fun (_: Event){
                        val id = document.getElementById("createIdBl") as HTMLInputElement
                        val name = document.getElementById("createNameBl") as HTMLInputElement
                        val color = document.getElementById("colorBl") as HTMLInputElement
                        val body = JSON.stringify(Balloon(id = id.value, name = name.value, color = color.value))
                        fetchRequest(method = POST, body = body, url = "balloons/", fn = "getSingleBalloon")

                    }
                }

            }
            form {

                input {
                    type = InputType.text
                    placeholder = "Id delete"
                    id = "deleteIdBl"
                }
                input {
                    type = InputType.button
                    value = "Submit Delete"
                    onClickFunction = fun (_: Event){
                        val valueOfId = document.getElementById("deleteIdBl") as HTMLInputElement
                        val url: String = "balloons/" + valueOfId.value
                        println(url)
                        fetchRequest(method = DELETE, body = null, url = url, fn = "deleteSingleBalloon")
                    }
                }
            }
        }
        div {
            + " Paints"
            button {
                + "Show all"
                onClickFunction = fun(_: Event){
                    fetchRequest(method = GET, body = null, url = "paints", fn = "getAllPaints")
                }
            }
            form {

                input {
                    type = InputType.text
                    placeholder = "Read via Id Sq"
                    id = "readPaintSq"
                }
                input {
                    type = InputType.button
                    value = "Search via id Sq"
                    onClickFunction = fun(_: Event){
                        val valueOfId = document.getElementById("readPaintSq") as HTMLInputElement
                        val url: String = "paints/sq/" + valueOfId.value
                        fetchRequest(method = GET, body = null, url = url, fn = "getAllPaints")
                    }
                }

            }
            form {

                input {
                    type = InputType.text
                    placeholder = "Read via Id Bl"
                    id = "readPaintBl"
                }
                input {
                    type = InputType.button
                    value = "Search via id Bal"
                    onClickFunction = fun(_: Event){
                        val valueOfId = document.getElementById("readPaintBl") as HTMLInputElement
                        val url: String = "paints/bal/" + valueOfId.value
                        fetchRequest(method = GET, body = null, url = url, fn = "getAllPaints")
                    }
                }
            }

            form {
                method = FormMethod.post

                input {
                    type = InputType.dateTime
                    placeholder = "b_datetime"
                    id = "b_datetime"
                }
                input {
                    type = InputType.text
                    placeholder = "sq_id"
                    id = "sq_id"
                }
                input {
                    type = InputType.text
                    placeholder = "bal_id"
                    id = "bal_id"
                }
                input {
                    type = InputType.text
                    placeholder = "volume 0..255"
                    id = "volume"
                }
                input {
                    type = InputType.button
                    value = "create new paints"
                    onClickFunction = fun (_: Event){
                        val sq_id = document.getElementById("sq_id") as HTMLInputElement
                        val bal_id = document.getElementById("bal_id") as HTMLInputElement
                        val volume = document.getElementById("volume") as HTMLInputElement
                        val b_datetime = document.getElementById("b_datetime") as HTMLInputElement
                        val body = JSON.stringify(Paint(b_datetime = b_datetime.value, sq_id = sq_id.value, bal_id = bal_id.value, volume = volume.value))
                        fetchRequest(method = POST, body = body, url = "paints/", fn = "getSinglePaint")
                    }
                }
            }
        }
    }
    root.appendChild(mainBar)
}