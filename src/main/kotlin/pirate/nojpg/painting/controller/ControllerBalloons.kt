package pirate.nojpg.painting.controller

import pirate.nojpg.painting.view.viewAllBalloons

/**
 * Created by Nojpg on 21.06.17.
 */
fun getAllBalloons(res: dynamic){
    println(JSON.stringify(res))
    println(res)
    viewAllBalloons()
    js("for(var obj in res) {" +
            "console.log(res[obj]);" +
            "var key = res[obj];" +
            "var id;" +
            "var name;" +
            "var volume;" +
            "var color;" +
            "for (var prop in key) {" +
            "console.log(prop + key[prop]);" +
            "switch (prop) {" +
            "case 'id':" +
            "id = key[prop];" +
            "break;" +
            "case 'name':" +
            "name = key[prop];" +
            "break;" +
            "case 'volume':" +
            "volume = key[prop];" +
            "break;" +
            "case 'color':" +
            "color = key[prop];" +
            "break;" +
            "}" +
            "}" +
            "singleBalloon(id, name, volume, color);" +
            "}"
    )
}

fun getSingleBalloon (res: dynamic){
    println(JSON.stringify(res))
    println(res)
    js("var id;" +
            "var name;" +
            "var volume;" +
            "var color;" +
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
            "case 'volume':" +
            "volume = res[obj];" +
            "break;" +
            "case 'color':" +
            "color = res[obj];" +
            "break;" +
            "}" +
            "}" +
            "viewOneBalloon(id, name, volume, color);"
    )
}