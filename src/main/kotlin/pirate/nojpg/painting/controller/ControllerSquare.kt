package pirate.nojpg.painting.controller

import pirate.nojpg.painting.view.viewAllSquares

/**
 * Created by Nojpg on 21.06.17.
 */
fun getAllSquares (res: dynamic){
    println(JSON.stringify(res))
    println(res)
    viewAllSquares()
    js("for(var obj in res) {" +
            "console.log(res[obj]);" +
            "var key = res[obj];" +
            "var id;" +
            "var name;" +
            "var r;" +
            "var g;" +
            "var b;" +
            "for (var prop in key) {" +
            "console.log(prop + key[prop]);" +
            "switch (prop) {" +
            "case 'id':" +
            "id = key[prop];" +
            "break;" +
            "case 'name':" +
            "name = key[prop];" +
            "break;" +
            "case 'r':" +
            "r = key[prop];" +
            "break;" +
            "case 'g':" +
            "g = key[prop];" +
            "break;" +
            "case 'b':" +
            "b = key[prop];" +
            "break;" +
            "}" +
            "}" +
            "singleSquare(id, name, r, g, b);" +
            "}"
    )
}

fun getSingleSquare (res: dynamic){
    println(JSON.stringify(res))
    println(res)
    js("var id;" +
            "var name;" +
            "var r;" +
            "var g;" +
            "var b;" +
            "for(var obj in res) {" +
            "console.log(obj);" +
            "console.log(res[obj]);" +
            "switch (obj){" +
            "case 'id':" +
            "id = res[obj];" +
            "break;" +
            "case 'name':" +
            "name = res[obj];" +
            "break;" +
            "case 'r':" +
            "r = res[obj];" +
            "break;" +
            "case 'g':" +
            "g = res[obj];" +
            "break;" +
            "case 'b':" +
            "b = res[obj];" +
            "break;" +
            "}" +
            "}" +
            "viewOneSquare(id, name, r, g, b);"
    )
}
