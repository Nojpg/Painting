package pirate.nojpg.painting.controller

import pirate.nojpg.painting.view.viewAllPaints

/**
 * Created by Nojpg on 21.06.17.
 */
fun getAllPaints(res: dynamic){
    println(JSON.stringify(res))
    println(res)
    viewAllPaints()
    js("for(var obj in res) {" +
            "console.log(res[obj]);" +
            "var key = res[obj];" +
            "var b_datetime;" +
            "var sq_id;" +
            "var bal_id;" +
            "var volume;" +
            "for (var prop in key) {" +
            "console.log(prop + key[prop]);" +
            "switch (prop) {" +
            "case 'b_datetime':" +
            "b_datetime = key[prop];" +
            "break;" +
            "case 'sq_id':" +
            "sq_id = key[prop];" +
            "break;" +
            "case 'bal_id':" +
            "bal_id = key[prop];" +
            "break;" +
            "case 'volume':" +
            "volume = key[prop];" +
            "break;" +
            "}" +
            "}" +
            "singlePaint(b_datetime, sq_id, bal_id, volume);" +
            "}"
    )
}

fun getSinglePaint (res: dynamic){
    println(JSON.stringify(res))
    println(res)
    js("var b_datetime;" +
            "var sq_id;" +
            "var bal_id;" +
            "var volume;" +
            "for(var obj in res) {" +
            "console.log(obj);" +
            "console.log(res[obj]);" +
            "switch (obj){" +
            "case 'b_datetime':" +
            "b_datetime = res[obj];" +
            "break;" +
            "case 'sq_id':" +
            "sq_id = res[obj];" +
            "break;" +
            "case 'bal_id':" +
            "bal_id = res[obj];" +
            "break;" +
            "case 'volume':" +
            "volume = res[obj];" +
            "break;" +
            "}" +
            "}" +
            "viewOnePaint(b_datetime, sq_id, bal_id, volume);"
    )
}
fun getAllPaintsForId(res: dynamic){
    println(JSON.stringify(res))
    println(res)
    viewAllPaints()
    js("for(var obj in res) {" +
            "console.log(res[obj]);" +
            "var key = res[obj];" +
            "var b_datetime;" +
            "var sq_id;" +
            "var bal_id;" +
            "var volume;" +
            "for (var prop in key) {" +
            "console.log(prop + key[prop]);" +
            "switch (prop) {" +
            "case 'b_datetime':" +
            "b_datetime = key[prop];" +
            "break;" +
            "case 'sq_id':" +
            "sq_id = key[prop];" +
            "break;" +
            "case 'bal_id':" +
            "bal_id = key[prop];" +
            "break;" +
            "case 'volume':" +
            "volume = key[prop];" +
            "break;" +
            "}" +
            "}" +
            "singlePaint(b_datetime, sq_id, bal_id, volume);" +
            "}"
    )
}